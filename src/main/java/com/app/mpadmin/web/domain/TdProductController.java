/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/Controller.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.web.util.PrimeFacesUtil.forceClose;
import static com.app.mpadmin.web.util.PrimeFacesUtil.showAskForMapTagGrpToTagDialog;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;


import com.app.mpadmin.dao.support.SearchParameters;
import com.app.mpadmin.domain.*;
import com.app.mpadmin.repository.*;
import com.app.mpadmin.web.converter.domain.TdProductConverter;
import com.app.mpadmin.web.converter.domain.TdTagConverter;
import com.app.mpadmin.web.converter.domain.TdTagGrpConverter;
import com.app.mpadmin.web.converter.domain.TdTagGrpTagMappingConverter;
import com.app.mpadmin.web.util.FileUploadController;
import com.app.mpadmin.web.util.MessageUtil;

/**
 * Thin controller layer allowing you to do business validation and other conditional 
 * checks that are easier to implement in Java than in webflow's xml syntax.
 */
@Named
@Singleton
public class TdProductController {
    private static final long serialVersionUID = 1L;

    @Inject
    private TdProductRepository tdProductRepository;
    @Inject
    private TdTagGrpRepository tdTagGrpRepository;
    @Inject
    private TdProductModelRepository tdProductModelRepository;
    @Inject
    private TdTagGrpTagMappingRepository tdTagGrpTagMappingRepository;

    @Inject
    private MessageUtil messageUtil;

    @Inject
    private TdProductConverter tdProductConverter;
    @Inject
    private TdTagGrpConverter tdTagGrpConverter;
    @Inject
    private TdTagConverter tdTagConverter;
    @Inject
    private TdTagGrpTagMappingConverter tdTagGrpTagMappingConverter;



    public TdProduct newIfNull(TdProduct tdProduct) {
        if (tdProduct != null) {
            return tdProduct;
        }

        return tdProductRepository.getNewWithDefaults();
    }

    public boolean save(TdProduct tdProduct) {
        tdProductRepository.save(tdProduct);
        messageUtil.info("status_saved_ok", tdProductConverter.print(tdProduct)); 
        String productname =tdProduct.getProductDisplayName();
        TdTagGrp tagGroup = new TdTagGrp();
        if(tdProductConverter.printId(tdProduct)!=-1)
        {

        tagGroup.setIsActive(1);
        tagGroup.setCreationDate(Calendar.getInstance().getTime());
        tagGroup.setReferenceId(tdProduct.getProductId());
        tagGroup.setReferenceType(400);
        tagGroup.setTagGrpStatus(1);
        tagGroup.setUpdationDate(Calendar.getInstance().getTime());
        
        tdTagGrpRepository.save(tagGroup);
        //int tagGroupId=tagService.insertTagGroup(tagGroup);  
        
       /* TdTag tag = new TdTag();
        tag.setIsActive(1);
        tag.setTagPriority(1);
        tag.setTagDesc(productname);
        tag.setTagStatus(1);
        tag.setTagTitle(productname.trim().replace(" ","-"));
        tag.setTagType(444);
        tag.setTagUrl("/"+productname.trim().replace(" ","-"));
        tag.setCreationDate(Calendar.getInstance().getTime());
        tag.setUpdationDate(Calendar.getInstance().getTime());
        //int tagId = tagService.insertTag(tag);
        //System.out.println("tag id"+tagId);
        
        tdTagRepository.save(tag);
        TdTagGrpTagMapping grp = new TdTagGrpTagMapping();
        grp.setTag(tag);
        grp.setTagGrp(tagGroup);        
        tdTagGrpTagMappingRepository.save(grp);*/
        //tagService.grpMapTagng(tagId,tagGroupId);
        }
        showAskForMapTagGrpToTagDialog();
        return true;
    }

    public boolean saveAndClose(TdProduct tdProduct) {
        tdProductRepository.save(tdProduct);
        messageUtil.infoDelayed("status_saved_ok", tdProductConverter.print(tdProduct));
        String productname =tdProduct.getProductDisplayName();
        if(tdProductConverter.printId(tdProduct)!=-1)
        {
        	
        TdTagGrp tagGroup = new TdTagGrp();
        tagGroup.setIsActive(1);
        tagGroup.setCreationDate(Calendar.getInstance().getTime());
        tagGroup.setReferenceId(tdProduct.getId());
        tagGroup.setReferenceType(400);
        tagGroup.setTagGrpStatus(1);
        tagGroup.setUpdationDate(Calendar.getInstance().getTime());        
        tdTagGrpRepository.save(tagGroup);
        messageUtil.infoDelayed("status_saved_ok", tdTagGrpConverter.print(tagGroup));
        //int tagGroupId=tagService.insertTagGroup(tagGroup);        
     /*   TdTag tag = new TdTag();
        tag.setIsActive(1);
        tag.setTagPriority(1);
        tag.setTagDesc(productname);
        tag.setTagStatus(1);
        tag.setTagTitle(productname.trim().replace(" ","-"));
        tag.setTagType(4);
        tag.setTagUrl("/"+productname.trim().replace(" ","-"));
        tag.setCreationDate(Calendar.getInstance().getTime());
        tag.setUpdationDate(Calendar.getInstance().getTime());
        //int tagId = tagService.insertTag(tag);
        //System.out.println("tag id"+tagId);        
        tdTagRepository.save(tag);
        messageUtil.infoDelayed("status_saved_ok", tdTagConverter.print(tag));
        TdTagGrpTagMapping grp = new TdTagGrpTagMapping();
        grp.setTag(tag);
        grp.setTagGrp(tagGroup);        
        tdTagGrpTagMappingRepository.save(grp);
        messageUtil.infoDelayed("status_saved_ok", tdTagGrpTagMappingConverter.print(grp));*/
        //tagService.grpMapTagng(tagId,tagGroupId);
        }

        forceClose();
        return true;
    }

     public boolean delete(TdProduct tdProduct) {
        String infoArg = tdProductConverter.print(tdProduct);
        tdProductRepository.delete(tdProduct);
        messageUtil.info("status_deleted_ok", infoArg);
        return true;
    }

    public boolean updateStatus(TdProduct[] arr){
        for(TdProduct tdProduct:arr){
            if(tdProduct.getProductStatus()){
                tdProduct.setProductStatus(false);
            }
            else
              tdProduct.setProductStatus(true);
            tdProductRepository.save(tdProduct);
        }
        messageUtil.info("status_saved_ok",arr.length+" request status updated");
        return true;
    }


  /*  public boolean delete(TdProduct tdProduct) {
        String infoArg = tdProductConverter.print(tdProduct);
        SearchParameters sp = new SearchParameters();
        Map<String,Object> par = new HashMap<String,Object>();
        par.put("productId", tdProduct.getProductId());
        sp.setNamedQuery("productModel.deleteProducts");
        sp.setNamedQueryParameters(par);
        TdProductModel pm = new TdProductModel();
        List<TdProductModel> deleteList =  tdProductModelRepository.find(pm,sp);
        for(TdProductModel productModel:deleteList)
           tdProductModelRepository.delete(productModel);
        tdProductRepository.delete(tdProduct);
        messageUtil.info("status_deleted_ok", infoArg);
        return true;
    }*/
}