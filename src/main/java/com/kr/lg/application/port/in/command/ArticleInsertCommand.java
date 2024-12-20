package com.kr.lg.application.port.in.command;

import com.kr.lg.adapter.in.kafka.msg.ArticleBody;
import com.kr.lg.adapter.out.persistence.entities.enums.*;
import com.kr.lg.adapter.out.persistence.entities.enums.formdang.FormType;
import com.kr.lg.adapter.out.persistence.entities.enums.formdang.LoginFlag;
import com.kr.lg.adapter.out.persistence.entities.enums.lawgg.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.apache.commons.lang.StringUtils;

import java.sql.Timestamp;

@ToString
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class ArticleInsertCommand {

    // command 객체로 외부 어댑터에서 내부 도미엔으로 보내는 객체

    private Long userId; // 유저아이디

    @NotBlank(message = "title 누락")
    private String title; // 타이틀

    @NotBlank(message = "writer 누락")
    private String writer; // 작성자

    @NotBlank(message = "desc 누락")
    private String desc; // 디스크립션

    @NotNull(message = "dtype 누락")
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

    private FormType formType; // 폼 타입 ( 0: 설문, 1: 퀴즈, 2: 쪽지시험 )

    private LoginFlag loginFlag; // 로그인 플래그 (0: 비로그인, 1: 로그인)

    private Timestamp beginDt; // 폼 시작일

    private Timestamp endDt; // 폼 종료일

    private Integer maxRespondentCnt; // 인원 제한수 ( 0: 제한 없음, 1~ 제한인원)

    private String logoUrl; // 로고 URL

    private String themaUrl; // 테마 URL


    public static ArticleInsertCommand of(ArticleBody articleBody) {
        ArticleInsertCommand command = ArticleInsertCommand
                .builder()
                .userId(articleBody.getUserId())
                .title(articleBody.getTitle())
                .writer(articleBody.getWriter())
                .desc(articleBody.getDesc())
                .dtype(DType.of(articleBody.getDtype()))
                .ip(articleBody.getIp())
                .lawFirmId(articleBody.getLawFirmId())
                .password(articleBody.getPassword())
                .postType(PostType.of(articleBody.getPostType()))
                .writerType(WriterType.of(articleBody.getWriterType()))
                .lineType(LineType.of(articleBody.getLineType()))
                .tierId(articleBody.getTierId())
                .judgeId(articleBody.getJudgeId())
                .subheading(articleBody.getSubheading())
                .plaintiffOpinion(articleBody.getPlaintiffOpinion())
                .defendantOpinion(articleBody.getDefendantOpinion())
                .plaintiffName(articleBody.getPlaintiffName())
                .defendantName(articleBody.getDefendantName())
                .playVideoUrl(articleBody.getPlayVideoUrl())
                .liveBroadcastUrl(articleBody.getLiveBroadcastUrl())
                .replayFileUrl(articleBody.getReplayFileUrl())
                .thumbnail(articleBody.getThumbnail())
                .precedent(PrecedentType.of(articleBody.getPrecedent()))
                .mainType(MainType.of(articleBody.getMainType()))
                .formType(FormType.of(articleBody.getFormType()))
                .loginFlag(LoginFlag.of(articleBody.getLoginFlag()))
                .maxRespondentCnt(articleBody.getMaxRespondentCnt())
                .logoUrl(articleBody.getLogoUrl())
                .themaUrl(articleBody.getThemaUrl())
                .build();

        if (StringUtils.isNotBlank(articleBody.getBeginDt())) {
            command.beginDt = Timestamp.valueOf(articleBody.getBeginDt());
        }

        if (StringUtils.isNotBlank(articleBody.getEndDt())) {
            command.endDt = Timestamp.valueOf(articleBody.getEndDt());
        }

        return command;
    }
}
