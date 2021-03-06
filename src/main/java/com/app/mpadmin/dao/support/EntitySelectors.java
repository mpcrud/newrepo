/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/dao/support/EntitySelectors.p.vm.java
 */
package com.app.mpadmin.dao.support;

import javax.persistence.metamodel.SingularAttribute;
import com.app.mpadmin.domain.AuthGroup;
import com.app.mpadmin.domain.AuthGroupPermissions;
import com.app.mpadmin.domain.AuthMessage;
import com.app.mpadmin.domain.AuthPermission;
import com.app.mpadmin.domain.AuthUser;
import com.app.mpadmin.domain.AuthUserGroups;
import com.app.mpadmin.domain.AuthUserUserPermissions;
/*import com.app.mpadmin.domain.DjangoAdminLog;
import com.app.mpadmin.domain.DjangoContentType;
import com.app.mpadmin.domain.DjangoSession;
import com.app.mpadmin.domain.DjangoSite; */
import com.app.mpadmin.domain.TdChangePassword;
import com.app.mpadmin.domain.TdCity;
import com.app.mpadmin.domain.TdComment;
import com.app.mpadmin.domain.TdCountry;
import com.app.mpadmin.domain.TdMake;
import com.app.mpadmin.domain.TdMakeModel;
import com.app.mpadmin.domain.TdMakeSubmodel;
import com.app.mpadmin.domain.TdMetro;
import com.app.mpadmin.domain.TdOrder;
import com.app.mpadmin.domain.TdPage;
import com.app.mpadmin.domain.TdPermission;
import com.app.mpadmin.domain.TdPicture;
import com.app.mpadmin.domain.TdProduct;
import com.app.mpadmin.domain.TdProductBrand;
import com.app.mpadmin.domain.TdProductModel;
import com.app.mpadmin.domain.TdProductShipment;
import com.app.mpadmin.domain.TdProductSubmodel;
import com.app.mpadmin.domain.TdProductSupplier;
import com.app.mpadmin.domain.TdRequestCarPart;
import com.app.mpadmin.domain.TdRole;
import com.app.mpadmin.domain.TdShipmentVendor;
import com.app.mpadmin.domain.TdState;
import com.app.mpadmin.domain.TdSubmodelYearMapping;
import com.app.mpadmin.domain.TdTag;
import com.app.mpadmin.domain.TdTagGrp;
import com.app.mpadmin.domain.TdTagGrpTagMapping;
import com.app.mpadmin.domain.TdTagRelation;
import com.app.mpadmin.domain.TdTopic;
import com.app.mpadmin.domain.TdUserActivity;
import com.app.mpadmin.domain.TdUserActivityEvent;
import com.app.mpadmin.domain.TdUserAddress;
import com.app.mpadmin.domain.TdUserAuth;
import com.app.mpadmin.domain.TdUserDetail;
import com.app.mpadmin.domain.TdUserTagPreference;
import com.app.mpadmin.domain.TdVote;
import com.app.mpadmin.domain.TempTdSubmodelYearMapping;
import com.app.mpadmin.domain.TempTdTagGrpTagMapping;
import com.app.mpadmin.domain.TempTdTagGrpTagMappingPk;

/**
 * Convenient type safe {@link EntitySelector}s. 
 */
@SuppressWarnings("serial")
public class EntitySelectors {

    public static class AuthGroupSelector<E> extends EntitySelector<E, AuthGroup, Integer> {
        public AuthGroupSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> AuthGroupSelector<E> newAuthGroupSelector(SingularAttribute<E, Integer> field) {
            return new AuthGroupSelector<E>(field);
        }
    }

    public static class AuthGroupPermissionsSelector<E> extends EntitySelector<E, AuthGroupPermissions, Integer> {
        public AuthGroupPermissionsSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> AuthGroupPermissionsSelector<E> newAuthGroupPermissionsSelector(SingularAttribute<E, Integer> field) {
            return new AuthGroupPermissionsSelector<E>(field);
        }
    }

    public static class AuthMessageSelector<E> extends EntitySelector<E, AuthMessage, Integer> {
        public AuthMessageSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> AuthMessageSelector<E> newAuthMessageSelector(SingularAttribute<E, Integer> field) {
            return new AuthMessageSelector<E>(field);
        }
    }

    public static class AuthPermissionSelector<E> extends EntitySelector<E, AuthPermission, Integer> {
        public AuthPermissionSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> AuthPermissionSelector<E> newAuthPermissionSelector(SingularAttribute<E, Integer> field) {
            return new AuthPermissionSelector<E>(field);
        }
    }

