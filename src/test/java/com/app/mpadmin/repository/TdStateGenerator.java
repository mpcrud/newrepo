/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/test/java/service/ModelGenerator.e.vm.java
 */
package com.app.mpadmin.repository;

import java.util.Date;
import javax.inject.Named;
import javax.inject.Singleton;
import com.app.mpadmin.domain.TdState;
import com.app.mpadmin.util.ValueGenerator;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@SuppressWarnings("unused")
@Named
@Singleton
public class TdStateGenerator {

    /**
     * Returns a new TdState instance filled with random values.
     */
    public TdState getTdState() {
        TdState tdState = new TdState();

        // simple attributes follows
        tdState.setStateName("a");
        tdState.setImportance(1);
        tdState.setDescShort("a");
        tdState.setDescLong("a");
        tdState.setCreationDate(new Date());
        tdState.setUpdationDate(new Date());
        return tdState;
    }

}