package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "swrunoffnutrientcontent", schema = "psc1", catalog = "")
public class SwrunoffnutrientcontentEntity {
    private int id;
    private int smallWatershedId;
    private Timestamp measureTime;
    private int measurePersonId;
    private int auditorId;
    private int measureStatus;
    private String auditOpinion;
    private Timestamp auditTime;
    private int totalNitrogen;
    private int totalPhosphorus;
    private int ammoniaNitrogen;
    private int nitrateNitrogen;
    private int cod;
    private int remark;
    private int nutrientType;
    private int status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "smallWatershed\nId")
    public int getSmallWatershedId() {
        return smallWatershedId;
    }

    public void setSmallWatershedId(int smallWatershedId) {
        this.smallWatershedId = smallWatershedId;
    }

    @Basic
    @Column(name = "measureTime")
    public Timestamp getMeasureTime() {
        return measureTime;
    }

    public void setMeasureTime(Timestamp measureTime) {
        this.measureTime = measureTime;
    }

    @Basic
    @Column(name = "measurePersonId")
    public int getMeasurePersonId() {
        return measurePersonId;
    }

    public void setMeasurePersonId(int measurePersonId) {
        this.measurePersonId = measurePersonId;
    }

    @Basic
    @Column(name = "auditorId")
    public int getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(int auditorId) {
        this.auditorId = auditorId;
    }

    @Basic
    @Column(name = "measureStatus")
    public int getMeasureStatus() {
        return measureStatus;
    }

    public void setMeasureStatus(int measureStatus) {
        this.measureStatus = measureStatus;
    }

    @Basic
    @Column(name = "auditOpinion")
    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    @Basic
    @Column(name = "auditTime")
    public Timestamp getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Timestamp auditTime) {
        this.auditTime = auditTime;
    }

    @Basic
    @Column(name = "totalNitrogen")
    public int getTotalNitrogen() {
        return totalNitrogen;
    }

    public void setTotalNitrogen(int totalNitrogen) {
        this.totalNitrogen = totalNitrogen;
    }

    @Basic
    @Column(name = "totalPhosphorus")
    public int getTotalPhosphorus() {
        return totalPhosphorus;
    }

    public void setTotalPhosphorus(int totalPhosphorus) {
        this.totalPhosphorus = totalPhosphorus;
    }

    @Basic
    @Column(name = "ammoniaNitrogen")
    public int getAmmoniaNitrogen() {
        return ammoniaNitrogen;
    }

    public void setAmmoniaNitrogen(int ammoniaNitrogen) {
        this.ammoniaNitrogen = ammoniaNitrogen;
    }

    @Basic
    @Column(name = "nitrateNitrogen")
    public int getNitrateNitrogen() {
        return nitrateNitrogen;
    }

    public void setNitrateNitrogen(int nitrateNitrogen) {
        this.nitrateNitrogen = nitrateNitrogen;
    }

    @Basic
    @Column(name = "cod")
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Basic
    @Column(name = "remark")
    public int getRemark() {
        return remark;
    }

    public void setRemark(int remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "nutrientType")
    public int getNutrientType() {
        return nutrientType;
    }

    public void setNutrientType(int nutrientType) {
        this.nutrientType = nutrientType;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SwrunoffnutrientcontentEntity that = (SwrunoffnutrientcontentEntity) o;
        return id == that.id &&
                smallWatershedId == that.smallWatershedId &&
                measurePersonId == that.measurePersonId &&
                auditorId == that.auditorId &&
                measureStatus == that.measureStatus &&
                totalNitrogen == that.totalNitrogen &&
                totalPhosphorus == that.totalPhosphorus &&
                ammoniaNitrogen == that.ammoniaNitrogen &&
                nitrateNitrogen == that.nitrateNitrogen &&
                cod == that.cod &&
                remark == that.remark &&
                nutrientType == that.nutrientType &&
                status == that.status &&
                Objects.equals(measureTime, that.measureTime) &&
                Objects.equals(auditOpinion, that.auditOpinion) &&
                Objects.equals(auditTime, that.auditTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, smallWatershedId, measureTime, measurePersonId, auditorId, measureStatus, auditOpinion, auditTime, totalNitrogen, totalPhosphorus, ammoniaNitrogen, nitrateNitrogen, cod, remark, nutrientType, status);
    }
}
