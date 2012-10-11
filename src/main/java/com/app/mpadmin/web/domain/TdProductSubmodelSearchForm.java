/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.EntitySelectors.TdProductSelector.newTdProductSelector;
import static com.app.mpadmin.dao.support.EntitySelectors.TdSubmodelYearMappingSelector.newTdSubmodelYearMappingSelector;
import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TdProductSubmodel_.submodelYearMappingId;
import static com.app.mpadmin.domain.TdProductSubmodel_.productId;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.app.mpadmin.dao.support.EntitySelectors.TdProductSelector;
import com.app.mpadmin.dao.support.EntitySelectors.TdSubmodelYearMappingSelector;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdProductSubmodel;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdProductSubmodel search.
 */
@Component
@Scope("session")
public class TdProductSubmodelSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdProductSubmodel tdProductSubmodel = new TdProductSubmodel();
   // private RangeInteger<TdProductSubmodel> submodelYearMappingIdRange = newRangeInteger(submodelYearMappingId);
   // private RangeInteger<TdProductSubmodel> productIdRange = newRangeInteger(productId);
    private TdProductSelector<TdProductSubmodel> productSelector = newTdProductSelector(productId);
    private TdSubmodelYearMappingSelector<TdProductSubmodel> submodelYearMappingSelector = newTdSubmodelYearMappingSelector(submodelYearMappingId);

    public TdProductSubmodel getTdProductSubmodel() {
        return tdProductSubmodel;
    }
    
    // Selectors for x-to-one associations
    public TdProductSelector<TdProductSubmodel> getProductSelector() {
        return productSelector;
    }
    
    public TdSubmodelYearMappingSelector<TdProductSubmodel> getSubmodelYearMappingSelector() {
        return submodelYearMappingSelector;
    }

    // Ranges, used from the view.
 /*   public RangeInteger<TdProductSubmodel> getSubmodelYearMappingIdRange() {
        return submodelYearMappingIdRange;
    }

    public RangeInteger<TdProductSubmodel> getProductIdRange() {
        return productIdRange;
    }*/
}