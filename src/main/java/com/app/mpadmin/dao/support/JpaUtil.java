/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/dao/support/JpaUtil.p.vm.java
 */
package com.app.mpadmin.dao.support;

import static com.google.common.collect.Iterables.toArray;
import static java.lang.reflect.Modifier.isPublic;

import java.lang.reflect.Method;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;

public class JpaUtil {

    public static boolean isEntityIdManuallyAssigned(Class<?> type) {
        for (Method method : type.getMethods()) {
            if (isPrimaryKey(method)) {
                return isManuallyAssigned(method);
            }
        }
        return false; // no pk found, should not happen
    }

    private static boolean isPrimaryKey(Method method) {
        return isPublic(method.getModifiers()) && (method.getAnnotation(Id.class) != null || method.getAnnotation(EmbeddedId.class) != null);
    }

    private static boolean isManuallyAssigned(Method method) {
        if (method.getAnnotation(Id.class) != null) {
            return method.getAnnotation(GeneratedValue.class) == null;
        } else if (method.getAnnotation(EmbeddedId.class) != null) {
            return true;
        } else {
            return true;
        }
    }

    public static Predicate andPredicate(List<Predicate> predicates, CriteriaBuilder builder) {
        if (predicates == null || predicates.isEmpty()) {
            return null;
        } else if (predicates.size() == 1) {
            return predicates.get(0);
        } else {
            return builder.and(toArray(predicates, Predicate.class));
        }
    }

    public static Predicate orPredicate(List<Predicate> predicates, CriteriaBuilder builder) {
        if (predicates == null || predicates.isEmpty()) {
            return null;
        } else if (predicates.size() == 1) {
            return predicates.get(0);
        } else {
            return builder.or(toArray(predicates, Predicate.class));
        }
    }

    public static <E> Predicate stringPredicate(Expression<String> path, Object attrValue, SearchParameters sp, CriteriaBuilder builder) {
        if (sp.isCaseInsensitive()) {
            path = builder.lower(path);
            attrValue = ((String) attrValue).toLowerCase();
        }

        switch (sp.getSearchMode()) {
        case EQUALS:
            return builder.equal(path, attrValue);
        case ENDING_LIKE:
            return builder.like(path, "%" + attrValue);
        case STARTING_LIKE:
            return builder.like(path, attrValue + "%");
        case ANYWHERE:
            return builder.like(path, "%" + attrValue + "%");
        case LIKE:
            return builder.like(path, (String) attrValue); // assume user provide the wild cards
        default:
            throw new IllegalStateException("expecting a search mode!");
        }
    }
}