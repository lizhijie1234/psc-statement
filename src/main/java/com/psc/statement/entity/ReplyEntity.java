package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "reply", schema = "psc1", catalog = "")
public class ReplyEntity {
    private String id;
    private String answerId;
    private Timestamp createTime;
    private String replyContent;
    private Integer responderId;
    private String responderType;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "answer_id")
    public String getAnswerId() {
        return answerId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId;
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
    @Column(name = "reply_content")
    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    @Basic
    @Column(name = "responder_id")
    public Integer getResponderId() {
        return responderId;
    }

    public void setResponderId(Integer responderId) {
        this.responderId = responderId;
    }

    @Basic
    @Column(name = "responder_type")
    public String getResponderType() {
        return responderType;
    }

    public void setResponderType(String responderType) {
        this.responderType = responderType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReplyEntity that = (ReplyEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(answerId, that.answerId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(replyContent, that.replyContent) &&
                Objects.equals(responderId, that.responderId) &&
                Objects.equals(responderType, that.responderType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, answerId, createTime, replyContent, responderId, responderType);
    }
}
