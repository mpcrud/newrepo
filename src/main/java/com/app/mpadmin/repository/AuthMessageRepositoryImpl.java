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
import com.app.mpadmin.domain.AuthMessage;
import com.app.mpadmin.dao.AuthMessageDao;

/**
 * Default implementation of the {@link AuthMessageRepository} interface.
 * Note: you may use multiple DAO from this layer.
 * @see AuthMessageRepository
 */
@Named("authMessageRepository")
@Singleton
public class AuthMessageRepositoryImpl extends RepositoryImpl<AuthMessage, Integer> implements AuthMessageRepository {

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(AuthMessageRepositoryImpl.class);

    protected AuthMessageDao authMessageDao;

    @Inject
    public void setAuthMessageDao(AuthMessageDao authMessageDao) {
        this.authMessageDao = authMessageDao;
    }

    /**
     * Dao getter used by the {@link RepositoryImpl}.
     */
    @Override
    public GenericDao<AuthMessage, Integer> getDao() {
        return authMessageDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthMessage getNew() {
        return new AuthMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthMessage getNewWithDefaults() {
        AuthMessage result = getNew();
        result.initDefaultValues();
        return result;
    }

}