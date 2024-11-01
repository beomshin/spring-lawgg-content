package com.kr.lg.application.domain.model;


import com.kr.lg.adapter.out.persistence.entities.enums.*;

import lombok.*;

@ToString
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class ArticleLawggTrial {

    // 도메인 객체

    private Long userId;

    private String title;

    private String writer;

    private String desc;

    private DType dtype; // 데이터 타입 (0: 게시판, 1: 트라이얼, 2: 폼)

    private String ip;

    private Long lawFirmId;

    private Long tierId;

    private Long judgeId;

    private String subheading;

    private String plaintiffOpinion;

    private String defendantOpinion;

    private String plaintiffName;

    private String defendantName;

    private String playVideoUrl;

    private String liveBroadcastUrl;

    private String replayFileUrl;

    private String thumbnail;

    private PrecedentType precedent;

    private PostType postType;

    private MainType mainType;

    private Integer commentCnt;

    private Integer recommendCnt;

    private Integer viewCnt;

    private Integer reportCnt;

    private TrialStatus status;

}
