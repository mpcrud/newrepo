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
import com.app.mpadmin.domain.TdProductModel;
import com.app.mpadmin.repository.TdProductModelRepository;
import com.app.mpadmin.web.converter.GenericJsfConverter;

/**
 * Responsible for creating TdProductModel JSF converters.
 * Each converter provides a 'print' method to convert an entity instance to a friendly string representation (readable by humans...).
 */
@Component
public class TdProductModelConverter extends GenericJsfConverter<TdProductModel, Integer> {
    @Inject
    public TdProductModelConverter(TdProductModelRepository tdProductModelRepository) {
        super(tdProductModelRepository, Integer.class);
    }

    @Override
    public String print(TdProductModel tdProductModel) {
        return tdProductModel == null ? "" : "" + tdProductModel.getMakeModelId() + "/" + tdProductModel.getProductId();
    }
}