/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/repository/RepositoryImpl.e.vm.java
 */
package com.app.mpadmin.repository;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import javax.inject.Named;
import javax.inject.Singleton;

import com.app.mpadmin.dao.support.GenericDao;
import com.app.mpadmin.repository.support.RepositoryImpl;
import com.app.mpadmin.domain.TdUserActivityEvent;
import com.app.mpadmin.dao.TdUserActivityEventDao;

/**
 * Default implementation of the {@link TdUserActivityEventRepository} interface.
 * Note: you may use multiple DAO from this layer.
 * @see TdUserActivityEventRepository
 */
@Named("tdUserActivityEventRepository")
@Singleton
public class TdUserActivityEventRepositoryImpl extends RepositoryImpl<TdUserActivityEvent, Integer> implements TdUserActivityEventRepository {

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(TdUserActivityEventRepositoryImpl.class);

    protected TdUserActivityEventDao tdUserActivityEventDao;

    @Inject
    public void setTdUserActivityEventDao(TdUserActivityEventDao tdUserActivityEventDao) {
        this.tdUserActivityEventDao = tdUserActivityEventDao;
    }

    /**
     * Dao getter used by the {@link RepositoryImpl}.
     */
    @Override
    public GenericDao<TdUserActivityEvent, Integer> getDao() {
        return tdUserActivityEventDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdUserActivityEvent getNew() {
        return new TdUserActivityEvent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdUserActivityEvent getNewWithDefaults() {
        TdUserActivityEvent result = getNew();
        result.initDefaultValues();
        return result;
    }

}