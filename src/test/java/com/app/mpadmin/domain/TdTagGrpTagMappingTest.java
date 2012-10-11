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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;

/**
 * Basic tests for TdTagGrpTagMapping
 */
@SuppressWarnings("unused")
public class TdTagGrpTagMappingTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        TdTagGrpTagMapping model = new TdTagGrpTagMapping();
        assertFalse(model.isIdSet());
    }

    @Test
    public void isIdSetReturnsTrue() {
        TdTagGrpTagMapping model = new TdTagGrpTagMapping();
        model.setGrpTagMappingId(ValueGenerator.getUniqueInteger());
        assertNotNull(model.getGrpTagMappingId());
        assertTrue(model.isIdSet());
    }

    // test columns methods

    @Test
    public void toStringNotNull() {
        TdTagGrpTagMapping model = new TdTagGrpTagMapping();
        assertNotNull(model.toString());
    }

    @Test
    public void equalsUsingPk() {
        TdTagGrpTagMapping model1 = new TdTagGrpTagMapping();
        TdTagGrpTagMapping model2 = new TdTagGrpTagMapping();

        Integer grpTagMappingId = ValueGenerator.getUniqueInteger();
        model1.setGrpTagMappingId(grpTagMappingId);
        model2.setGrpTagMappingId(grpTagMappingId);

    //    model1.setTagGrpId(1);
   //     model2.setTagGrpId(1);

   //     model1.setTagId(1);
  //      model2.setTagId(1);
        assertTrue(model1.isIdSet());
        assertTrue(model2.isIdSet());
        assertTrue(model1.hashCode() == model2.hashCode());
        assertTrue(model1.equals(model2));
        assertTrue(model2.equals(model1));
    }
}