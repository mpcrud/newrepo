/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/test/java/domain/ModelTest.e.vm.java
 */
package com.app.mpadmin.domain;

import java.io.*;
import java.util.*;

import static org.junit.Assert.*;
import org.junit.Test;

import com.app.mpadmin.util.*;
import static javax.persistence.TemporalType.TIMESTAMP;
import static org.hibernate.annotations.CacheConcurrencyStrategy.NONSTRICT_READ_WRITE;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import org.hibernate.validator.constraints.URL;

/**
 * Basic tests for TdMakeModel
 */
@SuppressWarnings("unused")
public class TdMakeModelTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        TdMakeModel model = new TdMakeModel();
        assertFalse(model.isIdSet());
    }

    @Test
    public void isIdSetReturnsTrue() {
        TdMakeModel model = new TdMakeModel();
        model.setMakeModelId(ValueGenerator.getUniqueInteger());
        assertNotNull(model.getMakeModelId());
        assertTrue(model.isIdSet());
    }

    // test columns methods

    @Test
    public void toStringNotNull() {
        TdMakeModel model = new TdMakeModel();
        assertNotNull(model.toString());
    }

    @Test
    public void equalsUsingPk() {
        TdMakeModel model1 = new TdMakeModel();
        TdMakeModel model2 = new TdMakeModel();

        Integer makeModelId = ValueGenerator.getUniqueInteger();
        model1.setMakeModelId(makeModelId);
        model2.setMakeModelId(makeModelId);

        //model1.setMakeId(1);
        //model2.setMakeId(1);

        model1.setMakemodelDisplayName("a");
        model2.setMakemodelDisplayName("a");

        model1.setMakemodelTechnicalName("a");
        model2.setMakemodelTechnicalName("a");

        model1.setMakemodelAlternateName("a");
        model2.setMakemodelAlternateName("a");

        model1.setShortDesc("a");
        model2.setShortDesc("a");

        model1.setLongDesc("d".getBytes());
        model2.setLongDesc("d".getBytes());

        model1.setIsActive(1);
        model2.setIsActive(1);

        model1.setModelLaunchYear(1);
        model2.setModelLaunchYear(1);

        model1.setFuelType(1);
        model2.setFuelType(1);

        model1.setTransmissionType(1);
        model2.setTransmissionType(1);

        model1.setWheeldriveType(1);
        model2.setWheeldriveType(1);

        model1.setEngineCapacity(1);
        model2.setEngineCapacity(1);

        model1.setBodyType(1);
        model2.setBodyType(1);

        model1.setDoorCount(1);
        model2.setDoorCount(1);

        model1.setGearCount(1);
        model2.setGearCount(1);

        model1.setFuelDelivery(1);
        model2.setFuelDelivery(1);

        model1.setValvesCount(1);
        model2.setValvesCount(1);

        model1.setBhp(1);
        model2.setBhp(1);

        model1.setTorque(1);
        model2.setTorque(1);

        model1.setMakemodelStatus(1);
        model2.setMakemodelStatus(1);

        model1.setSeoResources("a");
        model2.setSeoResources("a");

        model1.setSeoUrl("http://www.jaxio.com");
        model2.setSeoUrl("http://www.jaxio.com");

        model1.setSeoH1("a");
        model2.setSeoH1("a");

        model1.setSeoH2("a");
        model2.setSeoH2("a");

        model1.setMetaTitle("a");
        model2.setMetaTitle("a");

        model1.setMetaKeyword("a");
        model2.setMetaKeyword("a");

        model1.setMetaDescription("a");
        model2.setMetaDescription("a");

        model1.setCustom1("a");
        model2.setCustom1("a");

        model1.setCustom2("a");
        model2.setCustom2("a");

        model1.setCustom3("a");
        model2.setCustom3("a");

        model1.setCreationDate(new Date());
        model2.setCreationDate(new Date());

        model1.setUpdationDate(new Date());
        model2.setUpdationDate(new Date());
        assertTrue(model1.isIdSet());
        assertTrue(model2.isIdSet());
        assertTrue(model1.hashCode() == model2.hashCode());
        assertTrue(model1.equals(model2));
        assertTrue(model2.equals(model1));
    }
}