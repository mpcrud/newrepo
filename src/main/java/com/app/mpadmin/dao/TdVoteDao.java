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
import com.app.mpadmin.dao.TdVoteDao;
import com.app.mpadmin.dao.support.GenericDao;
import com.app.mpadmin.domain.TdVote;

/**
 * JPA 2 Data Access Object for {@link com.app.mpadmin.domain.TdVote}.
 * Note: do not use @Transactional in the DAO layer.
 */
@Named
@Singleton
public class TdVoteDao extends GenericDao<TdVote, Integer> {
    public TdVoteDao() {
        super(TdVote.class);
    }
}