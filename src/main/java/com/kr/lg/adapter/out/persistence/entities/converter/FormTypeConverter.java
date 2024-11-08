package com.kr.lg.adapter.out.persistence.entities.converter;

import com.kr.lg.adapter.out.persistence.entities.enums.formdang.FormType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;

@Converter
public class FormTypeConverter implements AttributeConverter<FormType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(FormType formType) {
        if (formType == null) return null;
        return formType.getCode();
    }

    @Override
    public FormType convertToEntityAttribute(Integer s) {
        return Arrays.stream(FormType.values()).filter(x -> x.getCode() == s).findFirst().orElse(null);
    }
}
