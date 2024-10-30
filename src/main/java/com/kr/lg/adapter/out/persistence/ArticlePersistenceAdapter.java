package com.kr.lg.adapter.out.persistence;


import com.kr.lg.adapter.out.persistence.entities.ArticleLawggBoardEntity;
import com.kr.lg.adapter.out.persistence.mapper.ArticleBoardMapper;
import com.kr.lg.adapter.out.persistence.repository.ArticleLawggBoardJpaRepo;
import com.kr.lg.application.domain.model.ArticleLawggBoard;
import com.kr.lg.application.port.out.InsertArticleBoardPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ArticlePersistenceAdapter implements InsertArticleBoardPort {

    private final ArticleBoardMapper articleBoardMapper;
    private final ArticleLawggBoardJpaRepo articleLawggBoardJpaRepo;

    @Override
    public void insertArticleBoard(ArticleLawggBoard board) {

        ArticleLawggBoardEntity boardEntity= articleBoardMapper.mapToJpaEntity(board);

        articleLawggBoardJpaRepo.save(boardEntity);

    }

}