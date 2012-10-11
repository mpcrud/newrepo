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
import com.app.mpadmin.domain.TdProductShipment;
import com.app.mpadmin.dao.TdProductShipmentDao;

/**
 * Default implementation of the {@link TdProductShipmentRepository} interface.
 * Note: you may use multiple DAO from this layer.
 * @see TdProductShipmentRepository
 */
@Named("tdProductShipmentRepository")
@Singleton
public class TdProductShipmentRepositoryImpl extends RepositoryImpl<TdProductShipment, Integer> implements TdProductShipmentRepository {

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(TdProductShipmentRepositoryImpl.class);

    protected TdProductShipmentDao tdProductShipmentDao;

    @Inject
    public void setTdProductShipmentDao(TdProductShipmentDao tdProductShipmentDao) {
        this.tdProductShipmentDao = tdProductShipmentDao;
    }

    /**
     * Dao getter used by the {@link RepositoryImpl}.
     */
    @Override
    public GenericDao<TdProductShipment, Integer> getDao() {
        return tdProductShipmentDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdProductShipment getNew() {
        return new TdProductShipment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdProductShipment getNewWithDefaults() {
        TdProductShipment result = getNew();
        result.initDefaultValues();
        return result;
    }

}