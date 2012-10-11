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
import com.app.mpadmin.domain.TempTdTagGrpTagMapping;
import com.app.mpadmin.domain.TempTdTagGrpTagMappingPk;
import com.app.mpadmin.repository.TempTdTagGrpTagMappingRepository;
import com.app.mpadmin.web.converter.GenericJsfConverter;

/**
 * Responsible for creating TempTdTagGrpTagMapping JSF converters.
 * Each converter provides a 'print' method to convert an entity instance to a friendly string representation (readable by humans...).
 */
@Component
public class TempTdTagGrpTagMappingConverter extends GenericJsfConverter<TempTdTagGrpTagMapping, TempTdTagGrpTagMappingPk> {
    @Inject
    public TempTdTagGrpTagMappingConverter(TempTdTagGrpTagMappingRepository tempTdTagGrpTagMappingRepository) {
        super(tempTdTagGrpTagMappingRepository, TempTdTagGrpTagMappingPk.class);
    }

    @Override
    public String print(TempTdTagGrpTagMapping tempTdTagGrpTagMapping) {
        return tempTdTagGrpTagMapping == null ? "" : "" + tempTdTagGrpTagMapping.getTagGrpId() + "/" + tempTdTagGrpTagMapping.getTagId();
    }
}