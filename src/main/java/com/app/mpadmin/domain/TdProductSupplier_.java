/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/domain/Entity_.e.vm.java
 */
package com.app.mpadmin.domain;

import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import com.app.mpadmin.domain.TdProduct;

@StaticMetamodel(TdProductSupplier.class)
public abstract class TdProductSupplier_ {

    // Raw attributes
    public static volatile SingularAttribute<TdProductSupplier, Integer> productSupplierId;
    public static volatile SingularAttribute<TdProductSupplier, String> productSupplierDisplayName;
    public static volatile SingularAttribute<TdProductSupplier, String> productSupplierAlternateName;
    public static volatile SingularAttribute<TdProductSupplier, String> productSupplierPolicy;
    public static volatile SingularAttribute<TdProductSupplier, String> productSupplierSpecialization;
    public static volatile SingularAttribute<TdProductSupplier, String> microDescription;
    public static volatile SingularAttribute<TdProductSupplier, String> shortDesc;
    public static volatile SingularAttribute<TdProductSupplier, String> longDesc;
    public static volatile SingularAttribute<TdProductSupplier, Integer> productSupplierRating;
    public static volatile SingularAttribute<TdProductSupplier, Integer> productSupplierType;
    public static volatile SingularAttribute<TdProductSupplier, String> productSupplierLogoSmall;
    public static volatile SingularAttribute<TdProductSupplier, String> productSupplierLogoLong;
    public static volatile SingularAttribute<TdProductSupplier, Boolean> productSupplierStatus;
    public static volatile SingularAttribute<TdProductSupplier, String> custom1;
    public static volatile SingularAttribute<TdProductSupplier, String> custom2;
    public static volatile SingularAttribute<TdProductSupplier, String> seoResources;
    public static volatile SingularAttribute<TdProductSupplier, String> seoUrl;
    public static volatile SingularAttribute<TdProductSupplier, String> seoH1;
    public static volatile SingularAttribute<TdProductSupplier, String> seoH2;
    public static volatile SingularAttribute<TdProductSupplier, String> metaTitle;
    public static volatile SingularAttribute<TdProductSupplier, String> metaKeyword;
    public static volatile SingularAttribute<TdProductSupplier, String> metaDescription;
    public static volatile SingularAttribute<TdProductSupplier, Date> creationDate;
    public static volatile SingularAttribute<TdProductSupplier, Date> updationDate;

    // Many to many
    public static volatile ListAttribute<TdProductSupplier, TdProduct> products;
}