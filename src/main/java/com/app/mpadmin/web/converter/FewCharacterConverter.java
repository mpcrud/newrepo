package com.app.mpadmin.web.converter;

import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 * Created by IntelliJ IDEA.
 * User: miti
 * Date: 11/25/12
 * Time: 11:23 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class FewCharacterConverter implements Converter {
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object modelValue) {
        // Write code here which converts the model value to display value.
        if (modelValue instanceof String) {
            if(((String) modelValue).length()>100)
            return ((String) modelValue).substring(0,100).concat("...");
            else
                return (String)modelValue;
        }
        return "";

    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String submittedValue)  {
        // Write code here which converts the submitted value to model value.
        // This method won't be used in h:outputText, but in UIInput components only.
        if (submittedValue != null && !submittedValue.isEmpty()) {
            return submittedValue.toString();
        }
        return null;
    }
}
