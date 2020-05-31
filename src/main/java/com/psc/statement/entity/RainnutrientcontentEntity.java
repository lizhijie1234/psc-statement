package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "rainnutrientcontent", schema = "psc1", catalog = "")
public class RainnutrientcontentEntity {
    private int id;
    private int measurePointId;
    private Timestamp samplingtime;
    private int measurePersonId;
    private String auditStatus;
    private String auditOpinion;
    private Timestamp auditTime;
    private int auditorId;
    private String depth;
    private String totalNitrogen;
    private String totalPhosphorus;
    private String ammoniaNitrogen;
    private String nitrateNitrogen;
    private String cod;
    private String remark;
    private String alkalineNitrogen;
    private String availablePhosphoru;
    private String organicMatter;
    private String nutrientContent;
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
    @Column(name = "measurePointId")
    public int getMeasurePointId() {
        return measurePointId;
    }

    public void setMeasurePointId(int measurePointId) {
        this.measurePointId = measurePointId;
    }

    @Basic
    @Column(name = "samplingtime")
    public Timestamp getSamplingtime() {
        return samplingtime;
    }

    public void setSamplingtime(Timestamp samplingtime) {
        this.samplingtime = samplingtime;
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
    @Column(name = "auditStatus")
    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
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
    @Column(name = "auditTime")
    public Timestamp getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Timestamp auditTime) {
        this.auditTime = auditTime;
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
    @Column(name = "depth")
    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    @Basic
    @Column(name = "totalNitrogen")
    public String getTotalNitrogen() {
        return totalNitrogen;
    }

    public void setTotalNitrogen(String totalNitrogen) {
        this.totalNitrogen = totalNitrogen;
    }

    @Basic
    @Column(name = "totalPhosphorus")
    public String getTotalPhosphorus() {
        return totalPhosphorus;
    }

    public void setTotalPhosphorus(String totalPhosphorus) {
        this.totalPhosphorus = totalPhosphorus;
    }

    @Basic
    @Column(name = "ammoniaNitrogen")
    public String getAmmoniaNitrogen() {
        return ammoniaNitrogen;
    }

    public void setAmmoniaNitrogen(String ammoniaNitrogen) {
        this.ammoniaNitrogen = ammoniaNitrogen;
    }

    @Basic
    @Column(name = "nitrateNitrogen")
    public String getNitrateNitrogen() {
        return nitrateNitrogen;
    }

    public void setNitrateNitrogen(String nitrateNitrogen) {
        this.nitrateNitrogen = nitrateNitrogen;
    }

    @Basic
    @Column(name = "cod")
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "alkalineNitrogen")
    public String getAlkalineNitrogen() {
        return alkalineNitrogen;
    }

    public void setAlkalineNitrogen(String alkalineNitrogen) {
        this.alkalineNitrogen = alkalineNitrogen;
    }

    @Basic
    @Column(name = "availablePhosphoru")
    public String getAvailablePhosphoru() {
        return availablePhosphoru;
    }

    public void setAvailablePhosphoru(String availablePhosphoru) {
        this.availablePhosphoru = availablePhosphoru;
    }

    @Basic
    @Column(name = "organicMatter")
    public String getOrganicMatter() {
        return organicMatter;
    }

    public void setOrganicMatter(String organicMatter) {
        this.organicMatter = organicMatter;
    }

    @Basic
    @Column(name = "nutrientContent")
    public String getNutrientContent() {
        return nutrientContent;
    }

    public void setNutrientContent(String nutrientContent) {
        this.nutrientContent = nutrientContent;
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
        RainnutrientcontentEntity that = (RainnutrientcontentEntity) o;
        return id == that.id &&
                measurePointId == that.measurePointId &&
                measurePersonId == that.measurePersonId &&
                auditorId == that.auditorId &&
                Objects.equals(samplingtime, that.samplingtime) &&
                Objects.equals(auditStatus, that.auditStatus) &&
                Objects.equals(auditOpinion, that.auditOpinion) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(depth, that.depth) &&
                Objects.equals(totalNitrogen, that.totalNitrogen) &&
                Objects.equals(totalPhosphorus, that.totalPhosphorus) &&
                Objects.equals(ammoniaNitrogen, that.ammoniaNitrogen) &&
                Objects.equals(nitrateNitrogen, that.nitrateNitrogen) &&
                Objects.equals(cod, that.cod) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(alkalineNitrogen, that.alkalineNitrogen) &&
                Objects.equals(availablePhosphoru, that.availablePhosphoru) &&
                Objects.equals(organicMatter, that.organicMatter) &&
                Objects.equals(nutrientContent, that.nutrientContent) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, measurePointId, samplingtime, measurePersonId, auditStatus, auditOpinion, auditTime, auditorId, depth, totalNitrogen, totalPhosphorus, ammoniaNitrogen, nitrateNitrogen, cod, remark, alkalineNitrogen, availablePhosphoru, organicMatter, nutrientContent, status);
    }
}
