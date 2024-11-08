package com.kr.lg.adapter.out.persistence.entities.converter;

import com.kr.lg.adapter.out.persistence.entities.enums.lawgg.LineType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;

@Converter
public class LineTypeConverter implements AttributeConverter<LineType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(LineType lineType) {
        if (lineType == null) return null;
        return lineType.getCode();
    }

    @Override
    public LineType convertToEntityAttribute(Integer s) {
        return Arrays.stream(LineType.values()).filter(x -> x.getCode() == s).findFirst().orElse(null);
    }
}
