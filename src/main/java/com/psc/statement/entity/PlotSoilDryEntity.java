package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "plot_soil_dry", schema = "psc1", catalog = "")
public class PlotSoilDryEntity {
    private int id;
    private Timestamp recordTime;
    private int recordPersonId;
    private int checkPersonId;
    private String status;
    private int testPointId;
    private int times;
    private String depth;
    private String boxCode;
    private double boxHumidWeight;
    private double boxDryWeight;
    private double boxWeight;
    private double waterContent;
    private int groupId;
    private double meanWaterContent;
    private String notes;
    private int plotId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "record_time")
    public Timestamp getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Timestamp recordTime) {
        this.recordTime = recordTime;
    }

    @Basic
    @Column(name = "record_person_id")
    public int getRecordPersonId() {
        return recordPersonId;
    }

    public void setRecordPersonId(int recordPersonId) {
        this.recordPersonId = recordPersonId;
    }

    @Basic
    @Column(name = "check_person_id")
    public int getCheckPersonId() {
        return checkPersonId;
    }

    public void setCheckPersonId(int checkPersonId) {
        this.checkPersonId = checkPersonId;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "test_point_id")
    public int getTestPointId() {
        return testPointId;
    }

    public void setTestPointId(int testPointId) {
        this.testPointId = testPointId;
    }

    @Basic
    @Column(name = "times")
    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
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
    @Column(name = "box_code")
    public String getBoxCode() {
        return boxCode;
    }

    public void setBoxCode(String boxCode) {
        this.boxCode = boxCode;
    }

    @Basic
    @Column(name = "box_humid_weight")
    public double getBoxHumidWeight() {
        return boxHumidWeight;
    }

    public void setBoxHumidWeight(double boxHumidWeight) {
        this.boxHumidWeight = boxHumidWeight;
    }

    @Basic
    @Column(name = "box_dry_weight")
    public double getBoxDryWeight() {
        return boxDryWeight;
    }

    public void setBoxDryWeight(double boxDryWeight) {
        this.boxDryWeight = boxDryWeight;
    }

    @Basic
    @Column(name = "box_weight")
    public double getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(double boxWeight) {
        this.boxWeight = boxWeight;
    }

    @Basic
    @Column(name = "water_content")
    public double getWaterContent() {
        return waterContent;
    }

    public void setWaterContent(double waterContent) {
        this.waterContent = waterContent;
    }

    @Basic
    @Column(name = "groupId")
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "mean_water_content")
    public double getMeanWaterContent() {
        return meanWaterContent;
    }

    public void setMeanWaterContent(double meanWaterContent) {
        this.meanWaterContent = meanWaterContent;
    }

    @Basic
    @Column(name = "notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "plot_id")
    public int getPlotId() {
        return plotId;
    }

    public void setPlotId(int plotId) {
        this.plotId = plotId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlotSoilDryEntity that = (PlotSoilDryEntity) o;
        return id == that.id &&
                recordPersonId == that.recordPersonId &&
                checkPersonId == that.checkPersonId &&
                testPointId == that.testPointId &&
                times == that.times &&
                Double.compare(that.boxHumidWeight, boxHumidWeight) == 0 &&
                Double.compare(that.boxDryWeight, boxDryWeight) == 0 &&
                Double.compare(that.boxWeight, boxWeight) == 0 &&
                Double.compare(that.waterContent, waterContent) == 0 &&
                groupId == that.groupId &&
                Double.compare(that.meanWaterContent, meanWaterContent) == 0 &&
                plotId == that.plotId &&
                Objects.equals(recordTime, that.recordTime) &&
                Objects.equals(status, that.status) &&
                Objects.equals(depth, that.depth) &&
                Objects.equals(boxCode, that.boxCode) &&
                Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recordTime, recordPersonId, checkPersonId, status, testPointId, times, depth, boxCode, boxHumidWeight, boxDryWeight, boxWeight, waterContent, groupId, meanWaterContent, notes, plotId);
    }
}
