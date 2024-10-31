package com.kr.lg.adapter.out.persistence.mapper;

import com.kr.lg.adapter.out.persistence.entities.ArticleLawggBoardEntity;
import com.kr.lg.application.domain.model.ArticleLawggBoard;
import com.kr.lg.application.port.in.command.ArticleInsertCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ArticleBoardMapper {

    public ArticleLawggBoardEntity mapToJpaEntity(ArticleLawggBoard articleLawggBoard) {
        log.info("◆ 도메인 객체 -> 엔티티 객체");
        return ArticleLawggBoardEntity.builder()
                .userId(articleLawggBoard.getUserId())
                .title(articleLawggBoard.getTitle())
                .writer(articleLawggBoard.getWriter())
                .desc(articleLawggBoard.getDesc())
                .ip(articleLawggBoard.getIp())
                .lawFirmId(articleLawggBoard.getLawFirmId())
                .password(articleLawggBoard.getPassword())
                .postType(articleLawggBoard.getPostType())
                .writerType(articleLawggBoard.getWriterType())
                .lineType(articleLawggBoard.getLineType())
                .build();
    }

    public ArticleLawggBoard mapToDomainEntity(ArticleLawggBoardEntity articleLawggBoardEntity) {
        log.info("◆ 엔티티 객체 -> 도메인 객체");
        return ArticleLawggBoard.builder()
                .userId(articleLawggBoardEntity.getUserId())
                .title(articleLawggBoardEntity.getTitle())
                .writer(articleLawggBoardEntity.getWriter())
                .desc(articleLawggBoardEntity.getDesc())
                .ip(articleLawggBoardEntity.getIp())
                .lawFirmId(articleLawggBoardEntity.getLawFirmId())
                .password(articleLawggBoardEntity.getPassword())
                .postType(articleLawggBoardEntity.getPostType())
                .writerType(articleLawggBoardEntity.getWriterType())
                .lineType(articleLawggBoardEntity.getLineType())
                .build();
    }

    public ArticleLawggBoard commandToDomainEntity(ArticleInsertCommand command) {
        log.info("◆ 커맨드 객체 -> 도메인 객체");
        return ArticleLawggBoard.builder()
                .userId(command.getUserId())
                .title(command.getTitle())
                .writer(command.getWriter())
                .desc(command.getDesc())
                .dtype(command.getDtype())
                .ip(command.getIp())
                .lawFirmId(command.getLawFirmId())
                .password(command.getPassword())
                .postType(command.getPostType())
                .writerType(command.getWriterType())
                .lineType(command.getLineType())
                .build();
    }

}
