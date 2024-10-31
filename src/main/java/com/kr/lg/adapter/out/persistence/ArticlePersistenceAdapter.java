package com.kr.lg.adapter.out.persistence;


import com.kr.lg.adapter.out.persistence.entities.ArticleLawggBoardEntity;
import com.kr.lg.adapter.out.persistence.mapper.ArticleBoardMapper;
import com.kr.lg.adapter.out.persistence.repository.ArticleLawggBoardJpaRepo;
import com.kr.lg.application.domain.model.ArticleLawggBoard;
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
    private final ArticleLawggBoardJpaRepo articleLawggBoardJpaRepo;

    @Override
    @Transactional
    public void insertArticleBoard(ArticleLawggBoard board) {
        log.info("◆ 게시판 등록 영속성 로직 수행");
        ArticleLawggBoardEntity boardEntity = articleBoardMapper.mapToJpaEntity(board); // domain -> entity 객체로 변경
        log.info("◆ 게시판 영속성 엔티티 저장 수행");
        articleLawggBoardJpaRepo.save(boardEntity);
    }

}
