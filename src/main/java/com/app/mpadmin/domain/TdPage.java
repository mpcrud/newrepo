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
import org.hibernate.validator.constraints.URL;
import com.app.mpadmin.domain.PersistableHashBuilder;
import com.google.common.base.Objects;

@Entity
@Table(name = "td_page")
@Cache(usage = NONSTRICT_READ_WRITE)
public class TdPage implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(TdPage.class);

    // Raw attributes
    private String pageHeading;
    private String pageShortDesc;
    private String pageLongDesc;
    private Integer pageType;
    private Integer pageReferenceId;
    private Integer pageId; // pk
    private String pageSeoUrl;
    private String pageSeoKeyword;
    private String pageSeoMetaDesc;
    private String pageSeoTitle;
    private String pageH1;
    private String pageH2;
    private String pageBackLink1;
    private String pageBackLink2;
    private Integer pageIsActive;
    private Integer pagePriority;
    private Date creationDate;
    private Date updationDate;
    private Integer pageUserId;
    private String pageCustom1;
    private String pageCustom2;
    private Integer pageCustom3;
    private Integer pageCustom4;

    // ---------------------------
    // Constructors
    // ---------------------------

    public TdPage() {
    }

    public TdPage(Integer primaryKey) {
        setId(primaryKey);
    }

    // ---------------------------
    // Identifiable implementation
    // ---------------------------

    @Override
    @Transient
    @XmlTransient
    public Integer getId() {
        return getPageId();
    }

    @Override
    public void setId(Integer pageId) {
        setPageId(pageId);
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return isPageIdSet();
    }

    // -------------------------------
    // Getter & Setter
    // -------------------------------

    // -- [pageHeading] ------------------------

    @Size(max = 256)
    @Column(name = "page_heading", length = 256)
    public String getPageHeading() {
        return pageHeading;
    }

    public void setPageHeading(String pageHeading) {
        this.pageHeading = pageHeading;
    }

    // -- [pageShortDesc] ------------------------

    @Size(max = 1024)
    @Column(name = "page_short_desc", length = 1024)
    public String getPageShortDesc() {
        return pageShortDesc;
    }

    public void setPageShortDesc(String pageShortDesc) {
        this.pageShortDesc = pageShortDesc;
    }

    // -- [pageLongDesc] ------------------------

    @Size(max = 8096)
    @Column(name = "page_long_desc", length = 8096)
    public String getPageLongDesc() {
        return pageLongDesc;
    }

    public void setPageLongDesc(String pageLongDesc) {
        this.pageLongDesc = pageLongDesc;
    }

    // -- [pageType] ------------------------

    @Column(name = "page_type", precision = 3)
    public Integer getPageType() {
        return pageType;
    }

    public void setPageType(Integer pageType) {
        this.pageType = pageType;
    }

    // -- [pageReferenceId] ------------------------

    @Column(name = "page_reference_id", precision = 10)
    public Integer getPageReferenceId() {
        return pageReferenceId;
    }

    public void setPageReferenceId(Integer pageReferenceId) {
        this.pageReferenceId = pageReferenceId;
    }

    // -- [pageId] ------------------------

    @Column(name = "page_id", precision = 10)
    @GeneratedValue
    @Id
    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    @Transient
    public boolean isPageIdSet() {
        return pageId != null;
    }

    // -- [pageSeoUrl] ------------------------

    @Size(max = 256)
    //@URL
    @Column(name = "page_seo_url", length = 256)
    public String getPageSeoUrl() {
        return pageSeoUrl;
    }

    public void setPageSeoUrl(String pageSeoUrl) {
        this.pageSeoUrl = pageSeoUrl;
    }

    // -- [pageSeoKeyword] ------------------------

    @Size(max = 256)
    @Column(name = "page_seo_keyword", length = 256)
    public String getPageSeoKeyword() {
        return pageSeoKeyword;
    }

    public void setPageSeoKeyword(String pageSeoKeyword) {
        this.pageSeoKeyword = pageSeoKeyword;
    }

    // -- [pageSeoMetaDesc] ------------------------

    @Size(max = 256)
    @Column(name = "page_seo_meta_desc", length = 256)
    public String getPageSeoMetaDesc() {
        return pageSeoMetaDesc;
    }

    public void setPageSeoMetaDesc(String pageSeoMetaDesc) {
        this.pageSeoMetaDesc = pageSeoMetaDesc;
    }

    // -- [pageSeoTitle] ------------------------

    @Size(max = 256)
    @Column(name = "page_seo_title", length = 256)
    public String getPageSeoTitle() {
        return pageSeoTitle;
    }

    public void setPageSeoTitle(String pageSeoTitle) {
        this.pageSeoTitle = pageSeoTitle;
    }

    // -- [pageH1] ------------------------

    @Size(max = 256)
    @Column(name = "page_h1", length = 256)
    public String getPageH1() {
        return pageH1;
    }

    public void setPageH1(String pageH1) {
        this.pageH1 = pageH1;
    }

    // -- [pageH2] ------------------------

    @Size(max = 256)
    @Column(name = "page_h2", length = 256)
    public String getPageH2() {
        return pageH2;
    }

    public void setPageH2(String pageH2) {
        this.pageH2 = pageH2;
    }

    // -- [pageBackLink1] ------------------------

    @Size(max = 256)
    @Column(name = "page_back_link1", length = 256)
    public String getPageBackLink1() {
        return pageBackLink1;
    }

    public void setPageBackLink1(String pageBackLink1) {
        this.pageBackLink1 = pageBackLink1;
    }

    // -- [pageBackLink2] ------------------------

    @Size(max = 256)
    @Column(name = "page_back_link2", length = 256)
    public String getPageBackLink2() {
        return pageBackLink2;
    }

    public void setPageBackLink2(String pageBackLink2) {
        this.pageBackLink2 = pageBackLink2;
    }

    // -- [pageIsActive] ------------------------

    @Column(name = "page_is_active", precision = 3)
    public Integer getPageIsActive() {
        return pageIsActive;
    }

    public void setPageIsActive(Integer pageIsActive) {
        this.pageIsActive = pageIsActive;
    }

    // -- [pagePriority] ------------------------

    @Column(name = "page_priority", precision = 3)
    public Integer getPagePriority() {
        return pagePriority;
    }

    public void setPagePriority(Integer pagePriority) {
        this.pagePriority = pagePriority;
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

    // -- [pageUserId] ------------------------

    @Column(name = "page_user_id", precision = 10)
    public Integer getPageUserId() {
        return pageUserId;
    }

    public void setPageUserId(Integer pageUserId) {
        this.pageUserId = pageUserId;
    }

    // -- [pageCustom1] ------------------------

    @Size(max = 256)
    @Column(name = "page_custom1", length = 256)
    public String getPageCustom1() {
        return pageCustom1;
    }

    public void setPageCustom1(String pageCustom1) {
        this.pageCustom1 = pageCustom1;
    }

    // -- [pageCustom2] ------------------------

    @Size(max = 256)
    @Column(name = "page_custom2", length = 256)
    public String getPageCustom2() {
        return pageCustom2;
    }

    public void setPageCustom2(String pageCustom2) {
        this.pageCustom2 = pageCustom2;
    }

    // -- [pageCustom3] ------------------------

    @Column(name = "page_custom3", precision = 10)
    public Integer getPageCustom3() {
        return pageCustom3;
    }

    public void setPageCustom3(Integer pageCustom3) {
        this.pageCustom3 = pageCustom3;
    }

    // -- [pageCustom4] ------------------------

    @Column(name = "page_custom4", precision = 10)
    public Integer getPageCustom4() {
        return pageCustom4;
    }

    public void setPageCustom4(Integer pageCustom4) {
        this.pageCustom4 = pageCustom4;
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
        return this == other || (other instanceof TdPage && hashCode() == other.hashCode());
    }

    private PersistableHashBuilder persistableHashBuilder = new PersistableHashBuilder();

    @Override
    public int hashCode() {
        return persistableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this TdPage instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("pageHeading", getPageHeading()) //
                .add("pageShortDesc", getPageShortDesc()) //
                .add("pageLongDesc", getPageLongDesc()) //
                .add("pageType", getPageType()) //
                .add("pageReferenceId", getPageReferenceId()) //
                .add("pageId", getPageId()) //
                .add("pageSeoUrl", getPageSeoUrl()) //
                .add("pageSeoKeyword", getPageSeoKeyword()) //
                .add("pageSeoMetaDesc", getPageSeoMetaDesc()) //
                .add("pageSeoTitle", getPageSeoTitle()) //
                .add("pageH1", getPageH1()) //
                .add("pageH2", getPageH2()) //
                .add("pageBackLink1", getPageBackLink1()) //
                .add("pageBackLink2", getPageBackLink2()) //
                .add("pageIsActive", getPageIsActive()) //
                .add("pagePriority", getPagePriority()) //
                .add("creationDate", getCreationDate()) //
                .add("updationDate", getUpdationDate()) //
                .add("pageUserId", getPageUserId()) //
                .add("pageCustom1", getPageCustom1()) //
                .add("pageCustom2", getPageCustom2()) //
                .add("pageCustom3", getPageCustom3()) //
                .add("pageCustom4", getPageCustom4()) //
                .toString();
    }

    @PrePersist
    protected void prePersist() {
        setCreationDate(new Date());
    }
}