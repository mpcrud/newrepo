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
import com.app.mpadmin.domain.TempTdTagGrpTagMapping;
import com.app.mpadmin.repository.TempTdTagGrpTagMappingRepository;
import com.app.mpadmin.web.domain.support.GenericLazyDataModel;

/**
 * Provides server-side pagination for search.
 *
 * @see http://jira.springframework.org/browse/SWF-1224 to avoid instanciate it as a var from your flow 
 */
public class TempTdTagGrpTagMappingLazyDataModel extends GenericLazyDataModel<TempTdTagGrpTagMapping> {
    private static final long serialVersionUID = 1L;

    @Inject
    transient private TempTdTagGrpTagMappingRepository tempTdTagGrpTagMappingRepository;
    @Inject
    transient private TempTdTagGrpTagMappingSearchForm tempTdTagGrpTagMappingSearchForm;

    /**
     * Prepare the search parameters and call the tempTdTagGrpTagMappingRepository finder.
     * Automatically called by PrimeFaces component.
     */
    @Override
    public List<TempTdTagGrpTagMapping> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
        SearchParameters sp = tempTdTagGrpTagMappingSearchForm.getSearchParameters();

        TempTdTagGrpTagMapping tempTdTagGrpTagMapping = tempTdTagGrpTagMappingSearchForm.getTempTdTagGrpTagMapping();
        setRowCount(tempTdTagGrpTagMappingRepository.findCount(tempTdTagGrpTagMapping, sp)); // total count so the paginator may display the total number of pages
        populateSearchParameters(sp, first, pageSize, sortField, sortOrder, filters); // load one page of data

        return tempTdTagGrpTagMappingRepository.find(tempTdTagGrpTagMapping, sp);
    }
}