/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/SearchForm.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.dao.support.Ranges.RangeDate.newRangeDate;
import static com.app.mpadmin.dao.support.Ranges.RangeInteger.newRangeInteger;
import static com.app.mpadmin.domain.TdPage_.*;

import com.app.mpadmin.dao.support.EntitySelectors;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.app.mpadmin.dao.support.Ranges.RangeDate;
import com.app.mpadmin.dao.support.Ranges.RangeInteger;
import com.app.mpadmin.domain.TdPage;
import com.app.mpadmin.web.domain.support.SearchFormBase;

/**
 * Simple parameters holder for tdPage search.
 */
@Component
@Scope("request")
public class TdPageSearchForm extends SearchFormBase {
    private static final long serialVersionUID = 1L;

    private TdPage tdPage = new TdPage();
    private RangeInteger<TdPage> pageTypeRange = newRangeInteger(pageType);
    private RangeInteger<TdPage> pageReferenceIdRange = newRangeInteger(pageReferenceId);
    private RangeInteger<TdPage> pageIsActiveRange = newRangeInteger(pageIsActive);
    private RangeInteger<TdPage> pagePriorityRange = newRangeInteger(pagePriority);
    private RangeDate<TdPage> updationDateRange = newRangeDate(updationDate);
  //  private RangeInteger<TdPage> pageUserIdRange = newRangeInteger(pageUserId);
    private RangeInteger<TdPage> pageCustom3Range = newRangeInteger(pageCustom3);
    private RangeInteger<TdPage> pageCustom4Range = newRangeInteger(pageCustom4);
    private RangeInteger<TdPage> pageIdRange = newRangeInteger(pageId);
    private EntitySelectors.TdUserAuthSelector<TdPage> userSelector = EntitySelectors.TdUserAuthSelector.newTdUserAuthSelector(pageUserId);
    public TdPage getTdPage() {
        return tdPage;
    }

    // Ranges, used from the view.
    public RangeInteger<TdPage> getPageIdRange(){
        return pageIdRange;
    }

    public RangeInteger<TdPage> getPageTypeRange() {
        return pageTypeRange;
    }

    public RangeInteger<TdPage> getPageReferenceIdRange() {
        return pageReferenceIdRange;
    }

    public RangeInteger<TdPage> getPageIsActiveRange() {
        return pageIsActiveRange;
    }

    public RangeInteger<TdPage> getPagePriorityRange() {
        return pagePriorityRange;
    }

    public RangeDate<TdPage> getUpdationDateRange() {
        return updationDateRange;
    }

   /* public RangeInteger<TdPage> getPageUserIdRange() {
        return pageUserIdRange;
    }  */
    public EntitySelectors.TdUserAuthSelector<TdPage> getUserSelector() {
        return userSelector;
    }

    public RangeInteger<TdPage> getPageCustom3Range() {
        return pageCustom3Range;
    }

    public RangeInteger<TdPage> getPageCustom4Range() {
        return pageCustom4Range;
    }
}