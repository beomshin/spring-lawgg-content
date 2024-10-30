package com.kr.lg.application.domain.service;

import com.kr.lg.adapter.out.persistence.mapper.ArticleBoardMapper;
import com.kr.lg.application.domain.model.ArticleLawggBoard;
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
    private final ArticleBoardMapper articleBoardMapper;

    @Override
    public void enroll(ArticleInsertCommand command) {

        ArticleLawggBoard board = articleBoardMapper.commandToDomainEntity(command);

        insertArticleBoardPort.insertArticleBoard(board);

    }

}
