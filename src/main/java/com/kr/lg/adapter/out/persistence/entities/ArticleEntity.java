package com.kr.lg.adapter.out.persistence.entities;

import com.kr.lg.adapter.out.persistence.entities.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;

@Getter
@SuperBuilder
@ToString(callSuper = true)
@Entity(name = "article")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dtype") // 조인 전략 설정 컬럼, 데이터 타입 (0: 게시판, 1: 트라이얼, 2: 폼)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@DynamicInsert
public abstract class ArticleEntity extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id; // 식별값

    @Column(name = "user_id")
    private Long userId; // 유저아이디

    @Column(name = "title")
    private String title; // 타이틀

    @Column(name = "writer")
    private String writer; // 작성자

    @Column(name = "`desc`")
    private String desc; // 디스크립션

    @Column(name = "ip")
    private String ip; // ip

}
