package com.kr.lg.adapter.in.kafka.msg;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ArticleMsg {

    private Long userId;

    private String title;

    private String writer;

    private String desc;

    private Integer dtype;

    private String ip;

}
