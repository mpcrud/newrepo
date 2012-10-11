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

import com.app.mpadmin.domain.AuthUser;
import com.app.mpadmin.repository.AuthUserGenerator;
import com.app.mpadmin.dao.AuthUserDao;

/**
 * Integration test on AuthUserDaoImpl
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-test.xml" })
@Transactional
public class AuthUserDaoImplIT {
    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(AuthUserDaoImplIT.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    private AuthUserDao authUserDao;

    @Inject
    private AuthUserGenerator authUserGenerator;

    @Test
    @Rollback
    public void saveAndGet() {
        AuthUser authUser = authUserGenerator.getAuthUser();

        // add it to a Set before saving (force equals/hashcode)
        Set<AuthUser> set = newHashSet(authUser, authUser);
        assertThat(set).hasSize(1);

        authUserDao.save(authUser);
        entityManager.flush();

        // reload it from cache and check equality
        AuthUser model = new AuthUser();
        model.setId(authUser.getId());
        assertThat(authUser).isEqualTo(authUserDao.get(model));

        // clear cache to force reload from db
        entityManager.clear();

        // since you use a business key, equality must be preserved.
        assertThat(authUser).isEqualTo(authUserDao.get(model));
    }
}