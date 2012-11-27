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
import com.app.mpadmin.domain.TdTopic;
import com.app.mpadmin.domain.TdUserAuth;
import com.google.common.base.Objects;

@Entity
@Table(name = "td_comment")
@Cache(usage = NONSTRICT_READ_WRITE)
public class TdComment implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(TdComment.class);

    // Raw attributes
    private Integer commentId; // pk
    private Integer topicId;
    private String commentName;
    private Integer commentCount;
    private Integer userId;
    private Date creationDate;
    private Date updationDate;
    private Integer isActive;
    private String commentDesc;
    private Integer commentStatus;
    private String shortDesc;
    
    
 // Many to one
    private TdUserAuth user; // (userId)
    private TdTopic topic; // (topicId)


    // ---------------------------
    // Constructors
    // ---------------------------

    public TdComment() {
    }

    public TdComment(Integer primaryKey) {
        setId(primaryKey);
    }

    // ---------------------------
    // Identifiable implementation
    // ---------------------------

    @Override
    @Transient
    @XmlTransient
    public Integer getId() {
        return getCommentId();
    }

    @Override
    public void setId(Integer commentId) {
        setCommentId(commentId);
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return isCommentIdSet();
    }

    // -------------------------------
    // Getter & Setter
    // -------------------------------

    // -- [commentId] ------------------------

    @Column(name = "comment_id", precision = 10)
    @GeneratedValue
    @Id
    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    @Transient
    public boolean isCommentIdSet() {
        return commentId != null;
    }

    // -- [topicId] ------------------------
    @NotNull
    @Column(name = "topic_id", precision = 10, insertable = false, updatable = false, nullable=false)
    public Integer getTopicId() {
        return topicId;
    }

    private void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }
    /*@Column(name = "topic_id", precision = 10)
    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }*/

    // -- [commentName] ------------------------

    @Size(max = 45)
    @Column(name = "comment_name", length = 45)
    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName;
    }

    // -- [commentCount] ------------------------

    @Column(name = "comment_count", precision = 10)
    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    // -- [userId] ------------------------
    @NotNull
    @Column(name = "user_id", precision = 10, insertable = false, updatable = false,nullable=false)
    public Integer getUserId() {
        return userId;
    }

    private void setUserId(Integer userId) {
        this.userId = userId;
    }

    /*@Column(name = "user_id", precision = 10)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }*/

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

    // -- [isActive] ------------------------

    @Column(name = "is_active", precision = 5)
    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    // -- [commentDesc] ------------------------

    @Size(max = 10000)
    @Column(name = "comment_desc", length = 10000)
    public String getCommentDesc() {
        return commentDesc;
    }

    public void setCommentDesc(String commentDesc) {
        this.commentDesc = commentDesc;
    }

    // -- [commentStatus] ------------------------

    @Column(name = "comment_status", precision = 5)
    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }

    // -- [shortDesc] ------------------------

    @Size(max = 500)
    @Column(name = "short_desc", length = 500)
    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }
    
 // Many to One support
    // --------------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: TdComment.userId ==> TdUserAuth.userId
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    
    @Cache(usage = NONSTRICT_READ_WRITE)
    @JoinColumn(name = "user_id")
    @ManyToOne(cascade = PERSIST, fetch = LAZY)
    public TdUserAuth getUser() {
        return user;
    }

    /**
     * Set the user without adding this TdComment instance on the passed user
     * If you want to preserve referential integrity we recommend to use
     * instead the corresponding adder method provided by {@link TdUserAuth}
     */
    public void setUser(TdUserAuth user) {
        this.user = user;

        // We set the foreign key property so it can be used by our JPA search by Example facility.
        if (user != null) {
            setUserId(user.getUserId());
        } else {
            setUserId(null);
        }
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: TdComment.topicId ==> TdTopic.topicId
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @Cache(usage = NONSTRICT_READ_WRITE)
    @JoinColumn(name = "topic_id")
    @ManyToOne(cascade = PERSIST, fetch = LAZY)
    public TdTopic getTopic() {
        return topic;
    }

    /**
     * Set the topic without adding this TdComment instance on the passed topic
     * If you want to preserve referential integrity we recommend to use
     * instead the corresponding adder method provided by {@link TdTopic}
     */
    public void setTopic(TdTopic topic) {
        this.topic = topic;

        // We set the foreign key property so it can be used by our JPA search by Example facility.
        if (topic != null) {
            setTopicId(topic.getTopicId());
        } else {
            setTopicId(null);
        }
    }

    /**
     * Set the default values.
     */
    public void initDefaultValues() {
        setCommentCount(0);
        setCommentStatus(1);
        setIsActive(1);
    }

    /**
     * equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof TdComment && hashCode() == other.hashCode());
    }

    private PersistableHashBuilder persistableHashBuilder = new PersistableHashBuilder();

    @Override
    public int hashCode() {
        return persistableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this TdComment instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("commentId", getCommentId()) //
                .add("topicId", getTopicId()) //
                .add("commentName", getCommentName()) //
                .add("commentCount", getCommentCount()) //
                .add("userId", getUserId()) //
                .add("creationDate", getCreationDate()) //
                .add("updationDate", getUpdationDate()) //
                .add("isActive", getIsActive()) //
                .add("commentDesc", getCommentDesc()) //
                .add("commentStatus", getCommentStatus()) //
                .add("shortDesc", getShortDesc()) //
                .toString();
    }

    @PrePersist
    protected void prePersist() {
        setCreationDate(new Date());
    }
}