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

@StaticMetamodel(TdShipmentVendor.class)
public abstract class TdShipmentVendor_ {

    // Raw attributes
    public static volatile SingularAttribute<TdShipmentVendor, Integer> shipmentVendorId;
    public static volatile SingularAttribute<TdShipmentVendor, String> shipmentVendorDisplayName;
    public static volatile SingularAttribute<TdShipmentVendor, String> shipmentVendorAlternateName;
    public static volatile SingularAttribute<TdShipmentVendor, Float> shipmentVendorStandardMrpCost;
    public static volatile SingularAttribute<TdShipmentVendor, Float> shipmentVendorStandardDiscount;
    public static volatile SingularAttribute<TdShipmentVendor, String> shipmentVendorPolicy;
    public static volatile SingularAttribute<TdShipmentVendor, String> shipmentVendorSpecialNote;
    public static volatile SingularAttribute<TdShipmentVendor, Integer> shipmentDuration;
    public static volatile SingularAttribute<TdShipmentVendor, Integer> shipmentVendorType;
    public static volatile SingularAttribute<TdShipmentVendor, Boolean> shipmentVendorStatus;
    public static volatile SingularAttribute<TdShipmentVendor, String> custom1;
    public static volatile SingularAttribute<TdShipmentVendor, String> custom2;
    public static volatile SingularAttribute<TdShipmentVendor, Date> creationDate;
    public static volatile SingularAttribute<TdShipmentVendor, Date> updationDate;
}