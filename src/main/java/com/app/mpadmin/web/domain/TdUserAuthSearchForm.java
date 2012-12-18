/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.EntitySelectors.TdRoleSelector.newTdRoleSelector;
import static com.app.mpadmin.dao.support.Ranges.RangeDate.newRangeDate;
import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TdUserAuth_.*;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.EntitySelectors.TdRoleSelector;
import com.app.mpadmin.dao.support.Ranges.RangeDate;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdUserAuth;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdUserAuth search.
 */
@Component
@Scope("request")
public class TdUserAuthSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdUserAuth tdUserAuth = new TdUserAuth();
    private RangeInteger<TdUserAuth> isActiveRange = newRangeInteger(isActive);
    private RangeDate<TdUserAuth> updationDateRange = newRangeDate(updationDate);
    private TdRoleSelector<TdUserAuth> roleSelector = newTdRoleSelector(roleId);
    private RangeInteger<TdUserAuth> userIdRange = newRangeInteger(userId);

    public TdUserAuth getTdUserAuth() {
        return tdUserAuth;
    }

    // Ranges, used from the view.
    public RangeInteger<TdUserAuth> getUserIdRange(){
        return userIdRange;
    }
    public RangeInteger<TdUserAuth> getIsActiveRange() {
        return isActiveRange;
    }

    public RangeDate<TdUserAuth> getUpdationDateRange() {
        return updationDateRange;
    }

    // Selectors for x-to-one associations
    public TdRoleSelector<TdUserAuth> getRoleSelector() {
        return roleSelector;
    }
}