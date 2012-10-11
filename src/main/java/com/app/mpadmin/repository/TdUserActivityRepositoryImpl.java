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
import com.app.mpadmin.domain.TdUserActivity;
import com.app.mpadmin.dao.TdUserActivityDao;

/**
 * Default implementation of the {@link TdUserActivityRepository} interface.
 * Note: you may use multiple DAO from this layer.
 * @see TdUserActivityRepository
 */
@Named("tdUserActivityRepository")
@Singleton
public class TdUserActivityRepositoryImpl extends RepositoryImpl<TdUserActivity, Integer> implements TdUserActivityRepository {

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(TdUserActivityRepositoryImpl.class);

    protected TdUserActivityDao tdUserActivityDao;

    @Inject
    public void setTdUserActivityDao(TdUserActivityDao tdUserActivityDao) {
        this.tdUserActivityDao = tdUserActivityDao;
    }

    /**
     * Dao getter used by the {@link RepositoryImpl}.
     */
    @Override
    public GenericDao<TdUserActivity, Integer> getDao() {
        return tdUserActivityDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdUserActivity getNew() {
        return new TdUserActivity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdUserActivity getNewWithDefaults() {
        TdUserActivity result = getNew();
        result.initDefaultValues();
        return result;
    }

}