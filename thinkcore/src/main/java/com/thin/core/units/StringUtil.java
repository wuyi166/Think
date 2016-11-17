package com.thin.core.units;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jun.wu on 2016/8/4.
 */
public class StringUtil {
    public static boolean isNullOrBlank(String str){
        if(null== str || "".equals(str)){
            return true;
        }
        return false;
    }




    public static String formartDate(Date d){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(d);
    }

    public static String formartDate(Date d, String format){
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(d);
    }


    public static String formartDate(String d){
        return formartDate(StrToDate(d));
    }
    public static String formartDate(String d, String format){
        return formartDate(StrToDate(d),format);
    }

    public static Date StrToDate(String d){
        SimpleDateFormat sdf =   new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            Date date =   sdf.parse(d);
           return date;
        } catch (ParseException e) {

        }
      return null;
    }




}
