/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/domain/Entity.e.vm.java
 */
package com.app.mpadmin.domain;

import static javax.persistence.TemporalType.TIMESTAMP;
import static org.hibernate.annotations.CacheConcurrencyStrategy.NONSTRICT_READ_WRITE;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
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

@Entity
@Table(name = "td_make")
@Cache(usage = NONSTRICT_READ_WRITE)
public class TdMake implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(TdMake.class);

    // Raw attributes
    private Integer makeId; // pk
    private String makeDisplayName;
    private String makeTechnicalName;
    private String makeAlternateName;
    private String shortDesc;
    private byte[] longDesc;
    private Integer isActive;
    private Integer startingYearOps;
    private Integer representCountryId;
    private String custom1;
    private String custom2;
    private String custom3;
    private Integer makeStatus;
    private String seoResources;
    private String seoUrl;
    private String seoH1;
    private String seoH2;
    private String metaTitle;
    private String metaKeyword;
    private String metaDescription;
    private Date creationDate;
    private Date updationDate;

    // ---------------------------
    // Constructors
    // ---------------------------

    public TdMake() {
    }

    public TdMake(Integer primaryKey) {
        setId(primaryKey);
    }

    // ---------------------------
    // Identifiable implementation
    // ---------------------------

    @Override
    @Transient
    @XmlTransient
    public Integer getId() {
        return getMakeId();
    }

    @Override
    public void setId(Integer makeId) {
        setMakeId(makeId);
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return isMakeIdSet();
    }

    // -------------------------------
    // Getter & Setter
    // -------------------------------

    // -- [makeId] ------------------------

    @Column(name = "make_id", precision = 10)
    @Id
    public Integer getMakeId() {
        return makeId;
    }

    public void setMakeId(Integer makeId) {
        this.makeId = makeId;
    }

    @Transient
    public boolean isMakeIdSet() {
        return makeId != null;
    }

    // -- [makeDisplayName] ------------------------

    @Size(max = 768)
    @Column(name = "make_display_name", length = 768)
    public String getMakeDisplayName() {
        return makeDisplayName;
    }

    public void setMakeDisplayName(String makeDisplayName) {
        this.makeDisplayName = makeDisplayName;
    }

    // -- [makeTechnicalName] ------------------------

    @Size(max = 768)
    @Column(name = "make_technical_name", length = 768)
    public String getMakeTechnicalName() {
        return makeTechnicalName;
    }

    public void setMakeTechnicalName(String makeTechnicalName) {
        this.makeTechnicalName = makeTechnicalName;
    }

    // -- [makeAlternateName] ------------------------

    @Size(max = 768)
    @Column(name = "make_alternate_name", length = 768)
    public String getMakeAlternateName() {
        return makeAlternateName;
    }

    public void setMakeAlternateName(String makeAlternateName) {
        this.makeAlternateName = makeAlternateName;
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

    // -- [startingYearOps] ------------------------

    @Column(name = "starting_year_ops", precision = 5)
    public Integer getStartingYearOps() {
        return startingYearOps;
    }

    public void setStartingYearOps(Integer startingYearOps) {
        this.startingYearOps = startingYearOps;
    }

    // -- [representCountryId] ------------------------

    @Column(name = "represent_country_id", precision = 10)
    public Integer getRepresentCountryId() {
        return representCountryId;
    }

    public void setRepresentCountryId(Integer representCountryId) {
        this.representCountryId = representCountryId;
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

    // -- [makeStatus] ------------------------

    @Column(name = "make_status", precision = 3)
    public Integer getMakeStatus() {
        return makeStatus;
    }

    public void setMakeStatus(Integer makeStatus) {
        this.makeStatus = makeStatus;
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
        return this == other || (other instanceof TdMake && hashCode() == other.hashCode());
    }

    private PersistableHashBuilder persistableHashBuilder = new PersistableHashBuilder();

    @Override
    public int hashCode() {
        return persistableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this TdMake instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("makeId", getMakeId()) //
                .add("makeDisplayName", getMakeDisplayName()) //
            /*    .add("makeTechnicalName", getMakeTechnicalName()) //
                .add("makeAlternateName", getMakeAlternateName()) //
                .add("shortDesc", getShortDesc()) //
                .add("longDesc", getLongDesc()) //
                .add("isActive", getIsActive()) //
                .add("startingYearOps", getStartingYearOps()) //
                .add("representCountryId", getRepresentCountryId()) //
                .add("custom1", getCustom1()) //
                .add("custom2", getCustom2()) //
                .add("custom3", getCustom3()) //
                .add("makeStatus", getMakeStatus()) //
                .add("seoResources", getSeoResources()) //
                .add("seoUrl", getSeoUrl()) //
                .add("seoH1", getSeoH1()) //
                .add("seoH2", getSeoH2()) //
                .add("metaTitle", getMetaTitle()) //
                .add("metaKeyword", getMetaKeyword()) //
                .add("metaDescription", getMetaDescription()) //
                .add("creationDate", getCreationDate()) //
                .add("updationDate", getUpdationDate()) //
             */   .toString();
    }

    @PrePersist
    protected void prePersist() {
        setCreationDate(new Date());
    }
}