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
import com.app.mpadmin.domain.TdMake;
import com.app.mpadmin.repository.TdMakeRepository;
import com.app.mpadmin.web.converter.GenericJsfConverter;

/**
 * Responsible for creating TdMake JSF converters.
 * Each converter provides a 'print' method to convert an entity instance to a friendly string representation (readable by humans...).
 */
@Component
public class TdMakeConverter extends GenericJsfConverter<TdMake, Integer> {
    @Inject
    public TdMakeConverter(TdMakeRepository tdMakeRepository) {
        super(tdMakeRepository, Integer.class);
    }

    @Override
    public String print(TdMake tdMake) {
        return tdMake == null ? "" : "" + tdMake.getMakeDisplayName() + "/" + tdMake.getMakeTechnicalName() + "/" + tdMake.getMakeAlternateName();
    }
}