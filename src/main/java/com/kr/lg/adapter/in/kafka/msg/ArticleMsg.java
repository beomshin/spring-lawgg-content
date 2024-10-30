package com.kr.lg.adapter.in.kafka.msg;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor
public class ArticleMsg {

    private Long userId;

    private String title;

    private String writer;

    private String desc;

    private Integer dtype;

    private String ip;

}
