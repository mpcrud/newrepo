/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/LazyDataModel.e.vm.java
 */
package com.app.mpadmin.web.domain;

import java.util.List;
import java.util.Map;
import javax.inject.Inject;

import org.primefaces.model.SortOrder;

import com.app.mpadmin.dao.support.SearchParameters;
import com.app.mpadmin.domain.TdUserActivity;
import com.app.mpadmin.repository.TdUserActivityRepository;
import com.app.mpadmin.web.domain.support.GenericLazyDataModel;

/**
 * Provides server-side pagination for search.
 *
 * @see http://jira.springframework.org/browse/SWF-1224 to avoid instanciate it as a var from your flow 
 */
public class TdUserActivityLazyDataModel extends GenericLazyDataModel<TdUserActivity> {
    private static final long serialVersionUID = 1L;

    @Inject
    transient private TdUserActivityRepository tdUserActivityRepository;
    @Inject
    transient private TdUserActivitySearchForm tdUserActivitySearchForm;

    /**
     * Prepare the search parameters and call the tdUserActivityRepository finder.
     * Automatically called by PrimeFaces component.
     */
    @Override
    public List<TdUserActivity> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
        SearchParameters sp = tdUserActivitySearchForm.getSearchParameters();

        // ranges
        sp.clearRanges();
        sp.addRange(tdUserActivitySearchForm.getUserLogintimeRange());
        sp.addRange(tdUserActivitySearchForm.getDurationRange());
        sp.addRange(tdUserActivitySearchForm.getViewCountRange());
        sp.addRange(tdUserActivitySearchForm.getReplyCountRange());
        sp.addRange(tdUserActivitySearchForm.getCurrentStatusRange());
        sp.addRange(tdUserActivitySearchForm.getUpdationDateRange());
        sp.addRange(tdUserActivitySearchForm.getIsActiveRange());
        sp.addRange(tdUserActivitySearchForm.getSessionPageRange());

        // entity selectors
        sp.clearEntitySelectors();
        sp.addEntitySelector(tdUserActivitySearchForm.getUserSelector());

        TdUserActivity tdUserActivity = tdUserActivitySearchForm.getTdUserActivity();
        setRowCount(tdUserActivityRepository.findCount(tdUserActivity, sp)); // total count so the paginator may display the total number of pages
        populateSearchParameters(sp, first, pageSize, sortField, sortOrder, filters); // load one page of data

        return tdUserActivityRepository.find(tdUserActivity, sp);
    }
}