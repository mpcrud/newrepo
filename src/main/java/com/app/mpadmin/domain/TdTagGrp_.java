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

@StaticMetamodel(TdTagGrp.class)
public abstract class TdTagGrp_ {

    // Raw attributes
    public static volatile SingularAttribute<TdTagGrp, Integer> tagGrpId;
    public static volatile SingularAttribute<TdTagGrp, Integer> referenceId;
    public static volatile SingularAttribute<TdTagGrp, Date> creationDate;
    public static volatile SingularAttribute<TdTagGrp, Date> updationDate;
    public static volatile SingularAttribute<TdTagGrp, Integer> isActive;
    public static volatile SingularAttribute<TdTagGrp, Integer> tagGrpStatus;
    public static volatile SingularAttribute<TdTagGrp, Integer> referenceType;
}