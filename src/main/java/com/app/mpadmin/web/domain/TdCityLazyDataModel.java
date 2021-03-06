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
import com.app.mpadmin.domain.TdCity;
import com.app.mpadmin.repository.TdCityRepository;
import com.app.mpadmin.web.domain.support.GenericLazyDataModel;

/**
 * Provides server-side pagination for search.
 *
 * @see http://jira.springframework.org/browse/SWF-1224 to avoid instanciate it as a var from your flow 
 */
public class TdCityLazyDataModel extends GenericLazyDataModel<TdCity> {
    private static final long serialVersionUID = 1L;

    @Inject
    transient private TdCityRepository tdCityRepository;
    @Inject
    transient private TdCitySearchForm tdCitySearchForm;


    /**
     * Prepare the search parameters and call the tdCityRepository finder.
     * Automatically called by PrimeFaces component.
     */

    List<TdCity> datasource;

    @Override
    public TdCity getRowData(String rowKey) {
        for(TdCity tdCity : datasource) {
            if(tdCity.getCityId().equals(rowKey))
                return tdCity;
        }

        return null;
    }

    @Override
    public Object getRowKey(TdCity tdCity)
    {
         return tdCity.getCityId();
    }

    @Override
    public List<TdCity> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
        SearchParameters sp = tdCitySearchForm.getSearchParameters();

        // ranges
        sp.clearRanges();
        sp.addRange(tdCitySearchForm.getPopulationRankRange());
        sp.addRange(tdCitySearchForm.getDestinationRankRange());
        sp.addRange(tdCitySearchForm.getFlagRange());
        sp.addRange(tdCitySearchForm.getDestinationTypeRange());
        sp.addRange(tdCitySearchForm.getImportanceRange());
        sp.addRange(tdCitySearchForm.getMetroIdRange());
        sp.addRange(tdCitySearchForm.getIsResourceRange());
        sp.addRange(tdCitySearchForm.getIsSupportedByRange());
        sp.addRange(tdCitySearchForm.getCustomtable1Range());
        sp.addRange(tdCitySearchForm.getCustomtable2Range());
        sp.addRange(tdCitySearchForm.getCustomtable3Range());
        sp.addRange(tdCitySearchForm.getCustomtable4Range());
        sp.addRange(tdCitySearchForm.getUpdationDateRange());
        sp.addRange(tdCitySearchForm.getCityIdRange());

        TdCity tdCity = tdCitySearchForm.getTdCity();
        setRowCount(tdCityRepository.findCount(tdCity, sp)); // total count so the paginator may display the total number of pages
        populateSearchParameters(sp, first, pageSize, sortField, sortOrder, filters); // load one page of data
        datasource= tdCityRepository.find(tdCity, sp);
        return datasource;
    }
}