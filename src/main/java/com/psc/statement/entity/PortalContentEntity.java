package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "portal_content", schema = "psc1", catalog = "")
public class PortalContentEntity {
    private int id;
    private String contentTitle;
    private String contentFrom;
    private String contentContent;
    private int blockId;
    private Integer organizationId;
    private Integer createId;
    private Timestamp createTime;
    private Integer editId;
    private Timestamp editTime;
    private String userType;
    private String contentStatus;
    private String auditStatus;
    private Integer auditId;
    private Timestamp auditTime;
    private String auditAdvise;
    private String extend1;
    private String extend2;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content_title")
    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }

    @Basic
    @Column(name = "content_from")
    public String getContentFrom() {
        return contentFrom;
    }

    public void setContentFrom(String contentFrom) {
        this.contentFrom = contentFrom;
    }

    @Basic
    @Column(name = "content_content")
    public String getContentContent() {
        return contentContent;
    }

    public void setContentContent(String contentContent) {
        this.contentContent = contentContent;
    }

    @Basic
    @Column(name = "block_id")
    public int getBlockId() {
        return blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }

    @Basic
    @Column(name = "organization_id")
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "create_id")
    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
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
    @Column(name = "edit_id")
    public Integer getEditId() {
        return editId;
    }

    public void setEditId(Integer editId) {
        this.editId = editId;
    }

    @Basic
    @Column(name = "edit_time")
    public Timestamp getEditTime() {
        return editTime;
    }

    public void setEditTime(Timestamp editTime) {
        this.editTime = editTime;
    }

    @Basic
    @Column(name = "user_type")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "content_status")
    public String getContentStatus() {
        return contentStatus;
    }

    public void setContentStatus(String contentStatus) {
        this.contentStatus = contentStatus;
    }

    @Basic
    @Column(name = "audit_status")
    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    @Basic
    @Column(name = "audit_id")
    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
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
    @Column(name = "audit_advise")
    public String getAuditAdvise() {
        return auditAdvise;
    }

    public void setAuditAdvise(String auditAdvise) {
        this.auditAdvise = auditAdvise;
    }

    @Basic
    @Column(name = "extend1")
    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    @Basic
    @Column(name = "extend2")
    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PortalContentEntity that = (PortalContentEntity) o;
        return id == that.id &&
                blockId == that.blockId &&
                Objects.equals(contentTitle, that.contentTitle) &&
                Objects.equals(contentFrom, that.contentFrom) &&
                Objects.equals(contentContent, that.contentContent) &&
                Objects.equals(organizationId, that.organizationId) &&
                Objects.equals(createId, that.createId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(editId, that.editId) &&
                Objects.equals(editTime, that.editTime) &&
                Objects.equals(userType, that.userType) &&
                Objects.equals(contentStatus, that.contentStatus) &&
                Objects.equals(auditStatus, that.auditStatus) &&
                Objects.equals(auditId, that.auditId) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(auditAdvise, that.auditAdvise) &&
                Objects.equals(extend1, that.extend1) &&
                Objects.equals(extend2, that.extend2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contentTitle, contentFrom, contentContent, blockId, organizationId, createId, createTime, editId, editTime, userType, contentStatus, auditStatus, auditId, auditTime, auditAdvise, extend1, extend2);
    }
}
