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

import com.app.mpadmin.domain.TdMakeModel;
import com.app.mpadmin.repository.TdMakeModelRepositoryImpl;
import com.app.mpadmin.dao.TdMakeModelDao;
import com.app.mpadmin.dao.support.SearchParameters;

/**
 * Unit test on TdMakeModelRepositoryImpl
 */
public class TdMakeModelRepositoryImplTest {

    private TdMakeModelRepositoryImpl tdMakeModelRepositoryImpl;
    private TdMakeModelDao tdMakeModelDao;

    @Before
    public void setUp() {
        // called before each test.
        tdMakeModelRepositoryImpl = new TdMakeModelRepositoryImpl();
        tdMakeModelDao = mock(TdMakeModelDao.class);
        tdMakeModelRepositoryImpl.setTdMakeModelDao(tdMakeModelDao);
    }

    @Test
    public void testFindUniqueOrNoneCaseNone() {
        TdMakeModel none = null;

        when(tdMakeModelDao.findUniqueOrNone(any(TdMakeModel.class), any(SearchParameters.class))).thenReturn(none);

        TdMakeModel result = tdMakeModelRepositoryImpl.findUniqueOrNone(new TdMakeModel());

        assertThat(result).isNull();
        verify(tdMakeModelDao, times(1)).findUniqueOrNone(any(TdMakeModel.class), any(SearchParameters.class));
    }

    @Test
    public void testFindUniqueOrNoneCaseUnique() {
        TdMakeModel unique = new TdMakeModel();

        when(tdMakeModelDao.findUniqueOrNone(any(TdMakeModel.class), any(SearchParameters.class))).thenReturn(unique);

        TdMakeModel result = tdMakeModelRepositoryImpl.findUniqueOrNone(new TdMakeModel());

        assertThat(result).isNotNull();
        verify(tdMakeModelDao, times(1)).findUniqueOrNone(any(TdMakeModel.class), any(SearchParameters.class));
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NonUniqueResultException.class)
    public void testFindUniqueOrNoneCaseMultiple() {
        when(tdMakeModelDao.findUniqueOrNone(any(TdMakeModel.class), any(SearchParameters.class))).thenThrow(NonUniqueResultException.class);

        tdMakeModelRepositoryImpl.findUniqueOrNone(new TdMakeModel());
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NoResultException.class)
    public void testFindUniqueCaseNone() {
        when(tdMakeModelDao.findUnique(any(TdMakeModel.class), any(SearchParameters.class))).thenThrow(NoResultException.class);

        tdMakeModelRepositoryImpl.findUnique(new TdMakeModel());
    }

    @Test
    public void testFindUniqueCaseUnique() {
        TdMakeModel unique = new TdMakeModel();

        when(tdMakeModelDao.findUnique(any(TdMakeModel.class), any(SearchParameters.class))).thenReturn(unique);

        TdMakeModel result = tdMakeModelRepositoryImpl.findUnique(new TdMakeModel());

        assertThat(result).isNotNull();
        verify(tdMakeModelDao, times(1)).findUnique(any(TdMakeModel.class), any(SearchParameters.class));
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NonUniqueResultException.class)
    public void testFindUniqueCaseMultiple() {
        when(tdMakeModelDao.findUnique(any(TdMakeModel.class), any(SearchParameters.class))).thenThrow(NonUniqueResultException.class);

        tdMakeModelRepositoryImpl.findUnique(new TdMakeModel());
    }
}