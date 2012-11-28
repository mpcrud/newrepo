package com.app.mpadmin.web.converter;

import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: miti
 * Date: 11/28/12
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class ListConverter implements Converter{

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object modelValue) {
        // Write code here which converts the model value to display value.
        if (modelValue instanceof ArrayList) {
             String string = modelValue.toString();
             return string.substring(1,string.length()-1);
            /* ArrayList a = (ArrayList) modelValue;
             String str= " ";
             for(Object object:a)
                str.concat(object.toString());
             return str;  */
        }
        return "";

    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String submittedValue)  {
        // Write code here which converts the submitted value to model value.
        // This method won't be used in h:outputText, but in UIInput components only.
        if (submittedValue != null && !submittedValue.isEmpty()) {
            List<String> stringList = new ArrayList<String>();
            String[] strings = submittedValue.split(",");
            for(String str:strings)
                stringList.add(str);
            return stringList;
        }
        return null;
    }
}
