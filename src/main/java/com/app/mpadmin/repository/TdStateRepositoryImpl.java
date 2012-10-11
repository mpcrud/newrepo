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
import com.app.mpadmin.domain.TdState;
import com.app.mpadmin.dao.TdStateDao;

/**
 * Default implementation of the {@link TdStateRepository} interface.
 * Note: you may use multiple DAO from this layer.
 * @see TdStateRepository
 */
@Named("tdStateRepository")
@Singleton
public class TdStateRepositoryImpl extends RepositoryImpl<TdState, Integer> implements TdStateRepository {

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(TdStateRepositoryImpl.class);

    protected TdStateDao tdStateDao;

    @Inject
    public void setTdStateDao(TdStateDao tdStateDao) {
        this.tdStateDao = tdStateDao;
    }

    /**
     * Dao getter used by the {@link RepositoryImpl}.
     */
    @Override
    public GenericDao<TdState, Integer> getDao() {
        return tdStateDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdState getNew() {
        return new TdState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdState getNewWithDefaults() {
        TdState result = getNew();
        result.initDefaultValues();
        return result;
    }

}