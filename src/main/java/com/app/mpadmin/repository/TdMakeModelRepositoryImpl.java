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
import com.app.mpadmin.domain.TdMakeModel;
import com.app.mpadmin.dao.TdMakeModelDao;

/**
 * Default implementation of the {@link TdMakeModelRepository} interface.
 * Note: you may use multiple DAO from this layer.
 * @see TdMakeModelRepository
 */
@Named("tdMakeModelRepository")
@Singleton
public class TdMakeModelRepositoryImpl extends RepositoryImpl<TdMakeModel, Integer> implements TdMakeModelRepository {

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(TdMakeModelRepositoryImpl.class);

    protected TdMakeModelDao tdMakeModelDao;

    @Inject
    public void setTdMakeModelDao(TdMakeModelDao tdMakeModelDao) {
        this.tdMakeModelDao = tdMakeModelDao;
    }

    /**
     * Dao getter used by the {@link RepositoryImpl}.
     */
    @Override
    public GenericDao<TdMakeModel, Integer> getDao() {
        return tdMakeModelDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdMakeModel getNew() {
        return new TdMakeModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdMakeModel getNewWithDefaults() {
        TdMakeModel result = getNew();
        result.initDefaultValues();
        return result;
    }

}