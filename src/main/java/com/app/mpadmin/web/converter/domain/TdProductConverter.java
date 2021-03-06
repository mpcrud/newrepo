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
import com.app.mpadmin.domain.TdProduct;
import com.app.mpadmin.repository.TdProductRepository;
import com.app.mpadmin.web.converter.GenericJsfConverter;

/**
 * Responsible for creating TdProduct JSF converters.
 * Each converter provides a 'print' method to convert an entity instance to a friendly string representation (readable by humans...).
 */
@Component
public class TdProductConverter extends GenericJsfConverter<TdProduct, Integer> {
    @Inject
    public TdProductConverter(TdProductRepository tdProductRepository) {
        super(tdProductRepository, Integer.class);
    }

    @Override
    public String print(TdProduct tdProduct) {
        return tdProduct == null ? "" : "" + tdProduct.getProductId()+"/"+tdProduct.getProductDisplayName();
    }

    public int printId(TdProduct tdProduct)
    {
        return tdProduct == null ? -1 : tdProduct.getId();
    }
}