package com.kr.lg.entities;

import com.kr.lg.entities.common.BaseEntity;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dtype") // 조인 전략 설정 컬럼
public abstract class Article extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "title")
    private String title;

    @Column(name = "writer")
    private String writer;

    @Column(name = "desc")
    private String desc;

    @Column(name = "ip")
    private String ip;

}
