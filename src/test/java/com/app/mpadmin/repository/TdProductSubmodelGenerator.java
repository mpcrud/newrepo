/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/test/java/service/ModelGenerator.e.vm.java
 */
package com.app.mpadmin.repository;

import javax.inject.Named;
import javax.inject.Singleton;
import com.app.mpadmin.domain.TdProductSubmodel;
import com.app.mpadmin.util.ValueGenerator;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@SuppressWarnings("unused")
@Named
@Singleton
public class TdProductSubmodelGenerator {

    /**
     * Returns a new TdProductSubmodel instance filled with random values.
     */
    public TdProductSubmodel getTdProductSubmodel() {
        TdProductSubmodel tdProductSubmodel = new TdProductSubmodel();

        // primary key column must be set manually
        tdProductSubmodel.setProductSubmodelId(ValueGenerator.getUniqueInteger());
        // simple attributes follows
        //tdProductSubmodel.setSubmodelYearMappingId(1);
       // tdProductSubmodel.setProductId(1);
        tdProductSubmodel.setMakeInternalProductCode("a");
        tdProductSubmodel.setProductSubmodelApplyLocation("a");
        return tdProductSubmodel;
    }

}