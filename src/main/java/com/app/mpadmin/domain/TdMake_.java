/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/domain/Entity_.e.vm.java
 */
package com.app.mpadmin.domain;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TdMake.class)
public abstract class TdMake_ {

    // Raw attributes
    public static volatile SingularAttribute<TdMake, Integer> makeId;
    public static volatile SingularAttribute<TdMake, String> makeDisplayName;
    public static volatile SingularAttribute<TdMake, String> makeTechnicalName;
    public static volatile SingularAttribute<TdMake, String> makeAlternateName;
    public static volatile SingularAttribute<TdMake, String> shortDesc;
    public static volatile SingularAttribute<TdMake, byte[]> longDesc;
    public static volatile SingularAttribute<TdMake, Integer> isActive;
    public static volatile SingularAttribute<TdMake, Integer> startingYearOps;
    public static volatile SingularAttribute<TdMake, Integer> representCountryId;
    public static volatile SingularAttribute<TdMake, String> custom1;
    public static volatile SingularAttribute<TdMake, String> custom2;
    public static volatile SingularAttribute<TdMake, String> custom3;
    public static volatile SingularAttribute<TdMake, Integer> makeStatus;
    public static volatile SingularAttribute<TdMake, String> seoResources;
    public static volatile SingularAttribute<TdMake, String> seoUrl;
    public static volatile SingularAttribute<TdMake, String> seoH1;
    public static volatile SingularAttribute<TdMake, String> seoH2;
    public static volatile SingularAttribute<TdMake, String> metaTitle;
    public static volatile SingularAttribute<TdMake, String> metaKeyword;
    public static volatile SingularAttribute<TdMake, String> metaDescription;
    public static volatile SingularAttribute<TdMake, Date> creationDate;
    public static volatile SingularAttribute<TdMake, Date> updationDate;
}