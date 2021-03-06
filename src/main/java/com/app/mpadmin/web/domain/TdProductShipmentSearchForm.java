/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.EntitySelectors.TdShipmentVendorSelector.newTdShipmentVendorSelector;
import static com.app.mpadmin.dao.support.PropertySelectors.BooleanSelector.newBooleanSelector;
import static com.app.mpadmin.dao.support.Ranges.RangeDate.newRangeDate;
import static com.app.mpadmin.dao.support.Ranges.RangeFloat.newRangeFloat;
import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TdProductShipment_.*;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.EntitySelectors.TdShipmentVendorSelector;
import com.app.mpadmin.dao.support.PropertySelectors.BooleanSelector;
import com.app.mpadmin.dao.support.Ranges.RangeDate;
import com.app.mpadmin.dao.support.Ranges.RangeFloat;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdProductShipment;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdProductShipment search.
 */
@Component
@Scope("request")
public class TdProductShipmentSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdProductShipment tdProductShipment = new TdProductShipment();
    private RangeFloat<TdProductShipment> shipmentMrpCostRange = newRangeFloat(shipmentMrpCost);
    private RangeFloat<TdProductShipment> shipmentDiscountRange = newRangeFloat(shipmentDiscount);
    private RangeInteger<TdProductShipment> shipmentDurationRange = newRangeInteger(shipmentDuration);
    private RangeInteger<TdProductShipment> shipmentTypeRange = newRangeInteger(shipmentType);
    private RangeDate<TdProductShipment> updationDateRange = newRangeDate(updationDate);
    private BooleanSelector<TdProductShipment> shipmentStatusSelector = newBooleanSelector(shipmentStatus);
    private TdShipmentVendorSelector<TdProductShipment> shipmentVendorSelector = newTdShipmentVendorSelector(shipmentVendorId);
    private RangeInteger<TdProductShipment> productShipmentIdRange = newRangeInteger(productShipmentId);

    public TdProductShipment getTdProductShipment() {
        return tdProductShipment;
    }

    // Ranges, used from the view.
    public RangeInteger<TdProductShipment> getProductShipmentIdRange(){
        return productShipmentIdRange;
    }
    public RangeFloat<TdProductShipment> getShipmentMrpCostRange() {
        return shipmentMrpCostRange;
    }

    public RangeFloat<TdProductShipment> getShipmentDiscountRange() {
        return shipmentDiscountRange;
    }

    public RangeInteger<TdProductShipment> getShipmentDurationRange() {
        return shipmentDurationRange;
    }

    public RangeInteger<TdProductShipment> getShipmentTypeRange() {
        return shipmentTypeRange;
    }

    public RangeDate<TdProductShipment> getUpdationDateRange() {
        return updationDateRange;
    }

    // Selectors for property
    public BooleanSelector<TdProductShipment> getShipmentStatusSelector() {
        return shipmentStatusSelector;
    }

    // Selectors for x-to-one associations
    public TdShipmentVendorSelector<TdProductShipment> getShipmentVendorSelector() {
        return shipmentVendorSelector;
    }
}