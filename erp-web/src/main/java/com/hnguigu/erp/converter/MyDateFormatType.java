package com.hnguigu.erp.converter;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.core.convert.converter.Converter;
import java.util.Date;

public class MyDateFormatType implements Converter<String,Date> {

    private String[] formatType;

    public void setFormatType(String[] formatType) {
        this.formatType = formatType;
    }

    @Override
    public Date convert(String s) {
        Date date=null;
        try {
            date=DateUtils.parseDate(s,formatType);
        }catch (Exception e){
            e.fillInStackTrace();
        }
        return date;
    }
}
