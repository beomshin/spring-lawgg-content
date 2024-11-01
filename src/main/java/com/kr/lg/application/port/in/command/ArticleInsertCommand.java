package com.kr.lg.application.port.in.command;

import com.kr.lg.adapter.in.kafka.msg.ArticleMsg;
import com.kr.lg.adapter.out.persistence.entities.enums.*;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class ArticleInsertCommand {

    // command 객체로 외부 어댑터에서 내부 도미엔으로 보내는 객체

    private Long userId; // 유저아이디

    private String title; // 타이틀

    private String writer; // 작성자

    private String desc; // 디스크립션

    private DType dtype; // 데이터 타입 (0: 게시판, 1: 트라이얼, 2: 폼)

    private String ip; // ip

    private Long lawFirmId; // 로펌 아이디

    private String password; // 패스워드 (비회원 전용)

    private PostType postType; // 포스트 타입 ( 0: 일반, 1: 이미지, 2: 추천, 3: 베스트, 98: 이벤트, 99: 공지)

    private WriterType writerType; // 작성자 타입 ( 0: 비회원, 1: 회원 )

    private LineType lineType; // 라인 타입 ( 0:탑, 1:정글, 2: 미드, 3: 원딜, 4: 서폿 )

    private Long tierId; // 티어 아이디

    private Long judgeId; // 판사 아이디

    private String subheading; // 소제목

    private String plaintiffOpinion; // 원고 의견

    private String defendantOpinion; // 피고 의견

    private String plaintiffName; // 원고명

    private String defendantName; // 피고명

    private String playVideoUrl; // 플레이 비디오 URL

    private String liveBroadcastUrl; // 라이브방송 URL

    private String replayFileUrl; // 리플레이 파일 URL

    private String thumbnail; // 썸네일

    private PrecedentType precedent; // 판례 ( 0: 원공 승, 1: 피고 승, 9: 진행중)

    private MainType mainType; // 메인 트라이얼 게시 여부 ( 0: 일반, 1: 메인 )


    public static ArticleInsertCommand of(ArticleMsg articleMsg) {
        return ArticleInsertCommand
                .builder()
                .userId(articleMsg.getUserId())
                .title(articleMsg.getTitle())
                .writer(articleMsg.getWriter())
                .desc(articleMsg.getDesc())
                .dtype(DType.of(articleMsg.getDtype()))
                .ip(articleMsg.getIp())
                .lawFirmId(articleMsg.getLawFirmId())
                .password(articleMsg.getPassword())
                .postType(PostType.of(articleMsg.getPostType()))
                .writerType(WriterType.of(articleMsg.getWriterType()))
                .lineType(LineType.of(articleMsg.getLineType()))
                .tierId(articleMsg.getTierId())
                .judgeId(articleMsg.getJudgeId())
                .subheading(articleMsg.getSubheading())
                .plaintiffOpinion(articleMsg.getPlaintiffOpinion())
                .defendantOpinion(articleMsg.getDefendantOpinion())
                .plaintiffName(articleMsg.getPlaintiffName())
                .defendantName(articleMsg.getDefendantName())
                .playVideoUrl(articleMsg.getPlayVideoUrl())
                .liveBroadcastUrl(articleMsg.getLiveBroadcastUrl())
                .replayFileUrl(articleMsg.getReplayFileUrl())
                .thumbnail(articleMsg.getThumbnail())
                .precedent(PrecedentType.of(articleMsg.getPrecedent()))
                .mainType(MainType.of(articleMsg.getMainType()))
                .build();
    }
}
