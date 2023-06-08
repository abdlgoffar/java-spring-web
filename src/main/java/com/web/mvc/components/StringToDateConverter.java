package com.web.mvc.components;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//disini terdapat contoh cara convert data type String ke Date, caranya cukup membuat class yang implements ke interface Converter.
@Component
@Slf4j
public class StringToDateConverter implements Converter<String, Date> {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    public Date convert(String source) {
       try {
           return simpleDateFormat.parse(source);
       } catch (ParseException parseException) {
           log.warn("Error convert Date data type from string{}", source, parseException);
           return null;
       }
    }
}
