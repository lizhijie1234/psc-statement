package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "import_task", schema = "psc1", catalog = "")
public class ImportTaskEntity {
    private int id;
    private int templateId;
    private String status;
    private String url;
    private int importUserId;
    private Integer checkUserId;
    private String autoCheckLog;
    private String checkLog;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String fileName;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "template_id")
    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
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
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "import_user_id")
    public int getImportUserId() {
        return importUserId;
    }

    public void setImportUserId(int importUserId) {
        this.importUserId = importUserId;
    }

    @Basic
    @Column(name = "check_user_id")
    public Integer getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Integer checkUserId) {
        this.checkUserId = checkUserId;
    }

    @Basic
    @Column(name = "auto_check_log")
    public String getAutoCheckLog() {
        return autoCheckLog;
    }

    public void setAutoCheckLog(String autoCheckLog) {
        this.autoCheckLog = autoCheckLog;
    }

    @Basic
    @Column(name = "check_log")
    public String getCheckLog() {
        return checkLog;
    }

    public void setCheckLog(String checkLog) {
        this.checkLog = checkLog;
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
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "file_name")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImportTaskEntity that = (ImportTaskEntity) o;
        return id == that.id &&
                templateId == that.templateId &&
                importUserId == that.importUserId &&
                Objects.equals(status, that.status) &&
                Objects.equals(url, that.url) &&
                Objects.equals(checkUserId, that.checkUserId) &&
                Objects.equals(autoCheckLog, that.autoCheckLog) &&
                Objects.equals(checkLog, that.checkLog) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(fileName, that.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, templateId, status, url, importUserId, checkUserId, autoCheckLog, checkLog, createTime, updateTime, fileName);
    }
}
