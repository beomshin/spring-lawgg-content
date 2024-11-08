package com.kr.lg.adapter.out.persistence.entities.converter;

import com.kr.lg.adapter.out.persistence.entities.enums.lawgg.PrecedentType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;

@Converter
public class PrecedentTypeConverter implements AttributeConverter<PrecedentType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(PrecedentType precedentType) {
        if (precedentType == null) return null;
        return precedentType.getCode();
    }

    @Override
    public PrecedentType convertToEntityAttribute(Integer s) {
        return Arrays.stream(PrecedentType.values()).filter(x -> x.getCode() == s).findFirst().orElse(null);
    }
}
