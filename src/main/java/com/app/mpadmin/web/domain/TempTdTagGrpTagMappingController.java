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

import com.app.mpadmin.domain.TempTdTagGrpTagMapping;
import com.app.mpadmin.repository.TempTdTagGrpTagMappingRepository;
import com.app.mpadmin.web.converter.domain.TempTdTagGrpTagMappingConverter;
import com.app.mpadmin.web.util.MessageUtil;

/**
 * Thin controller layer allowing you to do business validation and other conditional 
 * checks that are easier to implement in Java than in webflow's xml syntax.
 */
@Named
@Singleton
public class TempTdTagGrpTagMappingController {
    private static final long serialVersionUID = 1L;

    @Inject
    private TempTdTagGrpTagMappingRepository tempTdTagGrpTagMappingRepository;

    @Inject
    private MessageUtil messageUtil;

    @Inject
    private TempTdTagGrpTagMappingConverter tempTdTagGrpTagMappingConverter;

    public TempTdTagGrpTagMapping newIfNull(TempTdTagGrpTagMapping tempTdTagGrpTagMapping) {
        if (tempTdTagGrpTagMapping != null) {
            return tempTdTagGrpTagMapping;
        }

        return tempTdTagGrpTagMappingRepository.getNewWithDefaults();
    }

    public boolean save(TempTdTagGrpTagMapping tempTdTagGrpTagMapping) {
        tempTdTagGrpTagMappingRepository.save(tempTdTagGrpTagMapping);
        messageUtil.info("status_saved_ok", tempTdTagGrpTagMappingConverter.print(tempTdTagGrpTagMapping));
        return true;
    }

    public boolean saveAndClose(TempTdTagGrpTagMapping tempTdTagGrpTagMapping) {
        tempTdTagGrpTagMappingRepository.save(tempTdTagGrpTagMapping);
        messageUtil.infoDelayed("status_saved_ok", tempTdTagGrpTagMappingConverter.print(tempTdTagGrpTagMapping));
        forceClose();
        return true;
    }

    public boolean delete(TempTdTagGrpTagMapping tempTdTagGrpTagMapping) {
        String infoArg = tempTdTagGrpTagMappingConverter.print(tempTdTagGrpTagMapping);
        tempTdTagGrpTagMappingRepository.delete(tempTdTagGrpTagMapping);
        messageUtil.info("status_deleted_ok", infoArg);
        return true;
    }
}