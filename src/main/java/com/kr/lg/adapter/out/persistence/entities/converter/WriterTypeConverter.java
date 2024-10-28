package com.kr.lg.adapter.out.persistence.entities.converter;

import com.kr.lg.adapter.out.persistence.entities.enums.WriterType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;

@Converter
public class WriterTypeConverter implements AttributeConverter<WriterType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(WriterType writerType) {
        if (writerType == null) return null;
        return writerType.getCode();
    }

    @Override
    public WriterType convertToEntityAttribute(Integer s) {
        return Arrays.stream(WriterType.values()).filter(x -> x.getCode() == s).findFirst().orElse(null);
    }
}
