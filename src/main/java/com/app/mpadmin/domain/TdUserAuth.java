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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import com.app.mpadmin.domain.PersistableHashBuilder;
import com.app.mpadmin.domain.TdRole;
import com.google.common.base.Objects;

@Entity
@Table(name = "td_user_auth")
@Cache(usage = NONSTRICT_READ_WRITE)
public class TdUserAuth implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(TdUserAuth.class);

    // Raw attributes
    private Integer userId; // pk
    private String username; // not null
    private String email; // not null
    private String userpassword; // not null
    private Integer isActive;
    private Date creationDate;
    private Date updationDate;

    // Technical attributes for query by example
    private Integer roleId;

    // Many to one
    private TdRole role; // (roleId)

    // ---------------------------
    // Constructors
    // ---------------------------

    public TdUserAuth() {
    }

    public TdUserAuth(Integer primaryKey) {
        setId(primaryKey);
    }

    // ---------------------------
    // Identifiable implementation
    // ---------------------------

    @Override
    @Transient
    @XmlTransient
    public Integer getId() {
        return getUserId();
    }

    @Override
    public void setId(Integer userId) {
        setUserId(userId);
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return isUserIdSet();
    }

    // -------------------------------
    // Getter & Setter
    // -------------------------------

    // -- [userId] ------------------------

    @Column(name = "user_id", precision = 10)
    @GeneratedValue
    @Id
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Transient
    public boolean isUserIdSet() {
        return userId != null;
    }

    // -- [username] ------------------------

    @Size(max = 100)
    @NotEmpty
    @Column(nullable = false, length = 100)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // -- [email] ------------------------

    @Size(max = 100)
    @NotEmpty
    @Email
    @Column(nullable = false, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // -- [userpassword] ------------------------

    @Size(max = 100)
    @NotEmpty
    @Column(nullable = false, length = 100)
    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    // -- [isActive] ------------------------

    @Column(name = "is_active", precision = 5)
    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
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

    // -- [roleId] ------------------------

    @Column(name = "role_id", precision = 10, insertable = false, updatable = false)
    public Integer getRoleId() {
        return roleId;
    }

    private void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    // --------------------------------------------------------------------
    // Many to One support
    // --------------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: TdUserAuth.roleId ==> TdRole.roleId
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @Cache(usage = NONSTRICT_READ_WRITE)
    @JoinColumn(name = "role_id")
    @ManyToOne(cascade = PERSIST, fetch = LAZY)
    public TdRole getRole() {
        return role;
    }

    /**
     * Set the role without adding this TdUserAuth instance on the passed role
     * If you want to preserve referential integrity we recommend to use
     * instead the corresponding adder method provided by {@link TdRole}
     */
    public void setRole(TdRole role) {
        this.role = role;

        // We set the foreign key property so it can be used by our JPA search by Example facility.
        if (role != null) {
            setRoleId(role.getRoleId());
        } else {
            setRoleId(null);
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
        return this == other || (other instanceof TdUserAuth && hashCode() == other.hashCode());
    }

    private PersistableHashBuilder persistableHashBuilder = new PersistableHashBuilder();

    @Override
    public int hashCode() {
        return persistableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this TdUserAuth instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("userId", getUserId()) //
                .add("username", getUsername()) //
                .add("email", getEmail()) //
                .add("userpassword", getUserpassword()) //
                .add("isActive", getIsActive()) //
                .add("creationDate", getCreationDate()) //
                .add("updationDate", getUpdationDate()) //
                .add("roleId", getRoleId()) //
                .toString();
    }

    @PrePersist
    protected void prePersist() {
        setCreationDate(new Date());
    }
}