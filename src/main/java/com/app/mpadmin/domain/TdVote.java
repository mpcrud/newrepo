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
import javax.xml.bind.annotation.XmlTransient;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import com.app.mpadmin.domain.PersistableHashBuilder;
import com.app.mpadmin.domain.TdTopic;
import com.app.mpadmin.domain.TdUserAuth;
import com.google.common.base.Objects;

@Entity
@Table(name = "td_vote")
@Cache(usage = NONSTRICT_READ_WRITE)
public class TdVote implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(TdVote.class);

    // Raw attributes
    private Integer voteId; // pk
    private Integer voteType;
    private Date creationDate;
    private Date updationDate;
    private Integer isActive;
    private Integer voteStatus;
    private Integer commentId;

    // Technical attributes for query by example
    private Integer userId;
    private Integer topicId;
    // Many to one
    private TdUserAuth user; // (userId)
    private TdTopic topic; // (topicId)

    // ---------------------------
    // Constructors
    // ---------------------------

    public TdVote() {
    }

    public TdVote(Integer primaryKey) {
        setId(primaryKey);
    }

    // ---------------------------
    // Identifiable implementation
    // ---------------------------

    @Override
    @Transient
    @XmlTransient
    public Integer getId() {
        return getVoteId();
    }

    @Override
    public void setId(Integer voteId) {
        setVoteId(voteId);
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return isVoteIdSet();
    }

    // -------------------------------
    // Getter & Setter
    // -------------------------------

    // -- [voteId] ------------------------

    @Column(name = "vote_id", precision = 10)
    @GeneratedValue
    @Id
    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    @Transient
    public boolean isVoteIdSet() {
        return voteId != null;
    }

    // -- [userId] ------------------------

    @Column(name = "user_id", precision = 10, insertable = false, updatable = false)
    public Integer getUserId() {
        return userId;
    }

    private void setUserId(Integer userId) {
        this.userId = userId;
    }

    // -- [topicId] ------------------------

    @Column(name = "topic_id", precision = 10, insertable = false, updatable = false)
    public Integer getTopicId() {
        return topicId;
    }

    private void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    // -- [voteType] ------------------------

    @Column(name = "vote_type", precision = 5)
    public Integer getVoteType() {
        return voteType;
    }

    public void setVoteType(Integer voteType) {
        this.voteType = voteType;
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

    // -- [isActive] ------------------------

    @Column(name = "is_active", precision = 5)
    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    // -- [voteStatus] ------------------------

    @Column(name = "vote_status", precision = 5)
    public Integer getVoteStatus() {
        return voteStatus;
    }

    public void setVoteStatus(Integer voteStatus) {
        this.voteStatus = voteStatus;
    }

    // -- [commentId] ------------------------

    @Column(name = "comment_id", precision = 10)
    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    // --------------------------------------------------------------------
    // Many to One support
    // --------------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: TdVote.userId ==> TdUserAuth.userId
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @Cache(usage = NONSTRICT_READ_WRITE)
    @JoinColumn(name = "user_id")
    @ManyToOne(cascade = PERSIST, fetch = LAZY)
    public TdUserAuth getUser() {
        return user;
    }

    /**
     * Set the user without adding this TdVote instance on the passed user
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
    // many-to-one: TdVote.topicId ==> TdTopic.topicId
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @Cache(usage = NONSTRICT_READ_WRITE)
    @JoinColumn(name = "topic_id")
    @ManyToOne(cascade = PERSIST, fetch = LAZY)
    public TdTopic getTopic() {
        return topic;
    }

    /**
     * Set the topic without adding this TdVote instance on the passed topic
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
        setCommentId(0);
        setVoteStatus(0);
        setVoteType(0);

    }

    /**
     * equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof TdVote && hashCode() == other.hashCode());
    }

    private PersistableHashBuilder persistableHashBuilder = new PersistableHashBuilder();

    @Override
    public int hashCode() {
        return persistableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this TdVote instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("voteId", getVoteId()) //
                .add("userId", getUserId()) //
                .add("topicId", getTopicId()) //
                .add("voteType", getVoteType()) //
                .add("creationDate", getCreationDate()) //
                .add("updationDate", getUpdationDate()) //
                .add("isActive", getIsActive()) //
                .add("voteStatus", getVoteStatus()) //
                .add("commentId", getCommentId()) //
                .toString();
    }

    @PrePersist
    protected void prePersist() {
        setCreationDate(new Date());
    }
}