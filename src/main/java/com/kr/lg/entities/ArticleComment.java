package com.kr.lg.entities;

import com.kr.lg.entities.common.BaseEntity;
import com.kr.lg.entities.converter.TrialStatusConverter;
import com.kr.lg.entities.enums.CommentStatus;
import jakarta.persistence.*;

@Entity(name = "article_commet")
public class ArticleComment extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id")
    private Article article;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "password")
    private String password;

    @Column(name = "ip")
    private String ip;

    @Column(name = "writer")
    private String writer;

    @Column(name = "desc")
    private String desc;

    @Column(name = "order")
    private Integer order;

    @Column(name = "depth")
    private Integer depth;

    @Column(name = "report_cnt")
    private Integer reportCnt;

    @Column(name = "status")
    @Convert(converter = TrialStatusConverter.class)
    private CommentStatus status;

}
