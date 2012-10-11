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

import com.app.mpadmin.domain.TdCountry;
import com.app.mpadmin.repository.TdCountryRepository;
import com.app.mpadmin.web.converter.domain.TdCountryConverter;
import com.app.mpadmin.web.util.MessageUtil;

/**
 * Thin controller layer allowing you to do business validation and other conditional 
 * checks that are easier to implement in Java than in webflow's xml syntax.
 */
@Named
@Singleton
public class TdCountryController {
    private static final long serialVersionUID = 1L;

    @Inject
    private TdCountryRepository tdCountryRepository;

    @Inject
    private MessageUtil messageUtil;

    @Inject
    private TdCountryConverter tdCountryConverter;

    public TdCountry newIfNull(TdCountry tdCountry) {
        if (tdCountry != null) {
            return tdCountry;
        }

        return tdCountryRepository.getNewWithDefaults();
    }

    public boolean save(TdCountry tdCountry) {
        tdCountryRepository.save(tdCountry);
        messageUtil.info("status_saved_ok", tdCountryConverter.print(tdCountry));
        return true;
    }

    public boolean saveAndClose(TdCountry tdCountry) {
        tdCountryRepository.save(tdCountry);
        messageUtil.infoDelayed("status_saved_ok", tdCountryConverter.print(tdCountry));
        forceClose();
        return true;
    }

    public boolean delete(TdCountry tdCountry) {
        String infoArg = tdCountryConverter.print(tdCountry);
        tdCountryRepository.delete(tdCountry);
        messageUtil.info("status_deleted_ok", infoArg);
        return true;
    }
}