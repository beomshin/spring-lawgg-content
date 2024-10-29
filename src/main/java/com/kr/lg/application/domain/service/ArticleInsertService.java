package com.kr.lg.application.domain.service;

import com.kr.lg.application.port.in.ArticleInsertUseCase;
import com.kr.lg.application.port.in.command.ArticleInsertCommand;
import com.kr.lg.application.port.out.InsertArticleBoardPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ArticleInsertService implements ArticleInsertUseCase {

    private final InsertArticleBoardPort insertArticleBoardPort;

    @Override
    public void enroll(ArticleInsertCommand command) {

    }

}
