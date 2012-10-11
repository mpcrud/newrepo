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
import com.app.mpadmin.domain.TdCountry;
import com.app.mpadmin.dao.TdCountryDao;

/**
 * Default implementation of the {@link TdCountryRepository} interface.
 * Note: you may use multiple DAO from this layer.
 * @see TdCountryRepository
 */
@Named("tdCountryRepository")
@Singleton
public class TdCountryRepositoryImpl extends RepositoryImpl<TdCountry, Integer> implements TdCountryRepository {

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(TdCountryRepositoryImpl.class);

    protected TdCountryDao tdCountryDao;

    @Inject
    public void setTdCountryDao(TdCountryDao tdCountryDao) {
        this.tdCountryDao = tdCountryDao;
    }

    /**
     * Dao getter used by the {@link RepositoryImpl}.
     */
    @Override
    public GenericDao<TdCountry, Integer> getDao() {
        return tdCountryDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdCountry getNew() {
        return new TdCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdCountry getNewWithDefaults() {
        TdCountry result = getNew();
        result.initDefaultValues();
        return result;
    }

}