package com.app.mpadmin.web.domain;

import com.app.mpadmin.dao.support.SearchParameters;
import com.app.mpadmin.domain.TdProduct;
import com.app.mpadmin.repository.TdProductRepository;
import com.app.mpadmin.web.domain.support.GenericLazyDataModel;
import org.primefaces.model.SortOrder;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: miti
 * Date: 11/8/12
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProductWithoutImageLazyDataModel extends GenericLazyDataModel<TdProduct>{
    private static final long serialVersionUID = 1L;

           @Inject
            transient private TdProductRepository tdProductRepository;
           @Override
           public List<TdProduct> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
            SearchParameters sp = new SearchParameters();
            sp.setNamedQuery("product.getAllWithoutImages");
            TdProduct tdTagGrp = new TdProduct();
            setRowCount(tdProductRepository.findCount(tdTagGrp,sp));
            populateSearchParameters(sp, first, pageSize, sortField, sortOrder, filters);
            List<TdProduct> list = tdProductRepository.find(tdTagGrp,sp);
            return list;

        }
    }




