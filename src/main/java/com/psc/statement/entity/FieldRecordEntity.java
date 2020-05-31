package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "field_record", schema = "psc1", catalog = "")
public class FieldRecordEntity {
    private int id;
    private String operate;
    private String tool;
    private String disturbanceDepth;
    private int recordPersonId;
    private int checkPersonId;
    private Timestamp recordTime;
    private String notes;
    private String check;
    private Integer status;
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
    @Column(name = "operate")
    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    @Basic
    @Column(name = "tool")
    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    @Basic
    @Column(name = "disturbance_depth")
    public String getDisturbanceDepth() {
        return disturbanceDepth;
    }

    public void setDisturbanceDepth(String disturbanceDepth) {
        this.disturbanceDepth = disturbanceDepth;
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
    @Column(name = "notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "check")
    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldRecordEntity that = (FieldRecordEntity) o;
        return id == that.id &&
                recordPersonId == that.recordPersonId &&
                checkPersonId == that.checkPersonId &&
                Objects.equals(operate, that.operate) &&
                Objects.equals(tool, that.tool) &&
                Objects.equals(disturbanceDepth, that.disturbanceDepth) &&
                Objects.equals(recordTime, that.recordTime) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(check, that.check) &&
                Objects.equals(status, that.status) &&
                Objects.equals(windFieldId, that.windFieldId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, operate, tool, disturbanceDepth, recordPersonId, checkPersonId, recordTime, notes, check, status, windFieldId);
    }
}
