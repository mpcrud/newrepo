/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TdChangePassword_.isActive;
import static com.app.mpadmin.domain.TdChangePassword_.userid;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdChangePassword;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdChangePassword search.
 */
@Component
@Scope("session")
public class TdChangePasswordSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdChangePassword tdChangePassword = new TdChangePassword();
    private RangeInteger<TdChangePassword> useridRange = newRangeInteger(userid);
    private RangeInteger<TdChangePassword> isActiveRange = newRangeInteger(isActive);

    public TdChangePassword getTdChangePassword() {
        return tdChangePassword;
    }

    // Ranges, used from the view.
    public RangeInteger<TdChangePassword> getUseridRange() {
        return useridRange;
    }

    public RangeInteger<TdChangePassword> getIsActiveRange() {
        return isActiveRange;
    }
}