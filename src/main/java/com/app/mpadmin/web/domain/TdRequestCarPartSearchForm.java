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
import static com.app.mpadmin.domain.TdRequestCarPart_.carYear;
import static com.app.mpadmin.domain.TdRequestCarPart_.lastUpdateDate;
import static com.app.mpadmin.domain.TdRequestCarPart_.requestStatus;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.Ranges.RangeDate;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdRequestCarPart;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdRequestCarPart search.
 */
@Component
@Scope("session")
public class TdRequestCarPartSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdRequestCarPart tdRequestCarPart = new TdRequestCarPart();
    private RangeDate<TdRequestCarPart> lastUpdateDateRange = newRangeDate(lastUpdateDate);
    private RangeInteger<TdRequestCarPart> carYearRange = newRangeInteger(carYear);
    private RangeInteger<TdRequestCarPart> requestStatusRange = newRangeInteger(requestStatus);

    public TdRequestCarPart getTdRequestCarPart() {
        return tdRequestCarPart;
    }

    // Ranges, used from the view.
    public RangeDate<TdRequestCarPart> getLastUpdateDateRange() {
        return lastUpdateDateRange;
    }

    public RangeInteger<TdRequestCarPart> getCarYearRange() {
        return carYearRange;
    }

    public RangeInteger<TdRequestCarPart> getRequestStatusRange() {
        return requestStatusRange;
    }
}