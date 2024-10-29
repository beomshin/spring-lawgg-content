package com.kr.lg.adapter.out.persistence.entities;

import com.kr.lg.adapter.out.persistence.entities.common.BaseEntity;
import com.kr.lg.adapter.out.persistence.entities.converter.AttachStatusConverter;
import com.kr.lg.adapter.out.persistence.entities.enums.AttachStatus;
import jakarta.persistence.*;
import lombok.ToString;

@ToString(callSuper=true, exclude = {"article"})
@Entity(name = "article_attach")
public class ArticleAttachEntity extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id")
    private ArticleEntity articleEntity;

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
