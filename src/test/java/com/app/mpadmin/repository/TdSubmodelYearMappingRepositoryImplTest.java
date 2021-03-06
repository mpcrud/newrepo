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

import com.app.mpadmin.domain.TdSubmodelYearMapping;
import com.app.mpadmin.repository.TdSubmodelYearMappingRepositoryImpl;
import com.app.mpadmin.dao.TdSubmodelYearMappingDao;
import com.app.mpadmin.dao.support.SearchParameters;

/**
 * Unit test on TdSubmodelYearMappingRepositoryImpl
 */
public class TdSubmodelYearMappingRepositoryImplTest {

    private TdSubmodelYearMappingRepositoryImpl tdSubmodelYearMappingRepositoryImpl;
    private TdSubmodelYearMappingDao tdSubmodelYearMappingDao;

    @Before
    public void setUp() {
        // called before each test.
        tdSubmodelYearMappingRepositoryImpl = new TdSubmodelYearMappingRepositoryImpl();
        tdSubmodelYearMappingDao = mock(TdSubmodelYearMappingDao.class);
        tdSubmodelYearMappingRepositoryImpl.setTdSubmodelYearMappingDao(tdSubmodelYearMappingDao);
    }

    @Test
    public void testFindUniqueOrNoneCaseNone() {
        TdSubmodelYearMapping none = null;

        when(tdSubmodelYearMappingDao.findUniqueOrNone(any(TdSubmodelYearMapping.class), any(SearchParameters.class))).thenReturn(none);

        TdSubmodelYearMapping result = tdSubmodelYearMappingRepositoryImpl.findUniqueOrNone(new TdSubmodelYearMapping());

        assertThat(result).isNull();
        verify(tdSubmodelYearMappingDao, times(1)).findUniqueOrNone(any(TdSubmodelYearMapping.class), any(SearchParameters.class));
    }

    @Test
    public void testFindUniqueOrNoneCaseUnique() {
        TdSubmodelYearMapping unique = new TdSubmodelYearMapping();

        when(tdSubmodelYearMappingDao.findUniqueOrNone(any(TdSubmodelYearMapping.class), any(SearchParameters.class))).thenReturn(unique);

        TdSubmodelYearMapping result = tdSubmodelYearMappingRepositoryImpl.findUniqueOrNone(new TdSubmodelYearMapping());

        assertThat(result).isNotNull();
        verify(tdSubmodelYearMappingDao, times(1)).findUniqueOrNone(any(TdSubmodelYearMapping.class), any(SearchParameters.class));
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NonUniqueResultException.class)
    public void testFindUniqueOrNoneCaseMultiple() {
        when(tdSubmodelYearMappingDao.findUniqueOrNone(any(TdSubmodelYearMapping.class), any(SearchParameters.class)))
                .thenThrow(NonUniqueResultException.class);

        tdSubmodelYearMappingRepositoryImpl.findUniqueOrNone(new TdSubmodelYearMapping());
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NoResultException.class)
    public void testFindUniqueCaseNone() {
        when(tdSubmodelYearMappingDao.findUnique(any(TdSubmodelYearMapping.class), any(SearchParameters.class))).thenThrow(NoResultException.class);

        tdSubmodelYearMappingRepositoryImpl.findUnique(new TdSubmodelYearMapping());
    }

    @Test
    public void testFindUniqueCaseUnique() {
        TdSubmodelYearMapping unique = new TdSubmodelYearMapping();

        when(tdSubmodelYearMappingDao.findUnique(any(TdSubmodelYearMapping.class), any(SearchParameters.class))).thenReturn(unique);

        TdSubmodelYearMapping result = tdSubmodelYearMappingRepositoryImpl.findUnique(new TdSubmodelYearMapping());

        assertThat(result).isNotNull();
        verify(tdSubmodelYearMappingDao, times(1)).findUnique(any(TdSubmodelYearMapping.class), any(SearchParameters.class));
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NonUniqueResultException.class)
    public void testFindUniqueCaseMultiple() {
        when(tdSubmodelYearMappingDao.findUnique(any(TdSubmodelYearMapping.class), any(SearchParameters.class))).thenThrow(NonUniqueResultException.class);

        tdSubmodelYearMappingRepositoryImpl.findUnique(new TdSubmodelYearMapping());
    }
}