/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class XDate {
    static SimpleDateFormat formater = new SimpleDateFormat();
    public static Date toDate(String date,String pattern){
        try {
            formater.applyPattern(pattern);
            return formater.parse(date);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public static String toString(Date date,String pattern){
        if(date == null){
            return "";
        }
        formater.applyPattern(pattern);
        return formater.format(date);
    }
    public static Date adđay(Date date,long days){
        date.setTime(date.getTime() + days*24*60*60*1000);
        return date;
    }
}
