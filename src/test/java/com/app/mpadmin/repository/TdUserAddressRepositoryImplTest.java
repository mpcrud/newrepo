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

import com.app.mpadmin.domain.TdUserAddress;
import com.app.mpadmin.repository.TdUserAddressRepositoryImpl;
import com.app.mpadmin.dao.TdUserAddressDao;
import com.app.mpadmin.dao.support.SearchParameters;

/**
 * Unit test on TdUserAddressRepositoryImpl
 */
public class TdUserAddressRepositoryImplTest {

    private TdUserAddressRepositoryImpl tdUserAddressRepositoryImpl;
    private TdUserAddressDao tdUserAddressDao;

    @Before
    public void setUp() {
        // called before each test.
        tdUserAddressRepositoryImpl = new TdUserAddressRepositoryImpl();
        tdUserAddressDao = mock(TdUserAddressDao.class);
        tdUserAddressRepositoryImpl.setTdUserAddressDao(tdUserAddressDao);
    }

    @Test
    public void testFindUniqueOrNoneCaseNone() {
        TdUserAddress none = null;

        when(tdUserAddressDao.findUniqueOrNone(any(TdUserAddress.class), any(SearchParameters.class))).thenReturn(none);

        TdUserAddress result = tdUserAddressRepositoryImpl.findUniqueOrNone(new TdUserAddress());

        assertThat(result).isNull();
        verify(tdUserAddressDao, times(1)).findUniqueOrNone(any(TdUserAddress.class), any(SearchParameters.class));
    }

    @Test
    public void testFindUniqueOrNoneCaseUnique() {
        TdUserAddress unique = new TdUserAddress();

        when(tdUserAddressDao.findUniqueOrNone(any(TdUserAddress.class), any(SearchParameters.class))).thenReturn(unique);

        TdUserAddress result = tdUserAddressRepositoryImpl.findUniqueOrNone(new TdUserAddress());

        assertThat(result).isNotNull();
        verify(tdUserAddressDao, times(1)).findUniqueOrNone(any(TdUserAddress.class), any(SearchParameters.class));
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NonUniqueResultException.class)
    public void testFindUniqueOrNoneCaseMultiple() {
        when(tdUserAddressDao.findUniqueOrNone(any(TdUserAddress.class), any(SearchParameters.class))).thenThrow(NonUniqueResultException.class);

        tdUserAddressRepositoryImpl.findUniqueOrNone(new TdUserAddress());
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NoResultException.class)
    public void testFindUniqueCaseNone() {
        when(tdUserAddressDao.findUnique(any(TdUserAddress.class), any(SearchParameters.class))).thenThrow(NoResultException.class);

        tdUserAddressRepositoryImpl.findUnique(new TdUserAddress());
    }

    @Test
    public void testFindUniqueCaseUnique() {
        TdUserAddress unique = new TdUserAddress();

        when(tdUserAddressDao.findUnique(any(TdUserAddress.class), any(SearchParameters.class))).thenReturn(unique);

        TdUserAddress result = tdUserAddressRepositoryImpl.findUnique(new TdUserAddress());

        assertThat(result).isNotNull();
        verify(tdUserAddressDao, times(1)).findUnique(any(TdUserAddress.class), any(SearchParameters.class));
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NonUniqueResultException.class)
    public void testFindUniqueCaseMultiple() {
        when(tdUserAddressDao.findUnique(any(TdUserAddress.class), any(SearchParameters.class))).thenThrow(NonUniqueResultException.class);

        tdUserAddressRepositoryImpl.findUnique(new TdUserAddress());
    }
}