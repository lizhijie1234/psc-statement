package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "supervision_report", schema = "psc1", catalog = "")
public class SupervisionReportEntity {
    private int id;
    private int taskNo;
    private String reportName;
    private int supervisionType;
    private String supervisionReportFile;
    private String submitter;
    private Timestamp submitTime;
    private String reportTimeExplain;
    private int projectId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "task_no")
    public int getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(int taskNo) {
        this.taskNo = taskNo;
    }

    @Basic
    @Column(name = "report_name")
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    @Basic
    @Column(name = "supervision_type")
    public int getSupervisionType() {
        return supervisionType;
    }

    public void setSupervisionType(int supervisionType) {
        this.supervisionType = supervisionType;
    }

    @Basic
    @Column(name = "supervision_report_file")
    public String getSupervisionReportFile() {
        return supervisionReportFile;
    }

    public void setSupervisionReportFile(String supervisionReportFile) {
        this.supervisionReportFile = supervisionReportFile;
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
    @Column(name = "report_time_explain")
    public String getReportTimeExplain() {
        return reportTimeExplain;
    }

    public void setReportTimeExplain(String reportTimeExplain) {
        this.reportTimeExplain = reportTimeExplain;
    }

    @Basic
    @Column(name = "project_id")
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupervisionReportEntity that = (SupervisionReportEntity) o;
        return id == that.id &&
                taskNo == that.taskNo &&
                supervisionType == that.supervisionType &&
                projectId == that.projectId &&
                Objects.equals(reportName, that.reportName) &&
                Objects.equals(supervisionReportFile, that.supervisionReportFile) &&
                Objects.equals(submitter, that.submitter) &&
                Objects.equals(submitTime, that.submitTime) &&
                Objects.equals(reportTimeExplain, that.reportTimeExplain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taskNo, reportName, supervisionType, supervisionReportFile, submitter, submitTime, reportTimeExplain, projectId);
    }
}
