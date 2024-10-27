package com.kr.lg.entities;

import com.kr.lg.entities.common.BaseEntity;
import com.kr.lg.entities.converter.AttachStatusConverter;
import com.kr.lg.entities.enums.AttachStatus;
import jakarta.persistence.*;

@Entity(name = "article_attach")
public class ArticleAttach extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id")
    private Article article;

    @Column(name = "path")
    private String path;

    @Column(name = "ori_name")
    private String oriName;

    @Column(name = "new_nmae")
    private String newNmae;

    @Column(name = "size")
    private Integer size;

    @Column(name = "status")
    @Convert(converter = AttachStatusConverter.class)
    private AttachStatus status;

}
