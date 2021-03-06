/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TdSubmodelYearMapping_.makeSubmodelId;
import static com.app.mpadmin.domain.TdSubmodelYearMapping_.modelLaunchYear;
import static com.app.mpadmin.domain.TdSubmodelYearMapping_.submodelYearMappingId;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdSubmodelYearMapping;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdSubmodelYearMapping search.
 */
@Component
@Scope("request")
public class TdSubmodelYearMappingSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdSubmodelYearMapping tdSubmodelYearMapping = new TdSubmodelYearMapping();
    private RangeInteger<TdSubmodelYearMapping> makeSubmodelIdRange = newRangeInteger(makeSubmodelId);
    private RangeInteger<TdSubmodelYearMapping> modelLaunchYearRange = newRangeInteger(modelLaunchYear);
    private RangeInteger<TdSubmodelYearMapping> mappingIdRange = newRangeInteger(submodelYearMappingId);

    public TdSubmodelYearMapping getTdSubmodelYearMapping() {
        return tdSubmodelYearMapping;
    }

    // Ranges, used from the view.
    public RangeInteger<TdSubmodelYearMapping> getMappingIdRange(){
        return  mappingIdRange;
    }
    public RangeInteger<TdSubmodelYearMapping> getMakeSubmodelIdRange() {
        return makeSubmodelIdRange;
    }

    public RangeInteger<TdSubmodelYearMapping> getModelLaunchYearRange() {
        return modelLaunchYearRange;
    }
}