package com.kr.lg.adapter.out.persistence.entities;

import com.kr.lg.adapter.out.persistence.entities.converter.BoardStatusConverter;
import com.kr.lg.adapter.out.persistence.entities.converter.LineTypeConverter;
import com.kr.lg.adapter.out.persistence.entities.converter.PostTypeConverter;
import com.kr.lg.adapter.out.persistence.entities.converter.WriterTypeConverter;
import com.kr.lg.adapter.out.persistence.entities.enums.BoardStatus;
import com.kr.lg.adapter.out.persistence.entities.enums.LineType;
import com.kr.lg.adapter.out.persistence.entities.enums.PostType;
import com.kr.lg.adapter.out.persistence.entities.enums.WriterType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;

@Getter
@SuperBuilder
@ToString(callSuper = true)
@Entity(name = "article_lawgg_board")
@DiscriminatorValue("0")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@DynamicInsert
public class ArticleLawggBoardEntity extends ArticleEntity {

    @Column(name = "law_firm_id")
    private Long lawFirmId; // 로펌 아이디

    @Column(name = "password")
    private String password; // 패스워드 (비회원 전용)

    @Column(name = "post_type")
    @Convert(converter = PostTypeConverter.class)
    private PostType postType; // 포스트 타입 ( 0: 일반, 1: 이미지, 2: 추천, 3: 베스트, 98: 이벤트, 99: 공지)

    @Column(name = "writer_type")
    @Convert(converter = WriterTypeConverter.class)
    private WriterType writerType; // 작성자 타입 ( 0: 비회원, 1: 회원 )

    @Column(name = "line_type")
    @Convert(converter = LineTypeConverter.class)
    private LineType lineType; // 라인 타입 ( 0:탑, 1:정글, 2: 미드, 3: 원딜, 4: 서폿 )

    @Column(name = "comment_cnt")
    private Integer commentCnt; // 댓글수

    @Column(name = "recommend_cnt")
    private Integer recommendCnt; // 추천수

    @Column(name = "view_cnt")
    private Integer viewCnt; // 조회수

    @Column(name = "report_cnt")
    private Integer reportCnt; // 신고수

    @Column(name = "status")
    @Convert(converter = BoardStatusConverter.class)
    private BoardStatus status; // 게시글 상태 ( 0: 정상, 8: 정지, 9: 삭제 )

}
