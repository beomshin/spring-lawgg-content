package com.kr.lg.adapter.out.persistence.repository;

import com.kr.lg.adapter.out.persistence.entities.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentJpaRepo extends JpaRepository<ArticleComment, Long> {
}
