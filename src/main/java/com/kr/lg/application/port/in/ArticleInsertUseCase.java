package com.kr.lg.application.port.in;

import com.kr.lg.application.port.in.command.ArticleInsertCommand;

public interface ArticleInsertUseCase {
    void enroll(ArticleInsertCommand command);
}
