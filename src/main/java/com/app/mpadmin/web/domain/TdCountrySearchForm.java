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
import static com.app.mpadmin.domain.TdCountry_.countryCode;
import static com.app.mpadmin.domain.TdCountry_.countryCode2;
import static com.app.mpadmin.domain.TdCountry_.importance;
import static com.app.mpadmin.domain.TdCountry_.isdCode;
import static com.app.mpadmin.domain.TdCountry_.updationDate;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.Ranges.RangeDate;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdCountry;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdCountry search.
 */
@Component
@Scope("session")
public class TdCountrySearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdCountry tdCountry = new TdCountry();
    private RangeInteger<TdCountry> importanceRange = newRangeInteger(importance);
    private RangeInteger<TdCountry> countryCodeRange = newRangeInteger(countryCode);
    private RangeInteger<TdCountry> countryCode2Range = newRangeInteger(countryCode2);
    private RangeInteger<TdCountry> isdCodeRange = newRangeInteger(isdCode);
    private RangeDate<TdCountry> updationDateRange = newRangeDate(updationDate);

    public TdCountry getTdCountry() {
        return tdCountry;
    }

    // Ranges, used from the view.
    public RangeInteger<TdCountry> getImportanceRange() {
        return importanceRange;
    }

    public RangeInteger<TdCountry> getCountryCodeRange() {
        return countryCodeRange;
    }

    public RangeInteger<TdCountry> getCountryCode2Range() {
        return countryCode2Range;
    }

    public RangeInteger<TdCountry> getIsdCodeRange() {
        return isdCodeRange;
    }

    public RangeDate<TdCountry> getUpdationDateRange() {
        return updationDateRange;
    }
}