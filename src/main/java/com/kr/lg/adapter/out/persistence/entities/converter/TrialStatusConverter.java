package com.kr.lg.adapter.out.persistence.entities.converter;

import com.kr.lg.adapter.out.persistence.entities.enums.TrialStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;

@Converter
public class TrialStatusConverter implements AttributeConverter<TrialStatus, Integer> {

    @Override
    public Integer convertToDatabaseColumn(TrialStatus status) {
        if (status == null) return null;
        return status.getCode();
    }

    @Override
    public TrialStatus convertToEntityAttribute(Integer s) {
        return Arrays.stream(TrialStatus.values()).filter(x -> x.getCode() == s).findFirst().orElse(null);
    }
}
