/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.EntitySelectors.TdTopicSelector.newTdTopicSelector;
import static com.app.mpadmin.dao.support.EntitySelectors.TdUserAuthSelector.newTdUserAuthSelector;
import static com.app.mpadmin.dao.support.Ranges.RangeDate.newRangeDate;
import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TdVote_.*;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.EntitySelectors.TdTopicSelector;
import com.app.mpadmin.dao.support.EntitySelectors.TdUserAuthSelector;
import com.app.mpadmin.dao.support.Ranges.RangeDate;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdVote;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdVote search.
 */
@Component
@Scope("session")
public class TdVoteSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdVote tdVote = new TdVote();
    private RangeInteger<TdVote> voteTypeRange = newRangeInteger(voteType);
    private RangeDate<TdVote> updationDateRange = newRangeDate(updationDate);
    private RangeInteger<TdVote> isActiveRange = newRangeInteger(isActive);
    private RangeInteger<TdVote> voteStatusRange = newRangeInteger(voteStatus);
    private RangeInteger<TdVote> commentIdRange = newRangeInteger(commentId);
    private TdUserAuthSelector<TdVote> userSelector = newTdUserAuthSelector(userId);
    private TdTopicSelector<TdVote> topicSelector = newTdTopicSelector(topicId);
    private RangeInteger<TdVote> voteIdRange = newRangeInteger(voteId);

    public TdVote getTdVote() {
        return tdVote;
    }

    // Ranges, used from the view.
    public RangeInteger<TdVote> getVoteIdRange(){
        return voteIdRange;
    }
    public RangeInteger<TdVote> getVoteTypeRange() {
        return voteTypeRange;
    }

    public RangeDate<TdVote> getUpdationDateRange() {
        return updationDateRange;
    }

    public RangeInteger<TdVote> getIsActiveRange() {
        return isActiveRange;
    }

    public RangeInteger<TdVote> getVoteStatusRange() {
        return voteStatusRange;
    }

    public RangeInteger<TdVote> getCommentIdRange() {
        return commentIdRange;
    }

    // Selectors for x-to-one associations
    public TdUserAuthSelector<TdVote> getUserSelector() {
        return userSelector;
    }

    public TdTopicSelector<TdVote> getTopicSelector() {
        return topicSelector;
    }
}