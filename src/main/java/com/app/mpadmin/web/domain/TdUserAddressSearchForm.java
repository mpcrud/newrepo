/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.EntitySelectors.TdCitySelector.newTdCitySelector;
import static com.app.mpadmin.dao.support.EntitySelectors.TdCountrySelector.newTdCountrySelector;
import static com.app.mpadmin.dao.support.EntitySelectors.TdMetroSelector.newTdMetroSelector;
import static com.app.mpadmin.dao.support.EntitySelectors.TdStateSelector.newTdStateSelector;
import static com.app.mpadmin.dao.support.Ranges.RangeDate.newRangeDate;
import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TdUserAddress_.*;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.EntitySelectors.TdCitySelector;
import com.app.mpadmin.dao.support.EntitySelectors.TdCountrySelector;
import com.app.mpadmin.dao.support.EntitySelectors.TdMetroSelector;
import com.app.mpadmin.dao.support.EntitySelectors.TdStateSelector;
import com.app.mpadmin.dao.support.Ranges.RangeDate;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdUserAddress;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdUserAddress search.
 */
@Component
@Scope("request")
public class TdUserAddressSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdUserAddress tdUserAddress = new TdUserAddress();
    private RangeInteger<TdUserAddress> zipCodeRange = newRangeInteger(zipCode);
    private RangeInteger<TdUserAddress> userDetailsIdRange = newRangeInteger(userDetailsId);
    private RangeDate<TdUserAddress> updationDateRange = newRangeDate(updationDate);
    private RangeInteger<TdUserAddress> isActiveRange = newRangeInteger(isActive);
    private TdCountrySelector<TdUserAddress> countrySelector = newTdCountrySelector(countryId);
    private TdStateSelector<TdUserAddress> stateSelector = newTdStateSelector(stateId);
    private TdCitySelector<TdUserAddress> citySelector = newTdCitySelector(cityId);
    private TdMetroSelector<TdUserAddress> metroSelector = newTdMetroSelector(metroId);
    private RangeInteger<TdUserAddress> userAddressIdRange = newRangeInteger(userAddressId);

    public TdUserAddress getTdUserAddress() {
        return tdUserAddress;
    }

    // Ranges, used from the view.
    public RangeInteger<TdUserAddress> getUserAddressIdRange() {
        return userAddressIdRange;
    }
    public RangeInteger<TdUserAddress> getZipCodeRange() {
        return zipCodeRange;
    }

    public RangeInteger<TdUserAddress> getUserDetailsIdRange() {
        return userDetailsIdRange;
    }

    public RangeDate<TdUserAddress> getUpdationDateRange() {
        return updationDateRange;
    }

    public RangeInteger<TdUserAddress> getIsActiveRange() {
        return isActiveRange;
    }

    // Selectors for x-to-one associations
    public TdCountrySelector<TdUserAddress> getCountrySelector() {
        return countrySelector;
    }

    public TdStateSelector<TdUserAddress> getStateSelector() {
        return stateSelector;
    }

    public TdCitySelector<TdUserAddress> getCitySelector() {
        return citySelector;
    }

    public TdMetroSelector<TdUserAddress> getMetroSelector() {
        return metroSelector;
    }
}