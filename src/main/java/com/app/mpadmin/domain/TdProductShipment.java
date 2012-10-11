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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import com.app.mpadmin.domain.PersistableHashBuilder;
import com.app.mpadmin.domain.TdShipmentVendor;
import com.google.common.base.Objects;

@Entity
@Table(name = "td_product_shipment")
@Cache(usage = NONSTRICT_READ_WRITE)
public class TdProductShipment implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(TdProductShipment.class);

    // Raw attributes
    private Integer productShipmentId; // pk
    private Float shipmentMrpCost;
    private Float shipmentDiscount;
    private String shipmentPolicy;
    private String shipmentSpecialNote;
    private Integer shipmentDuration;
    private Integer shipmentType;
    private Boolean shipmentStatus; // not null
    private String custom1;
    private String custom2;
    private Date creationDate;
    private Date updationDate;

    // Technical attributes for query by example
    private Integer shipmentVendorId; // not null

    // Many to one
    private TdShipmentVendor shipmentVendor; // not null (shipmentVendorId)

    // ---------------------------
    // Constructors
    // ---------------------------

    public TdProductShipment() {
    }

    public TdProductShipment(Integer primaryKey) {
        setId(primaryKey);
    }

    // ---------------------------
    // Identifiable implementation
    // ---------------------------

    @Override
    @Transient
    @XmlTransient
    public Integer getId() {
        return getProductShipmentId();
    }

    @Override
    public void setId(Integer productShipmentId) {
        setProductShipmentId(productShipmentId);
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return isProductShipmentIdSet();
    }

    // -------------------------------
    // Getter & Setter
    // -------------------------------

    // -- [productShipmentId] ------------------------

    @Column(name = "product_shipment_id", precision = 10)
    @GeneratedValue
    @Id
    public Integer getProductShipmentId() {
        return productShipmentId;
    }

    public void setProductShipmentId(Integer productShipmentId) {
        this.productShipmentId = productShipmentId;
    }

    @Transient
    public boolean isProductShipmentIdSet() {
        return productShipmentId != null;
    }

    // -- [shipmentVendorId] ------------------------

    @Column(name = "shipment_vendor_id", nullable = false, precision = 10, insertable = false, updatable = false)
    public Integer getShipmentVendorId() {
        return shipmentVendorId;
    }

    private void setShipmentVendorId(Integer shipmentVendorId) {
        this.shipmentVendorId = shipmentVendorId;
    }

    // -- [shipmentMrpCost] ------------------------

    @Column(name = "shipment_mrp_cost", precision = 12)
    public Float getShipmentMrpCost() {
        return shipmentMrpCost;
    }

    public void setShipmentMrpCost(Float shipmentMrpCost) {
        this.shipmentMrpCost = shipmentMrpCost;
    }

    /**
     * Helper method to set the shipmentMrpCost attribute via an int.
     * @see #setShipmentMrpCost(Float)
     */
    public void setShipmentMrpCost(int shipmentMrpCost) {
        this.shipmentMrpCost = Float.valueOf(shipmentMrpCost);
    }

    // -- [shipmentDiscount] ------------------------

    @Column(name = "shipment_discount", precision = 12)
    public Float getShipmentDiscount() {
        return shipmentDiscount;
    }

    public void setShipmentDiscount(Float shipmentDiscount) {
        this.shipmentDiscount = shipmentDiscount;
    }

    /**
     * Helper method to set the shipmentDiscount attribute via an int.
     * @see #setShipmentDiscount(Float)
     */
    public void setShipmentDiscount(int shipmentDiscount) {
        this.shipmentDiscount = Float.valueOf(shipmentDiscount);
    }

    // -- [shipmentPolicy] ------------------------

    @Size(max = 1024)
    @Column(name = "shipment_policy", length = 1024)
    public String getShipmentPolicy() {
        return shipmentPolicy;
    }

    public void setShipmentPolicy(String shipmentPolicy) {
        this.shipmentPolicy = shipmentPolicy;
    }

    // -- [shipmentSpecialNote] ------------------------

    @Size(max = 512)
    @Column(name = "shipment_special_note", length = 512)
    public String getShipmentSpecialNote() {
        return shipmentSpecialNote;
    }

    public void setShipmentSpecialNote(String shipmentSpecialNote) {
        this.shipmentSpecialNote = shipmentSpecialNote;
    }

    // -- [shipmentDuration] ------------------------

    @Column(name = "shipment_duration", precision = 5)
    public Integer getShipmentDuration() {
        return shipmentDuration;
    }

    public void setShipmentDuration(Integer shipmentDuration) {
        this.shipmentDuration = shipmentDuration;
    }

    // -- [shipmentType] ------------------------

    @Column(name = "shipment_type", precision = 5)
    public Integer getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(Integer shipmentType) {
        this.shipmentType = shipmentType;
    }

    // -- [shipmentStatus] ------------------------

    @NotNull
    @Column(name = "shipment_status", nullable = false, length = 0)
    public Boolean getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(Boolean shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    // -- [custom1] ------------------------

    @Size(max = 1024)
    @Column(length = 1024)
    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1;
    }

    // -- [custom2] ------------------------

    @Size(max = 1024)
    @Column(length = 1024)
    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2;
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
    // many-to-one: TdProductShipment.shipmentVendorId ==> TdShipmentVendor.shipmentVendorId
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @Cache(usage = NONSTRICT_READ_WRITE)
    @JoinColumn(name = "shipment_vendor_id", nullable = false)
    @ManyToOne(cascade = PERSIST, fetch = LAZY)
    public TdShipmentVendor getShipmentVendor() {
        return shipmentVendor;
    }

    /**
     * Set the shipmentVendor without adding this TdProductShipment instance on the passed shipmentVendor
     * If you want to preserve referential integrity we recommend to use
     * instead the corresponding adder method provided by {@link TdShipmentVendor}
     */
    public void setShipmentVendor(TdShipmentVendor shipmentVendor) {
        this.shipmentVendor = shipmentVendor;

        // We set the foreign key property so it can be used by our JPA search by Example facility.
        if (shipmentVendor != null) {
            setShipmentVendorId(shipmentVendor.getShipmentVendorId());
        } else {
            setShipmentVendorId(null);
        }
    }

    /**
     * Set the default values.
     */
    public void initDefaultValues() {
        setShipmentMrpCost(0);
        setShipmentDiscount(0);
        setShipmentStatus(false);
    }

    /**
     * equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof TdProductShipment && hashCode() == other.hashCode());
    }

    private PersistableHashBuilder persistableHashBuilder = new PersistableHashBuilder();

    @Override
    public int hashCode() {
        return persistableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this TdProductShipment instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("productShipmentId", getProductShipmentId()) //
                .add("shipmentVendorId", getShipmentVendorId()) //
                .add("shipmentMrpCost", getShipmentMrpCost()) //
                .add("shipmentDiscount", getShipmentDiscount()) //
                .add("shipmentPolicy", getShipmentPolicy()) //
                .add("shipmentSpecialNote", getShipmentSpecialNote()) //
                .add("shipmentDuration", getShipmentDuration()) //
                .add("shipmentType", getShipmentType()) //
                .add("shipmentStatus", getShipmentStatus()) //
                .add("custom1", getCustom1()) //
                .add("custom2", getCustom2()) //
                .add("creationDate", getCreationDate()) //
                .add("updationDate", getUpdationDate()) //
                .toString();
    }

    @PrePersist
    protected void prePersist() {
        setCreationDate(new Date());
    }
}