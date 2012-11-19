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
import com.app.mpadmin.domain.TdRequestCarPart;
import com.app.mpadmin.repository.TdRequestCarPartRepository;
import com.app.mpadmin.web.domain.support.GenericLazyDataModel;

/**
 * Provides server-side pagination for search.
 *
 * @see http://jira.springframework.org/browse/SWF-1224 to avoid instanciate it as a var from your flow 
 */
public class TdRequestCarPartLazyDataModel extends GenericLazyDataModel<TdRequestCarPart> {
    private static final long serialVersionUID = 1L;

    @Inject
    transient private TdRequestCarPartRepository tdRequestCarPartRepository;
    @Inject
    transient private TdRequestCarPartSearchForm tdRequestCarPartSearchForm;

List<TdRequestCarPart> datasource;

    @Override
    public TdRequestCarPart getRowData(String rowKey) {
        for(TdRequestCarPart tdRequestCarPart : datasource) {
            if(tdRequestCarPart.getRequestId().equals(rowKey))
                return tdRequestCarPart;
        }

        return null;
    }

    @Override
    public Object getRowKey(TdRequestCarPart tdRequestCarPart)
    {
         return tdRequestCarPart.getRequestId();
    }


    /**
     * Prepare the search parameters and call the tdRequestCarPartRepository finder.
     * Automatically called by PrimeFaces component.
     */
    @Override
    public List<TdRequestCarPart> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
        SearchParameters sp = tdRequestCarPartSearchForm.getSearchParameters();

        // ranges
        sp.clearRanges();
        sp.addRange(tdRequestCarPartSearchForm.getLastUpdateDateRange());
        sp.addRange(tdRequestCarPartSearchForm.getCarYearRange());
        sp.addRange(tdRequestCarPartSearchForm.getRequestStatusRange());

        TdRequestCarPart tdRequestCarPart = tdRequestCarPartSearchForm.getTdRequestCarPart();
        setRowCount(tdRequestCarPartRepository.findCount(tdRequestCarPart, sp)); // total count so the paginator may display the total number of pages
        populateSearchParameters(sp, first, pageSize, sortField, sortOrder, filters); // load one page of data
        datasource = tdRequestCarPartRepository.find(tdRequestCarPart, sp);
        return datasource;
    }
}