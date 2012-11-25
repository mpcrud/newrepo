/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.EntitySelectors.TdUserActivitySelector.newTdUserActivitySelector;
import static com.app.mpadmin.dao.support.Ranges.RangeDate.newRangeDate;
import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TdUserActivityEvent_.updationDate;
import static com.app.mpadmin.domain.TdUserActivityEvent_.userActivityEventId;
import static com.app.mpadmin.domain.TdUserActivityEvent_.userActivityId;

import com.app.mpadmin.dao.support.Ranges;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.EntitySelectors.TdUserActivitySelector;
import com.app.mpadmin.dao.support.Ranges.RangeDate;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdUserActivityEvent;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdUserActivityEvent search.
 */
@Component
@Scope("session")
public class TdUserActivityEventSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdUserActivityEvent tdUserActivityEvent = new TdUserActivityEvent();
    private RangeDate<TdUserActivityEvent> updationDateRange = newRangeDate(updationDate);
    private TdUserActivitySelector<TdUserActivityEvent> userActivitySelector = newTdUserActivitySelector(userActivityId);
    private RangeInteger<TdUserActivityEvent> userActivityEventIdRange = newRangeInteger(userActivityEventId);

    public TdUserActivityEvent getTdUserActivityEvent() {
        return tdUserActivityEvent;
    }

    // Ranges, used from the view.
    public RangeInteger<TdUserActivityEvent> getUserActivityEventIdRange(){
        return userActivityEventIdRange;
    }
    public RangeDate<TdUserActivityEvent> getUpdationDateRange() {
        return updationDateRange;
    }

    // Selectors for x-to-one associations
    public TdUserActivitySelector<TdUserActivityEvent> getUserActivitySelector() {
        return userActivitySelector;
    }
}