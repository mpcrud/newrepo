package com.app.mpadmin.web.domain;

import com.app.mpadmin.dao.support.SearchParameters;
import com.app.mpadmin.domain.TdTagGrp;
import com.app.mpadmin.repository.TdTagGrpRepository;
import com.app.mpadmin.web.domain.support.GenericLazyDataModel;
import org.primefaces.model.SortOrder;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: miti
 * Date: 10/18/12
 * Time: 7:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class UnMappedTagGrpLazyDataModel extends GenericLazyDataModel<TdTagGrp> {
    private static final long serialVersionUID = 1L;

        @Inject
        transient private TdTagGrpRepository tdTagGrpRepository;
        @Override
       public List<TdTagGrp> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
        SearchParameters sp = new SearchParameters();
        sp.setNamedQuery("TdTagGrp.NotMappedToTag");
        TdTagGrp tdTagGrp = new TdTagGrp();
        setRowCount(tdTagGrpRepository.findCount(tdTagGrp,sp));
        populateSearchParameters(sp, first, pageSize, sortField, sortOrder, filters);
        List<TdTagGrp> list = tdTagGrpRepository.find(tdTagGrp,sp);
        return list;

    }
}