    public static class AuthUserSelector<E> extends EntitySelector<E, AuthUser, Integer> {
        public AuthUserSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> AuthUserSelector<E> newAuthUserSelector(SingularAttribute<E, Integer> field) {
            return new AuthUserSelector<E>(field);
        }
    }

    public static class AuthUserGroupsSelector<E> extends EntitySelector<E, AuthUserGroups, Integer> {
        public AuthUserGroupsSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> AuthUserGroupsSelector<E> newAuthUserGroupsSelector(SingularAttribute<E, Integer> field) {
            return new AuthUserGroupsSelector<E>(field);
        }
    }

    public static class AuthUserUserPermissionsSelector<E> extends EntitySelector<E, AuthUserUserPermissions, Integer> {
        public AuthUserUserPermissionsSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> AuthUserUserPermissionsSelector<E> newAuthUserUserPermissionsSelector(SingularAttribute<E, Integer> field) {
            return new AuthUserUserPermissionsSelector<E>(field);
        }
    }

   /* public static class DjangoAdminLogSelector<E> extends EntitySelector<E, DjangoAdminLog, Integer> {
        public DjangoAdminLogSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> DjangoAdminLogSelector<E> newDjangoAdminLogSelector(SingularAttribute<E, Integer> field) {
            return new DjangoAdminLogSelector<E>(field);
        }
    }

    public static class DjangoContentTypeSelector<E> extends EntitySelector<E, DjangoContentType, Integer> {
        public DjangoContentTypeSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> DjangoContentTypeSelector<E> newDjangoContentTypeSelector(SingularAttribute<E, Integer> field) {
            return new DjangoContentTypeSelector<E>(field);
        }
    }

    public static class DjangoSessionSelector<E> extends EntitySelector<E, DjangoSession, String> {
        public DjangoSessionSelector(SingularAttribute<E, String> field) {
            super(field);
        }

        public static <E> DjangoSessionSelector<E> newDjangoSessionSelector(SingularAttribute<E, String> field) {
            return new DjangoSessionSelector<E>(field);
        }
    }

    public static class DjangoSiteSelector<E> extends EntitySelector<E, DjangoSite, Integer> {
        public DjangoSiteSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> DjangoSiteSelector<E> newDjangoSiteSelector(SingularAttribute<E, Integer> field) {
            return new DjangoSiteSelector<E>(field);
        }
    }
*/
    public static class TdChangePasswordSelector<E> extends EntitySelector<E, TdChangePassword, Integer> {
        public TdChangePasswordSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdChangePasswordSelector<E> newTdChangePasswordSelector(SingularAttribute<E, Integer> field) {
            return new TdChangePasswordSelector<E>(field);
        }
    }

    public static class TdCitySelector<E> extends EntitySelector<E, TdCity, Integer> {
        public TdCitySelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdCitySelector<E> newTdCitySelector(SingularAttribute<E, Integer> field) {
            return new TdCitySelector<E>(field);
        }
    }

    public static class TdCommentSelector<E> extends EntitySelector<E, TdComment, Integer> {
        public TdCommentSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdCommentSelector<E> newTdCommentSelector(SingularAttribute<E, Integer> field) {
            return new TdCommentSelector<E>(field);
        }
    }

    public static class TdCountrySelector<E> extends EntitySelector<E, TdCountry, Integer> {
        public TdCountrySelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdCountrySelector<E> newTdCountrySelector(SingularAttribute<E, Integer> field) {
            return new TdCountrySelector<E>(field);
        }
    }

    public static class TdMakeSelector<E> extends EntitySelector<E, TdMake, Integer> {
        public TdMakeSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdMakeSelector<E> newTdMakeSelector(SingularAttribute<E, Integer> field) {
            return new TdMakeSelector<E>(field);
        }
    }

    public static class TdMakeModelSelector<E> extends EntitySelector<E, TdMakeModel, Integer> {
        public TdMakeModelSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdMakeModelSelector<E> newTdMakeModelSelector(SingularAttribute<E, Integer> field) {
            return new TdMakeModelSelector<E>(field);
        }
    }

    public static class TdMakeSubmodelSelector<E> extends EntitySelector<E, TdMakeSubmodel, Double> {
        public TdMakeSubmodelSelector(SingularAttribute<E, Double> field) {
            super(field);
        }

        public static <E> TdMakeSubmodelSelector<E> newTdMakeSubmodelSelector(SingularAttribute<E, Double> field) {
            return new TdMakeSubmodelSelector<E>(field);
        }
    }

    public static class TdMetroSelector<E> extends EntitySelector<E, TdMetro, Integer> {
        public TdMetroSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdMetroSelector<E> newTdMetroSelector(SingularAttribute<E, Integer> field) {
            return new TdMetroSelector<E>(field);
        }
    }

