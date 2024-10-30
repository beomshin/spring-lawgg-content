package com.kr.lg.adapter.out.persistence.entities;

import com.kr.lg.adapter.out.persistence.entities.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;

@Getter
@SuperBuilder
@ToString(callSuper = true)
@Entity(name = "article")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dtype") // 조인 전략 설정 컬럼
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public abstract class ArticleEntity extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "title")
    private String title;

    @Column(name = "writer")
    private String writer;

    @Column(name = "`desc`")
    private String desc;

    @Column(name = "ip")
    private String ip;

}
