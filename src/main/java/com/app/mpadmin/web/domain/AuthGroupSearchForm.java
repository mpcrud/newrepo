/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.domain.AuthGroup;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for authGroup search.
 */
@Component
@Scope("session")
public class AuthGroupSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private AuthGroup authGroup = new AuthGroup();

    public AuthGroup getAuthGroup() {
        return authGroup;
    }
}