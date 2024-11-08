package com.kr.lg.adapter.out.persistence.entities.converter;

import com.kr.lg.adapter.out.persistence.entities.enums.lawgg.BoardStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;

@Converter
public class BoardStatusConverter implements AttributeConverter<BoardStatus, Integer> {

    @Override
    public Integer convertToDatabaseColumn(BoardStatus status) {
        if (status == null) return null;
        return status.getCode();
    }

    @Override
    public BoardStatus convertToEntityAttribute(Integer s) {
        return Arrays.stream(BoardStatus.values()).filter(x -> x.getCode() == s).findFirst().orElse(null);
    }
}
