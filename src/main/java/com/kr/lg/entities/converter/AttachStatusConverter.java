package com.kr.lg.entities.converter;

import com.kr.lg.entities.enums.AttachStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;

@Converter
public class AttachStatusConverter implements AttributeConverter<AttachStatus, Integer> {

    @Override
    public Integer convertToDatabaseColumn(AttachStatus status) {
        if (status == null) return null;
        return status.getCode();
    }

    @Override
    public AttachStatus convertToEntityAttribute(Integer s) {
        return Arrays.stream(AttachStatus.values()).filter(x -> x.getCode() == s).findFirst().orElse(null);
    }
}
