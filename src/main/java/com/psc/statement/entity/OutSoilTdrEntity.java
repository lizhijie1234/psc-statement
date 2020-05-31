package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "out_soil_tdr", schema = "psc1", catalog = "")
public class OutSoilTdrEntity {
    @Id
    private int id;
    private Timestamp recordTime;
    private int recordPersonId;
    private int checkPersonId;
    private int testPointId;
    private String depth;
    private double firstTest;
    private double secondTest;
    private double thirdTest;
    private double avgTest;
    private String notes;
    private String status;

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
    @Column(name = "test_point_id")
    public int getTestPointId() {
        return testPointId;
    }

    public void setTestPointId(int testPointId) {
        this.testPointId = testPointId;
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
    @Column(name = "first_test")
    public double getFirstTest() {
        return firstTest;
    }

    public void setFirstTest(double firstTest) {
        this.firstTest = firstTest;
    }

    @Basic
    @Column(name = "second_test")
    public double getSecondTest() {
        return secondTest;
    }

    public void setSecondTest(double secondTest) {
        this.secondTest = secondTest;
    }

    @Basic
    @Column(name = "third_test")
    public double getThirdTest() {
        return thirdTest;
    }

    public void setThirdTest(double thirdTest) {
        this.thirdTest = thirdTest;
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
        OutSoilTdrEntity that = (OutSoilTdrEntity) o;
        return id == that.id &&
                recordPersonId == that.recordPersonId &&
                checkPersonId == that.checkPersonId &&
                testPointId == that.testPointId &&
                Double.compare(that.firstTest, firstTest) == 0 &&
                Double.compare(that.secondTest, secondTest) == 0 &&
                Double.compare(that.thirdTest, thirdTest) == 0 &&
                Double.compare(that.avgTest, avgTest) == 0 &&
                Objects.equals(recordTime, that.recordTime) &&
                Objects.equals(depth, that.depth) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recordTime, recordPersonId, checkPersonId, testPointId, depth, firstTest, secondTest, thirdTest, avgTest, notes, status);
    }
}
