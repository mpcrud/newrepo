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
import com.app.mpadmin.domain.TdTopic;
import com.app.mpadmin.repository.TdTopicRepository;
import com.app.mpadmin.web.domain.support.GenericLazyDataModel;

/**
 * Provides server-side pagination for search.
 *
 * @see http://jira.springframework.org/browse/SWF-1224 to avoid instanciate it as a var from your flow 
 */
public class TdTopicLazyDataModel extends GenericLazyDataModel<TdTopic> {
    private static final long serialVersionUID = 1L;

    @Inject
    transient private TdTopicRepository tdTopicRepository;
    @Inject
    transient private TdTopicSearchForm tdTopicSearchForm;

List<TdTopic> datasource;

    @Override
    public TdTopic getRowData(String rowKey) {
        for(TdTopic tdTopic : datasource) {
            if(tdTopic.getTopicId().equals(rowKey))
                return tdTopic;
        }

        return null;
    }

    @Override
    public Object getRowKey(TdTopic tdTopic)
    {
         return tdTopic.getTopicId();
    }


    /**
     * Prepare the search parameters and call the tdTopicRepository finder.
     * Automatically called by PrimeFaces component.
     */
    @Override
    public List<TdTopic> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
        SearchParameters sp = tdTopicSearchForm.getSearchParameters();

        // ranges
        sp.clearRanges();
        sp.addRange(tdTopicSearchForm.getViewCountRange());
        sp.addRange(tdTopicSearchForm.getCommentCountRange());
        sp.addRange(tdTopicSearchForm.getAssignedSinceRange());
        sp.addRange(tdTopicSearchForm.getParentTopicIdRange());
        sp.addRange(tdTopicSearchForm.getTwitterCountRange());
        sp.addRange(tdTopicSearchForm.getFacebookCountRange());
        sp.addRange(tdTopicSearchForm.getUpdationDateRange());
        sp.addRange(tdTopicSearchForm.getIsActiveRange());
        sp.addRange(tdTopicSearchForm.getIsFeaturedRange());
        sp.addRange(tdTopicSearchForm.getAssignedToUserRange());
        sp.addRange(tdTopicSearchForm.getExpiryDateRange());
        sp.addRange(tdTopicSearchForm.getTopicStatusRange());
        sp.addRange(tdTopicSearchForm.getVoteCountRange());
        sp.addRange(tdTopicSearchForm.getCustomInt1Range());
        sp.addRange(tdTopicSearchForm.getCustomInt2Range());
        sp.addRange(tdTopicSearchForm.getTopicIdRange());

        // entity selectors
        sp.clearEntitySelectors();
        sp.addEntitySelector(tdTopicSearchForm.getUserSelector());

        TdTopic tdTopic = tdTopicSearchForm.getTdTopic();
        setRowCount(tdTopicRepository.findCount(tdTopic, sp)); // total count so the paginator may display the total number of pages
        populateSearchParameters(sp, first, pageSize, sortField, sortOrder, filters); // load one page of data
        datasource = tdTopicRepository.find(tdTopic, sp);
        return datasource;
    }
}