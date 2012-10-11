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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;

/**
 * Basic tests for AuthGroupPermissions
 */
@SuppressWarnings("unused")
public class AuthGroupPermissionsTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        AuthGroupPermissions model = new AuthGroupPermissions();
        assertFalse(model.isIdSet());
    }

    @Test
    public void isIdSetReturnsTrue() {
        AuthGroupPermissions model = new AuthGroupPermissions();
        model.setId(ValueGenerator.getUniqueInteger());
        assertNotNull(model.getId());
        assertTrue(model.isIdSet());
    }

    // test columns methods

    @Test
    public void toStringNotNull() {
        AuthGroupPermissions model = new AuthGroupPermissions();
        assertNotNull(model.toString());
    }

    @Test
    public void equalsUsingBusinessKey() {
        AuthGroupPermissions model1 = new AuthGroupPermissions();
        AuthGroupPermissions model2 = new AuthGroupPermissions();
        Integer groupId = 1;
        model1.setGroupId(groupId);
        model2.setGroupId(groupId);
        Integer permissionId = 1;
        model1.setPermissionId(permissionId);
        model2.setPermissionId(permissionId);
        assertTrue(model1.equals(model2));
        assertTrue(model2.equals(model1));
        assertTrue(model1.hashCode() == model2.hashCode());
    }
}