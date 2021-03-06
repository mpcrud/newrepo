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
import com.app.mpadmin.domain.TdProduct;
import com.app.mpadmin.util.ValueGenerator;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@SuppressWarnings("unused")
@Named
@Singleton
public class TdProductGenerator {

    /**
     * Returns a new TdProduct instance filled with random values.
     */
    public TdProduct getTdProduct() {
        TdProduct tdProduct = new TdProduct();

        // simple attributes follows
     //   tdProduct.setProductSupplierId(1);
      //  tdProduct.setProductShipmentId(1);
        tdProduct.setSupplierProductCode("a");
        tdProduct.setProductDisplayName("a");
        tdProduct.setProductTechnicalName("a");
        tdProduct.setProductAlternateName("a");
        tdProduct.setMicroDescription("a");
        tdProduct.setShortDesc("a");
        tdProduct.setLongDesc("a");
        tdProduct.setProductAgeTime(1);
        tdProduct.setProductAgeDistance(1);
        tdProduct.setProductMeasurementUnit("a");
        tdProduct.setInnerDia1(1);
        tdProduct.setInnerDia2(1);
        tdProduct.setOuterDia1(1);
        tdProduct.setOuterDia2(1);
        tdProduct.setHeight1(1);
        tdProduct.setHeight2(1);
        tdProduct.setWidth1(1);
        tdProduct.setWidth2(1);
        tdProduct.setThickness1(1);
        tdProduct.setThickness2(1);
        tdProduct.setNoOfOuterThread1(1);
        tdProduct.setNoOfOuterThread2(1);
        tdProduct.setNoOfHoles1(1);
        tdProduct.setNoOfHoles2(1);
        tdProduct.setNoOfTeeth1(1);
        tdProduct.setNoOfTeeth2(1);
        tdProduct.setPitchCircle("a");
        tdProduct.setPlateDiameter(1);
        tdProduct.setEngineVersion("a");
        tdProduct.setMaterial("a");
        tdProduct.setDimensions("a");
        tdProduct.setMaxFreeplay("a");
        tdProduct.setMaxRock("a");
        tdProduct.setWearWarning("a");
        tdProduct.setBrakeSystemType("a");
        tdProduct.setFrictionControlPlate("a");
        tdProduct.setAdjustment("a");
        tdProduct.setApplicationInformation("a");
        tdProduct.setFittingPosition("a");
        tdProduct.setQuantityOfFit(1);
        tdProduct.setRequiredQuantity(1);
        tdProduct.setSupplementaryInfo("a");
        tdProduct.setExtraInfo("a");
        tdProduct.setCustomName1("a");
        tdProduct.setCustomValue1("a");
        tdProduct.setCustomName2("a");
        tdProduct.setCustomValue2("a");
        tdProduct.setCustomName3("a");
        tdProduct.setCustomValue3("a");
        tdProduct.setCustomName4("a");
        tdProduct.setCustomValue4("a");
        tdProduct.setMrpPrice(1f);
        tdProduct.setDiscount(1f);
        tdProduct.setDealerPrice(1f);
        tdProduct.setInternalRating(1);
        tdProduct.setRecommendedProduct(true);
        tdProduct.setBestSeller(true);
        tdProduct.setSpecifications("a");
        tdProduct.setRefLink1("a");
        tdProduct.setRefLink2("a");
        tdProduct.setProductSegmentType(1);
        tdProduct.setComparison("a");
        tdProduct.setBookableOnline(true);
        tdProduct.setBookableOffline(true);
        tdProduct.setUniformAcrossYear(true);
        tdProduct.setUniformAcrossSubmodel(true);
        tdProduct.setUniformAcrossModel(true);
        tdProduct.setUniformAcrossMake(true);
        tdProduct.setDeliveryType(1);
        tdProduct.setProductStatus(true);
        tdProduct.setCustomint1(1);
        tdProduct.setCustomint2(1);
        tdProduct.setCustomint3(1);
        tdProduct.setSeoResources("a");
        tdProduct.setSeoUrl("http://www.jaxio.com");
        tdProduct.setSeoH1("a");
        tdProduct.setSeoH2("a");
        tdProduct.setMetaTitle("a");
        tdProduct.setMetaKeyword("a");
        tdProduct.setMetaDescription("a");
        tdProduct.setCreationDate(new Date());
        tdProduct.setUpdationDate(new Date());
        return tdProduct;
    }

}