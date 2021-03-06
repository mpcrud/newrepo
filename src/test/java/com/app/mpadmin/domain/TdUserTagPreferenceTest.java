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
import static javax.persistence.TemporalType.TIMESTAMP;
import static org.hibernate.annotations.CacheConcurrencyStrategy.NONSTRICT_READ_WRITE;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import com.app.mpadmin.domain.TdTag;
import com.app.mpadmin.domain.TdUserAuth;

/**
 * Basic tests for TdUserTagPreference
 */
@SuppressWarnings("unused")
public class TdUserTagPreferenceTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        TdUserTagPreference model = new TdUserTagPreference();
        assertFalse(model.isIdSet());
    }

    @Test
    public void isIdSetReturnsTrue() {
        TdUserTagPreference model = new TdUserTagPreference();
        model.setUserTagPreferenceId(ValueGenerator.getUniqueInteger());
        assertNotNull(model.getUserTagPreferenceId());
        assertTrue(model.isIdSet());
    }

    // test columns methods

    //-------------------------------------------------------------
    // Many to One:  TdUserTagPreference.userId ==> TdUserAuth.userId
    //-------------------------------------------------------------

    @Test
    public void manyToOne_setUser() {
        TdUserTagPreference many = new TdUserTagPreference();

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
    public void manyToOne_setTag() {
        TdUserTagPreference many = new TdUserTagPreference();

        // init
        TdTag one = new TdTag();

        one.setTagId(ValueGenerator.getUniqueInteger());
        many.setTag(one);

        // make sure it is propagated properly
        assertNotNull(many.getTagId());
        assertEquals(one, many.getTag());
        assertSame(many.getTagId(), one.getTagId());
        // now set it to back to null
        many.setTag(null);

        // make sure null is propagated properly
        assertNull(many.getTag());

        // make sure it is propagated on fk column as well
        assertNull(many.getTagId());
    }

    @Test
    public void toStringNotNull() {
        TdUserTagPreference model = new TdUserTagPreference();
        assertNotNull(model.toString());
    }

    @Test
    public void equalsUsingPk() {
        TdUserTagPreference model1 = new TdUserTagPreference();
        TdUserTagPreference model2 = new TdUserTagPreference();

        Integer userTagPreferenceId = ValueGenerator.getUniqueInteger();
        model1.setUserTagPreferenceId(userTagPreferenceId);
        model2.setUserTagPreferenceId(userTagPreferenceId);

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