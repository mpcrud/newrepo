/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TempTdSubmodelYearMapping_.makeSubmodelId;
import static com.app.mpadmin.domain.TempTdSubmodelYearMapping_.modelEndYear;
import static com.app.mpadmin.domain.TempTdSubmodelYearMapping_.modelLaunchYear;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TempTdSubmodelYearMapping;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tempTdSubmodelYearMapping search.
 */
@Component
@Scope("session")
public class TempTdSubmodelYearMappingSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TempTdSubmodelYearMapping tempTdSubmodelYearMapping = new TempTdSubmodelYearMapping();
    private RangeInteger<TempTdSubmodelYearMapping> makeSubmodelIdRange = newRangeInteger(makeSubmodelId);
    private RangeInteger<TempTdSubmodelYearMapping> modelLaunchYearRange = newRangeInteger(modelLaunchYear);
    private RangeInteger<TempTdSubmodelYearMapping> modelEndYearRange = newRangeInteger(modelEndYear);

    public TempTdSubmodelYearMapping getTempTdSubmodelYearMapping() {
        return tempTdSubmodelYearMapping;
    }

    // Ranges, used from the view.
    public RangeInteger<TempTdSubmodelYearMapping> getMakeSubmodelIdRange() {
        return makeSubmodelIdRange;
    }

    public RangeInteger<TempTdSubmodelYearMapping> getModelLaunchYearRange() {
        return modelLaunchYearRange;
    }

    public RangeInteger<TempTdSubmodelYearMapping> getModelEndYearRange() {
        return modelEndYearRange;
    }
}