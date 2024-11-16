package com.kr.lg.application.port.in;

import com.kr.lg.application.port.in.command.ArticleCommentDeleteCommand;
import com.kr.lg.application.port.in.command.ArticleDeleteCommand;
import jakarta.validation.Valid;

public interface ArticleDeleteUseCase {

    void delete(@Valid ArticleDeleteCommand command);
    void deleteComment(@Valid ArticleCommentDeleteCommand command);
}
