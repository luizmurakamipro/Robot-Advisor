/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Utilidade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

/**
 *
 * @author Luiz Murakami
 */
public class StringToDate extends 
        org.jdesktop.beansbinding.Converter<Date,String>{

    private SimpleDateFormat df;
    public StringToDate(){
        df = new SimpleDateFormat("dd/MM/yyyy");
    }
    
    @Override
    public Date convertReverse(String s) {
        try{
            return new Date(df.parse(s).getTime());
        }catch(ParseException e){
            return null;
        }
    }

    @Override
    public String convertForward(Date t) {
        return df.format(t);
    }
}
