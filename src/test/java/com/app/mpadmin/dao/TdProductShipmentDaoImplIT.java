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

import com.app.mpadmin.domain.TdProductShipment;
import com.app.mpadmin.repository.TdProductShipmentGenerator;
import com.app.mpadmin.dao.TdProductShipmentDao;

/**
 * Integration test on TdProductShipmentDaoImpl
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-test.xml" })
@Transactional
public class TdProductShipmentDaoImplIT {
    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(TdProductShipmentDaoImplIT.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    private TdProductShipmentDao tdProductShipmentDao;

    @Inject
    private TdProductShipmentGenerator tdProductShipmentGenerator;

    @Test
    @Rollback
    public void saveAndGet() {
        TdProductShipment tdProductShipment = tdProductShipmentGenerator.getTdProductShipment();

        // add it to a Set before saving (force equals/hashcode)
        Set<TdProductShipment> set = newHashSet(tdProductShipment, tdProductShipment);
        assertThat(set).hasSize(1);

        tdProductShipmentDao.save(tdProductShipment);
        entityManager.flush();

        // reload it from cache and check equality
        TdProductShipment model = new TdProductShipment();
        model.setProductShipmentId(tdProductShipment.getProductShipmentId());
        assertThat(tdProductShipment).isEqualTo(tdProductShipmentDao.get(model));

        // clear cache to force reload from db
        entityManager.clear();

        // pk are equals...
        assertThat(tdProductShipment.getId()).isEqualTo(tdProductShipmentDao.get(model).getId());

        // but since you do not use a business key, equality is lost.
        assertThat(tdProductShipment).isNotEqualTo(tdProductShipmentDao.get(model));
    }
}