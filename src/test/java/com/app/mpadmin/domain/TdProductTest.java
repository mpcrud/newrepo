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
import static javax.persistence.TemporalType.TIMESTAMP;
import static org.hibernate.annotations.CacheConcurrencyStrategy.NONSTRICT_READ_WRITE;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

/**
 * Basic tests for TdProduct
 */
@SuppressWarnings("unused")
public class TdProductTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        TdProduct model = new TdProduct();
        assertFalse(model.isIdSet());
    }

    @Test
    public void isIdSetReturnsTrue() {
        TdProduct model = new TdProduct();
        model.setProductId(ValueGenerator.getUniqueInteger());
        assertNotNull(model.getProductId());
        assertTrue(model.isIdSet());
    }

    // test columns methods

    @Test
    public void toStringNotNull() {
        TdProduct model = new TdProduct();
        assertNotNull(model.toString());
    }

    @Test
    public void equalsUsingPk() {
        TdProduct model1 = new TdProduct();
        TdProduct model2 = new TdProduct();

        Integer productId = ValueGenerator.getUniqueInteger();
        model1.setProductId(productId);
        model2.setProductId(productId);

      //  model1.setProductSupplierId(1);
      //  model2.setProductSupplierId(1);

//        model1.setProductShipmentId(1);
  //      model2.setProductShipmentId(1);

        model1.setSupplierProductCode("a");
        model2.setSupplierProductCode("a");

        model1.setProductDisplayName("a");
        model2.setProductDisplayName("a");

        model1.setProductTechnicalName("a");
        model2.setProductTechnicalName("a");

        model1.setProductAlternateName("a");
        model2.setProductAlternateName("a");

        model1.setMicroDescription("a");
        model2.setMicroDescription("a");

        model1.setShortDesc("a");
        model2.setShortDesc("a");

        model1.setLongDesc("a");
        model2.setLongDesc("a");

        model1.setProductAgeTime(1);
        model2.setProductAgeTime(1);

        model1.setProductAgeDistance(1);
        model2.setProductAgeDistance(1);

        model1.setProductMeasurementUnit("a");
        model2.setProductMeasurementUnit("a");

        model1.setInnerDia1(1);
        model2.setInnerDia1(1);

        model1.setInnerDia2(1);
        model2.setInnerDia2(1);

        model1.setOuterDia1(1);
        model2.setOuterDia1(1);

        model1.setOuterDia2(1);
        model2.setOuterDia2(1);

        model1.setHeight1(1);
        model2.setHeight1(1);

        model1.setHeight2(1);
        model2.setHeight2(1);

        model1.setWidth1(1);
        model2.setWidth1(1);

        model1.setWidth2(1);
        model2.setWidth2(1);

        model1.setThickness1(1);
        model2.setThickness1(1);

        model1.setThickness2(1);
        model2.setThickness2(1);

        model1.setNoOfOuterThread1(1);
        model2.setNoOfOuterThread1(1);

        model1.setNoOfOuterThread2(1);
        model2.setNoOfOuterThread2(1);

        model1.setNoOfHoles1(1);
        model2.setNoOfHoles1(1);

        model1.setNoOfHoles2(1);
        model2.setNoOfHoles2(1);

        model1.setNoOfTeeth1(1);
        model2.setNoOfTeeth1(1);

        model1.setNoOfTeeth2(1);
        model2.setNoOfTeeth2(1);

        model1.setPitchCircle("a");
        model2.setPitchCircle("a");

        model1.setPlateDiameter(1);
        model2.setPlateDiameter(1);

        model1.setEngineVersion("a");
        model2.setEngineVersion("a");

        model1.setMaterial("a");
        model2.setMaterial("a");

        model1.setDimensions("a");
        model2.setDimensions("a");

        model1.setMaxFreeplay("a");
        model2.setMaxFreeplay("a");

        model1.setMaxRock("a");
        model2.setMaxRock("a");

        model1.setWearWarning("a");
        model2.setWearWarning("a");

        model1.setBrakeSystemType("a");
        model2.setBrakeSystemType("a");

        model1.setFrictionControlPlate("a");
        model2.setFrictionControlPlate("a");

        model1.setAdjustment("a");
        model2.setAdjustment("a");

        model1.setApplicationInformation("a");
        model2.setApplicationInformation("a");

        model1.setFittingPosition("a");
        model2.setFittingPosition("a");

        model1.setQuantityOfFit(1);
        model2.setQuantityOfFit(1);

        model1.setRequiredQuantity(1);
        model2.setRequiredQuantity(1);

        model1.setSupplementaryInfo("a");
        model2.setSupplementaryInfo("a");

        model1.setExtraInfo("a");
        model2.setExtraInfo("a");

        model1.setCustomName1("a");
        model2.setCustomName1("a");

        model1.setCustomValue1("a");
        model2.setCustomValue1("a");

        model1.setCustomName2("a");
        model2.setCustomName2("a");

        model1.setCustomValue2("a");
        model2.setCustomValue2("a");

        model1.setCustomName3("a");
        model2.setCustomName3("a");

        model1.setCustomValue3("a");
        model2.setCustomValue3("a");

        model1.setCustomName4("a");
        model2.setCustomName4("a");

        model1.setCustomValue4("a");
        model2.setCustomValue4("a");

        model1.setMrpPrice(1f);
        model2.setMrpPrice(1f);

        model1.setDiscount(1f);
        model2.setDiscount(1f);

        model1.setDealerPrice(1f);
        model2.setDealerPrice(1f);

        model1.setInternalRating(1);
        model2.setInternalRating(1);

        model1.setRecommendedProduct(true);
        model2.setRecommendedProduct(true);

        model1.setBestSeller(true);
        model2.setBestSeller(true);

        model1.setSpecifications("a");
        model2.setSpecifications("a");

        model1.setRefLink1("a");
        model2.setRefLink1("a");

        model1.setRefLink2("a");
        model2.setRefLink2("a");

        model1.setProductSegmentType(1);
        model2.setProductSegmentType(1);

        model1.setComparison("a");
        model2.setComparison("a");

        model1.setBookableOnline(true);
        model2.setBookableOnline(true);

        model1.setBookableOffline(true);
        model2.setBookableOffline(true);

        model1.setUniformAcrossYear(true);
        model2.setUniformAcrossYear(true);

        model1.setUniformAcrossSubmodel(true);
        model2.setUniformAcrossSubmodel(true);

        model1.setUniformAcrossModel(true);
        model2.setUniformAcrossModel(true);

        model1.setUniformAcrossMake(true);
        model2.setUniformAcrossMake(true);

        model1.setDeliveryType(1);
        model2.setDeliveryType(1);

        model1.setProductStatus(true);
        model2.setProductStatus(true);

        model1.setCustomint1(1);
        model2.setCustomint1(1);

        model1.setCustomint2(1);
        model2.setCustomint2(1);

        model1.setCustomint3(1);
        model2.setCustomint3(1);

        model1.setSeoResources("a");
        model2.setSeoResources("a");

        model1.setSeoUrl("http://www.jaxio.com");
        model2.setSeoUrl("http://www.jaxio.com");

        model1.setSeoH1("a");
        model2.setSeoH1("a");

        model1.setSeoH2("a");
        model2.setSeoH2("a");

        model1.setMetaTitle("a");
        model2.setMetaTitle("a");

        model1.setMetaKeyword("a");
        model2.setMetaKeyword("a");

        model1.setMetaDescription("a");
        model2.setMetaDescription("a");

        model1.setCreationDate(new Date());
        model2.setCreationDate(new Date());

        model1.setUpdationDate(new Date());
        model2.setUpdationDate(new Date());
        assertTrue(model1.isIdSet());
        assertTrue(model2.isIdSet());
        assertTrue(model1.hashCode() == model2.hashCode());
        assertTrue(model1.equals(model2));
        assertTrue(model2.equals(model1));
    }
}