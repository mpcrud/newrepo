/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/dao/DAOImpl.e.vm.java
 */
package com.app.mpadmin.dao;

import javax.inject.Named;
import javax.inject.Singleton;
import com.app.mpadmin.dao.TdCityDao;
import com.app.mpadmin.dao.support.GenericDao;
import com.app.mpadmin.domain.TdCity;

/**
 * JPA 2 Data Access Object for {@link com.app.mpadmin.domain.TdCity}.
 * Note: do not use @Transactional in the DAO layer.
 */
@Named
@Singleton
public class TdCityDao extends GenericDao<TdCity, Integer> {
    public TdCityDao() {
        super(TdCity.class);
    }
}