/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.EntitySelectors.TdMakeModelSelector.newTdMakeModelSelector;
import static com.app.mpadmin.dao.support.Ranges.RangeDate.newRangeDate;
import static com.app.mpadmin.dao.support.Ranges.RangeDouble.newRangeDouble;
import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TdMakeSubmodel_.*;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.persistence.metamodel.SingularAttribute;
import com.app.mpadmin.dao.support.EntitySelectors.TdMakeModelSelector;
import com.app.mpadmin.dao.support.Ranges.RangeDate;
import com.app.mpadmin.dao.support.Ranges.RangeDouble;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdMakeModel;
import com.app.mpadmin.domain.TdMakeSubmodel;
import com.app.mpadmin.web.domain.support.SearchFormBase;


/**
 * Simple parameters holder for tdMakeSubmodel search.
 */
@Component
@Scope("request")
public class TdMakeSubmodelSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdMakeSubmodel tdMakeSubmodel = new TdMakeSubmodel();
    private RangeDouble<TdMakeSubmodel> makeModelIdRange = newRangeDouble(makeModelId);
    private RangeInteger<TdMakeSubmodel> submodelLaunchYearRange = newRangeInteger(submodelLaunchYear);
    private RangeInteger<TdMakeSubmodel> fuelTypeRange = newRangeInteger(fuelType);
    private RangeInteger<TdMakeSubmodel> transmissionTypeRange = newRangeInteger(transmissionType);
    private RangeInteger<TdMakeSubmodel> wheeldriveTypeRange = newRangeInteger(wheeldriveType);
    private RangeInteger<TdMakeSubmodel> engineCapacityRange = newRangeInteger(engineCapacity);
    private RangeInteger<TdMakeSubmodel> bodyTypeRange = newRangeInteger(bodyType);
    private RangeInteger<TdMakeSubmodel> doorCountRange = newRangeInteger(doorCount);
    private RangeInteger<TdMakeSubmodel> gearCountRange = newRangeInteger(gearCount);
    private RangeInteger<TdMakeSubmodel> fuelDeliveryRange = newRangeInteger(fuelDelivery);
    private RangeInteger<TdMakeSubmodel> valvesCountRange = newRangeInteger(valvesCount);
    private RangeInteger<TdMakeSubmodel> isActiveRange = newRangeInteger(isActive);
    private RangeInteger<TdMakeSubmodel> bhpRange = newRangeInteger(bhp);
    private RangeInteger<TdMakeSubmodel> torqueRange = newRangeInteger(torque);
    private RangeInteger<TdMakeSubmodel> submodelTypeRange = newRangeInteger(submodelType);
    private RangeInteger<TdMakeSubmodel> specialEditionYearRange = newRangeInteger(specialEditionYear);
    private RangeInteger<TdMakeSubmodel> makesubmodelStatusRange = newRangeInteger(makesubmodelStatus);
    private RangeDate<TdMakeSubmodel> updationDateRange = newRangeDate(updationDate);
    //private TdMakeModelSelector<TdMakeSubmodel> makeModelSelector = newTdMakeModelSelector(makeModelId);
    private  RangeDouble<TdMakeSubmodel> makeSubmodelIdRange = newRangeDouble(makeSubmodelId);

    public TdMakeSubmodel getTdMakeSubmodel() { 
        return tdMakeSubmodel;
    }

    // Ranges, used from the view.
    public RangeDouble<TdMakeSubmodel> getMakeSubmodelIdRange(){
        return makeSubmodelIdRange;
    }

    public RangeDouble<TdMakeSubmodel> getMakeModelIdRange() {
        return makeModelIdRange;
    }

    public RangeInteger<TdMakeSubmodel> getSubmodelLaunchYearRange() {
        return submodelLaunchYearRange;
    }

    public RangeInteger<TdMakeSubmodel> getFuelTypeRange() {
        return fuelTypeRange;
    }

    public RangeInteger<TdMakeSubmodel> getTransmissionTypeRange() {
        return transmissionTypeRange;
    }

    public RangeInteger<TdMakeSubmodel> getWheeldriveTypeRange() {
        return wheeldriveTypeRange;
    }

    public RangeInteger<TdMakeSubmodel> getEngineCapacityRange() {
        return engineCapacityRange;
    }

    public RangeInteger<TdMakeSubmodel> getBodyTypeRange() {
        return bodyTypeRange;
    }

    public RangeInteger<TdMakeSubmodel> getDoorCountRange() {
        return doorCountRange;
    }

    public RangeInteger<TdMakeSubmodel> getGearCountRange() {
        return gearCountRange;
    }

    public RangeInteger<TdMakeSubmodel> getFuelDeliveryRange() {
        return fuelDeliveryRange;
    }

    public RangeInteger<TdMakeSubmodel> getValvesCountRange() {
        return valvesCountRange;
    }

    public RangeInteger<TdMakeSubmodel> getIsActiveRange() {
        return isActiveRange;
    }

    public RangeInteger<TdMakeSubmodel> getBhpRange() {
        return bhpRange;
    }

    public RangeInteger<TdMakeSubmodel> getTorqueRange() {
        return torqueRange;
    }

    public RangeInteger<TdMakeSubmodel> getSubmodelTypeRange() {
        return submodelTypeRange;
    }

    public RangeInteger<TdMakeSubmodel> getSpecialEditionYearRange() {
        return specialEditionYearRange;
    }

    public RangeInteger<TdMakeSubmodel> getMakesubmodelStatusRange() {
        return makesubmodelStatusRange;
    }

    public RangeDate<TdMakeSubmodel> getUpdationDateRange() {
        return updationDateRange;
    }
    
 // Selectors for x-to-one associations
 /*   public TdMakeModelSelector<TdMakeSubmodel> getMakeModelSelector() {
        return makeModelSelector;
    }*/
}