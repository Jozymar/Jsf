
package com.ifpb.convert;

import com.ifpb.integrante.CPF;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "convert.CPF", forClass = CPF.class)
public class ConvertCPF implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        
       String cpf = value;
          if (value!= null && !value.equals(""))
               cpf = value.replaceAll("\\.", "").replaceAll("\\-", "");
 
        CPF cpfOb = new CPF(cpf);
          return cpfOb;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        
         String cpf= value.toString();
          if (cpf != null && cpf.length() == 11)
               cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
 
          return cpf;
 
    }
}
