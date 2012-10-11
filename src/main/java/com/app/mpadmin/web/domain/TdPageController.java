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

import com.app.mpadmin.domain.TdPage;
import com.app.mpadmin.repository.TdPageRepository;
import com.app.mpadmin.web.converter.domain.TdPageConverter;
import com.app.mpadmin.web.util.MessageUtil;

/**
 * Thin controller layer allowing you to do business validation and other conditional 
 * checks that are easier to implement in Java than in webflow's xml syntax.
 */
@Named
@Singleton
public class TdPageController {
    private static final long serialVersionUID = 1L;

    @Inject
    private TdPageRepository tdPageRepository;

    @Inject
    private MessageUtil messageUtil;

    @Inject
    private TdPageConverter tdPageConverter;

    public TdPage newIfNull(TdPage tdPage) {
        if (tdPage != null) {
            return tdPage;
        }

        return tdPageRepository.getNewWithDefaults();
    }

    public boolean save(TdPage tdPage) {
        tdPageRepository.save(tdPage);
        messageUtil.info("status_saved_ok", tdPageConverter.print(tdPage));
        return true;
    }

    public boolean saveAndClose(TdPage tdPage) {
        tdPageRepository.save(tdPage);
        messageUtil.infoDelayed("status_saved_ok", tdPageConverter.print(tdPage));
        forceClose();
        return true;
    }

    public boolean delete(TdPage tdPage) {
        String infoArg = tdPageConverter.print(tdPage);
        tdPageRepository.delete(tdPage);
        messageUtil.info("status_deleted_ok", infoArg);
        return true;
    }
}