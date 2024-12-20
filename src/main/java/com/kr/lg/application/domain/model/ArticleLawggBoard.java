package com.kr.lg.application.domain.model;

import com.kr.lg.adapter.out.persistence.entities.enums.DType;
import com.kr.lg.adapter.out.persistence.entities.enums.lawgg.LineType;
import com.kr.lg.adapter.out.persistence.entities.enums.lawgg.PostType;
import com.kr.lg.adapter.out.persistence.entities.enums.lawgg.WriterType;
import lombok.*;

@ToString
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class ArticleLawggBoard {

    // 도메인 객체

    private Long userId;

    private String title;

    private String writer;

    private String desc;

    private DType dtype;

    private String ip;

    private Long lawFirmId;

    private String password;

    private PostType postType;

    private WriterType writerType;

    private LineType lineType;

}
