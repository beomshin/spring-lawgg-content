package com.kr.lg.adapter.out.persistence.mapper;

import com.kr.lg.adapter.out.persistence.entities.ArticleLawggTrialEntity;
import com.kr.lg.application.domain.model.ArticleLawggTrial;
import com.kr.lg.application.port.in.command.ArticleInsertCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ArticleTrialMapper {

    public ArticleLawggTrialEntity mapToJpaEntity(ArticleLawggTrial articleLawggTrial) {
        log.info("◆ LAWGG TRIAL 도메인 객체 -> 엔티티 객체");
        return ArticleLawggTrialEntity.builder()
                .userId(articleLawggTrial.getUserId())
                .title(articleLawggTrial.getTitle())
                .writer(articleLawggTrial.getWriter())
                .desc(articleLawggTrial.getDesc())
                .ip(articleLawggTrial.getIp())
                .lawFirmId(articleLawggTrial.getLawFirmId())
                .tierId(articleLawggTrial.getTierId())
                .judgeId(articleLawggTrial.getJudgeId())
                .subheading(articleLawggTrial.getSubheading())
                .plaintiffOpinion(articleLawggTrial.getPlaintiffOpinion())
                .defendantOpinion(articleLawggTrial.getDefendantOpinion())
                .plaintiffName(articleLawggTrial.getPlaintiffName())
                .defendantName(articleLawggTrial.getDefendantName())
                .playVideoUrl(articleLawggTrial.getPlayVideoUrl())
                .liveBroadcastUrl(articleLawggTrial.getLiveBroadcastUrl())
                .replayFileUrl(articleLawggTrial.getReplayFileUrl())
                .thumbnail(articleLawggTrial.getThumbnail())
                .precedent(articleLawggTrial.getPrecedent())
                .postType(articleLawggTrial.getPostType())
                .mainType(articleLawggTrial.getMainType())
                .build();
    }

    public ArticleLawggTrial mapToDomainEntity(ArticleLawggTrialEntity articleLawggTrialEntity) {
        log.info("◆ LAWGG TRIAL 엔티티 객체 -> 도메인 객체");
        return ArticleLawggTrial.builder()
                .userId(articleLawggTrialEntity.getUserId())
                .title(articleLawggTrialEntity.getTitle())
                .writer(articleLawggTrialEntity.getWriter())
                .desc(articleLawggTrialEntity.getDesc())
                .ip(articleLawggTrialEntity.getIp())
                .lawFirmId(articleLawggTrialEntity.getLawFirmId())
                .tierId(articleLawggTrialEntity.getTierId())
                .judgeId(articleLawggTrialEntity.getJudgeId())
                .subheading(articleLawggTrialEntity.getSubheading())
                .plaintiffOpinion(articleLawggTrialEntity.getPlaintiffOpinion())
                .defendantOpinion(articleLawggTrialEntity.getDefendantOpinion())
                .plaintiffName(articleLawggTrialEntity.getPlaintiffName())
                .defendantName(articleLawggTrialEntity.getDefendantName())
                .playVideoUrl(articleLawggTrialEntity.getPlayVideoUrl())
                .liveBroadcastUrl(articleLawggTrialEntity.getLiveBroadcastUrl())
                .replayFileUrl(articleLawggTrialEntity.getReplayFileUrl())
                .thumbnail(articleLawggTrialEntity.getThumbnail())
                .precedent(articleLawggTrialEntity.getPrecedent())
                .postType(articleLawggTrialEntity.getPostType())
                .mainType(articleLawggTrialEntity.getMainType())
                .commentCnt(articleLawggTrialEntity.getCommentCnt())
                .recommendCnt(articleLawggTrialEntity.getRecommendCnt())
                .viewCnt(articleLawggTrialEntity.getViewCnt())
                .reportCnt(articleLawggTrialEntity.getReportCnt())
                .status(articleLawggTrialEntity.getStatus())
                .build();
    }

    public ArticleLawggTrial commandToDomainEntity(ArticleInsertCommand command) {
        log.info("◆ LAWGG TRIAL 커맨드 객체 -> 도메인 객체");
        return ArticleLawggTrial.builder()
                .userId(command.getUserId())
                .title(command.getTitle())
                .writer(command.getWriter())
                .desc(command.getDesc())
                .dtype(command.getDtype())
                .ip(command.getIp())
                .lawFirmId(command.getLawFirmId())
                .tierId(command.getTierId())
                .judgeId(command.getJudgeId())
                .subheading(command.getSubheading())
                .plaintiffOpinion(command.getPlaintiffOpinion())
                .defendantOpinion(command.getDefendantOpinion())
                .plaintiffName(command.getPlaintiffName())
                .defendantName(command.getDefendantName())
                .playVideoUrl(command.getPlayVideoUrl())
                .liveBroadcastUrl(command.getLiveBroadcastUrl())
                .replayFileUrl(command.getReplayFileUrl())
                .thumbnail(command.getThumbnail())
                .precedent(command.getPrecedent())
                .postType(command.getPostType())
                .mainType(command.getMainType())
                .build();
    }

}
