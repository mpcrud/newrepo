/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.EntitySelectors.TdTagSelector.newTdTagSelector;
import static com.app.mpadmin.dao.support.Ranges.RangeDate.newRangeDate;
import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TdTagRelation_.currentTagId;
import static com.app.mpadmin.domain.TdTagRelation_.isActive;
import static com.app.mpadmin.domain.TdTagRelation_.parentTagId;
import static com.app.mpadmin.domain.TdTagRelation_.tagStatus;
import static com.app.mpadmin.domain.TdTagRelation_.updationDate;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.EntitySelectors.TdTagSelector;
import com.app.mpadmin.dao.support.Ranges.RangeDate;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdTagRelation;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdTagRelation search.
 */
@Component
@Scope("session")
public class TdTagRelationSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdTagRelation tdTagRelation = new TdTagRelation();
    private RangeDate<TdTagRelation> updationDateRange = newRangeDate(updationDate);
    private RangeInteger<TdTagRelation> tagStatusRange = newRangeInteger(tagStatus);
    private RangeInteger<TdTagRelation> isActiveRange = newRangeInteger(isActive);
    private TdTagSelector<TdTagRelation> parentTagSelector = newTdTagSelector(parentTagId);
    private TdTagSelector<TdTagRelation> currentTagSelector = newTdTagSelector(currentTagId);

    public TdTagRelation getTdTagRelation() {
        return tdTagRelation;
    }

    // Ranges, used from the view.
    public RangeDate<TdTagRelation> getUpdationDateRange() {
        return updationDateRange;
    }

    public RangeInteger<TdTagRelation> getTagStatusRange() {
        return tagStatusRange;
    }

    public RangeInteger<TdTagRelation> getIsActiveRange() {
        return isActiveRange;
    }

    // Selectors for x-to-one associations
    public TdTagSelector<TdTagRelation> getParentTagSelector() {
        return parentTagSelector;
    }

    public TdTagSelector<TdTagRelation> getCurrentTagSelector() {
        return currentTagSelector;
    }
}