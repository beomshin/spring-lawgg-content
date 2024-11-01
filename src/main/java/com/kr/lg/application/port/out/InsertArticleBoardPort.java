package com.kr.lg.application.port.out;

import com.kr.lg.application.domain.model.ArticleLawggBoard;
import com.kr.lg.application.domain.model.ArticleLawggTrial;

public interface InsertArticleBoardPort {

    void insertArticleLawggBoard(ArticleLawggBoard board);

    void insertArticleLawggTrial(ArticleLawggTrial trial);
}
