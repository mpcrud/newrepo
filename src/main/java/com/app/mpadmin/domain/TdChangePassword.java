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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import org.hibernate.validator.constraints.NotEmpty;
import com.app.mpadmin.domain.PersistableHashBuilder;
import com.app.mpadmin.validation.FixedLength;
import com.google.common.base.Objects;

@Entity
@Table(name = "td_change_password")
@Cache(usage = NONSTRICT_READ_WRITE)
public class TdChangePassword implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(TdChangePassword.class);

    // Raw attributes
    private String guidChar; // not null
    private Integer userid; // not null
    private Date creationDate; // not null
    private Integer isActive; // not null
    private Integer guidInt; // pk

    // ---------------------------
    // Constructors
    // ---------------------------

    public TdChangePassword() {
    }

    public TdChangePassword(Integer primaryKey) {
        setId(primaryKey);
    }

    // ---------------------------
    // Identifiable implementation
    // ---------------------------

    @Override
    @Transient
    @XmlTransient
    public Integer getId() {
        return getGuidInt();
    }

    @Override
    public void setId(Integer guidInt) {
        setGuidInt(guidInt);
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return isGuidIntSet();
    }

    // -------------------------------
    // Getter & Setter
    // -------------------------------

    // -- [guidChar] ------------------------

    @FixedLength(length = 36, nullable = false)
    @NotEmpty
    @Column(name = "guid_char", nullable = false, length = 36)
    public String getGuidChar() {
        return guidChar;
    }

    public void setGuidChar(String guidChar) {
        this.guidChar = guidChar;
    }

    // -- [userid] ------------------------

    @NotNull
    @Column(name = "userId", nullable = false, precision = 10)
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    // -- [creationDate] ------------------------

    @Column(name = "creation_date", nullable = false, length = 19)
    @Temporal(TIMESTAMP)
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    // -- [isActive] ------------------------

    @NotNull
    @Column(name = "is_active", nullable = false, precision = 5)
    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    // -- [guidInt] ------------------------

    @Column(name = "guid_int", precision = 10)
    @GeneratedValue
    @Id
    public Integer getGuidInt() {
        return guidInt;
    }

    public void setGuidInt(Integer guidInt) {
        this.guidInt = guidInt;
    }

    @Transient
    public boolean isGuidIntSet() {
        return guidInt != null;
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
        return this == other || (other instanceof TdChangePassword && hashCode() == other.hashCode());
    }

    private PersistableHashBuilder persistableHashBuilder = new PersistableHashBuilder();

    @Override
    public int hashCode() {
        return persistableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this TdChangePassword instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("guidChar", getGuidChar()) //
                .add("userid", getUserid()) //
                .add("creationDate", getCreationDate()) //
                .add("isActive", getIsActive()) //
                .add("guidInt", getGuidInt()) //
                .toString();
    }

    @PrePersist
    protected void prePersist() {
        setCreationDate(new Date());
    }
}