package com.kr.lg.adapter.out.persistence.mapper;

import com.kr.lg.adapter.out.persistence.entities.ArticleLawggBoardEntity;
import com.kr.lg.application.domain.model.ArticleLawggBoard;
import com.kr.lg.application.port.in.command.ArticleInsertCommand;
import org.springframework.stereotype.Component;

@Component
public class ArticleBoardMapper {

    public ArticleLawggBoardEntity mapToJpaEntity(ArticleLawggBoard articleLawggBoard) {
        return ArticleLawggBoardEntity.builder()
                .userId(articleLawggBoard.getUserId())
                .title(articleLawggBoard.getTitle())
                .writer(articleLawggBoard.getWriter())
                .desc(articleLawggBoard.getDesc())
                .ip(articleLawggBoard.getIp())
                .build();
    }

    public ArticleLawggBoard mapToDomainEntity(ArticleLawggBoardEntity articleLawggBoardEntity) {
        return ArticleLawggBoard.builder()
                .userId(articleLawggBoardEntity.getUserId())
                .title(articleLawggBoardEntity.getTitle())
                .writer(articleLawggBoardEntity.getWriter())
                .desc(articleLawggBoardEntity.getDesc())
                .ip(articleLawggBoardEntity.getIp())
                .build();
    }

    public ArticleLawggBoard commandToDomainEntity(ArticleInsertCommand command) {
        return ArticleLawggBoard.builder()
                .userId(command.getUserId())
                .title(command.getTitle())
                .writer(command.getWriter())
                .desc(command.getDesc())
                .dtype(command.getDtype())
                .ip(command.getIp())
                .build();
    }

}
