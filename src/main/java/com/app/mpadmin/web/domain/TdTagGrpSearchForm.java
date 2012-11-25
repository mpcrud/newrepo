/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.EntitySelectors.TdTopicSelector.newTdTopicSelector;
import static com.app.mpadmin.dao.support.EntitySelectors.TdProductSelector.newTdProductSelector;
import static com.app.mpadmin.dao.support.Ranges.RangeDate.newRangeDate;
import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TdTagGrp_.*;

import com.app.mpadmin.dao.support.EntitySelectors;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.Ranges.RangeDate;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdTagGrp;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdTagGrp search.
 */
@Component
@Scope("session")
public class TdTagGrpSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdTagGrp tdTagGrp = new TdTagGrp();
    private RangeInteger<TdTagGrp> referenceIdRange = newRangeInteger(referenceId);
    private RangeDate<TdTagGrp> updationDateRange = newRangeDate(updationDate);
    private RangeInteger<TdTagGrp> isActiveRange = newRangeInteger(isActive);
    private RangeInteger<TdTagGrp> tagGrpStatusRange = newRangeInteger(tagGrpStatus);
    private RangeInteger<TdTagGrp> referenceTypeRange = newRangeInteger(referenceType);
    private RangeInteger<TdTagGrp> tagGrpIdRange = newRangeInteger(tagGrpId);

    private EntitySelectors.TdTopicSelector<TdTagGrp> topicSelector = newTdTopicSelector(referenceId);
    private EntitySelectors.TdProductSelector<TdTagGrp> productSelector = newTdProductSelector(referenceId);

    public TdTagGrp getTdTagGrp() {
        return tdTagGrp;
    }

    // Ranges, used from the view.
    public RangeInteger<TdTagGrp> getTagGrpIdRange(){
        return tagGrpIdRange;
    }
    public RangeInteger<TdTagGrp> getReferenceIdRange() {
        return referenceIdRange;
    }

    public RangeDate<TdTagGrp> getUpdationDateRange() {
        return updationDateRange;
    }

    public RangeInteger<TdTagGrp> getIsActiveRange() {
        return isActiveRange;
    }

    public RangeInteger<TdTagGrp> getTagGrpStatusRange() {
        return tagGrpStatusRange;
    }

    public RangeInteger<TdTagGrp> getReferenceTypeRange() {
        return referenceTypeRange;
    }

    public EntitySelectors.TdTopicSelector<TdTagGrp> getTopicSelector() {
            return topicSelector;
        }
    public EntitySelectors.TdProductSelector<TdTagGrp> getProductSelector() {
                return productSelector;
            }

}