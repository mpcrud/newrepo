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

import com.app.mpadmin.domain.TdTagGrp;
import com.app.mpadmin.repository.TdTagGrpGenerator;
import com.app.mpadmin.dao.TdTagGrpDao;

/**
 * Integration test on TdTagGrpDaoImpl
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-test.xml" })
@Transactional
public class TdTagGrpDaoImplIT {
    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(TdTagGrpDaoImplIT.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    private TdTagGrpDao tdTagGrpDao;

    @Inject
    private TdTagGrpGenerator tdTagGrpGenerator;

    @Test
    @Rollback
    public void saveAndGet() {
        TdTagGrp tdTagGrp = tdTagGrpGenerator.getTdTagGrp();

        // add it to a Set before saving (force equals/hashcode)
        Set<TdTagGrp> set = newHashSet(tdTagGrp, tdTagGrp);
        assertThat(set).hasSize(1);

        tdTagGrpDao.save(tdTagGrp);
        entityManager.flush();

        // reload it from cache and check equality
        TdTagGrp model = new TdTagGrp();
        model.setTagGrpId(tdTagGrp.getTagGrpId());
        assertThat(tdTagGrp).isEqualTo(tdTagGrpDao.get(model));

        // clear cache to force reload from db
        entityManager.clear();

        // pk are equals...
        assertThat(tdTagGrp.getId()).isEqualTo(tdTagGrpDao.get(model).getId());

        // but since you do not use a business key, equality is lost.
        assertThat(tdTagGrp).isNotEqualTo(tdTagGrpDao.get(model));
    }
}