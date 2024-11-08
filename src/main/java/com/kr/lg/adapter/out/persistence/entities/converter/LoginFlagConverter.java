package com.kr.lg.adapter.out.persistence.entities.converter;

import com.kr.lg.adapter.out.persistence.entities.enums.formdang.LoginFlag;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;

@Converter
public class LoginFlagConverter implements AttributeConverter<LoginFlag, Integer> {

    @Override
    public Integer convertToDatabaseColumn(LoginFlag loginFlag) {
        if (loginFlag == null) return null;
        return loginFlag.getCode();
    }

    @Override
    public LoginFlag convertToEntityAttribute(Integer s) {
        return Arrays.stream(LoginFlag.values()).filter(x -> x.getCode() == s).findFirst().orElse(null);
    }
}
