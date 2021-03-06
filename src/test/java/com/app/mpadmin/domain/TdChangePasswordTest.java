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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import org.hibernate.validator.constraints.NotEmpty;
import com.app.mpadmin.validation.FixedLength;

/**
 * Basic tests for TdChangePassword
 */
@SuppressWarnings("unused")
public class TdChangePasswordTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        TdChangePassword model = new TdChangePassword();
        assertFalse(model.isIdSet());
    }

    @Test
    public void isIdSetReturnsTrue() {
        TdChangePassword model = new TdChangePassword();
        model.setGuidInt(ValueGenerator.getUniqueInteger());
        assertNotNull(model.getGuidInt());
        assertTrue(model.isIdSet());
    }

    // test columns methods

    @Test
    public void toStringNotNull() {
        TdChangePassword model = new TdChangePassword();
        assertNotNull(model.toString());
    }

    @Test
    public void equalsUsingPk() {
        TdChangePassword model1 = new TdChangePassword();
        TdChangePassword model2 = new TdChangePassword();

        model1.setGuidChar("dddddddddddddddddddddddddddddddddddd");
        model2.setGuidChar("dddddddddddddddddddddddddddddddddddd");

      //  model1.setUserid(1);
      //  model2.setUserid(1);


        model1.setCreationDate(new Date());
        model2.setCreationDate(new Date());

        model1.setIsActive(1);
        model2.setIsActive(1);

        Integer guidInt = ValueGenerator.getUniqueInteger();
        model1.setGuidInt(guidInt);
        model2.setGuidInt(guidInt);
        assertTrue(model1.isIdSet());
        assertTrue(model2.isIdSet());
        assertTrue(model1.hashCode() == model2.hashCode());
        assertTrue(model1.equals(model2));
        assertTrue(model2.equals(model1));
    }
}