    public static class TdOrderSelector<E> extends EntitySelector<E, TdOrder, Integer> {
        public TdOrderSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdOrderSelector<E> newTdOrderSelector(SingularAttribute<E, Integer> field) {
            return new TdOrderSelector<E>(field);
        }
    }

    public static class TdPageSelector<E> extends EntitySelector<E, TdPage, Integer> {
        public TdPageSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdPageSelector<E> newTdPageSelector(SingularAttribute<E, Integer> field) {
            return new TdPageSelector<E>(field);
        }
    }

    public static class TdPermissionSelector<E> extends EntitySelector<E, TdPermission, Integer> {
        public TdPermissionSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdPermissionSelector<E> newTdPermissionSelector(SingularAttribute<E, Integer> field) {
            return new TdPermissionSelector<E>(field);
        }
    }

    public static class TdPictureSelector<E> extends EntitySelector<E, TdPicture, Integer> {
        public TdPictureSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdPictureSelector<E> newTdPictureSelector(SingularAttribute<E, Integer> field) {
            return new TdPictureSelector<E>(field);
        }
    }

    public static class TdProductSelector<E> extends EntitySelector<E, TdProduct, Integer> {
        public TdProductSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdProductSelector<E> newTdProductSelector(SingularAttribute<E, Integer> field) {
            return new TdProductSelector<E>(field);
        }
    }

    public static class TdProductBrandSelector<E> extends EntitySelector<E, TdProductBrand, Integer> {
        public TdProductBrandSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdProductBrandSelector<E> newTdProductBrandSelector(SingularAttribute<E, Integer> field) {
            return new TdProductBrandSelector<E>(field);
        }
    }

    public static class TdProductModelSelector<E> extends EntitySelector<E, TdProductModel, Integer> {
        public TdProductModelSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdProductModelSelector<E> newTdProductModelSelector(SingularAttribute<E, Integer> field) {
            return new TdProductModelSelector<E>(field);
        }
    }

    public static class TdProductShipmentSelector<E> extends EntitySelector<E, TdProductShipment, Integer> {
        public TdProductShipmentSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdProductShipmentSelector<E> newTdProductShipmentSelector(SingularAttribute<E, Integer> field) {
            return new TdProductShipmentSelector<E>(field);
        }
    }

    public static class TdProductSubmodelSelector<E> extends EntitySelector<E, TdProductSubmodel, Integer> {
        public TdProductSubmodelSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdProductSubmodelSelector<E> newTdProductSubmodelSelector(SingularAttribute<E, Integer> field) {
            return new TdProductSubmodelSelector<E>(field);
        }
    }

    public static class TdProductSupplierSelector<E> extends EntitySelector<E, TdProductSupplier, Integer> {
        public TdProductSupplierSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdProductSupplierSelector<E> newTdProductSupplierSelector(SingularAttribute<E, Integer> field) {
            return new TdProductSupplierSelector<E>(field);
        }
    }

    public static class TdRequestCarPartSelector<E> extends EntitySelector<E, TdRequestCarPart, Integer> {
        public TdRequestCarPartSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdRequestCarPartSelector<E> newTdRequestCarPartSelector(SingularAttribute<E, Integer> field) {
            return new TdRequestCarPartSelector<E>(field);
        }
    }

    public static class TdRoleSelector<E> extends EntitySelector<E, TdRole, Integer> {
        public TdRoleSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdRoleSelector<E> newTdRoleSelector(SingularAttribute<E, Integer> field) {
            return new TdRoleSelector<E>(field);
        }
    }

    public static class TdShipmentVendorSelector<E> extends EntitySelector<E, TdShipmentVendor, Integer> {
        public TdShipmentVendorSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdShipmentVendorSelector<E> newTdShipmentVendorSelector(SingularAttribute<E, Integer> field) {
            return new TdShipmentVendorSelector<E>(field);
        }
    }

    public static class TdStateSelector<E> extends EntitySelector<E, TdState, Integer> {
        public TdStateSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdStateSelector<E> newTdStateSelector(SingularAttribute<E, Integer> field) {
            return new TdStateSelector<E>(field);
        }
    }

    public static class TdSubmodelYearMappingSelector<E> extends EntitySelector<E, TdSubmodelYearMapping, Integer> {
        public TdSubmodelYearMappingSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdSubmodelYearMappingSelector<E> newTdSubmodelYearMappingSelector(SingularAttribute<E, Integer> field) {
            return new TdSubmodelYearMappingSelector<E>(field);
        }
    }

    public static class TdTagSelector<E> extends EntitySelector<E, TdTag, Integer> {
        public TdTagSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdTagSelector<E> newTdTagSelector(SingularAttribute<E, Integer> field) {
            return new TdTagSelector<E>(field);
        }
    }

