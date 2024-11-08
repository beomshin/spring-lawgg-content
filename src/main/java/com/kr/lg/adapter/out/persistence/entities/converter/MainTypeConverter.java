package com.kr.lg.adapter.out.persistence.entities.converter;

import com.kr.lg.adapter.out.persistence.entities.enums.lawgg.MainType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;

@Converter
public class MainTypeConverter implements AttributeConverter<MainType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(MainType mainType) {
        if (mainType == null) return null;
        return mainType.getCode();
    }

    @Override
    public MainType convertToEntityAttribute(Integer s) {
        return Arrays.stream(MainType.values()).filter(x -> x.getCode() == s).findFirst().orElse(null);
    }
}
