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
import com.app.mpadmin.domain.TdUserActivityEvent;
import com.app.mpadmin.util.ValueGenerator;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@SuppressWarnings("unused")
@Named
@Singleton
public class TdUserActivityEventGenerator {

    /**
     * Returns a new TdUserActivityEvent instance filled with random values.
     */
    public TdUserActivityEvent getTdUserActivityEvent() {
        TdUserActivityEvent tdUserActivityEvent = new TdUserActivityEvent();

        // simple attributes follows
        tdUserActivityEvent.setUserActivityName("a");
        tdUserActivityEvent.setUserEventName("a");
        tdUserActivityEvent.setUserEventDesc("a");
        tdUserActivityEvent.setCreationDate(new Date());
        tdUserActivityEvent.setUpdationDate(new Date());
        return tdUserActivityEvent;
    }

}