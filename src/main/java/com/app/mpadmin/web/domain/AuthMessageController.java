/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/Controller.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.web.util.PrimeFacesUtil.forceClose;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.app.mpadmin.domain.AuthMessage;
import com.app.mpadmin.repository.AuthMessageRepository;
import com.app.mpadmin.web.converter.domain.AuthMessageConverter;
import com.app.mpadmin.web.util.MessageUtil;

/**
 * Thin controller layer allowing you to do business validation and other conditional 
 * checks that are easier to implement in Java than in webflow's xml syntax.
 */
@Named
@Singleton
public class AuthMessageController {
    private static final long serialVersionUID = 1L;

    @Inject
    private AuthMessageRepository authMessageRepository;

    @Inject
    private MessageUtil messageUtil;

    @Inject
    private AuthMessageConverter authMessageConverter;

    public AuthMessage newIfNull(AuthMessage authMessage) {
        if (authMessage != null) {
            return authMessage;
        }

        return authMessageRepository.getNewWithDefaults();
    }

    public boolean save(AuthMessage authMessage) {
        authMessageRepository.save(authMessage);
        messageUtil.info("status_saved_ok", authMessageConverter.print(authMessage));
        return true;
    }

    public boolean saveAndClose(AuthMessage authMessage) {
        authMessageRepository.save(authMessage);
        messageUtil.infoDelayed("status_saved_ok", authMessageConverter.print(authMessage));
        forceClose();
        return true;
    }

    public boolean delete(AuthMessage authMessage) {
        String infoArg = authMessageConverter.print(authMessage);
        authMessageRepository.delete(authMessage);
        messageUtil.info("status_deleted_ok", infoArg);
        return true;
    }
}