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

import com.app.mpadmin.domain.TdTagRelation;
import com.app.mpadmin.repository.TdTagRelationRepository;
import com.app.mpadmin.web.converter.domain.TdTagRelationConverter;
import com.app.mpadmin.web.util.MessageUtil;

/**
 * Thin controller layer allowing you to do business validation and other conditional 
 * checks that are easier to implement in Java than in webflow's xml syntax.
 */
@Named
@Singleton
public class TdTagRelationController {
    private static final long serialVersionUID = 1L;

    @Inject
    private TdTagRelationRepository tdTagRelationRepository;

    @Inject
    private MessageUtil messageUtil;

    @Inject
    private TdTagRelationConverter tdTagRelationConverter;

    public TdTagRelation newIfNull(TdTagRelation tdTagRelation) {
        if (tdTagRelation != null) {
            return tdTagRelation;
        }

        return tdTagRelationRepository.getNewWithDefaults();
    }

    public boolean save(TdTagRelation tdTagRelation) {
        tdTagRelationRepository.save(tdTagRelation);
        messageUtil.info("status_saved_ok", tdTagRelationConverter.print(tdTagRelation));
        return true;
    }

    public boolean saveAndClose(TdTagRelation tdTagRelation) {
        tdTagRelationRepository.save(tdTagRelation);
        messageUtil.infoDelayed("status_saved_ok", tdTagRelationConverter.print(tdTagRelation));
        forceClose();
        return true;
    }

    public boolean delete(TdTagRelation tdTagRelation) {
        String infoArg = tdTagRelationConverter.print(tdTagRelation);
        tdTagRelationRepository.delete(tdTagRelation);
        messageUtil.info("status_deleted_ok", infoArg);
        return true;
    }
}