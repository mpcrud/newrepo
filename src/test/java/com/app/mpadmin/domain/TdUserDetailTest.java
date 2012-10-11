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
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.TemporalType.DATE;
import static javax.persistence.TemporalType.TIMESTAMP;
import static org.hibernate.annotations.CacheConcurrencyStrategy.NONSTRICT_READ_WRITE;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import com.app.mpadmin.domain.TdUserAuth;

/**
 * Basic tests for TdUserDetail
 */
@SuppressWarnings("unused")
public class TdUserDetailTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        TdUserDetail model = new TdUserDetail();
        assertFalse(model.isIdSet());
    }

    @Test
    public void isIdSetReturnsTrue() {
        TdUserDetail model = new TdUserDetail();
        model.setUserDetailsId(ValueGenerator.getUniqueInteger());
        assertNotNull(model.getUserDetailsId());
        assertTrue(model.isIdSet());
    }

    // test columns methods

    //-------------------------------------------------------------
    // Many to One:  TdUserDetail.userId ==> TdUserAuth.userId
    //-------------------------------------------------------------

    @Test
    public void manyToOne_setUser() {
        TdUserDetail many = new TdUserDetail();

        // init
        TdUserAuth one = new TdUserAuth();

        one.setUserId(ValueGenerator.getUniqueInteger());
        many.setUser(one);

        // make sure it is propagated properly
        assertNotNull(many.getUserId());
        assertEquals(one, many.getUser());
        assertSame(many.getUserId(), one.getUserId());
        // now set it to back to null
        many.setUser(null);

        // make sure null is propagated properly
        assertNull(many.getUser());

        // make sure it is propagated on fk column as well
        assertNull(many.getUserId());
    }

    @Test
    public void toStringNotNull() {
        TdUserDetail model = new TdUserDetail();
        assertNotNull(model.toString());
    }

    @Test
    public void equalsUsingPk() {
        TdUserDetail model1 = new TdUserDetail();
        TdUserDetail model2 = new TdUserDetail();

        Integer userDetailsId = ValueGenerator.getUniqueInteger();
        model1.setUserDetailsId(userDetailsId);
        model2.setUserDetailsId(userDetailsId);

        model1.setFirstname("a");
        model2.setFirstname("a");

        model1.setLastname("a");
        model2.setLastname("a");

        model1.setIsActive(1);
        model2.setIsActive(1);

        model1.setDob(new Date());
        model2.setDob(new Date());

        model1.setPhone(1);
        model2.setPhone(1);

        model1.setInterest("a");
        model2.setInterest("a");

        model1.setCreationDate(new Date());
        model2.setCreationDate(new Date());

        model1.setUpdationDate(new Date());
        model2.setUpdationDate(new Date());

        model1.setCredit(1);
        model2.setCredit(1);
        assertTrue(model1.isIdSet());
        assertTrue(model2.isIdSet());
        assertTrue(model1.hashCode() == model2.hashCode());
        assertTrue(model1.equals(model2));
        assertTrue(model2.equals(model1));
    }
}