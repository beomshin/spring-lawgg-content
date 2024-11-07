package com.kr.lg.adapter.out.persistence.entities;

import com.kr.lg.adapter.out.persistence.entities.common.BaseEntity;
import com.kr.lg.adapter.out.persistence.entities.converter.AttachStatusConverter;
import com.kr.lg.adapter.out.persistence.entities.enums.AttachStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;

@Getter
@SuperBuilder
@ToString(callSuper=true, exclude = {"articleEntity"})
@Entity(name = "article_attach")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@DynamicInsert
public class ArticleAttachEntity extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id")
    private ArticleEntity articleEntity; // article id

    @Column(name = "path")
    private String path; // 첨부파일경로

    @Column(name = "ori_name")
    private String oriName; // 실제파일이름

    @Column(name = "new_nmae")
    private String newNmae; // 생성파일이름

    @Column(name = "size")
    private Integer size; // 파일사이즈

    @Column(name = "status")
    @Convert(converter = AttachStatusConverter.class)
    private AttachStatus status; // 첨부파일 상태 ( 0: 정상, 9: 삭제)

}
