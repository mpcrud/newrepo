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
import com.app.mpadmin.domain.TdUserAddress;
import com.app.mpadmin.dao.TdUserAddressDao;

/**
 * Default implementation of the {@link TdUserAddressRepository} interface.
 * Note: you may use multiple DAO from this layer.
 * @see TdUserAddressRepository
 */
@Named("tdUserAddressRepository")
@Singleton
public class TdUserAddressRepositoryImpl extends RepositoryImpl<TdUserAddress, Integer> implements TdUserAddressRepository {

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(TdUserAddressRepositoryImpl.class);

    protected TdUserAddressDao tdUserAddressDao;

    @Inject
    public void setTdUserAddressDao(TdUserAddressDao tdUserAddressDao) {
        this.tdUserAddressDao = tdUserAddressDao;
    }

    /**
     * Dao getter used by the {@link RepositoryImpl}.
     */
    @Override
    public GenericDao<TdUserAddress, Integer> getDao() {
        return tdUserAddressDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdUserAddress getNew() {
        return new TdUserAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdUserAddress getNewWithDefaults() {
        TdUserAddress result = getNew();
        result.initDefaultValues();
        return result;
    }

}