package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "supervision_opinion", schema = "psc1", catalog = "")
public class SupervisionOpinionEntity {
    private int id;
    private String supervisionOpinionSummary;
    private String supervisionDetail;
    private String submitter;
    private Timestamp submitTime;
    private String supervisionReply;
    private String repler;
    private Timestamp replyTime;
    private int projectId;
    private int opinionStatus;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "supervision_opinion_summary")
    public String getSupervisionOpinionSummary() {
        return supervisionOpinionSummary;
    }

    public void setSupervisionOpinionSummary(String supervisionOpinionSummary) {
        this.supervisionOpinionSummary = supervisionOpinionSummary;
    }

    @Basic
    @Column(name = "supervision_detail")
    public String getSupervisionDetail() {
        return supervisionDetail;
    }

    public void setSupervisionDetail(String supervisionDetail) {
        this.supervisionDetail = supervisionDetail;
    }

    @Basic
    @Column(name = "submitter")
    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    @Basic
    @Column(name = "submit_time")
    public Timestamp getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Timestamp submitTime) {
        this.submitTime = submitTime;
    }

    @Basic
    @Column(name = "supervision_reply")
    public String getSupervisionReply() {
        return supervisionReply;
    }

    public void setSupervisionReply(String supervisionReply) {
        this.supervisionReply = supervisionReply;
    }

    @Basic
    @Column(name = "repler")
    public String getRepler() {
        return repler;
    }

    public void setRepler(String repler) {
        this.repler = repler;
    }

    @Basic
    @Column(name = "reply_time")
    public Timestamp getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Timestamp replyTime) {
        this.replyTime = replyTime;
    }

    @Basic
    @Column(name = "project_id")
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Basic
    @Column(name = "opinion_status")
    public int getOpinionStatus() {
        return opinionStatus;
    }

    public void setOpinionStatus(int opinionStatus) {
        this.opinionStatus = opinionStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupervisionOpinionEntity that = (SupervisionOpinionEntity) o;
        return id == that.id &&
                projectId == that.projectId &&
                opinionStatus == that.opinionStatus &&
                Objects.equals(supervisionOpinionSummary, that.supervisionOpinionSummary) &&
                Objects.equals(supervisionDetail, that.supervisionDetail) &&
                Objects.equals(submitter, that.submitter) &&
                Objects.equals(submitTime, that.submitTime) &&
                Objects.equals(supervisionReply, that.supervisionReply) &&
                Objects.equals(repler, that.repler) &&
                Objects.equals(replyTime, that.replyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, supervisionOpinionSummary, supervisionDetail, submitter, submitTime, supervisionReply, repler, replyTime, projectId, opinionStatus);
    }
}
