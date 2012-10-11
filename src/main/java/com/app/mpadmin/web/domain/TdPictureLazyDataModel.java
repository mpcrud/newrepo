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
import com.app.mpadmin.domain.TdPicture;
import com.app.mpadmin.repository.TdPictureRepository;
import com.app.mpadmin.web.domain.support.GenericLazyDataModel;

/**
 * Provides server-side pagination for search.
 *
 * @see http://jira.springframework.org/browse/SWF-1224 to avoid instanciate it as a var from your flow 
 */
public class TdPictureLazyDataModel extends GenericLazyDataModel<TdPicture> {
    private static final long serialVersionUID = 1L;

    @Inject
    transient private TdPictureRepository tdPictureRepository;
    @Inject
    transient private TdPictureSearchForm tdPictureSearchForm;

    /**
     * Prepare the search parameters and call the tdPictureRepository finder.
     * Automatically called by PrimeFaces component.
     */
    @Override
    public List<TdPicture> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
        SearchParameters sp = tdPictureSearchForm.getSearchParameters();

        // ranges
        sp.clearRanges();
        sp.addRange(tdPictureSearchForm.getPictureTypeRange());
        sp.addRange(tdPictureSearchForm.getPictureRefIdRange());
        sp.addRange(tdPictureSearchForm.getStatusRange());

        TdPicture tdPicture = tdPictureSearchForm.getTdPicture();
        setRowCount(tdPictureRepository.findCount(tdPicture, sp)); // total count so the paginator may display the total number of pages
        populateSearchParameters(sp, first, pageSize, sortField, sortOrder, filters); // load one page of data

        return tdPictureRepository.find(tdPicture, sp);
    }
}