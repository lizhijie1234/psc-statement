package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sedimentrecordofdrainagebasin", schema = "psc1", catalog = "")
public class SedimentrecordofdrainagebasinEntity {
    private int id;
    private int drainageBasinId;
    private Timestamp samplingTime;
    private int measurePersonId;
    private Integer auditorId;
    private Timestamp auditTime;
    private int auditStatus;
    private String auditOpinion;
    private int staffGaugeNum;
    private int sampleBottleNum;
    private int sampleVolume;
    private int sedimentBoxNum;
    private int totalWeight;
    private int boxWeight;
    private String remarks;
    private int equipmentId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "drainageBasinId")
    public int getDrainageBasinId() {
        return drainageBasinId;
    }

    public void setDrainageBasinId(int drainageBasinId) {
        this.drainageBasinId = drainageBasinId;
    }

    @Basic
    @Column(name = "samplingTime")
    public Timestamp getSamplingTime() {
        return samplingTime;
    }

    public void setSamplingTime(Timestamp samplingTime) {
        this.samplingTime = samplingTime;
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
    public Integer getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Integer auditorId) {
        this.auditorId = auditorId;
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
    @Column(name = "auditStatus")
    public int getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        this.auditStatus = auditStatus;
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
    @Column(name = "staffGaugeNum")
    public int getStaffGaugeNum() {
        return staffGaugeNum;
    }

    public void setStaffGaugeNum(int staffGaugeNum) {
        this.staffGaugeNum = staffGaugeNum;
    }

    @Basic
    @Column(name = "sampleBottleNum")
    public int getSampleBottleNum() {
        return sampleBottleNum;
    }

    public void setSampleBottleNum(int sampleBottleNum) {
        this.sampleBottleNum = sampleBottleNum;
    }

    @Basic
    @Column(name = "sampleVolume")
    public int getSampleVolume() {
        return sampleVolume;
    }

    public void setSampleVolume(int sampleVolume) {
        this.sampleVolume = sampleVolume;
    }

    @Basic
    @Column(name = "sedimentBoxNum")
    public int getSedimentBoxNum() {
        return sedimentBoxNum;
    }

    public void setSedimentBoxNum(int sedimentBoxNum) {
        this.sedimentBoxNum = sedimentBoxNum;
    }

    @Basic
    @Column(name = "totalWeight")
    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    @Basic
    @Column(name = "boxWeight")
    public int getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(int boxWeight) {
        this.boxWeight = boxWeight;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "equipmentId")
    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SedimentrecordofdrainagebasinEntity that = (SedimentrecordofdrainagebasinEntity) o;
        return id == that.id &&
                drainageBasinId == that.drainageBasinId &&
                measurePersonId == that.measurePersonId &&
                auditStatus == that.auditStatus &&
                staffGaugeNum == that.staffGaugeNum &&
                sampleBottleNum == that.sampleBottleNum &&
                sampleVolume == that.sampleVolume &&
                sedimentBoxNum == that.sedimentBoxNum &&
                totalWeight == that.totalWeight &&
                boxWeight == that.boxWeight &&
                equipmentId == that.equipmentId &&
                Objects.equals(samplingTime, that.samplingTime) &&
                Objects.equals(auditorId, that.auditorId) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(auditOpinion, that.auditOpinion) &&
                Objects.equals(remarks, that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, drainageBasinId, samplingTime, measurePersonId, auditorId, auditTime, auditStatus, auditOpinion, staffGaugeNum, sampleBottleNum, sampleVolume, sedimentBoxNum, totalWeight, boxWeight, remarks, equipmentId);
    }
}
