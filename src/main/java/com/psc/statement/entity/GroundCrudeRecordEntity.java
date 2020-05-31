package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ground_ crude_record", schema = "psc1", catalog = "")
public class GroundCrudeRecordEntity {
    private int id;
    private String notes;
    private Timestamp recordTime;
    private Integer windFieldId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "record_time")
    public Timestamp getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Timestamp recordTime) {
        this.recordTime = recordTime;
    }

    @Basic
    @Column(name = "wind_field_id")
    public Integer getWindFieldId() {
        return windFieldId;
    }

    public void setWindFieldId(Integer windFieldId) {
        this.windFieldId = windFieldId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroundCrudeRecordEntity that = (GroundCrudeRecordEntity) o;
        return id == that.id &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(recordTime, that.recordTime) &&
                Objects.equals(windFieldId, that.windFieldId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, notes, recordTime, windFieldId);
    }
}
