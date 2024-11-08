package com.kr.lg.adapter.out.persistence.entities.converter;

import com.kr.lg.adapter.out.persistence.entities.enums.formdang.FormStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;

@Converter
public class FormStatusConverter implements AttributeConverter<FormStatus, Integer> {

    @Override
    public Integer convertToDatabaseColumn(FormStatus status) {
        if (status == null) return null;
        return status.getCode();
    }

    @Override
    public FormStatus convertToEntityAttribute(Integer s) {
        return Arrays.stream(FormStatus.values()).filter(x -> x.getCode() == s).findFirst().orElse(null);
    }
}
