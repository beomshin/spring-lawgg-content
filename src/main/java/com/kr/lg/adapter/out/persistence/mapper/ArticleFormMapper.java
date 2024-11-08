package com.kr.lg.adapter.out.persistence.mapper;

import com.kr.lg.adapter.out.persistence.entities.ArticleFormEntity;
import com.kr.lg.application.domain.model.ArticleForm;
import com.kr.lg.application.port.in.command.ArticleInsertCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ArticleFormMapper {

    public ArticleFormEntity mapToJpaEntity(ArticleForm articleForm) {
        log.info("◆ 폼당폼당 FORM 도메인 객체 -> 엔티티 객체");
        return ArticleFormEntity.builder()
                .userId(articleForm.getUserId())
                .title(articleForm.getTitle())
                .writer(articleForm.getWriter())
                .desc(articleForm.getDesc())
                .ip(articleForm.getIp())
                .formType(articleForm.getFormType())
                .loginFlag(articleForm.getLoginFlag())
                .beginDt(articleForm.getBeginDt())
                .endDt(articleForm.getEndDt())
                .maxRespondentCnt(articleForm.getMaxRespondentCnt())
                .logoUrl(articleForm.getLogoUrl())
                .themaUrl(articleForm.getThemaUrl())
                .build();
    }

    public ArticleForm mapToDomainEntity(ArticleFormEntity articleFormEntity) {
        log.info("◆ 폼당폼당 FORM 엔티티 객체 -> 도메인 객체");
        return ArticleForm.builder()
                .userId(articleFormEntity.getUserId())
                .title(articleFormEntity.getTitle())
                .writer(articleFormEntity.getWriter())
                .desc(articleFormEntity.getDesc())
                .ip(articleFormEntity.getIp())
                .formType(articleFormEntity.getFormType())
                .loginFlag(articleFormEntity.getLoginFlag())
                .beginDt(articleFormEntity.getBeginDt())
                .endDt(articleFormEntity.getEndDt())
                .maxRespondentCnt(articleFormEntity.getMaxRespondentCnt())
                .logoUrl(articleFormEntity.getLogoUrl())
                .themaUrl(articleFormEntity.getThemaUrl())
                .questionCnt(articleFormEntity.getQuestionCnt())
                .reportCnt(articleFormEntity.getReportCnt())
                .answerCnt(articleFormEntity.getAnswerCnt())
                .status(articleFormEntity.getStatus())
                .build();
    }

    public ArticleForm commandToDomainEntity(ArticleInsertCommand command) {
        log.info("◆ 폼당폼당 FORM 커맨드 객체 -> 도메인 객체");
        return ArticleForm.builder()
                .userId(command.getUserId())
                .title(command.getTitle())
                .writer(command.getWriter())
                .desc(command.getDesc())
                .ip(command.getIp())
                .formType(command.getFormType())
                .loginFlag(command.getLoginFlag())
                .beginDt(command.getBeginDt())
                .endDt(command.getEndDt())
                .maxRespondentCnt(command.getMaxRespondentCnt())
                .logoUrl(command.getLogoUrl())
                .themaUrl(command.getThemaUrl())
                .build();
    }

}
