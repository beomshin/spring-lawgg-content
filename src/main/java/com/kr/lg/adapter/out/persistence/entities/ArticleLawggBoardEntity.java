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
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class ArticleLawggBoardEntity extends ArticleEntity {

    @Column(name = "law_firm_id")
    private Long lawFirmId;

    @Column(name = "password")
    private String password;

    @Column(name = "post_type")
    @Convert(converter = PostTypeConverter.class)
    private PostType postType;

    @Column(name = "writer_type")
    @Convert(converter = WriterTypeConverter.class)
    private WriterType writerType;

    @Column(name = "line_type")
    @Convert(converter = LineTypeConverter.class)
    private LineType lineType;

    @Column(name = "comment_cnt")
    private Integer commentCnt;

    @Column(name = "recommend_cnt")
    private Integer recommendCnt;

    @Column(name = "view_cnt")
    private Integer viewCnt;

    @Column(name = "report_cnt")
    private Integer reportCnt;

    @Column(name = "status")
    @Convert(converter = BoardStatusConverter.class)
    private BoardStatus status;

}
