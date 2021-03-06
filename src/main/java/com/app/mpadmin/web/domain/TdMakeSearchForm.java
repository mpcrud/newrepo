/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.Ranges.RangeDate.newRangeDate;
import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TdMake_.*;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.Ranges.RangeDate;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdMake;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdMake search.
 */
@Component
@Scope("request")
public class TdMakeSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdMake tdMake = new TdMake();
    private RangeInteger<TdMake> isActiveRange = newRangeInteger(isActive);
    private RangeInteger<TdMake> startingYearOpsRange = newRangeInteger(startingYearOps);
    private RangeInteger<TdMake> representCountryIdRange = newRangeInteger(representCountryId);
    private RangeInteger<TdMake> makeStatusRange = newRangeInteger(makeStatus);
    private RangeDate<TdMake> updationDateRange = newRangeDate(updationDate);
    private RangeInteger<TdMake> makeIdRange = RangeInteger.newRangeInteger(makeId);

    public TdMake getTdMake() {
        return tdMake;
    }

    // Ranges, used from the view.
    public RangeInteger<TdMake> getMakeIdRange(){
        return makeIdRange;
    }
    public RangeInteger<TdMake> getIsActiveRange() {
        return isActiveRange;
    }

    public RangeInteger<TdMake> getStartingYearOpsRange() {
        return startingYearOpsRange;
    }

    public RangeInteger<TdMake> getRepresentCountryIdRange() {
        return representCountryIdRange;
    }

    public RangeInteger<TdMake> getMakeStatusRange() {
        return makeStatusRange;
    }

    public RangeDate<TdMake> getUpdationDateRange() {
        return updationDateRange;
    }
}