package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "counselor_update_application", schema = "psc1", catalog = "")
public class CounselorUpdateApplicationEntity {
    private int id;
    private Integer applierId;
    private Timestamp applyTime;
    private Timestamp auditTime;
    private Integer auditorId;
    private String certificate;
    private String content;
    private String feedback;
    private String status;
    private String title;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "applier_id")
    public Integer getApplierId() {
        return applierId;
    }

    public void setApplierId(Integer applierId) {
        this.applierId = applierId;
    }

    @Basic
    @Column(name = "apply_time")
    public Timestamp getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Timestamp applyTime) {
        this.applyTime = applyTime;
    }

    @Basic
    @Column(name = "audit_time")
    public Timestamp getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Timestamp auditTime) {
        this.auditTime = auditTime;
    }

    @Basic
    @Column(name = "auditor_id")
    public Integer getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Integer auditorId) {
        this.auditorId = auditorId;
    }

    @Basic
    @Column(name = "certificate")
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
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
    @Column(name = "feedback")
    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CounselorUpdateApplicationEntity that = (CounselorUpdateApplicationEntity) o;
        return id == that.id &&
                Objects.equals(applierId, that.applierId) &&
                Objects.equals(applyTime, that.applyTime) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(auditorId, that.auditorId) &&
                Objects.equals(certificate, that.certificate) &&
                Objects.equals(content, that.content) &&
                Objects.equals(feedback, that.feedback) &&
                Objects.equals(status, that.status) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, applierId, applyTime, auditTime, auditorId, certificate, content, feedback, status, title);
    }
}
