/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/converter/EntityConverter.e.vm.java
 */
package com.app.mpadmin.web.converter.domain;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.inject.Inject;
import org.springframework.stereotype.Component;
import com.app.mpadmin.domain.TdTopic;
import com.app.mpadmin.repository.TdTopicRepository;
import com.app.mpadmin.web.converter.GenericJsfConverter;

/**
 * Responsible for creating TdTopic JSF converters.
 * Each converter provides a 'print' method to convert an entity instance to a friendly string representation (readable by humans...).
 */
@Component
public class TdTopicConverter extends GenericJsfConverter<TdTopic, Integer> {
    @Inject
    public TdTopicConverter(TdTopicRepository tdTopicRepository) {
        super(tdTopicRepository, Integer.class);
    }

    @Override
    public String print(TdTopic tdTopic) {
       // return tdTopic == null ? "" : "" + tdTopic.getTopicId()+"/"+tdTopic.getTopicTitle();//.replace("&nbsp;"," ");
        if(tdTopic !=null){
          String title = tdTopic.getTopicTitle();
          if(title.contains("&nbsp;"))
              title.replace("&nbsp;"," ");
          return tdTopic.getTopicId()+"/"+title;
        }
        return "";
    }

  }