package com.kr.lg.adapter.out.persistence.entities;

import com.kr.lg.adapter.out.persistence.entities.converter.MainTypeConverter;
import com.kr.lg.adapter.out.persistence.entities.converter.PostTypeConverter;
import com.kr.lg.adapter.out.persistence.entities.converter.PrecedentTypeConverter;
import com.kr.lg.adapter.out.persistence.entities.converter.TrialStatusConverter;
import com.kr.lg.adapter.out.persistence.entities.enums.lawgg.MainType;
import com.kr.lg.adapter.out.persistence.entities.enums.lawgg.PostType;
import com.kr.lg.adapter.out.persistence.entities.enums.lawgg.PrecedentType;
import com.kr.lg.adapter.out.persistence.entities.enums.lawgg.TrialStatus;
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
@Entity(name = "article_lawgg_trial")
@DiscriminatorValue("1")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@DynamicInsert
public class ArticleLawggTrialEntity extends ArticleEntity {

    @Column(name = "law_firm_id")
    private Long lawFirmId; // 로펌 아이디

    @Column(name = "tier_id")
    private Long tierId; // 티어 아이디

    @Column(name = "judge_id")
    private Long judgeId; // 판사 아이디

    @Column(name = "subheading")
    private String subheading; // 소제목

    @Column(name = "plaintiff_opinion")
    private String plaintiffOpinion; // 원고 의견

    @Column(name = "defendant_opinion")
    private String defendantOpinion; // 피고 의견

    @Column(name = "plaintiff_name")
    private String plaintiffName; // 원고명

    @Column(name = "defendant_name")
    private String defendantName; // 피고명

    @Column(name = "play_video_url")
    private String playVideoUrl; // 플레이 비디오 URL

    @Column(name = "live_broadcast_url")
    private String liveBroadcastUrl; // 라이브방송 URL

    @Column(name = "replay_file_url")
    private String replayFileUrl; // 리플레이 파일 URL

    @Column(name = "thumbnail")
    private String thumbnail; // 썸네일

    @Column(name = "precedent")
    @Convert(converter = PrecedentTypeConverter.class)
    private PrecedentType precedent; // 판례 ( 0: 원공 승, 1: 피고 승, 9: 진행중)

    @Column(name = "post_type")
    @Convert(converter = PostTypeConverter.class)
    private PostType postType; // 포스트 타입 ( 0: 일반, 1: 이미지, 2: 추천, 3: 베스트, 98: 이벤트, 99: 공지)

    @Column(name = "main_type")
    @Convert(converter = MainTypeConverter.class)
    private MainType mainType; // 메인 트라이얼 게시 여부 ( 0: 일반, 1: 메인 )

    @Column(name = "comment_cnt")
    private Integer commentCnt; // 댓글수

    @Column(name = "recommend_cnt")
    private Integer recommendCnt; // 추천수

    @Column(name = "view_cnt")
    private Integer viewCnt; // 조회수

    @Column(name = "report_cnt")
    private Integer reportCnt; // 신고수

    @Column(name = "status")
    @Convert(converter = TrialStatusConverter.class)
    private TrialStatus status; // 상태 ( 0: 일반, 1: 종료, 2:업로드상태, 3: 업로드 실패, 4: 라이브방송, 8: 정지, 9:삭제)

}
