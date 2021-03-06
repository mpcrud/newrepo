/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/Controller.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.web.util.PrimeFacesUtil.forceClose;
import static com.app.mpadmin.web.util.PrimeFacesUtil.showAskForMapTagGrpToTagDialog;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.app.mpadmin.domain.TdProduct;
import com.app.mpadmin.domain.TdTagGrp;
import com.app.mpadmin.domain.TdTopic;
import com.app.mpadmin.repository.TdTagGrpRepository;
import com.app.mpadmin.web.converter.domain.TdTagGrpConverter;
import com.app.mpadmin.web.util.MessageUtil;

/**
 * Thin controller layer allowing you to do business validation and other conditional 
 * checks that are easier to implement in Java than in webflow's xml syntax.
 */
@Named
@Singleton
public class TdTagGrpController {
    private static final long serialVersionUID = 1L;

    @Inject
    private TdTagGrpRepository tdTagGrpRepository;

    @Inject
    private MessageUtil messageUtil;

    @Inject
    private TdTagGrpConverter tdTagGrpConverter;

    public TdTagGrp newIfNull(TdTagGrp tdTagGrp) {
        if (tdTagGrp != null) {
            return tdTagGrp;
        }

        return tdTagGrpRepository.getNewWithDefaults();
    }

    public boolean save(TdTagGrp tdTagGrp) {
        tdTagGrpRepository.save(tdTagGrp);
        messageUtil.info("status_saved_ok", tdTagGrpConverter.print(tdTagGrp));
        showAskForMapTagGrpToTagDialog();
        return true;
    }

    public boolean saveAndClose(TdTagGrp tdTagGrp) {
        tdTagGrpRepository.save(tdTagGrp);
        messageUtil.infoDelayed("status_saved_ok", tdTagGrpConverter.print(tdTagGrp));
        forceClose();
        return true;
    }

    public boolean delete(TdTagGrp tdTagGrp) {
        String infoArg = tdTagGrpConverter.print(tdTagGrp);
        tdTagGrpRepository.delete(tdTagGrp);
        messageUtil.info("status_deleted_ok", infoArg);
        return true;
    }

    /*public TdTagGrp saveByProduct(TdProduct tdProduct){
        TdTagGrp tdTagGrp = new TdTagGrp();
        tdTagGrp.setProduct(tdProduct);
        tdTagGrp.setTagGrpStatus(1);
        tdTagGrp.setIsActive(1);
        tdTagGrpRepository.save(tdTagGrp);
        messageUtil.info("status_saved_ok", tdTagGrpConverter.print(tdTagGrp));
        //return true;
        return tdTagGrp;
    }  */

    public TdTagGrp saveToReturn(TdTagGrp tdTagGrp){
       // TdTagGrp tdTagGrp = new TdTagGrp();
        //tdTagGrp.setTopic(tdTopic);
       // tdTagGrp.setReferenceId(topicId);
       // tdTagGrp.setReferenceType(500);
        tdTagGrp.setTagGrpStatus(1);
        tdTagGrp.setIsActive(1);
        tdTagGrpRepository.save(tdTagGrp);
        messageUtil.info("status_saved_ok", tdTagGrpConverter.print(tdTagGrp));
        //return true;
        return tdTagGrp;
    }
}