package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "reserve_record", schema = "psc1", catalog = "")
public class ReserveRecordEntity {
    private int id;
    private Timestamp chatEndTime;
    private Timestamp chatStartTime;
    private Integer counselorScheduleId;
    private Timestamp createTime;
    private String evaluation;
    private Short flag;
    private Short status;
    private String theme;
    private Timestamp updateTime;
    private Integer userId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "chat_end_time")
    public Timestamp getChatEndTime() {
        return chatEndTime;
    }

    public void setChatEndTime(Timestamp chatEndTime) {
        this.chatEndTime = chatEndTime;
    }

    @Basic
    @Column(name = "chat_start_time")
    public Timestamp getChatStartTime() {
        return chatStartTime;
    }

    public void setChatStartTime(Timestamp chatStartTime) {
        this.chatStartTime = chatStartTime;
    }

    @Basic
    @Column(name = "counselor_schedule_id")
    public Integer getCounselorScheduleId() {
        return counselorScheduleId;
    }

    public void setCounselorScheduleId(Integer counselorScheduleId) {
        this.counselorScheduleId = counselorScheduleId;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "evaluation")
    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    @Basic
    @Column(name = "flag")
    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "status")
    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Basic
    @Column(name = "theme")
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReserveRecordEntity that = (ReserveRecordEntity) o;
        return id == that.id &&
                Objects.equals(chatEndTime, that.chatEndTime) &&
                Objects.equals(chatStartTime, that.chatStartTime) &&
                Objects.equals(counselorScheduleId, that.counselorScheduleId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(evaluation, that.evaluation) &&
                Objects.equals(flag, that.flag) &&
                Objects.equals(status, that.status) &&
                Objects.equals(theme, that.theme) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chatEndTime, chatStartTime, counselorScheduleId, createTime, evaluation, flag, status, theme, updateTime, userId);
    }
}
