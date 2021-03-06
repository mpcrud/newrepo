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

import com.app.mpadmin.domain.TdPicture;
import com.app.mpadmin.repository.TdPictureRepositoryImpl;
import com.app.mpadmin.dao.TdPictureDao;
import com.app.mpadmin.dao.support.SearchParameters;

/**
 * Unit test on TdPictureRepositoryImpl
 */
public class TdPictureRepositoryImplTest {

    private TdPictureRepositoryImpl tdPictureRepositoryImpl;
    private TdPictureDao tdPictureDao;

    @Before
    public void setUp() {
        // called before each test.
        tdPictureRepositoryImpl = new TdPictureRepositoryImpl();
        tdPictureDao = mock(TdPictureDao.class);
        tdPictureRepositoryImpl.setTdPictureDao(tdPictureDao);
    }

    @Test
    public void testFindUniqueOrNoneCaseNone() {
        TdPicture none = null;

        when(tdPictureDao.findUniqueOrNone(any(TdPicture.class), any(SearchParameters.class))).thenReturn(none);

        TdPicture result = tdPictureRepositoryImpl.findUniqueOrNone(new TdPicture());

        assertThat(result).isNull();
        verify(tdPictureDao, times(1)).findUniqueOrNone(any(TdPicture.class), any(SearchParameters.class));
    }

    @Test
    public void testFindUniqueOrNoneCaseUnique() {
        TdPicture unique = new TdPicture();

        when(tdPictureDao.findUniqueOrNone(any(TdPicture.class), any(SearchParameters.class))).thenReturn(unique);

        TdPicture result = tdPictureRepositoryImpl.findUniqueOrNone(new TdPicture());

        assertThat(result).isNotNull();
        verify(tdPictureDao, times(1)).findUniqueOrNone(any(TdPicture.class), any(SearchParameters.class));
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NonUniqueResultException.class)
    public void testFindUniqueOrNoneCaseMultiple() {
        when(tdPictureDao.findUniqueOrNone(any(TdPicture.class), any(SearchParameters.class))).thenThrow(NonUniqueResultException.class);

        tdPictureRepositoryImpl.findUniqueOrNone(new TdPicture());
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NoResultException.class)
    public void testFindUniqueCaseNone() {
        when(tdPictureDao.findUnique(any(TdPicture.class), any(SearchParameters.class))).thenThrow(NoResultException.class);

        tdPictureRepositoryImpl.findUnique(new TdPicture());
    }

    @Test
    public void testFindUniqueCaseUnique() {
        TdPicture unique = new TdPicture();

        when(tdPictureDao.findUnique(any(TdPicture.class), any(SearchParameters.class))).thenReturn(unique);

        TdPicture result = tdPictureRepositoryImpl.findUnique(new TdPicture());

        assertThat(result).isNotNull();
        verify(tdPictureDao, times(1)).findUnique(any(TdPicture.class), any(SearchParameters.class));
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NonUniqueResultException.class)
    public void testFindUniqueCaseMultiple() {
        when(tdPictureDao.findUnique(any(TdPicture.class), any(SearchParameters.class))).thenThrow(NonUniqueResultException.class);

        tdPictureRepositoryImpl.findUnique(new TdPicture());
    }
}