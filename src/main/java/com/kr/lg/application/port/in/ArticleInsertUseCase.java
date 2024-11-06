package com.kr.lg.application.port.in;

import com.kr.lg.application.port.in.command.ArticleInsertCommand;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

@Validated
public interface ArticleInsertUseCase {
    void enroll(@Valid ArticleInsertCommand command);
}
