/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.PropertySelectors.BooleanSelector.newBooleanSelector;
import static com.app.mpadmin.dao.support.Ranges.RangeDate.newRangeDate;
import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TdProductSupplier_.*;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.PropertySelectors.BooleanSelector;
import com.app.mpadmin.dao.support.Ranges.RangeDate;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdProductSupplier;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdProductSupplier search.
 */
@Component
@Scope("request")
public class TdProductSupplierSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdProductSupplier tdProductSupplier = new TdProductSupplier();
    private RangeInteger<TdProductSupplier> productSupplierRatingRange = newRangeInteger(productSupplierRating);
    private RangeInteger<TdProductSupplier> productSupplierTypeRange = newRangeInteger(productSupplierType);
    private RangeDate<TdProductSupplier> updationDateRange = newRangeDate(updationDate);
    private BooleanSelector<TdProductSupplier> productSupplierStatusSelector = newBooleanSelector(productSupplierStatus);
    private RangeInteger<TdProductSupplier> productSupplierIdRange  = newRangeInteger(productSupplierId);
    public TdProductSupplier getTdProductSupplier() {
        return tdProductSupplier;
    }

    // Ranges, used from the view.
    public RangeInteger<TdProductSupplier> getProductSupplierIdRange(){
        return productSupplierIdRange;
    }
    public RangeInteger<TdProductSupplier> getProductSupplierRatingRange() {
        return productSupplierRatingRange;
    }

    public RangeInteger<TdProductSupplier> getProductSupplierTypeRange() {
        return productSupplierTypeRange;
    }

    public RangeDate<TdProductSupplier> getUpdationDateRange() {
        return updationDateRange;
    }

    // Selectors for property
    public BooleanSelector<TdProductSupplier> getProductSupplierStatusSelector() {
        return productSupplierStatusSelector;
    }
}