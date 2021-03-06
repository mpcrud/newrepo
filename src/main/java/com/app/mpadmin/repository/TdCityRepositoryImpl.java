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
import com.app.mpadmin.domain.TdCity;
import com.app.mpadmin.dao.TdCityDao;

/**
 * Default implementation of the {@link TdCityRepository} interface.
 * Note: you may use multiple DAO from this layer.
 * @see TdCityRepository
 */
@Named("tdCityRepository")
@Singleton
public class TdCityRepositoryImpl extends RepositoryImpl<TdCity, Integer> implements TdCityRepository {

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(TdCityRepositoryImpl.class);

    protected TdCityDao tdCityDao;

    @Inject
    public void setTdCityDao(TdCityDao tdCityDao) {
        this.tdCityDao = tdCityDao;
    }

    /**
     * Dao getter used by the {@link RepositoryImpl}.
     */
    @Override
    public GenericDao<TdCity, Integer> getDao() {
        return tdCityDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdCity getNew() {
        return new TdCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdCity getNewWithDefaults() {
        TdCity result = getNew();
        result.initDefaultValues();
        return result;
    }

}