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
import com.app.mpadmin.domain.TdPage;
import com.app.mpadmin.util.ValueGenerator;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@SuppressWarnings("unused")
@Named
@Singleton
public class TdPageGenerator {

    /**
     * Returns a new TdPage instance filled with random values.
     */
    public TdPage getTdPage() {
        TdPage tdPage = new TdPage();

        // simple attributes follows
        tdPage.setPageHeading("a");
        tdPage.setPageShortDesc("a");
        tdPage.setPageLongDesc("a");
        tdPage.setPageType(1);
        tdPage.setPageReferenceId(1);
        tdPage.setPageSeoUrl("http://www.jaxio.com");
        tdPage.setPageSeoKeyword("a");
        tdPage.setPageSeoMetaDesc("a");
        tdPage.setPageSeoTitle("a");
        tdPage.setPageH1("a");
        tdPage.setPageH2("a");
        tdPage.setPageBackLink1("a");
        tdPage.setPageBackLink2("a");
        tdPage.setPageIsActive(1);
        tdPage.setPagePriority(1);
        tdPage.setCreationDate(new Date());
        tdPage.setUpdationDate(new Date());
        tdPage.setPageUserId(1);
        tdPage.setPageCustom1("a");
        tdPage.setPageCustom2("a");
        tdPage.setPageCustom3(1);
        tdPage.setPageCustom4(1);
        return tdPage;
    }

}