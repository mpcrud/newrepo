/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.AuthMessage_.userId;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.AuthMessage;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for authMessage search.
 */
@Component
@Scope("session")
public class AuthMessageSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private AuthMessage authMessage = new AuthMessage();
    private RangeInteger<AuthMessage> userIdRange = newRangeInteger(userId);

    public AuthMessage getAuthMessage() {
        return authMessage;
    }

    // Ranges, used from the view.
    public RangeInteger<AuthMessage> getUserIdRange() {
        return userIdRange;
    }
}