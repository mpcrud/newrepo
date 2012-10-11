/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/test/java/dao/DaoImplIT.e.vm.java
 */
package com.app.mpadmin.dao;

import java.util.Set;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import static com.google.common.collect.Sets.newHashSet;
import static org.fest.assertions.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.app.mpadmin.domain.TdCity;
import com.app.mpadmin.repository.TdCityGenerator;
import com.app.mpadmin.dao.TdCityDao;

/**
 * Integration test on TdCityDaoImpl
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-test.xml" })
@Transactional
public class TdCityDaoImplIT {
    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(TdCityDaoImplIT.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    private TdCityDao tdCityDao;

    @Inject
    private TdCityGenerator tdCityGenerator;

    @Test
    @Rollback
    public void saveAndGet() {
        TdCity tdCity = tdCityGenerator.getTdCity();

        // add it to a Set before saving (force equals/hashcode)
        Set<TdCity> set = newHashSet(tdCity, tdCity);
        assertThat(set).hasSize(1);

        tdCityDao.save(tdCity);
        entityManager.flush();

        // reload it from cache and check equality
        TdCity model = new TdCity();
        model.setCityId(tdCity.getCityId());
        assertThat(tdCity).isEqualTo(tdCityDao.get(model));

        // clear cache to force reload from db
        entityManager.clear();

        // pk are equals...
        assertThat(tdCity.getId()).isEqualTo(tdCityDao.get(model).getId());

        // but since you do not use a business key, equality is lost.
        assertThat(tdCity).isNotEqualTo(tdCityDao.get(model));
    }
}