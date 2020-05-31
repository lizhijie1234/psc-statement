package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "nisha_caiyang", schema = "psc1", catalog = "")
public class NishaCaiyangEntity {
    private int id;
    private int qid;
    private Byte tankType;
    private Double waterDepth1;
    private Double waterDepth2;
    private Double waterDepth3;
    private Integer bottleId;
    private Double volume;
    private Integer boxId;
    private Double weight;
    private Timestamp rainStartTime;
    private Timestamp rainEndTime;
    private Integer rainfallId;
    private Double waterDepthAverage;
    private Double boxWeight;
    private Double soliWeight;
    private Double sedimentConcentration;
    private Double sedimentConcentrationAverage;
    private Double runoff;
    private Integer holesNumber;
    private Date observationTime;
    private String calculatingMan;
    private String auditor;
    private String state;
    private String remark;
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
    @Column(name = "qid")
    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    @Basic
    @Column(name = "tank_type")
    public Byte getTankType() {
        return tankType;
    }

    public void setTankType(Byte tankType) {
        this.tankType = tankType;
    }

    @Basic
    @Column(name = "water_depth_1")
    public Double getWaterDepth1() {
        return waterDepth1;
    }

    public void setWaterDepth1(Double waterDepth1) {
        this.waterDepth1 = waterDepth1;
    }

    @Basic
    @Column(name = "water_depth_2")
    public Double getWaterDepth2() {
        return waterDepth2;
    }

    public void setWaterDepth2(Double waterDepth2) {
        this.waterDepth2 = waterDepth2;
    }

    @Basic
    @Column(name = "water_depth_3")
    public Double getWaterDepth3() {
        return waterDepth3;
    }

    public void setWaterDepth3(Double waterDepth3) {
        this.waterDepth3 = waterDepth3;
    }

    @Basic
    @Column(name = "bottle_id")
    public Integer getBottleId() {
        return bottleId;
    }

    public void setBottleId(Integer bottleId) {
        this.bottleId = bottleId;
    }

    @Basic
    @Column(name = "volume")
    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Basic
    @Column(name = "box_id")
    public Integer getBoxId() {
        return boxId;
    }

    public void setBoxId(Integer boxId) {
        this.boxId = boxId;
    }

    @Basic
    @Column(name = "weight")
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "rain_start_time")
    public Timestamp getRainStartTime() {
        return rainStartTime;
    }

    public void setRainStartTime(Timestamp rainStartTime) {
        this.rainStartTime = rainStartTime;
    }

    @Basic
    @Column(name = "rain_end_time")
    public Timestamp getRainEndTime() {
        return rainEndTime;
    }

    public void setRainEndTime(Timestamp rainEndTime) {
        this.rainEndTime = rainEndTime;
    }

    @Basic
    @Column(name = "rainfall_id")
    public Integer getRainfallId() {
        return rainfallId;
    }

    public void setRainfallId(Integer rainfallId) {
        this.rainfallId = rainfallId;
    }

    @Basic
    @Column(name = "water_depth_average")
    public Double getWaterDepthAverage() {
        return waterDepthAverage;
    }

    public void setWaterDepthAverage(Double waterDepthAverage) {
        this.waterDepthAverage = waterDepthAverage;
    }

    @Basic
    @Column(name = "box_weight")
    public Double getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(Double boxWeight) {
        this.boxWeight = boxWeight;
    }

    @Basic
    @Column(name = "soli_weight")
    public Double getSoliWeight() {
        return soliWeight;
    }

    public void setSoliWeight(Double soliWeight) {
        this.soliWeight = soliWeight;
    }

    @Basic
    @Column(name = "sediment_concentration")
    public Double getSedimentConcentration() {
        return sedimentConcentration;
    }

    public void setSedimentConcentration(Double sedimentConcentration) {
        this.sedimentConcentration = sedimentConcentration;
    }

    @Basic
    @Column(name = "sediment_concentration_average")
    public Double getSedimentConcentrationAverage() {
        return sedimentConcentrationAverage;
    }

    public void setSedimentConcentrationAverage(Double sedimentConcentrationAverage) {
        this.sedimentConcentrationAverage = sedimentConcentrationAverage;
    }

    @Basic
    @Column(name = "runoff")
    public Double getRunoff() {
        return runoff;
    }

    public void setRunoff(Double runoff) {
        this.runoff = runoff;
    }

    @Basic
    @Column(name = "holes_number")
    public Integer getHolesNumber() {
        return holesNumber;
    }

    public void setHolesNumber(Integer holesNumber) {
        this.holesNumber = holesNumber;
    }

    @Basic
    @Column(name = "observation_time")
    public Date getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(Date observationTime) {
        this.observationTime = observationTime;
    }

    @Basic
    @Column(name = "calculating_man")
    public String getCalculatingMan() {
        return calculatingMan;
    }

    public void setCalculatingMan(String calculatingMan) {
        this.calculatingMan = calculatingMan;
    }

    @Basic
    @Column(name = "auditor")
    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
        NishaCaiyangEntity that = (NishaCaiyangEntity) o;
        return id == that.id &&
                qid == that.qid &&
                Objects.equals(tankType, that.tankType) &&
                Objects.equals(waterDepth1, that.waterDepth1) &&
                Objects.equals(waterDepth2, that.waterDepth2) &&
                Objects.equals(waterDepth3, that.waterDepth3) &&
                Objects.equals(bottleId, that.bottleId) &&
                Objects.equals(volume, that.volume) &&
                Objects.equals(boxId, that.boxId) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(rainStartTime, that.rainStartTime) &&
                Objects.equals(rainEndTime, that.rainEndTime) &&
                Objects.equals(rainfallId, that.rainfallId) &&
                Objects.equals(waterDepthAverage, that.waterDepthAverage) &&
                Objects.equals(boxWeight, that.boxWeight) &&
                Objects.equals(soliWeight, that.soliWeight) &&
                Objects.equals(sedimentConcentration, that.sedimentConcentration) &&
                Objects.equals(sedimentConcentrationAverage, that.sedimentConcentrationAverage) &&
                Objects.equals(runoff, that.runoff) &&
                Objects.equals(holesNumber, that.holesNumber) &&
                Objects.equals(observationTime, that.observationTime) &&
                Objects.equals(calculatingMan, that.calculatingMan) &&
                Objects.equals(auditor, that.auditor) &&
                Objects.equals(state, that.state) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qid, tankType, waterDepth1, waterDepth2, waterDepth3, bottleId, volume, boxId, weight, rainStartTime, rainEndTime, rainfallId, waterDepthAverage, boxWeight, soliWeight, sedimentConcentration, sedimentConcentrationAverage, runoff, holesNumber, observationTime, calculatingMan, auditor, state, remark, status);
    }
}
