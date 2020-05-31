package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "measurepointsprayinfo", schema = "psc1", catalog = "")
public class MeasurepointsprayinfoEntity {
    private int id;
    private int measurePointSurveyId;
    private Timestamp sprayTime;
    private int sprayType;
    private int sprayAmount;
    private String status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "measurePointSurveyId")
    public int getMeasurePointSurveyId() {
        return measurePointSurveyId;
    }

    public void setMeasurePointSurveyId(int measurePointSurveyId) {
        this.measurePointSurveyId = measurePointSurveyId;
    }

    @Basic
    @Column(name = "sprayTime")
    public Timestamp getSprayTime() {
        return sprayTime;
    }

    public void setSprayTime(Timestamp sprayTime) {
        this.sprayTime = sprayTime;
    }

    @Basic
    @Column(name = "sprayType")
    public int getSprayType() {
        return sprayType;
    }

    public void setSprayType(int sprayType) {
        this.sprayType = sprayType;
    }

    @Basic
    @Column(name = "sprayAmount")
    public int getSprayAmount() {
        return sprayAmount;
    }

    public void setSprayAmount(int sprayAmount) {
        this.sprayAmount = sprayAmount;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeasurepointsprayinfoEntity that = (MeasurepointsprayinfoEntity) o;
        return id == that.id &&
                measurePointSurveyId == that.measurePointSurveyId &&
                sprayType == that.sprayType &&
                sprayAmount == that.sprayAmount &&
                Objects.equals(sprayTime, that.sprayTime) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, measurePointSurveyId, sprayTime, sprayType, sprayAmount, status);
    }
}
