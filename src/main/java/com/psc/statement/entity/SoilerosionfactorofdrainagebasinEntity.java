package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "soilerosionfactorofdrainagebasin", schema = "psc1", catalog = "")
public class SoilerosionfactorofdrainagebasinEntity {
    private int id;
    private Timestamp samplingtime;
    private int measurePersonId;
    private Integer auditStatus;
    private String auditOpinion;
    private Timestamp auditTime;
    private Integer auditorId;
    private String landUtilizationType;
    private int landUtilizationNum;
    private String plantType;
    private String plantNum;
    private int canopyDensity;
    private int coverDegree;
    private String engineeringMeasuresType;
    private int engineeringMeasuresNum;
    private Timestamp timeToBuild;
    private String quality;
    private String agricultureType;
    private int agricultureNum;
    private int photoNum;
    private String remark;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
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
    public Integer getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Integer auditorId) {
        this.auditorId = auditorId;
    }

    @Basic
    @Column(name = "landUtilizationType")
    public String getLandUtilizationType() {
        return landUtilizationType;
    }

    public void setLandUtilizationType(String landUtilizationType) {
        this.landUtilizationType = landUtilizationType;
    }

    @Basic
    @Column(name = "landUtilizationNum")
    public int getLandUtilizationNum() {
        return landUtilizationNum;
    }

    public void setLandUtilizationNum(int landUtilizationNum) {
        this.landUtilizationNum = landUtilizationNum;
    }

    @Basic
    @Column(name = "plantType")
    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    @Basic
    @Column(name = "plantNum")
    public String getPlantNum() {
        return plantNum;
    }

    public void setPlantNum(String plantNum) {
        this.plantNum = plantNum;
    }

    @Basic
    @Column(name = "canopyDensity")
    public int getCanopyDensity() {
        return canopyDensity;
    }

    public void setCanopyDensity(int canopyDensity) {
        this.canopyDensity = canopyDensity;
    }

    @Basic
    @Column(name = "coverDegree")
    public int getCoverDegree() {
        return coverDegree;
    }

    public void setCoverDegree(int coverDegree) {
        this.coverDegree = coverDegree;
    }

    @Basic
    @Column(name = "engineeringMeasuresType")
    public String getEngineeringMeasuresType() {
        return engineeringMeasuresType;
    }

    public void setEngineeringMeasuresType(String engineeringMeasuresType) {
        this.engineeringMeasuresType = engineeringMeasuresType;
    }

    @Basic
    @Column(name = "engineeringMeasuresNum")
    public int getEngineeringMeasuresNum() {
        return engineeringMeasuresNum;
    }

    public void setEngineeringMeasuresNum(int engineeringMeasuresNum) {
        this.engineeringMeasuresNum = engineeringMeasuresNum;
    }

    @Basic
    @Column(name = "timeToBuild")
    public Timestamp getTimeToBuild() {
        return timeToBuild;
    }

    public void setTimeToBuild(Timestamp timeToBuild) {
        this.timeToBuild = timeToBuild;
    }

    @Basic
    @Column(name = "quality")
    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Basic
    @Column(name = "agricultureType")
    public String getAgricultureType() {
        return agricultureType;
    }

    public void setAgricultureType(String agricultureType) {
        this.agricultureType = agricultureType;
    }

    @Basic
    @Column(name = "agricultureNum")
    public int getAgricultureNum() {
        return agricultureNum;
    }

    public void setAgricultureNum(int agricultureNum) {
        this.agricultureNum = agricultureNum;
    }

    @Basic
    @Column(name = "photoNum")
    public int getPhotoNum() {
        return photoNum;
    }

    public void setPhotoNum(int photoNum) {
        this.photoNum = photoNum;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoilerosionfactorofdrainagebasinEntity that = (SoilerosionfactorofdrainagebasinEntity) o;
        return id == that.id &&
                measurePersonId == that.measurePersonId &&
                landUtilizationNum == that.landUtilizationNum &&
                canopyDensity == that.canopyDensity &&
                coverDegree == that.coverDegree &&
                engineeringMeasuresNum == that.engineeringMeasuresNum &&
                agricultureNum == that.agricultureNum &&
                photoNum == that.photoNum &&
                Objects.equals(samplingtime, that.samplingtime) &&
                Objects.equals(auditStatus, that.auditStatus) &&
                Objects.equals(auditOpinion, that.auditOpinion) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(auditorId, that.auditorId) &&
                Objects.equals(landUtilizationType, that.landUtilizationType) &&
                Objects.equals(plantType, that.plantType) &&
                Objects.equals(plantNum, that.plantNum) &&
                Objects.equals(engineeringMeasuresType, that.engineeringMeasuresType) &&
                Objects.equals(timeToBuild, that.timeToBuild) &&
                Objects.equals(quality, that.quality) &&
                Objects.equals(agricultureType, that.agricultureType) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, samplingtime, measurePersonId, auditStatus, auditOpinion, auditTime, auditorId, landUtilizationType, landUtilizationNum, plantType, plantNum, canopyDensity, coverDegree, engineeringMeasuresType, engineeringMeasuresNum, timeToBuild, quality, agricultureType, agricultureNum, photoNum, remark);
    }
}
