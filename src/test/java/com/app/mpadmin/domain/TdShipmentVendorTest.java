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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Basic tests for TdShipmentVendor
 */
@SuppressWarnings("unused")
public class TdShipmentVendorTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        TdShipmentVendor model = new TdShipmentVendor();
        assertFalse(model.isIdSet());
    }

    @Test
    public void isIdSetReturnsTrue() {
        TdShipmentVendor model = new TdShipmentVendor();
        model.setShipmentVendorId(ValueGenerator.getUniqueInteger());
        assertNotNull(model.getShipmentVendorId());
        assertTrue(model.isIdSet());
    }

    // test columns methods

    @Test
    public void toStringNotNull() {
        TdShipmentVendor model = new TdShipmentVendor();
        assertNotNull(model.toString());
    }

    @Test
    public void equalsUsingPk() {
        TdShipmentVendor model1 = new TdShipmentVendor();
        TdShipmentVendor model2 = new TdShipmentVendor();

        Integer shipmentVendorId = ValueGenerator.getUniqueInteger();
        model1.setShipmentVendorId(shipmentVendorId);
        model2.setShipmentVendorId(shipmentVendorId);

        model1.setShipmentVendorDisplayName("a");
        model2.setShipmentVendorDisplayName("a");

        model1.setShipmentVendorAlternateName("a");
        model2.setShipmentVendorAlternateName("a");

        model1.setShipmentVendorStandardMrpCost(1f);
        model2.setShipmentVendorStandardMrpCost(1f);

        model1.setShipmentVendorStandardDiscount(1f);
        model2.setShipmentVendorStandardDiscount(1f);

        model1.setShipmentVendorPolicy("a");
        model2.setShipmentVendorPolicy("a");

        model1.setShipmentVendorSpecialNote("a");
        model2.setShipmentVendorSpecialNote("a");

        model1.setShipmentDuration(1);
        model2.setShipmentDuration(1);

        model1.setShipmentVendorType(1);
        model2.setShipmentVendorType(1);

        model1.setShipmentVendorStatus(true);
        model2.setShipmentVendorStatus(true);

        model1.setCustom1("a");
        model2.setCustom1("a");

        model1.setCustom2("a");
        model2.setCustom2("a");

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