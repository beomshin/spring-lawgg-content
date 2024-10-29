package com.kr.lg.adapter.out.persistence.repository;

import com.kr.lg.adapter.out.persistence.entities.ArticleCommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentJpaRepo extends JpaRepository<ArticleCommentEntity, Long> {
}
