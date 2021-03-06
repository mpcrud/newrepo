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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import com.app.mpadmin.domain.PersistableHashBuilder;
import com.app.mpadmin.validation.FixedLength;
import com.google.common.base.Objects;

@Entity
@Table(name = "td_city")
@Cache(usage = NONSTRICT_READ_WRITE)
public class TdCity implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(TdCity.class);

    // Raw attributes
    private Integer cityId; // pk
    private String cityName;
    private String cityName2;
    private Integer populationRank;
    private Integer destinationRank;
    private Integer flag;
    private Integer destinationType;
    private String isBigcity;
    private String isDestination;
    private Integer importance;
    private Integer metroId;
    private String descShort;
    private String descLong;
    private Integer isResource;
    private String resources;
    private Integer isSupportedBy;
    private String longitude;
    private String latitude;
    private Integer customtable1;
    private Integer customtable2;
    private Integer customtable3;
    private Integer customtable4;
    private Date creationDate;
    private Date updationDate;

    // ---------------------------
    // Constructors
    // ---------------------------

    public TdCity() {
    }

    public TdCity(Integer primaryKey) {
        setId(primaryKey);
    }

    // ---------------------------
    // Identifiable implementation
    // ---------------------------

    @Override
    @Transient
    @XmlTransient
    public Integer getId() {
        return getCityId();
    }

    @Override
    public void setId(Integer cityId) {
        setCityId(cityId);
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return isCityIdSet();
    }

    // -------------------------------
    // Getter & Setter
    // -------------------------------

    // -- [cityId] ------------------------

    @Column(name = "city_id", precision = 10)
    @GeneratedValue
    @Id
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Transient
    public boolean isCityIdSet() {
        return cityId != null;
    }

    // -- [cityName] ------------------------

    @Size(max = 45)
    @Column(name = "city_name", length = 45)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    // -- [cityName2] ------------------------

    @Size(max = 45)
    @Column(name = "city_name2", length = 45)
    public String getCityName2() {
        return cityName2;
    }

    public void setCityName2(String cityName2) {
        this.cityName2 = cityName2;
    }

    // -- [populationRank] ------------------------

    @Column(name = "population_rank", precision = 5)
    public Integer getPopulationRank() {
        return populationRank;
    }

    public void setPopulationRank(Integer populationRank) {
        this.populationRank = populationRank;
    }

    // -- [destinationRank] ------------------------

    @Column(name = "destination_rank", precision = 5)
    public Integer getDestinationRank() {
        return destinationRank;
    }

    public void setDestinationRank(Integer destinationRank) {
        this.destinationRank = destinationRank;
    }

    // -- [flag] ------------------------

    @Column(precision = 10)
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    // -- [destinationType] ------------------------

    @Column(name = "destination_type", precision = 5)
    public Integer getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(Integer destinationType) {
        this.destinationType = destinationType;
    }

    // -- [isBigcity] ------------------------

    @FixedLength(length = 1)
    @Column(name = "is_bigcity", length = 1)
    public String getIsBigcity() {
        return isBigcity;
    }

    public void setIsBigcity(String isBigcity) {
        this.isBigcity = isBigcity;
    }

    // -- [isDestination] ------------------------

    @FixedLength(length = 1)
    @Column(name = "is_destination", length = 1)
    public String getIsDestination() {
        return isDestination;
    }

    public void setIsDestination(String isDestination) {
        this.isDestination = isDestination;
    }

    // -- [importance] ------------------------

    @Column(precision = 5)
    public Integer getImportance() {
        return importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    // -- [metroId] ------------------------

    @Column(name = "metro_id", precision = 10)
    public Integer getMetroId() {
        return metroId;
    }

    public void setMetroId(Integer metroId) {
        this.metroId = metroId;
    }

    // -- [descShort] ------------------------

    @Size(max = 2048)
    @Column(name = "desc_short", length = 2048)
    public String getDescShort() {
        return descShort;
    }

    public void setDescShort(String descShort) {
        this.descShort = descShort;
    }

    // -- [descLong] ------------------------

    @Size(max = 65535)
    @Column(name = "desc_long", length = 65535)
    public String getDescLong() {
        return descLong;
    }

    public void setDescLong(String descLong) {
        this.descLong = descLong;
    }

    // -- [isResource] ------------------------

    @Column(name = "is_resource", precision = 3)
    public Integer getIsResource() {
        return isResource;
    }

    public void setIsResource(Integer isResource) {
        this.isResource = isResource;
    }

    // -- [resources] ------------------------

    @Size(max = 1024)
    @Column(length = 1024)
    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    // -- [isSupportedBy] ------------------------

    @Column(name = "is_supported_by", precision = 5)
    public Integer getIsSupportedBy() {
        return isSupportedBy;
    }

    public void setIsSupportedBy(Integer isSupportedBy) {
        this.isSupportedBy = isSupportedBy;
    }

    // -- [longitude] ------------------------

    @Size(max = 10)
    @Column(length = 10)
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    // -- [latitude] ------------------------

    @Size(max = 10)
    @Column(length = 10)
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    // -- [customtable1] ------------------------

    @Column(precision = 3)
    public Integer getCustomtable1() {
        return customtable1;
    }

    public void setCustomtable1(Integer customtable1) {
        this.customtable1 = customtable1;
    }

    // -- [customtable2] ------------------------

    @Column(precision = 3)
    public Integer getCustomtable2() {
        return customtable2;
    }

    public void setCustomtable2(Integer customtable2) {
        this.customtable2 = customtable2;
    }

    // -- [customtable3] ------------------------

    @Column(precision = 3)
    public Integer getCustomtable3() {
        return customtable3;
    }

    public void setCustomtable3(Integer customtable3) {
        this.customtable3 = customtable3;
    }

    // -- [customtable4] ------------------------

    @Column(precision = 3)
    public Integer getCustomtable4() {
        return customtable4;
    }

    public void setCustomtable4(Integer customtable4) {
        this.customtable4 = customtable4;
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
        setCustomtable1(0);
        setCustomtable2(0);
        setCustomtable3(0);
        setCustomtable4(0);
        setDestinationRank(0);
        setDestinationType(0);
        setFlag(0);
        setDestinationRank(0);
        setImportance(0);
        setIsResource(0);
        setIsSupportedBy(0);
        setMetroId(0);
        setPopulationRank(0);
    }

    /**
     * equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof TdCity && hashCode() == other.hashCode());
    }

    private PersistableHashBuilder persistableHashBuilder = new PersistableHashBuilder();

    @Override
    public int hashCode() {
        return persistableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this TdCity instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("cityId", getCityId()) //
                .add("cityName", getCityName()) //
                .add("cityName2", getCityName2()) //
                .add("populationRank", getPopulationRank()) //
                .add("destinationRank", getDestinationRank()) //
                .add("flag", getFlag()) //
                .add("destinationType", getDestinationType()) //
                .add("isBigcity", getIsBigcity()) //
                .add("isDestination", getIsDestination()) //
                .add("importance", getImportance()) //
                .add("metroId", getMetroId()) //
                .add("descShort", getDescShort()) //
                .add("descLong", getDescLong()) //
                .add("isResource", getIsResource()) //
                .add("resources", getResources()) //
                .add("isSupportedBy", getIsSupportedBy()) //
                .add("longitude", getLongitude()) //
                .add("latitude", getLatitude()) //
                .add("customtable1", getCustomtable1()) //
                .add("customtable2", getCustomtable2()) //
                .add("customtable3", getCustomtable3()) //
                .add("customtable4", getCustomtable4()) //
                .add("creationDate", getCreationDate()) //
                .add("updationDate", getUpdationDate()) //
                .toString();
    }

    @PrePersist
    protected void prePersist() {
        setCreationDate(new Date());
    }
}