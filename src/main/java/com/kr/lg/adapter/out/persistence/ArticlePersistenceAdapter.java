package com.kr.lg.adapter.out.persistence;


import com.kr.lg.adapter.out.persistence.entities.ArticleCommentEntity;
import com.kr.lg.adapter.out.persistence.entities.ArticleFormEntity;
import com.kr.lg.adapter.out.persistence.entities.ArticleLawggBoardEntity;
import com.kr.lg.adapter.out.persistence.entities.ArticleLawggTrialEntity;
import com.kr.lg.adapter.out.persistence.mapper.ArticleBoardMapper;
import com.kr.lg.adapter.out.persistence.mapper.ArticleCommentMapper;
import com.kr.lg.adapter.out.persistence.mapper.ArticleFormMapper;
import com.kr.lg.adapter.out.persistence.mapper.ArticleTrialMapper;
import com.kr.lg.adapter.out.persistence.repository.ArticleCommentJpaRepo;
import com.kr.lg.adapter.out.persistence.repository.ArticleFormJpaRepo;
import com.kr.lg.adapter.out.persistence.repository.ArticleLawggBoardJpaRepo;
import com.kr.lg.adapter.out.persistence.repository.ArticleLawggTrialJpaRepo;
import com.kr.lg.application.domain.model.ArticleComment;
import com.kr.lg.application.domain.model.ArticleForm;
import com.kr.lg.application.domain.model.ArticleLawggBoard;
import com.kr.lg.application.domain.model.ArticleLawggTrial;
import com.kr.lg.application.port.out.InsertArticleBoardPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
@RequiredArgsConstructor
public class ArticlePersistenceAdapter implements InsertArticleBoardPort {

    private final ArticleBoardMapper articleBoardMapper;
    private final ArticleTrialMapper articleTrialMapper;
    private final ArticleFormMapper articleFormMapper;
    private final ArticleCommentMapper articleCommentMapper;
    private final ArticleLawggBoardJpaRepo articleLawggBoardJpaRepo;
    private final ArticleLawggTrialJpaRepo articleLawggTrialJpaRepo;
    private final ArticleFormJpaRepo articleFormJpaRepo;
    private final ArticleCommentJpaRepo articleCommentJpaRepo;

    @Override
    @Transactional
    public void insertArticleLawggBoard(ArticleLawggBoard board) {
        log.info("◆ LAWGG BOARD 게시판 등록 영속성 로직 수행");
        ArticleLawggBoardEntity boardEntity = articleBoardMapper.mapToJpaEntity(board); // domain -> entity 객체로 변경
        log.info("◆ LAWGG BOARD 게시판 영속성 엔티티 저장 수행");
        articleLawggBoardJpaRepo.save(boardEntity);
    }

    @Override
    @Transactional
    public void insertArticleLawggTrial(ArticleLawggTrial trial) {
        log.info("◆ LAWGG TRIAL 게시판 등록 영속성 로직 수행");
        ArticleLawggTrialEntity boardEntity = articleTrialMapper.mapToJpaEntity(trial); // domain -> entity 객체로 변경
        log.info("◆ LAWGG TRIAL 게시판 영속성 엔티티 저장 수행");
        articleLawggTrialJpaRepo.save(boardEntity);
    }

    @Override
    @Transactional
    public void insertArticleForm(ArticleForm form) {
        log.info("◆ 폼당폼당 FORM 등록 영속성 로직 수행");
        ArticleFormEntity formEntity = articleFormMapper.mapToJpaEntity(form); // domain -> entity 객체로 변경
        log.info("◆ 폼당폼당 FORM 게시판 영속성 엔티티 저장 수행");
        articleFormJpaRepo.save(formEntity);
    }

    @Override
    @Transactional
    public void insertArticleComment(ArticleComment comment) {
        log.info("◆ 댓글 등록 영속성 로직 수행");
        ArticleCommentEntity commentEntity = articleCommentMapper.mapToJpaEntity(comment);
        log.info("◆ 댓글 게시판 영속성 엔티티 저장 수행");
        articleCommentJpaRepo.save(commentEntity);
    }

}
