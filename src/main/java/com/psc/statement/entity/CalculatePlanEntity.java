package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "calculate_plan", schema = "psc1", catalog = "")
public class CalculatePlanEntity {
    private int id;
    private Integer calculateNum;
    private String calculatePlanName;
    private int calculateStatus;
    private int calculateType;
    private Timestamp createPlanTime;
    private Timestamp endPlanTime;
    private int endRecordId;
    private String errorMessage;
    private Timestamp startPlanTime;
    private int startRecordId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "calculate_num")
    public Integer getCalculateNum() {
        return calculateNum;
    }

    public void setCalculateNum(Integer calculateNum) {
        this.calculateNum = calculateNum;
    }

    @Basic
    @Column(name = "calculate_plan_name")
    public String getCalculatePlanName() {
        return calculatePlanName;
    }

    public void setCalculatePlanName(String calculatePlanName) {
        this.calculatePlanName = calculatePlanName;
    }

    @Basic
    @Column(name = "calculate_status")
    public int getCalculateStatus() {
        return calculateStatus;
    }

    public void setCalculateStatus(int calculateStatus) {
        this.calculateStatus = calculateStatus;
    }

    @Basic
    @Column(name = "calculate_type")
    public int getCalculateType() {
        return calculateType;
    }

    public void setCalculateType(int calculateType) {
        this.calculateType = calculateType;
    }

    @Basic
    @Column(name = "create_plan_time")
    public Timestamp getCreatePlanTime() {
        return createPlanTime;
    }

    public void setCreatePlanTime(Timestamp createPlanTime) {
        this.createPlanTime = createPlanTime;
    }

    @Basic
    @Column(name = "end_plan_time")
    public Timestamp getEndPlanTime() {
        return endPlanTime;
    }

    public void setEndPlanTime(Timestamp endPlanTime) {
        this.endPlanTime = endPlanTime;
    }

    @Basic
    @Column(name = "end_record_id")
    public int getEndRecordId() {
        return endRecordId;
    }

    public void setEndRecordId(int endRecordId) {
        this.endRecordId = endRecordId;
    }

    @Basic
    @Column(name = "error_message")
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Basic
    @Column(name = "start_plan_time")
    public Timestamp getStartPlanTime() {
        return startPlanTime;
    }

    public void setStartPlanTime(Timestamp startPlanTime) {
        this.startPlanTime = startPlanTime;
    }

    @Basic
    @Column(name = "start_record_id")
    public int getStartRecordId() {
        return startRecordId;
    }

    public void setStartRecordId(int startRecordId) {
        this.startRecordId = startRecordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatePlanEntity that = (CalculatePlanEntity) o;
        return id == that.id &&
                calculateStatus == that.calculateStatus &&
                calculateType == that.calculateType &&
                endRecordId == that.endRecordId &&
                startRecordId == that.startRecordId &&
                Objects.equals(calculateNum, that.calculateNum) &&
                Objects.equals(calculatePlanName, that.calculatePlanName) &&
                Objects.equals(createPlanTime, that.createPlanTime) &&
                Objects.equals(endPlanTime, that.endPlanTime) &&
                Objects.equals(errorMessage, that.errorMessage) &&
                Objects.equals(startPlanTime, that.startPlanTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, calculateNum, calculatePlanName, calculateStatus, calculateType, createPlanTime, endPlanTime, endRecordId, errorMessage, startPlanTime, startRecordId);
    }
}
