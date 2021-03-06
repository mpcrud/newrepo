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
import javax.validation.constraints.Size;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import org.hibernate.validator.constraints.URL;

/**
 * Basic tests for TdPage
 */
@SuppressWarnings("unused")
public class TdPageTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        TdPage model = new TdPage();
        assertFalse(model.isIdSet());
    }

    @Test
    public void isIdSetReturnsTrue() {
        TdPage model = new TdPage();
        model.setPageId(ValueGenerator.getUniqueInteger());
        assertNotNull(model.getPageId());
        assertTrue(model.isIdSet());
    }

    // test columns methods

    @Test
    public void toStringNotNull() {
        TdPage model = new TdPage();
        assertNotNull(model.toString());
    }

    @Test
    public void equalsUsingPk() {
        TdPage model1 = new TdPage();
        TdPage model2 = new TdPage();

        model1.setPageHeading("a");
        model2.setPageHeading("a");

        model1.setPageShortDesc("a");
        model2.setPageShortDesc("a");

        model1.setPageLongDesc("a");
        model2.setPageLongDesc("a");

        model1.setPageType(1);
        model2.setPageType(1);

     //   model1.setPageReferenceId(1);
     //   model2.setPageReferenceId(1);

        Integer pageId = ValueGenerator.getUniqueInteger();
        model1.setPageId(pageId);
        model2.setPageId(pageId);

        model1.setPageSeoUrl("http://www.jaxio.com");
        model2.setPageSeoUrl("http://www.jaxio.com");

        model1.setPageSeoKeyword("a");
        model2.setPageSeoKeyword("a");

        model1.setPageSeoMetaDesc("a");
        model2.setPageSeoMetaDesc("a");

        model1.setPageSeoTitle("a");
        model2.setPageSeoTitle("a");

        model1.setPageH1("a");
        model2.setPageH1("a");

        model1.setPageH2("a");
        model2.setPageH2("a");

        model1.setPageBackLink1("a");
        model2.setPageBackLink1("a");

        model1.setPageBackLink2("a");
        model2.setPageBackLink2("a");

        model1.setPageIsActive(1);
        model2.setPageIsActive(1);

        model1.setPagePriority(1);
        model2.setPagePriority(1);

        model1.setCreationDate(new Date());
        model2.setCreationDate(new Date());

        model1.setUpdationDate(new Date());
        model2.setUpdationDate(new Date());

        model1.setPageUserId(1);
        model2.setPageUserId(1);

        model1.setPageCustom1("a");
        model2.setPageCustom1("a");

        model1.setPageCustom2("a");
        model2.setPageCustom2("a");

        model1.setPageCustom3(1);
        model2.setPageCustom3(1);

        model1.setPageCustom4(1);
        model2.setPageCustom4(1);
        assertTrue(model1.isIdSet());
        assertTrue(model2.isIdSet());
        assertTrue(model1.hashCode() == model2.hashCode());
        assertTrue(model1.equals(model2));
        assertTrue(model2.equals(model1));
    }
}