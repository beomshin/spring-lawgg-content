package com.kr.lg.adapter.out.persistence.repository;

import com.kr.lg.adapter.out.persistence.entities.ArticleFormEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleFormJpaRepo extends JpaRepository<ArticleFormEntity, Long> {
}
