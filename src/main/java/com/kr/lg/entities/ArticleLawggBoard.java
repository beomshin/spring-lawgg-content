package com.kr.lg.entities;

import com.kr.lg.entities.converter.BoardStatusConverter;
import com.kr.lg.entities.converter.LineTypeConverter;
import com.kr.lg.entities.converter.PostTypeConverter;
import com.kr.lg.entities.converter.WriterTypeConverter;
import com.kr.lg.entities.enums.BoardStatus;
import com.kr.lg.entities.enums.PostType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "article_lawgg_board")
@DiscriminatorValue("LB")
public class ArticleLawggBoard extends Article{

    @Column(name = "law_firm_id")
    private Long lawFirmId;

    @Column(name = "password")
    private String password;

    @Column(name = "post_type")
    @Convert(converter = PostTypeConverter.class)
    private PostType postType;

    @Column(name = "writer_type")
    @Convert(converter = WriterTypeConverter.class)
    private Integer writerType;

    @Column(name = "line_type")
    @Convert(converter = LineTypeConverter.class)
    private Integer lineType;

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
