package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "daily_record", schema = "psc1", catalog = "")
public class DailyRecordEntity {
    private int id;
    private Timestamp recordTime;
    private int recordPersonId;
    private int checkPersonId;
    private int windFieldId;
    private int status;
    private String checkAndMaintain;

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
    @Column(name = "wind_field_id")
    public int getWindFieldId() {
        return windFieldId;
    }

    public void setWindFieldId(int windFieldId) {
        this.windFieldId = windFieldId;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "check_and_maintain")
    public String getCheckAndMaintain() {
        return checkAndMaintain;
    }

    public void setCheckAndMaintain(String checkAndMaintain) {
        this.checkAndMaintain = checkAndMaintain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DailyRecordEntity that = (DailyRecordEntity) o;
        return id == that.id &&
                recordPersonId == that.recordPersonId &&
                checkPersonId == that.checkPersonId &&
                windFieldId == that.windFieldId &&
                status == that.status &&
                Objects.equals(recordTime, that.recordTime) &&
                Objects.equals(checkAndMaintain, that.checkAndMaintain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recordTime, recordPersonId, checkPersonId, windFieldId, status, checkAndMaintain);
    }
}
