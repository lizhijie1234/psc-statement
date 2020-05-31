package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "measurepointfertilizationinfo", schema = "psc1", catalog = "")
public class MeasurepointfertilizationinfoEntity {
    private int id;
    private int measurePointSurveyId;
    private Timestamp fertilizationTime;
    private int fertilizationType;
    private int fertilizationRatio;
    private int npkRatio;
    private int otherAmount;
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
    @Column(name = "fertilizationTime")
    public Timestamp getFertilizationTime() {
        return fertilizationTime;
    }

    public void setFertilizationTime(Timestamp fertilizationTime) {
        this.fertilizationTime = fertilizationTime;
    }

    @Basic
    @Column(name = "fertilizationType")
    public int getFertilizationType() {
        return fertilizationType;
    }

    public void setFertilizationType(int fertilizationType) {
        this.fertilizationType = fertilizationType;
    }

    @Basic
    @Column(name = "fertilizationRatio")
    public int getFertilizationRatio() {
        return fertilizationRatio;
    }

    public void setFertilizationRatio(int fertilizationRatio) {
        this.fertilizationRatio = fertilizationRatio;
    }

    @Basic
    @Column(name = "npkRatio")
    public int getNpkRatio() {
        return npkRatio;
    }

    public void setNpkRatio(int npkRatio) {
        this.npkRatio = npkRatio;
    }

    @Basic
    @Column(name = "otherAmount")
    public int getOtherAmount() {
        return otherAmount;
    }

    public void setOtherAmount(int otherAmount) {
        this.otherAmount = otherAmount;
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
        MeasurepointfertilizationinfoEntity that = (MeasurepointfertilizationinfoEntity) o;
        return id == that.id &&
                measurePointSurveyId == that.measurePointSurveyId &&
                fertilizationType == that.fertilizationType &&
                fertilizationRatio == that.fertilizationRatio &&
                npkRatio == that.npkRatio &&
                otherAmount == that.otherAmount &&
                Objects.equals(fertilizationTime, that.fertilizationTime) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, measurePointSurveyId, fertilizationTime, fertilizationType, fertilizationRatio, npkRatio, otherAmount, status);
    }
}
