/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/test/java/dao/support/NamedQueryUtilIT.p.vm.java
 */
package com.app.mpadmin.dao.support;

import java.util.*;

import javax.inject.Inject;
import org.apache.log4j.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.app.mpadmin.dao.support.*;
import com.app.mpadmin.util.*;
import com.app.mpadmin.domain.AuthGroup;
import com.app.mpadmin.domain.AuthGroupPermissions;
import com.app.mpadmin.domain.AuthMessage;
import com.app.mpadmin.domain.AuthPermission;
import com.app.mpadmin.domain.AuthUser;
import com.app.mpadmin.domain.AuthUserGroups;
import com.app.mpadmin.domain.AuthUserUserPermissions;
/*import com.app.mpadmin.domain.DjangoAdminLog;
import com.app.mpadmin.domain.DjangoContentType;
import com.app.mpadmin.domain.DjangoSession;
import com.app.mpadmin.domain.DjangoSite;*/
import com.app.mpadmin.domain.TdChangePassword;
import com.app.mpadmin.domain.TdCity;
import com.app.mpadmin.domain.TdComment;
import com.app.mpadmin.domain.TdCountry;
import com.app.mpadmin.domain.TdMake;
import com.app.mpadmin.domain.TdMakeModel;
import com.app.mpadmin.domain.TdMakeSubmodel;
import com.app.mpadmin.domain.TdMetro;
import com.app.mpadmin.domain.TdOrder;
import com.app.mpadmin.domain.TdPage;
import com.app.mpadmin.domain.TdPermission;
import com.app.mpadmin.domain.TdPicture;
import com.app.mpadmin.domain.TdProduct;
import com.app.mpadmin.domain.TdProductBrand;
import com.app.mpadmin.domain.TdProductModel;
import com.app.mpadmin.domain.TdProductShipment;
import com.app.mpadmin.domain.TdProductSubmodel;
import com.app.mpadmin.domain.TdProductSupplier;
import com.app.mpadmin.domain.TdRequestCarPart;
import com.app.mpadmin.domain.TdRole;
import com.app.mpadmin.domain.TdShipmentVendor;
import com.app.mpadmin.domain.TdState;
import com.app.mpadmin.domain.TdSubmodelYearMapping;
import com.app.mpadmin.domain.TdTag;
import com.app.mpadmin.domain.TdTagGrp;
import com.app.mpadmin.domain.TdTagGrpTagMapping;
import com.app.mpadmin.domain.TdTagRelation;
import com.app.mpadmin.domain.TdTopic;
import com.app.mpadmin.domain.TdUserActivity;
import com.app.mpadmin.domain.TdUserActivityEvent;
import com.app.mpadmin.domain.TdUserAddress;
import com.app.mpadmin.domain.TdUserAuth;
import com.app.mpadmin.domain.TdUserDetail;
import com.app.mpadmin.domain.TdUserTagPreference;
import com.app.mpadmin.domain.TdVote;
import com.app.mpadmin.domain.TempTdSubmodelYearMapping;
import com.app.mpadmin.domain.TempTdTagGrpTagMapping;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-test.xml" })
@Transactional
public class NamedQueryUtilIT {

    private static final Logger log = Logger.getLogger(NamedQueryUtilIT.class);

    @Inject
    private NamedQueryUtil namedQueryUtil;

    @Test
    @SuppressWarnings("unchecked")
    public void executeGetAllAccountsQueryName() {
        String sqlQuery = "AuthUser.selectAll";
        List<AuthUser> accounts = (List<AuthUser>) namedQueryUtil.findByNamedQuery(new SearchParameters().withNamedQuery(sqlQuery));

        if (accounts != null) {
            log.info(accounts.size());

            for (AuthUser account : accounts) {
                log.info(account.toString());
            }
        }
    }

    @Test
    @SuppressWarnings("unchecked")
    public void executeGetAllAccountsSqlQuery() {
        String sqlQuery = "AuthUser.selectAll.native";
        List<AuthUser> accounts = (List<AuthUser>) namedQueryUtil.findByNamedQuery(new SearchParameters().withNamedQuery(sqlQuery));

        if (accounts != null) {
            log.info(accounts.size());
            for (AuthUser account : accounts) {
                log.info(account.toString());
            }
        }
    }

}
