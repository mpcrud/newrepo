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

import com.app.mpadmin.domain.TdTag;
import com.app.mpadmin.repository.TdTagRepository;
import com.app.mpadmin.web.converter.domain.TdTagConverter;
import com.app.mpadmin.web.util.MessageUtil;

/**
 * Thin controller layer allowing you to do business validation and other conditional 
 * checks that are easier to implement in Java than in webflow's xml syntax.
 */
@Named
@Singleton
public class TdTagController {
    private static final long serialVersionUID = 1L;

    @Inject
    private TdTagRepository tdTagRepository;

    @Inject
    private MessageUtil messageUtil;

    @Inject
    private TdTagConverter tdTagConverter;

    public TdTag newIfNull(TdTag tdTag) {
        if (tdTag != null) {
            return tdTag;
        }

        return tdTagRepository.getNewWithDefaults();
    }

    public boolean save(TdTag tdTag) {
        tdTagRepository.save(tdTag);
        messageUtil.info("status_saved_ok", tdTagConverter.print(tdTag));
        return true;
    }

    public boolean saveAndClose(TdTag tdTag) {
        tdTagRepository.save(tdTag);
        messageUtil.infoDelayed("status_saved_ok", tdTagConverter.print(tdTag));
        forceClose();
        return true;
    }

    public boolean delete(TdTag tdTag) {
        String infoArg = tdTagConverter.print(tdTag);
        tdTagRepository.delete(tdTag);
        messageUtil.info("status_deleted_ok", infoArg);
        return true;
    }

    public boolean updateAll(TdTag[] arr){
        for(TdTag tag : arr)
        {
            switch(tag.getTagStatus())
            {
                case 0: tag.setTagStatus(1);break;
                case 1: tag.setTagStatus(0);break;
                default: tag.setTagStatus(0);break;
            }
            tdTagRepository.save(tag);
        }
        messageUtil.info("status_saved_ok", arr.length+" tags updated");
        return true;
    }

    public boolean deleteAll(TdTag[] arr){
        for (TdTag tag:arr){
            tdTagRepository.delete(tag);
        }
        messageUtil.info("status_deleted_ok", arr.length+" tags deleted");
        return true;
    }
}