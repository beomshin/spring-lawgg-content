package com.kr.lg.adapter.out.persistence.mapper;

import com.kr.lg.adapter.out.persistence.entities.ArticleCommentEntity;
import com.kr.lg.application.domain.model.ArticleComment;
import com.kr.lg.application.port.in.command.ArticleCommentInsertCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ArticleCommentMapper {

    public ArticleCommentEntity mapToJpaEntity(ArticleComment articleComment) {
        log.info("◆ 댓글 도메인 객체 -> 엔티티 객체");
        return ArticleCommentEntity.builder()
                .articleId(articleComment.getArticleId())
                .userId(articleComment.getUserId())
                .parentId(articleComment.getParentId())
                .password(articleComment.getPassword())
                .ip(articleComment.getIp())
                .writer(articleComment.getWriter())
                .desc(articleComment.getDesc())
                .order(articleComment.getOrder())
                .build();
    }

    public ArticleComment mapToDomainEntity(ArticleCommentEntity articleCommentEntity) {
        log.info("◆ 댓글 엔티티 객체 -> 도메인 객체");
        return ArticleComment.builder()
                .id(articleCommentEntity.getId())
                .articleId(articleCommentEntity.getArticleId())
                .userId(articleCommentEntity.getUserId())
                .parentId(articleCommentEntity.getParentId())
                .password(articleCommentEntity.getPassword())
                .ip(articleCommentEntity.getIp())
                .writer(articleCommentEntity.getWriter())
                .desc(articleCommentEntity.getDesc())
                .order(articleCommentEntity.getOrder())
                .depth(articleCommentEntity.getDepth())
                .reportCnt(articleCommentEntity.getReportCnt())
                .status(articleCommentEntity.getStatus())
                .build();
    }

    public ArticleComment commandToDomainEntity(ArticleCommentInsertCommand command) {
        log.info("◆ 댓글 커맨드 객체 -> 도메인 객체");
        return ArticleComment.builder()
                .articleId(command.getArticleId())
                .userId(command.getUserId())
                .parentId(command.getParentId())
                .password(command.getPassword())
                .ip(command.getIp())
                .writer(command.getWriter())
                .desc(command.getDesc())
                .order(command.getOrder())
                .build();
    }

}
