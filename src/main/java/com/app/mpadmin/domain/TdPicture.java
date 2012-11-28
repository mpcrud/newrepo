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
import static org.hibernate.annotations.CacheConcurrencyStrategy.NONSTRICT_READ_WRITE;
import java.io.Serializable;
import javax.annotation.Nullable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;
import com.app.mpadmin.domain.PersistableHashBuilder;
import com.google.common.base.Objects;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "td_picture")
@Cache(usage = NONSTRICT_READ_WRITE)
public class TdPicture implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(TdPicture.class);

    // Raw attributes
    private Integer pictureId; // pk
    private String pictureName; // not null
    private String pictureShortDesc;
    private String pictureLongDesc;
    private String picturePath;
    private String pictureUrl;
    private String pictureOwner;
    private Integer pictureType; // not null
    private Integer pictureRefId; // not null
    private Integer status; // not null

   //private UploadedFile file;
    private TdTopic topic;
    private TdProduct product;
    private TdComment comment;
    private TdTag tag;
    // ---------------------------
    // Constructors
    // ---------------------------

    public TdPicture() {
    }

    public TdPicture(Integer primaryKey) {
        setId(primaryKey);
    }

    // ---------------------------
    // Identifiable implementation
    // ---------------------------

    @Override
    @Transient
    @XmlTransient
    public Integer getId() {
        return getPictureId();
    }

    @Override
    public void setId(Integer pictureId) {
        setPictureId(pictureId);
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return isPictureIdSet();
    }
    // -------------------------------
    // Getter & Setter
    // -------------------------------

    // -- [pictureId] ------------------------

    @Column(name = "picture_id", precision = 10)
    @GeneratedValue
    @Id
    public Integer getPictureId() {
        return pictureId;
    }

    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

    @Transient
    public boolean isPictureIdSet() {
        return pictureId != null;
    }

    // -- [pictureName] ------------------------

    @Size(max = 48)
    @NotEmpty
    @Column(name = "picture_name", nullable = false, length = 48)
    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    // -- [pictureShortDesc] ------------------------

    @Size(max = 1024)
    @Column(name = "picture_short_desc", length = 1024)
    public String getPictureShortDesc() {
        return pictureShortDesc;
    }

    public void setPictureShortDesc(String pictureShortDesc) {
        this.pictureShortDesc = pictureShortDesc;
    }

    // -- [pictureLongDesc] ------------------------

    @Size(max = 4098)
    @Column(name = "picture_long_desc", length = 4098)
    public String getPictureLongDesc() {
        return pictureLongDesc;
    }

    public void setPictureLongDesc(String pictureLongDesc) {
        this.pictureLongDesc = pictureLongDesc;
    }

    // -- [picturePath] ------------------------

    @Size(max = 1024)
    @Column(name = "picture_path", length = 1024)
    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    // -- [pictureUrl] ------------------------

    @Size(max = 512)
    @Column(name = "picture_url", length = 512)
    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    // -- [pictureOwner] ------------------------

    @Size(max = 512)
    @Column(name = "picture_owner", length = 512)
    public String getPictureOwner() {
        return pictureOwner;
    }

    public void setPictureOwner(String pictureOwner) {
        this.pictureOwner = pictureOwner;
    }

    // -- [pictureType] ------------------------

    @NotNull
    @Column(name = "picture_type", nullable = false, precision = 5)
    public Integer getPictureType() {
        return pictureType;
    }

    public void setPictureType(Integer pictureType) {
        this.pictureType = pictureType;
    }

    // -- [pictureRefId] ------------------------

    @NotNull
    @Column(name = "picture_ref_id", nullable = false, precision = 10)
    public Integer getPictureRefId() {
        return pictureRefId;
    }

    public void setPictureRefId(Integer pictureRefId) {
        this.pictureRefId = pictureRefId;
    }

    // -- [status] ------------------------

    @NotNull
    @Column(nullable = false, precision = 3)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
   //Many To One
   @Cache(usage = NONSTRICT_READ_WRITE)
    @JoinColumn(name = "picture_ref_id", referencedColumnName = "topic_id",updatable = false,insertable = false)
    @OneToOne(cascade = PERSIST, fetch = LAZY)
    @NotFound(action= NotFoundAction.IGNORE)
    @Nullable
    public TdTopic getTopic( ){
        if(pictureType!=600)
         topic=null;
        return topic;
    }

    public void setTopic(TdTopic topic){
        this.topic=topic;
        if(topic!=null)
        {
          setPictureType(600);
          setPictureRefId(topic.getTopicId());
        }
     //   else setPictureRefId(null);
    }

    @Cache(usage = NONSTRICT_READ_WRITE)
    @JoinColumn(name = "picture_ref_id", referencedColumnName = "product_id",updatable = false,insertable = false)
    @OneToOne(cascade = PERSIST, fetch = LAZY)
    @NotFound(action= NotFoundAction.IGNORE)
    @Nullable
    public TdProduct getProduct( ){
         if(pictureType != 1000)
            product=null;
         return product;
    }

    public void setProduct(TdProduct product){
        this.product = product;
        if(product!=null)
        {
            setPictureType(1000);
            setPictureRefId(product.getProductId());
        }
     //   else setPictureRefId(null);
    }

    @Cache(usage = NONSTRICT_READ_WRITE)
        @JoinColumn(name = "picture_ref_id", referencedColumnName = "tag_id",updatable = false,insertable = false)
        @OneToOne(cascade = PERSIST, fetch = LAZY)
        @NotFound(action= NotFoundAction.IGNORE)
        @Nullable
        public TdTag getTag( ){
            if(pictureType!=800)
             tag=null;
            return tag;
        }

        public void setTag(TdTag tag){
            this.tag=tag;
            if(tag!=null)
            {
              setPictureType(800);
              setPictureRefId(tag.getTagId());
            }
          //  else setPictureRefId(null);
        }

        @Cache(usage = NONSTRICT_READ_WRITE)
        @JoinColumn(name = "picture_ref_id", referencedColumnName = "comment_id",updatable = false,insertable = false)
        @OneToOne(cascade = PERSIST, fetch = LAZY)
        @NotFound(action= NotFoundAction.IGNORE)
        @Nullable
        public TdComment getComment( ){
             if(pictureType != 700)
                comment=null;
             return comment;
        }

        public void setComment(TdComment comment){
            this.comment= comment;
            if(comment!=null)
            {
                setPictureType(700);
                setPictureRefId(comment.getCommentId());
            }
         //   else setPictureRefId(null);
        }

    /**
     * Set the default values.
     */
    public void initDefaultValues() {
        setStatus(1);
        setPictureType(0);
        setPictureRefId(0);
    }

    /**
     * equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof TdPicture && hashCode() == other.hashCode());
    }

    private PersistableHashBuilder persistableHashBuilder = new PersistableHashBuilder();

    @Override
    public int hashCode() {
        return persistableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this TdPicture instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("pictureId", getPictureId()) //
                .add("pictureName", getPictureName()) //
                .add("pictureShortDesc", getPictureShortDesc()) //
                .add("pictureLongDesc", getPictureLongDesc()) //
                .add("picturePath", getPicturePath()) //
                .add("pictureUrl", getPictureUrl()) //
                .add("pictureOwner", getPictureOwner()) //
                .add("pictureType", getPictureType()) //
                .add("pictureRefId", getPictureRefId()) //
                .add("status", getStatus()) //
                .toString();
    }
}