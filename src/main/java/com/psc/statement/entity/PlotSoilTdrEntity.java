package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "plot_soil_tdr", schema = "psc1", catalog = "")
public class PlotSoilTdrEntity {
    @Id
    private int id;
    private Timestamp recordTime;
    private int recordPersonId;
    private int checkPersonId;
    private String status;
    private int testPointId;
    private int times;
    private String depth;
    private double firstMoisture;
    private double secondMoisture;
    private double thirdMoisture;
    private double avgTest;
    private String notes;
    private int plotId;

    @Basic
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
    @Column(name = "first_moisture")
    public double getFirstMoisture() {
        return firstMoisture;
    }

    public void setFirstMoisture(double firstMoisture) {
        this.firstMoisture = firstMoisture;
    }

    @Basic
    @Column(name = "second_moisture")
    public double getSecondMoisture() {
        return secondMoisture;
    }

    public void setSecondMoisture(double secondMoisture) {
        this.secondMoisture = secondMoisture;
    }

    @Basic
    @Column(name = "third_moisture")
    public double getThirdMoisture() {
        return thirdMoisture;
    }

    public void setThirdMoisture(double thirdMoisture) {
        this.thirdMoisture = thirdMoisture;
    }

    @Basic
    @Column(name = "avg_test")
    public double getAvgTest() {
        return avgTest;
    }

    public void setAvgTest(double avgTest) {
        this.avgTest = avgTest;
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
    @Column(name = "Plot_id")
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
        PlotSoilTdrEntity that = (PlotSoilTdrEntity) o;
        return id == that.id &&
                recordPersonId == that.recordPersonId &&
                checkPersonId == that.checkPersonId &&
                testPointId == that.testPointId &&
                times == that.times &&
                Double.compare(that.firstMoisture, firstMoisture) == 0 &&
                Double.compare(that.secondMoisture, secondMoisture) == 0 &&
                Double.compare(that.thirdMoisture, thirdMoisture) == 0 &&
                Double.compare(that.avgTest, avgTest) == 0 &&
                plotId == that.plotId &&
                Objects.equals(recordTime, that.recordTime) &&
                Objects.equals(status, that.status) &&
                Objects.equals(depth, that.depth) &&
                Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recordTime, recordPersonId, checkPersonId, status, testPointId, times, depth, firstMoisture, secondMoisture, thirdMoisture, avgTest, notes, plotId);
    }
}
