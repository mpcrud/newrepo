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

import com.app.mpadmin.domain.TdTopic;
import com.app.mpadmin.repository.TdTopicRepositoryImpl;
import com.app.mpadmin.dao.TdTopicDao;
import com.app.mpadmin.dao.support.SearchParameters;

/**
 * Unit test on TdTopicRepositoryImpl
 */
public class TdTopicRepositoryImplTest {

    private TdTopicRepositoryImpl tdTopicRepositoryImpl;
    private TdTopicDao tdTopicDao;

    @Before
    public void setUp() {
        // called before each test.
        tdTopicRepositoryImpl = new TdTopicRepositoryImpl();
        tdTopicDao = mock(TdTopicDao.class);
        tdTopicRepositoryImpl.setTdTopicDao(tdTopicDao);
    }

    @Test
    public void testFindUniqueOrNoneCaseNone() {
        TdTopic none = null;

        when(tdTopicDao.findUniqueOrNone(any(TdTopic.class), any(SearchParameters.class))).thenReturn(none);

        TdTopic result = tdTopicRepositoryImpl.findUniqueOrNone(new TdTopic());

        assertThat(result).isNull();
        verify(tdTopicDao, times(1)).findUniqueOrNone(any(TdTopic.class), any(SearchParameters.class));
    }

    @Test
    public void testFindUniqueOrNoneCaseUnique() {
        TdTopic unique = new TdTopic();

        when(tdTopicDao.findUniqueOrNone(any(TdTopic.class), any(SearchParameters.class))).thenReturn(unique);

        TdTopic result = tdTopicRepositoryImpl.findUniqueOrNone(new TdTopic());

        assertThat(result).isNotNull();
        verify(tdTopicDao, times(1)).findUniqueOrNone(any(TdTopic.class), any(SearchParameters.class));
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NonUniqueResultException.class)
    public void testFindUniqueOrNoneCaseMultiple() {
        when(tdTopicDao.findUniqueOrNone(any(TdTopic.class), any(SearchParameters.class))).thenThrow(NonUniqueResultException.class);

        tdTopicRepositoryImpl.findUniqueOrNone(new TdTopic());
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NoResultException.class)
    public void testFindUniqueCaseNone() {
        when(tdTopicDao.findUnique(any(TdTopic.class), any(SearchParameters.class))).thenThrow(NoResultException.class);

        tdTopicRepositoryImpl.findUnique(new TdTopic());
    }

    @Test
    public void testFindUniqueCaseUnique() {
        TdTopic unique = new TdTopic();

        when(tdTopicDao.findUnique(any(TdTopic.class), any(SearchParameters.class))).thenReturn(unique);

        TdTopic result = tdTopicRepositoryImpl.findUnique(new TdTopic());

        assertThat(result).isNotNull();
        verify(tdTopicDao, times(1)).findUnique(any(TdTopic.class), any(SearchParameters.class));
    }

    @SuppressWarnings("unchecked")
    @Test(expected = NonUniqueResultException.class)
    public void testFindUniqueCaseMultiple() {
        when(tdTopicDao.findUnique(any(TdTopic.class), any(SearchParameters.class))).thenThrow(NonUniqueResultException.class);

        tdTopicRepositoryImpl.findUnique(new TdTopic());
    }
}