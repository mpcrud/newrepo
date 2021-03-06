/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/test/java/service/ServiceImplTest.e.vm.java
 */
package com.app.mpadmin.repository;

import static org.fest.assertions.Assertions.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import javax.persistence.NonUniqueResultException;
import javax.persistence.NoResultException;

import org.junit.Before;
import org.junit.Test;

import com.app.mpadmin.domain.TdShipmentVendor;
import com.app.mpadmin.repository.TdShipmentVendorRepositoryImpl;
import com.app.mpadmin.dao.TdShipmentVendorDao;
import com.app.mpadmin.dao.support.SearchParameters;

/**
 * Unit test on TdShipmentVendorRepositoryImpl
 */
public class TdShipmentVendorRepositoryImplTest {

    private TdShipmentVendorRepositoryImpl tdShipmentVendorRepositoryImpl;
    private TdShipmentVendorDao tdShipmentVendorDao;

    @Before
    public void setUp() {
        // called before each test.
        tdShipmentVendorRepositoryImpl = new TdShipmentVendorRepositoryImpl();
        tdShipmentVendorDao = mock(TdShipmentVendorDao.class);
        tdShipmentVendorRepositoryImpl.setTdShipmentVendorDao(tdShipmentVendorDao);
    }

    @Test
    public void testFindUniqueOrNoneCaseNone() {
        TdShipmentVendor none = null;

        when(tdShipmentVendorDao.findUniqueOrNone(any(TdShipmentVendor.class), any(SearchParameters.class))).thenReturn(none);

        TdShipmentVendor result = tdShipmentVendorRepositoryImpl.findUniqueOrNone(new TdShipmentVendor());

        assertThat(result).isNull();
        verify(tdShipmentVendorDao, times(1)).findUniqueOrNone(any(TdShipmentVendor.class), any(SearchParameters.class));
    }

    @Test
    public void testFindUniqueOrNoneCaseUnique() {
        TdShipmentVendor unique = new TdShipmentVendor();

        when(tdShipmentVendorDao.findUniqueOrNone(any(TdShipmentVendor.class), any(SearchParameters.class))).thenReturn(unique);

        TdShipmentVendor result = tdShipmentVendorRepositoryImpl.findUniqueOrNone(new TdShipmentVendor());

        assertThat(result).isNotNull();
        verify(tdShipmentVendorDao, times(1)).findUniqueOrNone(any(TdShipmentVendor.class), any(SearchParameters.class));
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NonUniqueResultException.class)
    public void testFindUniqueOrNoneCaseMultiple() {
        when(tdShipmentVendorDao.findUniqueOrNone(any(TdShipmentVendor.class), any(SearchParameters.class))).thenThrow(NonUniqueResultException.class);

        tdShipmentVendorRepositoryImpl.findUniqueOrNone(new TdShipmentVendor());
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NoResultException.class)
    public void testFindUniqueCaseNone() {
        when(tdShipmentVendorDao.findUnique(any(TdShipmentVendor.class), any(SearchParameters.class))).thenThrow(NoResultException.class);

        tdShipmentVendorRepositoryImpl.findUnique(new TdShipmentVendor());
    }

    @Test
    public void testFindUniqueCaseUnique() {
        TdShipmentVendor unique = new TdShipmentVendor();

        when(tdShipmentVendorDao.findUnique(any(TdShipmentVendor.class), any(SearchParameters.class))).thenReturn(unique);

        TdShipmentVendor result = tdShipmentVendorRepositoryImpl.findUnique(new TdShipmentVendor());

        assertThat(result).isNotNull();
        verify(tdShipmentVendorDao, times(1)).findUnique(any(TdShipmentVendor.class), any(SearchParameters.class));
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NonUniqueResultException.class)
    public void testFindUniqueCaseMultiple() {
        when(tdShipmentVendorDao.findUnique(any(TdShipmentVendor.class), any(SearchParameters.class))).thenThrow(NonUniqueResultException.class);

        tdShipmentVendorRepositoryImpl.findUnique(new TdShipmentVendor());
    }
}