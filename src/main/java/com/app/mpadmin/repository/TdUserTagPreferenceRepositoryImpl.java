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
import com.app.mpadmin.domain.TdUserTagPreference;
import com.app.mpadmin.dao.TdUserTagPreferenceDao;

/**
 * Default implementation of the {@link TdUserTagPreferenceRepository} interface.
 * Note: you may use multiple DAO from this layer.
 * @see TdUserTagPreferenceRepository
 */
@Named("tdUserTagPreferenceRepository")
@Singleton
public class TdUserTagPreferenceRepositoryImpl extends RepositoryImpl<TdUserTagPreference, Integer> implements TdUserTagPreferenceRepository {

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(TdUserTagPreferenceRepositoryImpl.class);

    protected TdUserTagPreferenceDao tdUserTagPreferenceDao;

    @Inject
    public void setTdUserTagPreferenceDao(TdUserTagPreferenceDao tdUserTagPreferenceDao) {
        this.tdUserTagPreferenceDao = tdUserTagPreferenceDao;
    }

    /**
     * Dao getter used by the {@link RepositoryImpl}.
     */
    @Override
    public GenericDao<TdUserTagPreference, Integer> getDao() {
        return tdUserTagPreferenceDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdUserTagPreference getNew() {
        return new TdUserTagPreference();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdUserTagPreference getNewWithDefaults() {
        TdUserTagPreference result = getNew();
        result.initDefaultValues();
        return result;
    }

}