package com.kr.lg.adapter.out.persistence.entities;

import com.kr.lg.adapter.out.persistence.entities.common.BaseEntity;
import com.kr.lg.adapter.out.persistence.entities.converter.TrialStatusConverter;
import com.kr.lg.adapter.out.persistence.entities.enums.CommentStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;

@Getter
@SuperBuilder
@ToString(callSuper=true)
@Entity(name = "article_commet")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@DynamicInsert
public class ArticleCommentEntity extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id; // 식별자

    @JoinColumn(name = "article_id")
    private Long articleId; // article key

    @Column(name = "user_id")
    private Long userId; // 유저아이디

    @Column(name = "parent_id")
    private Long parentId; // 댓글 부모키

    @Column(name = "password")
    private String password; // 패스워드 (비회원 전용)

    @Column(name = "ip")
    private String ip; // ip

    @Column(name = "writer")
    private String writer; // 작성자

    @Column(name = "`desc`")
    private String desc; // 디스크립션

    @Column(name = "`order`")
    private Integer order; // 순번

    @Column(name = "depth")
    private Integer depth; // 댓글 depth ( 0: root, 1 ~ )

    @Column(name = "report_cnt")
    private Integer reportCnt; // 신고수

    @Column(name = "status")
    @Convert(converter = TrialStatusConverter.class)
    private CommentStatus status; // 상태 ( 0: 정상, 8: 정지, 9: 삭제)

}
