package com.kr.lg.adapter.out.persistence.entities;

import com.kr.lg.adapter.out.persistence.entities.converter.MainTypeConverter;
import com.kr.lg.adapter.out.persistence.entities.converter.PostTypeConverter;
import com.kr.lg.adapter.out.persistence.entities.converter.PrecedentTypeConverter;
import com.kr.lg.adapter.out.persistence.entities.converter.TrialStatusConverter;
import com.kr.lg.adapter.out.persistence.entities.enums.MainType;
import com.kr.lg.adapter.out.persistence.entities.enums.PostType;
import com.kr.lg.adapter.out.persistence.entities.enums.PrecedentType;
import com.kr.lg.adapter.out.persistence.entities.enums.TrialStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;

@Getter
@SuperBuilder
@ToString(callSuper = true)
@Entity(name = "article_lawgg_trial")
@DiscriminatorValue("1")
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class ArticleLawggTrialEntity extends ArticleEntity {

    @Column(name = "law_firm_id")
    private Long lawFirmId;

    @Column(name = "tier_id")
    private Long tierId;

    @Column(name = "judge_id")
    private Long judgeId;

    @Column(name = "subheading")
    private String subheading;

    @Column(name = "plaintiff_opinion")
    private String plaintiffOpinion;

    @Column(name = "defendant_opinion")
    private String defendantOpinion;

    @Column(name = "plaintiff_name")
    private String plaintiffName;

    @Column(name = "defendant_name")
    private String defendantName;

    @Column(name = "play_video_url")
    private String playVideoUrl;

    @Column(name = "live_broadcast_url")
    private String liveBroadcastUrl;

    @Column(name = "replay_file_url")
    private String replayFileUrl;

    @Column(name = "thumbnail")
    private String thumbnail;

    @Column(name = "precedent")
    @Convert(converter = PrecedentTypeConverter.class)
    private PrecedentType precedent;

    @Column(name = "post_type")
    @Convert(converter = PostTypeConverter.class)
    private PostType postType;

    @Column(name = "main_type")
    @Convert(converter = MainTypeConverter.class)
    private MainType mainType;

    @Column(name = "comment_cnt")
    private Integer commentCnt;

    @Column(name = "recommend_cnt")
    private Integer recommendCnt;

    @Column(name = "view_cnt")
    private Integer viewCnt;

    @Column(name = "report_cnt")
    private Integer reportCnt;

    @Column(name = "status")
    @Convert(converter = TrialStatusConverter.class)
    private TrialStatus status;

}
