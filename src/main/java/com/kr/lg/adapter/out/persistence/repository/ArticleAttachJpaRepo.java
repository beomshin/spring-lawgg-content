package com.kr.lg.adapter.out.persistence.repository;

import com.kr.lg.adapter.out.persistence.entities.ArticleAttachEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleAttachJpaRepo extends JpaRepository<ArticleAttachEntity, Long> {
}
