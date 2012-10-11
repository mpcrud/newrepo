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
import static org.hibernate.annotations.CacheConcurrencyStrategy.NONSTRICT_READ_WRITE;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;

/**
 * Basic tests for TdProductSubmodel
 */
@SuppressWarnings("unused")
public class TdProductSubmodelTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        TdProductSubmodel model = new TdProductSubmodel();
        assertFalse(model.isIdSet());
    }

    @Test
    public void isIdSetReturnsTrue() {
        TdProductSubmodel model = new TdProductSubmodel();
        model.setProductSubmodelId(ValueGenerator.getUniqueInteger());
        assertNotNull(model.getProductSubmodelId());
        assertTrue(model.isIdSet());
    }

    // test columns methods

    @Test
    public void toStringNotNull() {
        TdProductSubmodel model = new TdProductSubmodel();
        assertNotNull(model.toString());
    }

    @Test
    public void equalsUsingPk() {
        TdProductSubmodel model1 = new TdProductSubmodel();
        TdProductSubmodel model2 = new TdProductSubmodel();

        Integer productSubmodelId = ValueGenerator.getUniqueInteger();
        model1.setProductSubmodelId(productSubmodelId);
        model2.setProductSubmodelId(productSubmodelId);

      //  model1.setSubmodelYearMappingId(1);
      //  model2.setSubmodelYearMappingId(1);

     //   model1.setProductId(1);
    //    model2.setProductId(1);

        model1.setMakeInternalProductCode("a");
        model2.setMakeInternalProductCode("a");

        model1.setProductSubmodelApplyLocation("a");
        model2.setProductSubmodelApplyLocation("a");
        assertTrue(model1.isIdSet());
        assertTrue(model2.isIdSet());
        assertTrue(model1.hashCode() == model2.hashCode());
        assertTrue(model1.equals(model2));
        assertTrue(model2.equals(model1));
    }
}