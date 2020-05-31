package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sand_record", schema = "psc1", catalog = "")
public class SandRecordEntity {
    private int id;
    private int recordPersonId;
    private int checkPersonId;
    private Timestamp recordTime;
    private Integer status;
    private Integer windFieldId;
    private String direction;
    private double boxHeight;
    private int boxId;
    private double boxSoilWeight;
    private double boxWeight;
    private double soilWeight;
    private String notes;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "record_time")
    public Timestamp getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Timestamp recordTime) {
        this.recordTime = recordTime;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "wind_field_id")
    public Integer getWindFieldId() {
        return windFieldId;
    }

    public void setWindFieldId(Integer windFieldId) {
        this.windFieldId = windFieldId;
    }

    @Basic
    @Column(name = "direction")
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Basic
    @Column(name = "box_height")
    public double getBoxHeight() {
        return boxHeight;
    }

    public void setBoxHeight(double boxHeight) {
        this.boxHeight = boxHeight;
    }

    @Basic
    @Column(name = "box_id")
    public int getBoxId() {
        return boxId;
    }

    public void setBoxId(int boxId) {
        this.boxId = boxId;
    }

    @Basic
    @Column(name = "box_soil_weight")
    public double getBoxSoilWeight() {
        return boxSoilWeight;
    }

    public void setBoxSoilWeight(double boxSoilWeight) {
        this.boxSoilWeight = boxSoilWeight;
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
    @Column(name = "soil_weight")
    public double getSoilWeight() {
        return soilWeight;
    }

    public void setSoilWeight(double soilWeight) {
        this.soilWeight = soilWeight;
    }

    @Basic
    @Column(name = "notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SandRecordEntity that = (SandRecordEntity) o;
        return id == that.id &&
                recordPersonId == that.recordPersonId &&
                checkPersonId == that.checkPersonId &&
                Double.compare(that.boxHeight, boxHeight) == 0 &&
                boxId == that.boxId &&
                Double.compare(that.boxSoilWeight, boxSoilWeight) == 0 &&
                Double.compare(that.boxWeight, boxWeight) == 0 &&
                Double.compare(that.soilWeight, soilWeight) == 0 &&
                Objects.equals(recordTime, that.recordTime) &&
                Objects.equals(status, that.status) &&
                Objects.equals(windFieldId, that.windFieldId) &&
                Objects.equals(direction, that.direction) &&
                Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recordPersonId, checkPersonId, recordTime, status, windFieldId, direction, boxHeight, boxId, boxSoilWeight, boxWeight, soilWeight, notes);
    }
}
