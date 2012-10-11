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
import com.app.mpadmin.domain.TdMakeModel;
import com.app.mpadmin.repository.TdMakeModelRepository;
import com.app.mpadmin.web.converter.GenericJsfConverter;

/**
 * Responsible for creating TdMakeModel JSF converters.
 * Each converter provides a 'print' method to convert an entity instance to a friendly string representation (readable by humans...).
 */
@Component
public class TdMakeModelConverter extends GenericJsfConverter<TdMakeModel, Integer> {
    @Inject
    public TdMakeModelConverter(TdMakeModelRepository tdMakeModelRepository) {
        super(tdMakeModelRepository, Integer.class);
    }

    @Override
    public String print(TdMakeModel tdMakeModel) {
        return tdMakeModel == null ? "" : "" + tdMakeModel.getMakemodelDisplayName() + "/" + tdMakeModel.getMakemodelTechnicalName() + "/"
                + tdMakeModel.getMakemodelAlternateName();
    }
}