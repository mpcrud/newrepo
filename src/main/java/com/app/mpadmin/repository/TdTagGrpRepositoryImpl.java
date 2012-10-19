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
import com.app.mpadmin.domain.TdTagGrp;
import com.app.mpadmin.dao.TdTagGrpDao;

/**
 * Default implementation of the {@link TdTagGrpRepository} interface.
 * Note: you may use multiple DAO from this layer.
 * @see TdTagGrpRepository
 */
@Named("tdTagGrpRepository")
@Singleton
public class TdTagGrpRepositoryImpl extends RepositoryImpl<TdTagGrp, Integer> implements TdTagGrpRepository {

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(TdTagGrpRepositoryImpl.class);

    protected TdTagGrpDao tdTagGrpDao;

    @Inject
    public void setTdTagGrpDao(TdTagGrpDao tdTagGrpDao) {
        this.tdTagGrpDao = tdTagGrpDao;
    }

    /**
     * Dao getter used by the {@link RepositoryImpl}.
     */
    @Override
    public GenericDao<TdTagGrp, Integer> getDao() {
        return tdTagGrpDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdTagGrp getNew() {
        return new TdTagGrp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdTagGrp getNewWithDefaults() {
        TdTagGrp result = getNew();
        result.initDefaultValues();
        return result;
    }


}