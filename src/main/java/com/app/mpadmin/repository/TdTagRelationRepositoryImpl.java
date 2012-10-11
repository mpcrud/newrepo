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
import com.app.mpadmin.domain.TdTagRelation;
import com.app.mpadmin.dao.TdTagRelationDao;

/**
 * Default implementation of the {@link TdTagRelationRepository} interface.
 * Note: you may use multiple DAO from this layer.
 * @see TdTagRelationRepository
 */
@Named("tdTagRelationRepository")
@Singleton
public class TdTagRelationRepositoryImpl extends RepositoryImpl<TdTagRelation, Integer> implements TdTagRelationRepository {

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(TdTagRelationRepositoryImpl.class);

    protected TdTagRelationDao tdTagRelationDao;

    @Inject
    public void setTdTagRelationDao(TdTagRelationDao tdTagRelationDao) {
        this.tdTagRelationDao = tdTagRelationDao;
    }

    /**
     * Dao getter used by the {@link RepositoryImpl}.
     */
    @Override
    public GenericDao<TdTagRelation, Integer> getDao() {
        return tdTagRelationDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdTagRelation getNew() {
        return new TdTagRelation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdTagRelation getNewWithDefaults() {
        TdTagRelation result = getNew();
        result.initDefaultValues();
        return result;
    }

}