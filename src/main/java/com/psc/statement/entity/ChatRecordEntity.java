package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "chat_record", schema = "psc1", catalog = "")
public class ChatRecordEntity {
    private int id;
    private String content;
    private Integer contentType;
    private Timestamp createTime;
    private Integer directionId;
    private Integer ifSended;
    private Integer messageType;
    private String receiverName;
    private String senderName;
    private Integer sessionId;
    private Timestamp updateTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "content_type")
    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
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
    @Column(name = "direction_id")
    public Integer getDirectionId() {
        return directionId;
    }

    public void setDirectionId(Integer directionId) {
        this.directionId = directionId;
    }

    @Basic
    @Column(name = "if_sended")
    public Integer getIfSended() {
        return ifSended;
    }

    public void setIfSended(Integer ifSended) {
        this.ifSended = ifSended;
    }

    @Basic
    @Column(name = "message_type")
    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    @Basic
    @Column(name = "receiver_name")
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Basic
    @Column(name = "sender_name")
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    @Basic
    @Column(name = "session_id")
    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatRecordEntity that = (ChatRecordEntity) o;
        return id == that.id &&
                Objects.equals(content, that.content) &&
                Objects.equals(contentType, that.contentType) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(directionId, that.directionId) &&
                Objects.equals(ifSended, that.ifSended) &&
                Objects.equals(messageType, that.messageType) &&
                Objects.equals(receiverName, that.receiverName) &&
                Objects.equals(senderName, that.senderName) &&
                Objects.equals(sessionId, that.sessionId) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, contentType, createTime, directionId, ifSended, messageType, receiverName, senderName, sessionId, updateTime);
    }
}
