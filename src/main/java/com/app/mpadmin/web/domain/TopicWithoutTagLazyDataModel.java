package com.app.mpadmin.web.domain;

import com.app.mpadmin.dao.support.SearchParameters;
import com.app.mpadmin.domain.TdTopic;
import com.app.mpadmin.repository.TdTopicRepository;
import com.app.mpadmin.web.domain.support.GenericLazyDataModel;
import org.primefaces.model.SortOrder;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: miti
 * Date: 11/9/12
 * Time: 9:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class TopicWithoutTagLazyDataModel extends GenericLazyDataModel<TdTopic> {
    private static final long serialVersionUID = 1L;
   
           @Inject
           transient private TdTopicRepository tdTopicRepository;
           @Override
          public List<TdTopic> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
           SearchParameters sp = new SearchParameters();
           sp.setNamedQuery("TdTopic.NotMappedToTag");
           TdTopic tdTopic = new TdTopic();
           setRowCount(tdTopicRepository.findCount(tdTopic,sp));
           populateSearchParameters(sp, first, pageSize, sortField, sortOrder, filters);
           List<TdTopic> list = tdTopicRepository.find(tdTopic,sp);
           return list;
   
       }
}
