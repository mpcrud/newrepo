/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/domain/Entity_.e.vm.java
 */
package com.app.mpadmin.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TdProductSubmodel.class)
public abstract class TdProductSubmodel_ {

    // Raw attributes
    public static volatile SingularAttribute<TdProductSubmodel, Integer> productSubmodelId;
    public static volatile SingularAttribute<TdProductSubmodel, Integer> submodelYearMappingId;
    public static volatile SingularAttribute<TdProductSubmodel, Integer> productId;
    public static volatile SingularAttribute<TdProductSubmodel, String> makeInternalProductCode;
    public static volatile SingularAttribute<TdProductSubmodel, String> productSubmodelApplyLocation;
}