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
import static com.app.mpadmin.domain.TdCity_.*;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.Ranges.RangeDate;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdCity;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdCity search.
 */
@Component
@Scope("request")
public class TdCitySearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdCity tdCity = new TdCity();
    private RangeInteger<TdCity> populationRankRange = newRangeInteger(populationRank);
    private RangeInteger<TdCity> destinationRankRange = newRangeInteger(destinationRank);
    private RangeInteger<TdCity> flagRange = newRangeInteger(flag);
    private RangeInteger<TdCity> destinationTypeRange = newRangeInteger(destinationType);
    private RangeInteger<TdCity> importanceRange = newRangeInteger(importance);
    private RangeInteger<TdCity> metroIdRange = newRangeInteger(metroId);
    private RangeInteger<TdCity> isResourceRange = newRangeInteger(isResource);
    private RangeInteger<TdCity> isSupportedByRange = newRangeInteger(isSupportedBy);
    private RangeInteger<TdCity> customtable1Range = newRangeInteger(customtable1);
    private RangeInteger<TdCity> customtable2Range = newRangeInteger(customtable2);
    private RangeInteger<TdCity> customtable3Range = newRangeInteger(customtable3);
    private RangeInteger<TdCity> customtable4Range = newRangeInteger(customtable4);
    private RangeDate<TdCity> updationDateRange = newRangeDate(updationDate);
    private RangeInteger<TdCity> cityIdRange = RangeInteger.newRangeInteger(cityId);

    public TdCity getTdCity() {
        return tdCity;
    }

    // Ranges, used from the view.
    public RangeInteger<TdCity> getPopulationRankRange() {
        return populationRankRange;
    }

    public RangeInteger<TdCity> getDestinationRankRange() {
        return destinationRankRange;
    }

    public RangeInteger<TdCity> getFlagRange() {
        return flagRange;
    }

    public RangeInteger<TdCity> getDestinationTypeRange() {
        return destinationTypeRange;
    }

    public RangeInteger<TdCity> getImportanceRange() {
        return importanceRange;
    }

    public RangeInteger<TdCity> getMetroIdRange() {
        return metroIdRange;
    }

    public RangeInteger<TdCity> getCityIdRange(){
        return cityIdRange;
    }

    public RangeInteger<TdCity> getIsResourceRange() {
        return isResourceRange;
    }

    public RangeInteger<TdCity> getIsSupportedByRange() {
        return isSupportedByRange;
    }

    public RangeInteger<TdCity> getCustomtable1Range() {
        return customtable1Range;
    }

    public RangeInteger<TdCity> getCustomtable2Range() {
        return customtable2Range;
    }

    public RangeInteger<TdCity> getCustomtable3Range() {
        return customtable3Range;
    }

    public RangeInteger<TdCity> getCustomtable4Range() {
        return customtable4Range;
    }

    public RangeDate<TdCity> getUpdationDateRange() {
        return updationDateRange;
    }
}