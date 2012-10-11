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
import com.app.mpadmin.domain.TdTagGrpTagMapping;
import com.app.mpadmin.repository.TdTagGrpTagMappingRepository;
import com.app.mpadmin.web.domain.support.GenericLazyDataModel;

/**
 * Provides server-side pagination for search.
 *
 * @see http://jira.springframework.org/browse/SWF-1224 to avoid instanciate it as a var from your flow 
 */
public class TdTagGrpTagMappingLazyDataModel extends GenericLazyDataModel<TdTagGrpTagMapping> {
    private static final long serialVersionUID = 1L;

    @Inject
    transient private TdTagGrpTagMappingRepository tdTagGrpTagMappingRepository;
    @Inject
    transient private TdTagGrpTagMappingSearchForm tdTagGrpTagMappingSearchForm;

    /**
     * Prepare the search parameters and call the tdTagGrpTagMappingRepository finder.
     * Automatically called by PrimeFaces component.
     */
    @Override
    public List<TdTagGrpTagMapping> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
        SearchParameters sp = tdTagGrpTagMappingSearchForm.getSearchParameters();

        // ranges
        sp.clearRanges();
       // sp.addRange(tdTagGrpTagMappingSearchForm.getTagGrpIdRange());
       // sp.addRange(tdTagGrpTagMappingSearchForm.getTagIdRange());
        sp.clearEntitySelectors();
        sp.addEntitySelector(tdTagGrpTagMappingSearchForm.getTagGrpSelector());
        sp.addEntitySelector(tdTagGrpTagMappingSearchForm.getTagSelector());

        TdTagGrpTagMapping tdTagGrpTagMapping = tdTagGrpTagMappingSearchForm.getTdTagGrpTagMapping();
        setRowCount(tdTagGrpTagMappingRepository.findCount(tdTagGrpTagMapping, sp)); // total count so the paginator may display the total number of pages
        populateSearchParameters(sp, first, pageSize, sortField, sortOrder, filters); // load one page of data

        return tdTagGrpTagMappingRepository.find(tdTagGrpTagMapping, sp);
    }
}