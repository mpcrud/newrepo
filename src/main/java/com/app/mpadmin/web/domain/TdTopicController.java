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

import com.app.mpadmin.domain.TdTopic;
import com.app.mpadmin.repository.TdTopicRepository;
import com.app.mpadmin.web.converter.domain.TdTopicConverter;
import com.app.mpadmin.web.util.MessageUtil;

/**
 * Thin controller layer allowing you to do business validation and other conditional 
 * checks that are easier to implement in Java than in webflow's xml syntax.
 */
@Named
@Singleton
public class TdTopicController {
    private static final long serialVersionUID = 1L;

    @Inject
    private TdTopicRepository tdTopicRepository;

    @Inject
    private MessageUtil messageUtil;

    @Inject
    private TdTopicConverter tdTopicConverter;

    public TdTopic newIfNull(TdTopic tdTopic) {
        if (tdTopic != null) {
            return tdTopic;
        }

        return tdTopicRepository.getNewWithDefaults();
    }

    public boolean save(TdTopic tdTopic) {
        tdTopicRepository.save(tdTopic);
        messageUtil.info("status_saved_ok", tdTopicConverter.print(tdTopic));
        return true;
    }

    public boolean saveAndClose(TdTopic tdTopic) {
        tdTopicRepository.save(tdTopic);
        messageUtil.infoDelayed("status_saved_ok", tdTopicConverter.print(tdTopic));
        forceClose();
        return true;
    }

    public boolean delete(TdTopic tdTopic) {
        String infoArg = tdTopicConverter.print(tdTopic);
        tdTopicRepository.delete(tdTopic);
        messageUtil.info("status_deleted_ok", infoArg);
        return true;
    }
}