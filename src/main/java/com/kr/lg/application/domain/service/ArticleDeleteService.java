package com.kr.lg.application.domain.service;

import com.kr.lg.application.port.in.ArticleDeleteUseCase;
import com.kr.lg.application.port.in.command.ArticleCommentDeleteCommand;
import com.kr.lg.application.port.in.command.ArticleDeleteCommand;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ArticleDeleteService implements ArticleDeleteUseCase {

    @Override
    public void delete(ArticleDeleteCommand command) {

    }

    @Override
    public void deleteComment(ArticleCommentDeleteCommand command) {

    }
}
