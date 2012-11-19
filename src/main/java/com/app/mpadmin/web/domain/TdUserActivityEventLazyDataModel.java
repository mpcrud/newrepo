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
import com.app.mpadmin.domain.TdUserActivityEvent;
import com.app.mpadmin.repository.TdUserActivityEventRepository;
import com.app.mpadmin.web.domain.support.GenericLazyDataModel;

/**
 * Provides server-side pagination for search.
 *
 * @see http://jira.springframework.org/browse/SWF-1224 to avoid instanciate it as a var from your flow 
 */
public class TdUserActivityEventLazyDataModel extends GenericLazyDataModel<TdUserActivityEvent> {
    private static final long serialVersionUID = 1L;

    @Inject
    transient private TdUserActivityEventRepository tdUserActivityEventRepository;
    @Inject
    transient private TdUserActivityEventSearchForm tdUserActivityEventSearchForm;

    List<TdUserActivityEvent> datasource;

    @Override
    public TdUserActivityEvent getRowData(String rowKey) {
        for(TdUserActivityEvent tdUserActivityEvent : datasource) {
            if(tdUserActivityEvent.getUserActivityEventId().equals(rowKey))
                return tdUserActivityEvent;
        }

        return null;
    }

    @Override
    public Object getRowKey(TdUserActivityEvent tdUserActivityEvent)
    {
         return tdUserActivityEvent.getUserActivityEventId();
    }


    /**
     * Prepare the search parameters and call the tdUserActivityEventRepository finder.
     * Automatically called by PrimeFaces component.
     */
    @Override
    public List<TdUserActivityEvent> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
        SearchParameters sp = tdUserActivityEventSearchForm.getSearchParameters();

        // ranges
        sp.clearRanges();
        sp.addRange(tdUserActivityEventSearchForm.getUpdationDateRange());

        // entity selectors
        sp.clearEntitySelectors();
        sp.addEntitySelector(tdUserActivityEventSearchForm.getUserActivitySelector());

        TdUserActivityEvent tdUserActivityEvent = tdUserActivityEventSearchForm.getTdUserActivityEvent();
        setRowCount(tdUserActivityEventRepository.findCount(tdUserActivityEvent, sp)); // total count so the paginator may display the total number of pages
        populateSearchParameters(sp, first, pageSize, sortField, sortOrder, filters); // load one page of data
        datasource = tdUserActivityEventRepository.find(tdUserActivityEvent, sp);
        return datasource;
    }
}