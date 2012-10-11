/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/converter/EntityConverter.e.vm.java
 */
package com.app.mpadmin.web.converter.domain;

import javax.inject.Inject;
import org.springframework.stereotype.Component;
import com.app.mpadmin.domain.AuthPermission;
import com.app.mpadmin.repository.AuthPermissionRepository;
import com.app.mpadmin.web.converter.GenericJsfConverter;

/**
 * Responsible for creating AuthPermission JSF converters.
 * Each converter provides a 'print' method to convert an entity instance to a friendly string representation (readable by humans...).
 */
@Component
public class AuthPermissionConverter extends GenericJsfConverter<AuthPermission, Integer> {
    @Inject
    public AuthPermissionConverter(AuthPermissionRepository authPermissionRepository) {
        super(authPermissionRepository, Integer.class);
    }

    @Override
    public String print(AuthPermission authPermission) {
        return authPermission == null ? "" : "" + authPermission.getContentTypeId() + "/" + authPermission.getCodename();
    }
}