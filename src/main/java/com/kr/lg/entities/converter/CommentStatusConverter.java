package com.kr.lg.entities.converter;

import com.kr.lg.entities.enums.CommentStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;

@Converter
public class CommentStatusConverter implements AttributeConverter<CommentStatus, Integer> {

    @Override
    public Integer convertToDatabaseColumn(CommentStatus status) {
        if (status == null) return null;
        return status.getCode();
    }

    @Override
    public CommentStatus convertToEntityAttribute(Integer s) {
        return Arrays.stream(CommentStatus.values()).filter(x -> x.getCode() == s).findFirst().orElse(null);
    }
}
