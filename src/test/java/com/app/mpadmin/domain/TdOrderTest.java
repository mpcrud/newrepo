/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/test/java/domain/ModelTest.e.vm.java
 */
package com.app.mpadmin.domain;

import java.io.*;
import java.util.*;

import static org.junit.Assert.*;
import org.junit.Test;

import com.app.mpadmin.util.*;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.TemporalType.TIMESTAMP;
import static org.hibernate.annotations.CacheConcurrencyStrategy.NONSTRICT_READ_WRITE;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.URL;
import com.app.mpadmin.domain.TdCity;
import com.app.mpadmin.domain.TdCountry;
import com.app.mpadmin.domain.TdProduct;
import com.app.mpadmin.domain.TdState;
import com.app.mpadmin.domain.TdUserAuth;
import com.app.mpadmin.validation.FixedLength;

/**
 * Basic tests for TdOrder
 */
@SuppressWarnings("unused")
public class TdOrderTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        TdOrder model = new TdOrder();
        assertFalse(model.isIdSet());
    }

    @Test
    public void isIdSetReturnsTrue() {
        TdOrder model = new TdOrder();
        model.setOrderId(ValueGenerator.getUniqueInteger());
        assertNotNull(model.getOrderId());
        assertTrue(model.isIdSet());
    }

    // test columns methods

    //-------------------------------------------------------------
    // Many to One:  TdOrder.billingCityId ==> TdCity.cityId
    //-------------------------------------------------------------

    @Test
    public void manyToOne_setBillingCity() {
        TdOrder many = new TdOrder();

        // init
        TdCity one = new TdCity();

        one.setCityId(ValueGenerator.getUniqueInteger());
        many.setBillingCity(one);

        // make sure it is propagated properly
        assertNotNull(many.getBillingCityId());
        assertEquals(one, many.getBillingCity());
        assertSame(many.getBillingCityId(), one.getCityId());
        // now set it to back to null
        many.setBillingCity(null);

        // make sure null is propagated properly
        assertNull(many.getBillingCity());

        // make sure it is propagated on fk column as well
        assertNull(many.getBillingCityId());
    }

    @Test
    public void manyToOne_setShipmentCity() {
        TdOrder many = new TdOrder();

        // init
        TdCity one = new TdCity();

        one.setCityId(ValueGenerator.getUniqueInteger());
        many.setShipmentCity(one);

        // make sure it is propagated properly
        assertNotNull(many.getShipmentCityId());
        assertEquals(one, many.getShipmentCity());
        assertSame(many.getShipmentCityId(), one.getCityId());
        // now set it to back to null
        many.setShipmentCity(null);

        // make sure null is propagated properly
        assertNull(many.getShipmentCity());

        // make sure it is propagated on fk column as well
        assertNull(many.getShipmentCityId());
    }

    @Test
    public void manyToOne_setShipmentState() {
        TdOrder many = new TdOrder();

        // init
        TdState one = new TdState();

        one.setStateId(ValueGenerator.getUniqueInteger());
        many.setShipmentState(one);

        // make sure it is propagated properly
        assertNotNull(many.getShipmentStateId());
        assertEquals(one, many.getShipmentState());
        assertSame(many.getShipmentStateId(), one.getStateId());
        // now set it to back to null
        many.setShipmentState(null);

        // make sure null is propagated properly
        assertNull(many.getShipmentState());

        // make sure it is propagated on fk column as well
        assertNull(many.getShipmentStateId());
    }

    @Test
    public void manyToOne_setUser() {
        TdOrder many = new TdOrder();

        // init
        TdUserAuth one = new TdUserAuth();

        one.setUserId(ValueGenerator.getUniqueInteger());
        many.setUser(one);

        // make sure it is propagated properly
        assertNotNull(many.getUserId());
        assertEquals(one, many.getUser());
        assertSame(many.getUserId(), one.getUserId());
        // now set it to back to null
        many.setUser(null);

        // make sure null is propagated properly
        assertNull(many.getUser());

        // make sure it is propagated on fk column as well
        assertNull(many.getUserId());
    }

    @Test
    public void manyToOne_setProduct() {
        TdOrder many = new TdOrder();

        // init
        TdProduct one = new TdProduct();

        one.setProductId(ValueGenerator.getUniqueInteger());
        many.setProduct(one);

        // make sure it is propagated properly
        assertNotNull(many.getProductId());
        assertEquals(one, many.getProduct());
        assertSame(many.getProductId(), one.getProductId());
        // now set it to back to null
        many.setProduct(null);

        // make sure null is propagated properly
        assertNull(many.getProduct());

        // make sure it is propagated on fk column as well
        assertNull(many.getProductId());
    }

    @Test
    public void manyToOne_setShipmentCountry() {
        TdOrder many = new TdOrder();

        // init
        TdCountry one = new TdCountry();

        one.setCountryId(ValueGenerator.getUniqueInteger());
        many.setShipmentCountry(one);

        // make sure it is propagated properly
        assertNotNull(many.getShipmentCountryId());
        assertEquals(one, many.getShipmentCountry());
        assertSame(many.getShipmentCountryId(), one.getCountryId());
        // now set it to back to null
        many.setShipmentCountry(null);

        // make sure null is propagated properly
        assertNull(many.getShipmentCountry());

        // make sure it is propagated on fk column as well
        assertNull(many.getShipmentCountryId());
    }

    @Test
    public void manyToOne_setBillingCountry() {
        TdOrder many = new TdOrder();

        // init
        TdCountry one = new TdCountry();

        one.setCountryId(ValueGenerator.getUniqueInteger());
        many.setBillingCountry(one);

        // make sure it is propagated properly
        assertNotNull(many.getBillingCountryId());
        assertEquals(one, many.getBillingCountry());
        assertSame(many.getBillingCountryId(), one.getCountryId());
        // now set it to back to null
        many.setBillingCountry(null);

        // make sure null is propagated properly
        assertNull(many.getBillingCountry());

        // make sure it is propagated on fk column as well
        assertNull(many.getBillingCountryId());
    }

    @Test
    public void manyToOne_setAssignedToUser() {
        TdOrder many = new TdOrder();

        // init
        TdUserAuth one = new TdUserAuth();

        one.setUserId(ValueGenerator.getUniqueInteger());
        many.setAssignedToUser(one);

        // make sure it is propagated properly
        assertNotNull(many.getAssignedToUserid());
        assertEquals(one, many.getAssignedToUser());
        assertSame(many.getAssignedToUserid(), one.getUserId());
        // now set it to back to null
        many.setAssignedToUser(null);

        // make sure null is propagated properly
        assertNull(many.getAssignedToUser());

        // make sure it is propagated on fk column as well
        assertNull(many.getAssignedToUserid());
    }

    @Test
    public void manyToOne_setBillingState() {
        TdOrder many = new TdOrder();

        // init
        TdState one = new TdState();

        one.setStateId(ValueGenerator.getUniqueInteger());
        many.setBillingState(one);

        // make sure it is propagated properly
        assertNotNull(many.getBillingStateId());
        assertEquals(one, many.getBillingState());
        assertSame(many.getBillingStateId(), one.getStateId());
        // now set it to back to null
        many.setBillingState(null);

        // make sure null is propagated properly
        assertNull(many.getBillingState());

        // make sure it is propagated on fk column as well
        assertNull(many.getBillingStateId());
    }

    @Test
    public void toStringNotNull() {
        TdOrder model = new TdOrder();
        assertNotNull(model.toString());
    }

    @Test
    public void equalsUsingPk() {
        TdOrder model1 = new TdOrder();
        TdOrder model2 = new TdOrder();

        Integer orderId = ValueGenerator.getUniqueInteger();
        model1.setOrderId(orderId);
        model2.setOrderId(orderId);

        model1.setBillingId(1);
        model2.setBillingId(1);

        model1.setInvoiceId(1);
        model2.setInvoiceId(1);

        model1.setUsername("a");
        model2.setUsername("a");

        model1.setOrderFormNo("a");
        model2.setOrderFormNo("a");

        model1.setOrderType(1);
        model2.setOrderType(1);

        model1.setOrderStatus(1);
        model2.setOrderStatus(1);

        model1.setOrderActive(1);
        model2.setOrderActive(1);

        model1.setOrderChangeHistory("a");
        model2.setOrderChangeHistory("a");

        model1.setOrderPriority(1);
        model2.setOrderPriority(1);

        model1.setOrderCorporateType(1);
        model2.setOrderCorporateType(1);

        model1.setOrderBulkType(1);
        model2.setOrderBulkType(1);

        model1.setOrderDiscountCouponCode("a");
        model2.setOrderDiscountCouponCode("a");

        model1.setProductName("a");
        model2.setProductName("a");

        model1.setProductQuantity(1);
        model2.setProductQuantity(1);

        model1.setAssignedToUseridDate(new Date());
        model2.setAssignedToUseridDate(new Date());

        model1.setBillingPhone1Blocked(1);
        model2.setBillingPhone1Blocked(1);

        model1.setBillingPhone2Blocked(1);
        model2.setBillingPhone2Blocked(1);

        model1.setBillingFirstname("a");
        model2.setBillingFirstname("a");

        model1.setBillingLastname("a");
        model2.setBillingLastname("a");

        model1.setBillingEmail("dummy@dummy.com");
        model2.setBillingEmail("dummy@dummy.com");

        model1.setBillingPhone1("a");
        model2.setBillingPhone1("a");

        model1.setBillingPhone2("a");
        model2.setBillingPhone2("a");

        model1.setBillingAddressline1("a");
        model2.setBillingAddressline1("a");

        model1.setBillingAddressline2("a");
        model2.setBillingAddressline2("a");

        model1.setBillingZip("a");
        model2.setBillingZip("a");

        model1.setBillingTotalAmount(1f);
        model2.setBillingTotalAmount(1f);

        model1.setBillingAdvanceAmount(1f);
        model2.setBillingAdvanceAmount(1f);

        model1.setBillingBalanceAmount(1f);
        model2.setBillingBalanceAmount(1f);

        model1.setBillingMarginAmount(1f);
        model2.setBillingMarginAmount(1f);

        model1.setBillingTaxrate(1f);
        model2.setBillingTaxrate(1f);

        model1.setBillingPaymentGatewayRate(1f);
        model2.setBillingPaymentGatewayRate(1f);

        model1.setShipmentRate(1f);
        model2.setShipmentRate(1f);

        model1.setBillingGrossAmount(1f);
        model2.setBillingGrossAmount(1f);

        model1.setBillingNettCost(1f);
        model2.setBillingNettCost(1f);

        model1.setCustPaymentMode(1);
        model2.setCustPaymentMode(1);

        model1.setCustPaymentStatus(1);
        model2.setCustPaymentStatus(1);

        model1.setCustPaymentDate(new Date());
        model2.setCustPaymentDate(new Date());

        model1.setCustPaymentComments("a");
        model2.setCustPaymentComments("a");

        model1.setCustPaymentId1("a");
        model2.setCustPaymentId1("a");

        model1.setCustPaymentId2("a");
        model2.setCustPaymentId2("a");

        model1.setVendorPaymentMode(1);
        model2.setVendorPaymentMode(1);

        model1.setVendorPaymentDate(new Date());
        model2.setVendorPaymentDate(new Date());

        model1.setVendorPaymentComments("a");
        model2.setVendorPaymentComments("a");

        model1.setShipmentFirstname("a");
        model2.setShipmentFirstname("a");

        model1.setShipmentLastname("a");
        model2.setShipmentLastname("a");

        model1.setShipmentEmail("dummy@dummy.com");
        model2.setShipmentEmail("dummy@dummy.com");

        model1.setShipmentPhone1("a");
        model2.setShipmentPhone1("a");

        model1.setShipmentPhone2("a");
        model2.setShipmentPhone2("a");

        model1.setShipmentAddressline1("a");
        model2.setShipmentAddressline1("a");

        model1.setShipmentAddressline2("a");
        model2.setShipmentAddressline2("a");

        model1.setShipmentZip("a");
        model2.setShipmentZip("a");

        model1.setShipmentComments("a");
        model2.setShipmentComments("a");

        model1.setOrderOriginIpaddress("a");
        model2.setOrderOriginIpaddress("a");

        model1.setOrderOriginCity("a");
        model2.setOrderOriginCity("a");

        model1.setOrderOriginCountryCode("dd");
        model2.setOrderOriginCountryCode("dd");

        model1.setOrderOriginCountryId(1);
        model2.setOrderOriginCountryId(1);

        model1.setOrderLeadsubmitUrl("http://www.jaxio.com");
        model2.setOrderLeadsubmitUrl("http://www.jaxio.com");

        model1.setOrderOriginRefUrl("http://www.jaxio.com");
        model2.setOrderOriginRefUrl("http://www.jaxio.com");

        model1.setOrderOriginalRefUrl("http://www.jaxio.com");
        model2.setOrderOriginalRefUrl("http://www.jaxio.com");

        model1.setOrderBrowsingHistory("a");
        model2.setOrderBrowsingHistory("a");

        model1.setOrderRefKeywords("a");
        model2.setOrderRefKeywords("a");

        model1.setOrderRefSourceId1("a");
        model2.setOrderRefSourceId1("a");

        model1.setOrderRefSourceId2("a");
        model2.setOrderRefSourceId2("a");

        model1.setOrderRefCid("a");
        model2.setOrderRefCid("a");

        model1.setOrderCreationDate(new Date());
        model2.setOrderCreationDate(new Date());

        model1.setOrderFirstUpdationDate(new Date());
        model2.setOrderFirstUpdationDate(new Date());

        model1.setOrderAvailabilityStatus(1);
        model2.setOrderAvailabilityStatus(1);

        model1.setOrderAvailabilityStatusUpdationDate(new Date());
        model2.setOrderAvailabilityStatusUpdationDate(new Date());

        model1.setDispatchAirwayId("a");
        model2.setDispatchAirwayId("a");

        model1.setDispatchDate(new Date());
        model2.setDispatchDate(new Date());

        model1.setDeliveryDate(new Date());
        model2.setDeliveryDate(new Date());

        model1.setDeliveryStatus(1);
        model2.setDeliveryStatus(1);

        model1.setMailedReminderToVendorStatus(1);
        model2.setMailedReminderToVendorStatus(1);

        model1.setMailedReminderToVendorDate(new Date());
        model2.setMailedReminderToVendorDate(new Date());

        model1.setOrderCancelRequestStatus(1);
        model2.setOrderCancelRequestStatus(1);

        model1.setOrderCancelRequestDate(new Date());
        model2.setOrderCancelRequestDate(new Date());

        model1.setOrderCancellationToVendorStatus(1);
        model2.setOrderCancellationToVendorStatus(1);

        model1.setOrderCancellationToVendorDate(new Date());
        model2.setOrderCancellationToVendorDate(new Date());

        model1.setOrderConversionDate(new Date());
        model2.setOrderConversionDate(new Date());

        model1.setOrderConfirmationDate(new Date());
        model2.setOrderConfirmationDate(new Date());

        model1.setOrderConfirmationComments("a");
        model2.setOrderConfirmationComments("a");

        model1.setOrderReconfirmationDate(new Date());
        model2.setOrderReconfirmationDate(new Date());

        model1.setOrderReconfirmationComments("a");
        model2.setOrderReconfirmationComments("a");

        model1.setOrderCancellationType(1);
        model2.setOrderCancellationType(1);

        model1.setOrderCancellationComments("a");
        model2.setOrderCancellationComments("a");

        model1.setOrderCancellationDate(new Date());
        model2.setOrderCancellationDate(new Date());

        model1.setOrderRefundType(1);
        model2.setOrderRefundType(1);

        model1.setOrderRefundComments("a");
        model2.setOrderRefundComments("a");

        model1.setOrderRefundDate(new Date());
        model2.setOrderRefundDate(new Date());

        model1.setDisputeRaisedStatus(1);
        model2.setDisputeRaisedStatus(1);

        model1.setDisputeRaisedDate(new Date());
        model2.setDisputeRaisedDate(new Date());

        model1.setDisputeRaisedComments("a");
        model2.setDisputeRaisedComments("a");

        model1.setOrderLastUpdationDate(new Date());
        model2.setOrderLastUpdationDate(new Date());

        model1.setOrderAcceptNewsletter(1);
        model2.setOrderAcceptNewsletter(1);

        model1.setOrderAcceptPromotionalMaterial(1);
        model2.setOrderAcceptPromotionalMaterial(1);

        model1.setOrderInternalNarration("a");
        model2.setOrderInternalNarration("a");

        model1.setCustom1("a");
        model2.setCustom1("a");

        model1.setCustom2("a");
        model2.setCustom2("a");

        model1.setCustomint1(1);
        model2.setCustomint1(1);

        model1.setCustomint2(1);
        model2.setCustomint2(1);

        model1.setIpaddress("a");
        model2.setIpaddress("a");

        model1.setCarMake("a");
        model2.setCarMake("a");

        model1.setCarModel("a");
        model2.setCarModel("a");

        model1.setCarYear(1);
        model2.setCarYear(1);

        model1.setFuelType("a");
        model2.setFuelType("a");

        model1.setOrderOriginRegion("a");
        model2.setOrderOriginRegion("a");
        assertTrue(model1.isIdSet());
        assertTrue(model2.isIdSet());
        assertTrue(model1.hashCode() == model2.hashCode());
        assertTrue(model1.equals(model2));
        assertTrue(model2.equals(model1));
    }
}