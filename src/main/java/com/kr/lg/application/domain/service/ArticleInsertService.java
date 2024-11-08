package com.kr.lg.application.domain.service;

import com.kr.lg.adapter.out.persistence.entities.enums.DType;
import com.kr.lg.adapter.out.persistence.mapper.ArticleBoardMapper;
import com.kr.lg.adapter.out.persistence.mapper.ArticleFormMapper;
import com.kr.lg.adapter.out.persistence.mapper.ArticleTrialMapper;
import com.kr.lg.application.domain.model.ArticleForm;
import com.kr.lg.application.domain.model.ArticleLawggBoard;
import com.kr.lg.application.domain.model.ArticleLawggTrial;
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
    private final ArticleTrialMapper articleTrialMapper;
    private final ArticleFormMapper articleFormMapper;

    @Override
    public void enroll(ArticleInsertCommand command) {
        log.info("◆ 게시판 등록 도메인 로직 수행");

        if (DType.LAWGG_BOARD == command.getDtype()) {
            ArticleLawggBoard board = articleBoardMapper.commandToDomainEntity(command); // command -> domain 객체 변경
            insertArticleBoardPort.insertArticleLawggBoard(board);
        } else if (DType.LAWGG_TRIAL == command.getDtype()) {
            ArticleLawggTrial trial = articleTrialMapper.commandToDomainEntity(command); // command -> domain 객체 변경
            insertArticleBoardPort.insertArticleLawggTrial(trial);
        } else if (DType.FORM == command.getDtype()) {
            ArticleForm form = articleFormMapper.commandToDomainEntity(command); // command -> domain 객체 변경
            insertArticleBoardPort.insertArticleForm(form);
        }

    }

}
