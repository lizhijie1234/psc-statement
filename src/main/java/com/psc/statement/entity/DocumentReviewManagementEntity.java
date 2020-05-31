package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "document_review_management", schema = "psc1", catalog = "")
public class DocumentReviewManagementEntity {
    private int id;
    private Timestamp updateTime;
    private int updateUserId;
    private Integer checkUserId;
    private int checkStatus;
    private String filePath;
    private String fileName;
    private int fileType;
    private String checkMessage;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "Update_userId")
    public int getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(int updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Basic
    @Column(name = "Check_userId")
    public Integer getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Integer checkUserId) {
        this.checkUserId = checkUserId;
    }

    @Basic
    @Column(name = "Check_status")
    public int getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(int checkStatus) {
        this.checkStatus = checkStatus;
    }

    @Basic
    @Column(name = "File_path")
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Basic
    @Column(name = "File_name")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "File_type")
    public int getFileType() {
        return fileType;
    }

    public void setFileType(int fileType) {
        this.fileType = fileType;
    }

    @Basic
    @Column(name = "Check_message")
    public String getCheckMessage() {
        return checkMessage;
    }

    public void setCheckMessage(String checkMessage) {
        this.checkMessage = checkMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentReviewManagementEntity that = (DocumentReviewManagementEntity) o;
        return id == that.id &&
                updateUserId == that.updateUserId &&
                checkStatus == that.checkStatus &&
                fileType == that.fileType &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(checkUserId, that.checkUserId) &&
                Objects.equals(filePath, that.filePath) &&
                Objects.equals(fileName, that.fileName) &&
                Objects.equals(checkMessage, that.checkMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, updateTime, updateUserId, checkUserId, checkStatus, filePath, fileName, fileType, checkMessage);
    }
}
