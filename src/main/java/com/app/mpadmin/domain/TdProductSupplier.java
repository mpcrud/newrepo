/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/domain/Entity.e.vm.java
 */
package com.app.mpadmin.domain;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.TemporalType.TIMESTAMP;
import static org.hibernate.annotations.CacheConcurrencyStrategy.NONSTRICT_READ_WRITE;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;
import com.app.mpadmin.domain.PersistableHashBuilder;
import com.app.mpadmin.domain.TdProduct;
import com.google.common.base.Objects;

@Entity
@Table(name = "td_product_supplier")
@Cache(usage = NONSTRICT_READ_WRITE)
public class TdProductSupplier implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(TdProductSupplier.class);

    // Raw attributes
    private Integer productSupplierId; // pk
    private String productSupplierDisplayName; // not null
    private String productSupplierAlternateName;
    private String productSupplierPolicy;
    private String productSupplierSpecialization;
    private String microDescription;
    private String shortDesc;
    private String longDesc;
    private Integer productSupplierRating;
    private Integer productSupplierType;
    private String productSupplierLogoSmall;
    private String productSupplierLogoLong;
    private Boolean productSupplierStatus; // not null
    private String custom1;
    private String custom2;
    private String seoResources;
    private String seoUrl;
    private String seoH1;
    private String seoH2;
    private String metaTitle;
    private String metaKeyword;
    private String metaDescription;
    private Date creationDate;
    private Date updationDate;

    // Many to many
    private List<TdProduct> products = new ArrayList<TdProduct>();

    // ---------------------------
    // Constructors
    // ---------------------------

    public TdProductSupplier() {
    }

    public TdProductSupplier(Integer primaryKey) {
        setId(primaryKey);
    }

    // ---------------------------
    // Identifiable implementation
    // ---------------------------

    @Override
    @Transient
    @XmlTransient
    public Integer getId() {
        return getProductSupplierId();
    }

    @Override
    public void setId(Integer productSupplierId) {
        setProductSupplierId(productSupplierId);
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return isProductSupplierIdSet();
    }

    // -------------------------------
    // Getter & Setter
    // -------------------------------

    // -- [productSupplierId] ------------------------

    @Column(name = "product_supplier_id", precision = 10)
    @GeneratedValue
    @Id
    public Integer getProductSupplierId() {
        return productSupplierId;
    }

    public void setProductSupplierId(Integer productSupplierId) {
        this.productSupplierId = productSupplierId;
    }

    @Transient
    public boolean isProductSupplierIdSet() {
        return productSupplierId != null;
    }

    // -- [productSupplierDisplayName] ------------------------

    @Size(max = 256)
    @NotEmpty
    @Column(name = "product_supplier_display_name", nullable = false, length = 256)
    public String getProductSupplierDisplayName() {
        return productSupplierDisplayName;
    }

    public void setProductSupplierDisplayName(String productSupplierDisplayName) {
        this.productSupplierDisplayName = productSupplierDisplayName;
    }

    // -- [productSupplierAlternateName] ------------------------

    @Size(max = 256)
    @Column(name = "product_supplier_alternate_name", length = 256)
    public String getProductSupplierAlternateName() {
        return productSupplierAlternateName;
    }

    public void setProductSupplierAlternateName(String productSupplierAlternateName) {
        this.productSupplierAlternateName = productSupplierAlternateName;
    }

    // -- [productSupplierPolicy] ------------------------

    @Size(max = 1024)
    @Column(name = "product_supplier_policy", length = 1024)
    public String getProductSupplierPolicy() {
        return productSupplierPolicy;
    }

    public void setProductSupplierPolicy(String productSupplierPolicy) {
        this.productSupplierPolicy = productSupplierPolicy;
    }

    // -- [productSupplierSpecialization] ------------------------

    @Size(max = 512)
    @Column(name = "product_supplier_specialization", length = 512)
    public String getProductSupplierSpecialization() {
        return productSupplierSpecialization;
    }

    public void setProductSupplierSpecialization(String productSupplierSpecialization) {
        this.productSupplierSpecialization = productSupplierSpecialization;
    }

    // -- [microDescription] ------------------------

    @Size(max = 128)
    @Column(name = "micro_description", length = 128)
    public String getMicroDescription() {
        return microDescription;
    }

    public void setMicroDescription(String microDescription) {
        this.microDescription = microDescription;
    }

    // -- [shortDesc] ------------------------

    @Size(max = 1024)
    @Column(name = "short_desc", length = 1024)
    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    // -- [longDesc] ------------------------

    @Size(max = 4096)
    @Column(name = "long_desc", length = 4096)
    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    // -- [productSupplierRating] ------------------------

    @Column(name = "product_supplier_rating", precision = 5)
    public Integer getProductSupplierRating() {
        return productSupplierRating;
    }

    public void setProductSupplierRating(Integer productSupplierRating) {
        this.productSupplierRating = productSupplierRating;
    }

    // -- [productSupplierType] ------------------------

    @Column(name = "product_supplier_type", precision = 5)
    public Integer getProductSupplierType() {
        return productSupplierType;
    }

    public void setProductSupplierType(Integer productSupplierType) {
        this.productSupplierType = productSupplierType;
    }

    // -- [productSupplierLogoSmall] ------------------------

    @Size(max = 512)
    @Column(name = "product_supplier_logo_small", length = 512)
    public String getProductSupplierLogoSmall() {
        return productSupplierLogoSmall;
    }

    public void setProductSupplierLogoSmall(String productSupplierLogoSmall) {
        this.productSupplierLogoSmall = productSupplierLogoSmall;
    }

    // -- [productSupplierLogoLong] ------------------------

    @Size(max = 512)
    @Column(name = "product_supplier_logo_long", length = 512)
    public String getProductSupplierLogoLong() {
        return productSupplierLogoLong;
    }

    public void setProductSupplierLogoLong(String productSupplierLogoLong) {
        this.productSupplierLogoLong = productSupplierLogoLong;
    }

    // -- [productSupplierStatus] ------------------------

    @NotNull
    @Column(name = "product_supplier_status", nullable = false, length = 0)
    public Boolean getProductSupplierStatus() {
        return productSupplierStatus;
    }

    public void setProductSupplierStatus(Boolean productSupplierStatus) {
        this.productSupplierStatus = productSupplierStatus;
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

    // -- [seoResources] ------------------------

    @Size(max = 256)
    @Column(name = "seo_resources", length = 256)
    public String getSeoResources() {
        return seoResources;
    }

    public void setSeoResources(String seoResources) {
        this.seoResources = seoResources;
    }

    // -- [seoUrl] ------------------------

    @Size(max = 512)
    @URL
    @Column(name = "seo_url", length = 512)
    public String getSeoUrl() {
        return seoUrl;
    }

    public void setSeoUrl(String seoUrl) {
        this.seoUrl = seoUrl;
    }

    // -- [seoH1] ------------------------

    @Size(max = 256)
    @Column(name = "seo_h1", length = 256)
    public String getSeoH1() {
        return seoH1;
    }

    public void setSeoH1(String seoH1) {
        this.seoH1 = seoH1;
    }

    // -- [seoH2] ------------------------

    @Size(max = 256)
    @Column(name = "seo_h2", length = 256)
    public String getSeoH2() {
        return seoH2;
    }

    public void setSeoH2(String seoH2) {
        this.seoH2 = seoH2;
    }

    // -- [metaTitle] ------------------------

    @Size(max = 512)
    @Column(name = "meta_title", length = 512)
    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    // -- [metaKeyword] ------------------------

    @Size(max = 512)
    @Column(name = "meta_keyword", length = 512)
    public String getMetaKeyword() {
        return metaKeyword;
    }

    public void setMetaKeyword(String metaKeyword) {
        this.metaKeyword = metaKeyword;
    }

    // -- [metaDescription] ------------------------

    @Size(max = 512)
    @Column(name = "meta_description", length = 512)
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

    // --------------------------------------------------------------------
    // Many to Many
    // --------------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-many: tdProductSupplier ==> products
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    /**
     * Returns the products list.
     */
    @Cache(usage = NONSTRICT_READ_WRITE)
    @JoinTable(name = "td_product_supplier_mapping", joinColumns = @JoinColumn(name = "product_supplier_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
    @ManyToMany(cascade = PERSIST)
    public List<TdProduct> getProducts() {
        return products;
    }

    /**
     * Set the products list.
     * <p>
     * It is recommended to use the helper method {@link #addProduct(TdProduct)} / {@link #removeProduct(TdProduct)}
     * if you want to preserve referential integrity at the object level.
     *
     * @param products the list of TdProduct
     */
    public void setProducts(List<TdProduct> products) {
        this.products = products;
    }

    /**
     * Helper method to add the passed {@link TdProduct} to the products list.
     */
    public boolean addProduct(TdProduct product) {
        return getProducts().add(product);
    }

    /**
     * Helper method to remove the passed {@link TdProduct} from the products list.
     */
    public boolean removeProduct(TdProduct product) {
        return getProducts().remove(product);
    }

    /**
     * Helper method to determine if the passed {@link TdProduct} is present in the products list.
     */
    public boolean containsProduct(TdProduct product) {
        return getProducts() != null && getProducts().contains(product);
    }

    /**
     * Set the default values.
     */
    public void initDefaultValues() {
        setProductSupplierStatus(false);
        /****/
        setProductSupplierRating(0);
        setProductSupplierType(0);

    }

    /**
     * equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof TdProductSupplier && hashCode() == other.hashCode());
    }

    private PersistableHashBuilder persistableHashBuilder = new PersistableHashBuilder();

    @Override
    public int hashCode() {
        return persistableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this TdProductSupplier instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("productSupplierId", getProductSupplierId()) //
                .add("productSupplierDisplayName", getProductSupplierDisplayName()) //
                .add("productSupplierAlternateName", getProductSupplierAlternateName()) //
                .add("productSupplierPolicy", getProductSupplierPolicy()) //
                .add("productSupplierSpecialization", getProductSupplierSpecialization()) //
                .add("microDescription", getMicroDescription()) //
                .add("shortDesc", getShortDesc()) //
                .add("longDesc", getLongDesc()) //
                .add("productSupplierRating", getProductSupplierRating()) //
                .add("productSupplierType", getProductSupplierType()) //
                .add("productSupplierLogoSmall", getProductSupplierLogoSmall()) //
                .add("productSupplierLogoLong", getProductSupplierLogoLong()) //
                .add("productSupplierStatus", getProductSupplierStatus()) //
                .add("custom1", getCustom1()) //
                .add("custom2", getCustom2()) //
                .add("seoResources", getSeoResources()) //
                .add("seoUrl", getSeoUrl()) //
                .add("seoH1", getSeoH1()) //
                .add("seoH2", getSeoH2()) //
                .add("metaTitle", getMetaTitle()) //
                .add("metaKeyword", getMetaKeyword()) //
                .add("metaDescription", getMetaDescription()) //
                .add("creationDate", getCreationDate()) //
                .add("updationDate", getUpdationDate()) //
                .toString();
    }

    @PrePersist
    protected void prePersist() {
        setCreationDate(new Date());
    }
}