    public static class TdTagGrpSelector<E> extends EntitySelector<E, TdTagGrp, Integer> {
        public TdTagGrpSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdTagGrpSelector<E> newTdTagGrpSelector(SingularAttribute<E, Integer> field) {
            return new TdTagGrpSelector<E>(field);
        }
    }

    public static class TdTagGrpTagMappingSelector<E> extends EntitySelector<E, TdTagGrpTagMapping, Integer> {
        public TdTagGrpTagMappingSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdTagGrpTagMappingSelector<E> newTdTagGrpTagMappingSelector(SingularAttribute<E, Integer> field) {
            return new TdTagGrpTagMappingSelector<E>(field);
        }
    }

    public static class TdTagRelationSelector<E> extends EntitySelector<E, TdTagRelation, Integer> {
        public TdTagRelationSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdTagRelationSelector<E> newTdTagRelationSelector(SingularAttribute<E, Integer> field) {
            return new TdTagRelationSelector<E>(field);
        }
    }

    public static class TdTopicSelector<E> extends EntitySelector<E, TdTopic, Integer> {
        public TdTopicSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdTopicSelector<E> newTdTopicSelector(SingularAttribute<E, Integer> field) {
            return new TdTopicSelector<E>(field);
        }
    }

    public static class TdUserActivitySelector<E> extends EntitySelector<E, TdUserActivity, Integer> {
        public TdUserActivitySelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdUserActivitySelector<E> newTdUserActivitySelector(SingularAttribute<E, Integer> field) {
            return new TdUserActivitySelector<E>(field);
        }
    }

    public static class TdUserActivityEventSelector<E> extends EntitySelector<E, TdUserActivityEvent, Integer> {
        public TdUserActivityEventSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdUserActivityEventSelector<E> newTdUserActivityEventSelector(SingularAttribute<E, Integer> field) {
            return new TdUserActivityEventSelector<E>(field);
        }
    }

    public static class TdUserAddressSelector<E> extends EntitySelector<E, TdUserAddress, Integer> {
        public TdUserAddressSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdUserAddressSelector<E> newTdUserAddressSelector(SingularAttribute<E, Integer> field) {
            return new TdUserAddressSelector<E>(field);
        }
    }

    public static class TdUserAuthSelector<E> extends EntitySelector<E, TdUserAuth, Integer> {
        public TdUserAuthSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdUserAuthSelector<E> newTdUserAuthSelector(SingularAttribute<E, Integer> field) {
            return new TdUserAuthSelector<E>(field);
        }
    }

    public static class TdUserDetailSelector<E> extends EntitySelector<E, TdUserDetail, Integer> {
        public TdUserDetailSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdUserDetailSelector<E> newTdUserDetailSelector(SingularAttribute<E, Integer> field) {
            return new TdUserDetailSelector<E>(field);
        }
    }

    public static class TdUserTagPreferenceSelector<E> extends EntitySelector<E, TdUserTagPreference, Integer> {
        public TdUserTagPreferenceSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdUserTagPreferenceSelector<E> newTdUserTagPreferenceSelector(SingularAttribute<E, Integer> field) {
            return new TdUserTagPreferenceSelector<E>(field);
        }
    }

    public static class TdVoteSelector<E> extends EntitySelector<E, TdVote, Integer> {
        public TdVoteSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TdVoteSelector<E> newTdVoteSelector(SingularAttribute<E, Integer> field) {
            return new TdVoteSelector<E>(field);
        }
    }

    public static class TempTdSubmodelYearMappingSelector<E> extends EntitySelector<E, TempTdSubmodelYearMapping, Integer> {
        public TempTdSubmodelYearMappingSelector(SingularAttribute<E, Integer> field) {
            super(field);
        }

        public static <E> TempTdSubmodelYearMappingSelector<E> newTempTdSubmodelYearMappingSelector(SingularAttribute<E, Integer> field) {
            return new TempTdSubmodelYearMappingSelector<E>(field);
        }
    }

    public static class TempTdTagGrpTagMappingSelector<E> extends EntitySelector<E, TempTdTagGrpTagMapping, TempTdTagGrpTagMappingPk> {
        public TempTdTagGrpTagMappingSelector(SingularAttribute<E, TempTdTagGrpTagMappingPk> field) {
            super(field);
        }

        public static <E> TempTdTagGrpTagMappingSelector<E> newTempTdTagGrpTagMappingSelector(SingularAttribute<E, TempTdTagGrpTagMappingPk> field) {
            return new TempTdTagGrpTagMappingSelector<E>(field);
        }
    }
}