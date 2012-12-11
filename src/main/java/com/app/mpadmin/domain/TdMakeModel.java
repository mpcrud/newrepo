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
import com.app.mpadmin.domain.TdMake;

@Entity
@Table(name = "td_make_model")
@Cache(usage = NONSTRICT_READ_WRITE)
public class TdMakeModel implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(TdMakeModel.class);

    // Raw attributes
    private Integer makeModelId; // pk
    private Integer makeId;
    private String makemodelDisplayName;
    private String makemodelTechnicalName;
    private String makemodelAlternateName;
    private String shortDesc;
    private byte[] longDesc;
    private Integer isActive;
    private Integer modelLaunchYear;
    private Integer fuelType;
    private Integer transmissionType;
    private Integer wheeldriveType;
    private Integer engineCapacity;
    private Integer bodyType;
    private Integer doorCount;
    private Integer gearCount;
    private Integer fuelDelivery;
    private Integer valvesCount;
    private Integer bhp;
    private Integer torque;
    private Integer makemodelStatus;
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
    private TdMake make;

    // ---------------------------
    // Constructors
    // ---------------------------

    public TdMakeModel() {
    }

    public TdMakeModel(Integer primaryKey) {
        setId(primaryKey);
    }

    // ---------------------------
    // Identifiable implementation
    // ---------------------------

    @Override
    @Transient
    @XmlTransient
    public Integer getId() {
        return getMakeModelId();
    }

    @Override
    public void setId(Integer makeModelId) {
        setMakeModelId(makeModelId);
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return isMakeModelIdSet();
    }

    // -------------------------------
    // Getter & Setter
    // -------------------------------

    // -- [makeModelId] ------------------------

    @Column(name = "make_model_id", precision = 10)
    @Id
    public Integer getMakeModelId() {
        return makeModelId;
    }

    public void setMakeModelId(Integer makeModelId) {
        this.makeModelId = makeModelId;
    }

    @Transient
    public boolean isMakeModelIdSet() {
        return makeModelId != null;
    }

    // -- [makeId] ------------------------

    @Column(name = "make_id", precision = 10, insertable = false, updatable = false)
    public Integer getMakeId() {
        return makeId;
    }

    public void setMakeId(Integer makeId) {
        this.makeId = makeId;
    }

    // -- [makemodelDisplayName] ------------------------

    @Size(max = 768)
    @Column(name = "makemodel_display_name", length = 768)
    public String getMakemodelDisplayName() {
        return makemodelDisplayName;
    }

    public void setMakemodelDisplayName(String makemodelDisplayName) {
        this.makemodelDisplayName = makemodelDisplayName;
    }

    // -- [makemodelTechnicalName] ------------------------

    @Size(max = 768)
    @Column(name = "makemodel_technical_name", length = 768)
    public String getMakemodelTechnicalName() {
        return makemodelTechnicalName;
    }

    public void setMakemodelTechnicalName(String makemodelTechnicalName) {
        this.makemodelTechnicalName = makemodelTechnicalName;
    }

    // -- [makemodelAlternateName] ------------------------

    @Size(max = 768)
    @Column(name = "makemodel_alternate_name", length = 768)
    public String getMakemodelAlternateName() {
        return makemodelAlternateName;
    }

    public void setMakemodelAlternateName(String makemodelAlternateName) {
        this.makemodelAlternateName = makemodelAlternateName;
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

    // -- [isActive] ------------------------

    @Column(name = "is_active", precision = 5)
    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    // -- [modelLaunchYear] ------------------------

    @Column(name = "model_launch_year", precision = 5)
    public Integer getModelLaunchYear() {
        return modelLaunchYear;
    }

    public void setModelLaunchYear(Integer modelLaunchYear) {
        this.modelLaunchYear = modelLaunchYear;
    }

    // -- [fuelType] ------------------------

    @Column(name = "fuel_type", precision = 5)
    public Integer getFuelType() {
        return fuelType;
    }

    public void setFuelType(Integer fuelType) {
        this.fuelType = fuelType;
    }

    // -- [transmissionType] ------------------------

    @Column(name = "transmission_type", precision = 5)
    public Integer getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(Integer transmissionType) {
        this.transmissionType = transmissionType;
    }

    // -- [wheeldriveType] ------------------------

    @Column(name = "wheeldrive_type", precision = 5)
    public Integer getWheeldriveType() {
        return wheeldriveType;
    }

    public void setWheeldriveType(Integer wheeldriveType) {
        this.wheeldriveType = wheeldriveType;
    }

    // -- [engineCapacity] ------------------------

    @Column(name = "engine_capacity", precision = 5)
    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    // -- [bodyType] ------------------------

    @Column(name = "body_type", precision = 5)
    public Integer getBodyType() {
        return bodyType;
    }

    public void setBodyType(Integer bodyType) {
        this.bodyType = bodyType;
    }

    // -- [doorCount] ------------------------

    @Column(name = "door_count", precision = 5)
    public Integer getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(Integer doorCount) {
        this.doorCount = doorCount;
    }

    // -- [gearCount] ------------------------

    @Column(name = "gear_count", precision = 5)
    public Integer getGearCount() {
        return gearCount;
    }

    public void setGearCount(Integer gearCount) {
        this.gearCount = gearCount;
    }

    // -- [fuelDelivery] ------------------------

    @Column(name = "fuel_delivery", precision = 5)
    public Integer getFuelDelivery() {
        return fuelDelivery;
    }

    public void setFuelDelivery(Integer fuelDelivery) {
        this.fuelDelivery = fuelDelivery;
    }

    // -- [valvesCount] ------------------------

    @Column(name = "valves_count", precision = 5)
    public Integer getValvesCount() {
        return valvesCount;
    }

    public void setValvesCount(Integer valvesCount) {
        this.valvesCount = valvesCount;
    }

    // -- [bhp] ------------------------

    @Column(precision = 5)
    public Integer getBhp() {
        return bhp;
    }

    public void setBhp(Integer bhp) {
        this.bhp = bhp;
    }

    // -- [torque] ------------------------

    @Column(precision = 5)
    public Integer getTorque() {
        return torque;
    }

    public void setTorque(Integer torque) {
        this.torque = torque;
    }

    // -- [makemodelStatus] ------------------------

    @Column(name = "makemodel_status", precision = 3)
    public Integer getMakemodelStatus() {
        return makemodelStatus;
    }

    public void setMakemodelStatus(Integer makemodelStatus) {
        this.makemodelStatus = makemodelStatus;
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
   // @URL
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
    // many-to-one: TdMakeModel.makeId ==> TdMake.makeId
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @Cache(usage = NONSTRICT_READ_WRITE)
    @JoinColumn(name = "make_id")
    @ManyToOne(cascade = PERSIST, fetch = LAZY)
    public TdMake getMake() {
        return make;
    }

    /**
     * Set the make without adding this TdMakeModel instance on the passed make
     * If you want to preserve referential integrity we recommend to use
     * instead the corresponding adder method provided by {@link TdMake}
     */
    public void setMake(TdMake make) {
        this.make = make;

        // We set the foreign key property so it can be used by our JPA search by Example facility.
        if (make != null) {
            setMakeId(make.getMakeId());
        } else {
            setMakeId(null);
        }
    }

    /**
     * Set the default values.
     */
    public void initDefaultValues() {
        setIsActive(1);
        setBhp(0);
        setBodyType(0);
        setDoorCount(0);
        setEngineCapacity(0);
        setFuelDelivery(0);
        setFuelType(0);
        setGearCount(0);
        setMakemodelStatus(1);
        setModelLaunchYear(0);
        setTorque(0);
        setTransmissionType(0);
        setValvesCount(0);
        setWheeldriveType(0);

    }

    /**
     * equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof TdMakeModel && hashCode() == other.hashCode());
    }

    private PersistableHashBuilder persistableHashBuilder = new PersistableHashBuilder();

    @Override
    public int hashCode() {
        return persistableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this TdMakeModel instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("makeModelId", getMakeModelId()) //
                .add("makeId", getMakeId()) //
                .add("makemodelDisplayName", getMakemodelDisplayName()) //
                .add("makemodelTechnicalName", getMakemodelTechnicalName()) //
                .add("makemodelAlternateName", getMakemodelAlternateName()) //
                .add("shortDesc", getShortDesc()) //
                .add("longDesc", getLongDesc()) //
                .add("isActive", getIsActive()) //
                .add("modelLaunchYear", getModelLaunchYear()) //
                .add("fuelType", getFuelType()) //
                .add("transmissionType", getTransmissionType()) //
                .add("wheeldriveType", getWheeldriveType()) //
                .add("engineCapacity", getEngineCapacity()) //
                .add("bodyType", getBodyType()) //
                .add("doorCount", getDoorCount()) //
                .add("gearCount", getGearCount()) //
                .add("fuelDelivery", getFuelDelivery()) //
                .add("valvesCount", getValvesCount()) //
                .add("bhp", getBhp()) //
                .add("torque", getTorque()) //
                .add("makemodelStatus", getMakemodelStatus()) //
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