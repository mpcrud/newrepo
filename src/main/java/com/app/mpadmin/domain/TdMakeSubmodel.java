/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/domain/Entity.e.vm.java
 */
package com.app.mpadmin.domain;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.TemporalType.TIMESTAMP;
import static org.hibernate.annotations.CacheConcurrencyStrategy.NONSTRICT_READ_WRITE;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import org.hibernate.validator.constraints.URL;
import com.app.mpadmin.domain.PersistableHashBuilder;
import com.google.common.base.Objects;
import com.app.mpadmin.domain.TdMakeModel;

@Entity
@Table(name = "td_make_submodel")
@Cache(usage = NONSTRICT_READ_WRITE)
public class TdMakeSubmodel implements Identifiable<Double>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(TdMakeSubmodel.class);

    // Raw attributes
    private Double makeSubmodelId; // pk
    private Double makeModelId;
    private String makesubmodelDisplayName;
    private String makesubmodelTechnicalName;
    private String makesubmodelAlternateName;
    private String shortDesc;
    private byte[] longDesc;
    private Integer submodelLaunchYear;
    private Integer fuelType;
    private Integer transmissionType;
    private Integer wheeldriveType;
    private Integer engineCapacity;
    private Integer bodyType;
    private Integer doorCount;
    private Integer gearCount;
    private Integer fuelDelivery;
    private Integer valvesCount;
    private Integer isActive;
    private Integer bhp;
    private Integer torque;
    private Integer submodelType;
    private String specialEditionName;
    private String specialEditionInfo;
    private Integer specialEditionYear;
    private Integer makesubmodelStatus;
    private String seoResources;
    private String seoUrl;
    private String seoH1;
    private String seoH2;
    private String metaTitle;
    private String metaKeyword;
    private String metaDescription;
    private String custom1;
    private String custom2;
    private String custom3;
    private Date creationDate;
    private Date updationDate;
    
 // Many to one
    private TdMakeModel makeModel;

    // ---------------------------
    // Constructors
    // ---------------------------

    public TdMakeSubmodel() {
    }

    public TdMakeSubmodel(Double primaryKey) {
        setId(primaryKey);
    }

    // ---------------------------
    // Identifiable implementation
    // ---------------------------

    @Override
    @Transient
    @XmlTransient
    public Double getId() {
        return getMakeSubmodelId();
    }

    @Override
    public void setId(Double makeSubmodelId) {
        setMakeSubmodelId(makeSubmodelId);
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return isMakeSubmodelIdSet();
    }

    // -------------------------------
    // Getter & Setter
    // -------------------------------

    // -- [makeSubmodelId] ------------------------

    @Column(name = "make_submodel_id", precision = 22)
    @Id
    public Double getMakeSubmodelId() {
        return makeSubmodelId;
    }

    public void setMakeSubmodelId(Double makeSubmodelId) {
        this.makeSubmodelId = makeSubmodelId;
    }

    @Transient
    public boolean isMakeSubmodelIdSet() {
        return makeSubmodelId != null;
    }

    /**
     * Helper method to set the makeSubmodelId attribute via an int.
     * @see #setMakeSubmodelId(Double)
     */
    public void setMakeSubmodelId(int makeSubmodelId) {
        this.makeSubmodelId = Double.valueOf(makeSubmodelId);
    }

    // -- [makeModelId] ------------------------

    @Column(name = "make_model_id", precision = 22,insertable=false,updatable=false)
    public Double getMakeModelId() {
        return makeModelId;
    }

    public void setMakeModelId(Double makeModelId) {
        this.makeModelId = makeModelId;
    }

    /**
     * Helper method to set the makeModelId attribute via an int.
     * @see #setMakeModelId(Double)
     */
    public void setMakeModelId(int makeModelId) {
        this.makeModelId = Double.valueOf(makeModelId);
    }

    // -- [makesubmodelDisplayName] ------------------------

    @Size(max = 768)
    @Column(name = "makesubmodel_display_name", length = 768)
    public String getMakesubmodelDisplayName() {
        return makesubmodelDisplayName;
    }

    public void setMakesubmodelDisplayName(String makesubmodelDisplayName) {
        this.makesubmodelDisplayName = makesubmodelDisplayName;
    }

    // -- [makesubmodelTechnicalName] ------------------------

    @Size(max = 768)
    @Column(name = "makesubmodel_technical_name", length = 768)
    public String getMakesubmodelTechnicalName() {
        return makesubmodelTechnicalName;
    }

    public void setMakesubmodelTechnicalName(String makesubmodelTechnicalName) {
        this.makesubmodelTechnicalName = makesubmodelTechnicalName;
    }

    // -- [makesubmodelAlternateName] ------------------------

    @Size(max = 768)
    @Column(name = "makesubmodel_alternate_name", length = 768)
    public String getMakesubmodelAlternateName() {
        return makesubmodelAlternateName;
    }

    public void setMakesubmodelAlternateName(String makesubmodelAlternateName) {
        this.makesubmodelAlternateName = makesubmodelAlternateName;
    }

    // -- [shortDesc] ------------------------

    @Size(max = 6144)
    @Column(name = "short_desc", length = 6144)
    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    // -- [longDesc] ------------------------

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "long_desc")
    @Lob
    public byte[] getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(byte[] longDesc) {
        this.longDesc = longDesc;
    }

    // -- [submodelLaunchYear] ------------------------

    @Column(name = "submodel_launch_year", precision = 10)
    public Integer getSubmodelLaunchYear() {
        return submodelLaunchYear;
    }

    public void setSubmodelLaunchYear(Integer submodelLaunchYear) {
        this.submodelLaunchYear = submodelLaunchYear;
    }

    // -- [fuelType] ------------------------

    @Column(name = "fuel_type", precision = 10)
    public Integer getFuelType() {
        return fuelType;
    }

    public void setFuelType(Integer fuelType) {
        this.fuelType = fuelType;
    }

    // -- [transmissionType] ------------------------

    @Column(name = "transmission_type", precision = 10)
    public Integer getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(Integer transmissionType) {
        this.transmissionType = transmissionType;
    }

    // -- [wheeldriveType] ------------------------

    @Column(name = "wheeldrive_type", precision = 10)
    public Integer getWheeldriveType() {
        return wheeldriveType;
    }

    public void setWheeldriveType(Integer wheeldriveType) {
        this.wheeldriveType = wheeldriveType;
    }

    // -- [engineCapacity] ------------------------

    @Column(name = "engine_capacity", precision = 10)
    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    // -- [bodyType] ------------------------

    @Column(name = "body_type", precision = 10)
    public Integer getBodyType() {
        return bodyType;
    }

    public void setBodyType(Integer bodyType) {
        this.bodyType = bodyType;
    }

    // -- [doorCount] ------------------------

    @Column(name = "door_count", precision = 10)
    public Integer getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(Integer doorCount) {
        this.doorCount = doorCount;
    }

    // -- [gearCount] ------------------------

    @Column(name = "gear_count", precision = 10)
    public Integer getGearCount() {
        return gearCount;
    }

    public void setGearCount(Integer gearCount) {
        this.gearCount = gearCount;
    }

    // -- [fuelDelivery] ------------------------

    @Column(name = "fuel_delivery", precision = 10)
    public Integer getFuelDelivery() {
        return fuelDelivery;
    }

    public void setFuelDelivery(Integer fuelDelivery) {
        this.fuelDelivery = fuelDelivery;
    }

    // -- [valvesCount] ------------------------

    @Column(name = "valves_count", precision = 10)
    public Integer getValvesCount() {
        return valvesCount;
    }

    public void setValvesCount(Integer valvesCount) {
        this.valvesCount = valvesCount;
    }

    // -- [isActive] ------------------------

    @Column(name = "is_active", precision = 10)
    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    // -- [bhp] ------------------------

    @Column(precision = 10)
    public Integer getBhp() {
        return bhp;
    }

    public void setBhp(Integer bhp) {
        this.bhp = bhp;
    }

    // -- [torque] ------------------------

    @Column(precision = 10)
    public Integer getTorque() {
        return torque;
    }

    public void setTorque(Integer torque) {
        this.torque = torque;
    }

    // -- [submodelType] ------------------------

    @Column(name = "submodel_type", precision = 10)
    public Integer getSubmodelType() {
        return submodelType;
    }

    public void setSubmodelType(Integer submodelType) {
        this.submodelType = submodelType;
    }

    // -- [specialEditionName] ------------------------

    @Size(max = 768)
    @Column(name = "special_edition_name", length = 768)
    public String getSpecialEditionName() {
        return specialEditionName;
    }

    public void setSpecialEditionName(String specialEditionName) {
        this.specialEditionName = specialEditionName;
    }

    // -- [specialEditionInfo] ------------------------

    @Size(max = 768)
    @Column(name = "special_edition_info", length = 768)
    public String getSpecialEditionInfo() {
        return specialEditionInfo;
    }

    public void setSpecialEditionInfo(String specialEditionInfo) {
        this.specialEditionInfo = specialEditionInfo;
    }

    // -- [specialEditionYear] ------------------------

    @Column(name = "special_edition_year", precision = 10)
    public Integer getSpecialEditionYear() {
        return specialEditionYear;
    }

    public void setSpecialEditionYear(Integer specialEditionYear) {
        this.specialEditionYear = specialEditionYear;
    }

    // -- [makesubmodelStatus] ------------------------

    @Column(name = "makesubmodel_status", precision = 3)
    public Integer getMakesubmodelStatus() {
        return makesubmodelStatus;
    }

    public void setMakesubmodelStatus(Integer makesubmodelStatus) {
        this.makesubmodelStatus = makesubmodelStatus;
    }

    // -- [seoResources] ------------------------

    @Size(max = 768)
    @Column(name = "seo_resources", length = 768)
    public String getSeoResources() {
        return seoResources;
    }

    public void setSeoResources(String seoResources) {
        this.seoResources = seoResources;
    }

    // -- [seoUrl] ------------------------

    @Size(max = 1536)
    @URL
    @Column(name = "seo_url", length = 1536)
    public String getSeoUrl() {
        return seoUrl;
    }

    public void setSeoUrl(String seoUrl) {
        this.seoUrl = seoUrl;
    }

    // -- [seoH1] ------------------------

    @Size(max = 768)
    @Column(name = "seo_h1", length = 768)
    public String getSeoH1() {
        return seoH1;
    }

    public void setSeoH1(String seoH1) {
        this.seoH1 = seoH1;
    }

    // -- [seoH2] ------------------------

    @Size(max = 768)
    @Column(name = "seo_h2", length = 768)
    public String getSeoH2() {
        return seoH2;
    }

    public void setSeoH2(String seoH2) {
        this.seoH2 = seoH2;
    }

    // -- [metaTitle] ------------------------

    @Size(max = 1536)
    @Column(name = "meta_title", length = 1536)
    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    // -- [metaKeyword] ------------------------

    @Size(max = 1536)
    @Column(name = "meta_keyword", length = 1536)
    public String getMetaKeyword() {
        return metaKeyword;
    }

    public void setMetaKeyword(String metaKeyword) {
        this.metaKeyword = metaKeyword;
    }

    // -- [metaDescription] ------------------------

    @Size(max = 1536)
    @Column(name = "meta_description", length = 1536)
    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    // -- [custom1] ------------------------

    @Size(max = 3072)
    @Column(length = 3072)
    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1;
    }

    // -- [custom2] ------------------------

    @Size(max = 3072)
    @Column(length = 3072)
    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2;
    }

    // -- [custom3] ------------------------

    @Size(max = 3072)
    @Column(length = 3072)
    public String getCustom3() {
        return custom3;
    }

    public void setCustom3(String custom3) {
        this.custom3 = custom3;
    }

    // -- [creationDate] ------------------------

    @Column(name = "creation_date", length = 19)
    @Temporal(TIMESTAMP)
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    // -- [updationDate] ------------------------

    @Column(name = "updation_date", length = 19)
    @Temporal(TIMESTAMP)
    public Date getUpdationDate() {
        return updationDate;
    }

    public void setUpdationDate(Date updationDate) {
        this.updationDate = updationDate;
    }
    
 // --------------------------------------------------------------------
    // Many to One support
    // --------------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: TdMakeSubmodel.makeModelId ==> TdMakeModel.makeModelId
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @Cache(usage = NONSTRICT_READ_WRITE)
    @JoinColumn(name = "make_model_id")
    @ManyToOne(cascade = PERSIST, fetch = LAZY)
    public TdMakeModel getMakeModel() {
        return makeModel;
    }

    /**
     * Set the model without adding this TdMakeSubmodel instance on the passed model
     * If you want to preserve referential integrity we recommend to use
     * instead the corresponding adder method provided by {@link TdMakeModel}
     */
    public void setMakeModel(TdMakeModel makeModel) {
        this.makeModel = makeModel;

        // We set the foreign key property so it can be used by our JPA search by Example facility.
        if (makeModel != null) {
        	setMakeModelId(makeModel.getMakeModelId());
        } else {
        	setMakeModelId(null);
        }
    }

    /**
     * Set the default values.
     */
    public void initDefaultValues() {
    }

    /**
     * equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof TdMakeSubmodel && hashCode() == other.hashCode());
    }

    private PersistableHashBuilder persistableHashBuilder = new PersistableHashBuilder();

    @Override
    public int hashCode() {
        return persistableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this TdMakeSubmodel instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("makeSubmodelId", getMakeSubmodelId()) //
                .add("makeModelId", getMakeModelId()) //
                .add("makesubmodelDisplayName", getMakesubmodelDisplayName()) //
                .add("makesubmodelTechnicalName", getMakesubmodelTechnicalName()) //
                .add("makesubmodelAlternateName", getMakesubmodelAlternateName()) //
                .add("shortDesc", getShortDesc()) //
                .add("longDesc", getLongDesc()) //
                .add("submodelLaunchYear", getSubmodelLaunchYear()) //
                .add("fuelType", getFuelType()) //
                .add("transmissionType", getTransmissionType()) //
                .add("wheeldriveType", getWheeldriveType()) //
                .add("engineCapacity", getEngineCapacity()) //
                .add("bodyType", getBodyType()) //
                .add("doorCount", getDoorCount()) //
                .add("gearCount", getGearCount()) //
                .add("fuelDelivery", getFuelDelivery()) //
                .add("valvesCount", getValvesCount()) //
                .add("isActive", getIsActive()) //
                .add("bhp", getBhp()) //
                .add("torque", getTorque()) //
                .add("submodelType", getSubmodelType()) //
                .add("specialEditionName", getSpecialEditionName()) //
                .add("specialEditionInfo", getSpecialEditionInfo()) //
                .add("specialEditionYear", getSpecialEditionYear()) //
                .add("makesubmodelStatus", getMakesubmodelStatus()) //
                .add("seoResources", getSeoResources()) //
                .add("seoUrl", getSeoUrl()) //
                .add("seoH1", getSeoH1()) //
                .add("seoH2", getSeoH2()) //
                .add("metaTitle", getMetaTitle()) //
                .add("metaKeyword", getMetaKeyword()) //
                .add("metaDescription", getMetaDescription()) //
                .add("custom1", getCustom1()) //
                .add("custom2", getCustom2()) //
                .add("custom3", getCustom3()) //
                .add("creationDate", getCreationDate()) //
                .add("updationDate", getUpdationDate()) //
                .toString();
    }

    @PrePersist
    protected void prePersist() {
        setCreationDate(new Date());
    }
}