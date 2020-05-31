package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "record_regulation", schema = "psc1", catalog = "")
public class RecordRegulationEntity {
    private int recRegId;
    private Integer regulationId;
    private Integer recordDetailId;
    private String recordDetailField;
    private String recRegParamter;
    private Boolean recRegOff;
    private Time recRegTime;
    private String recRegUser;

    @Id
    @Column(name = "rec_reg_id")
    public int getRecRegId() {
        return recRegId;
    }

    public void setRecRegId(int recRegId) {
        this.recRegId = recRegId;
    }

    @Basic
    @Column(name = "regulation_id")
    public Integer getRegulationId() {
        return regulationId;
    }

    public void setRegulationId(Integer regulationId) {
        this.regulationId = regulationId;
    }

    @Basic
    @Column(name = "record_detail__id")
    public Integer getRecordDetailId() {
        return recordDetailId;
    }

    public void setRecordDetailId(Integer recordDetailId) {
        this.recordDetailId = recordDetailId;
    }

    @Basic
    @Column(name = "record_detail_field")
    public String getRecordDetailField() {
        return recordDetailField;
    }

    public void setRecordDetailField(String recordDetailField) {
        this.recordDetailField = recordDetailField;
    }

    @Basic
    @Column(name = "rec_reg_paramter")
    public String getRecRegParamter() {
        return recRegParamter;
    }

    public void setRecRegParamter(String recRegParamter) {
        this.recRegParamter = recRegParamter;
    }

    @Basic
    @Column(name = "rec_reg_off")
    public Boolean getRecRegOff() {
        return recRegOff;
    }

    public void setRecRegOff(Boolean recRegOff) {
        this.recRegOff = recRegOff;
    }

    @Basic
    @Column(name = "rec_reg_time")
    public Time getRecRegTime() {
        return recRegTime;
    }

    public void setRecRegTime(Time recRegTime) {
        this.recRegTime = recRegTime;
    }

    @Basic
    @Column(name = "rec_reg_user")
    public String getRecRegUser() {
        return recRegUser;
    }

    public void setRecRegUser(String recRegUser) {
        this.recRegUser = recRegUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordRegulationEntity that = (RecordRegulationEntity) o;
        return recRegId == that.recRegId &&
                Objects.equals(regulationId, that.regulationId) &&
                Objects.equals(recordDetailId, that.recordDetailId) &&
                Objects.equals(recordDetailField, that.recordDetailField) &&
                Objects.equals(recRegParamter, that.recRegParamter) &&
                Objects.equals(recRegOff, that.recRegOff) &&
                Objects.equals(recRegTime, that.recRegTime) &&
                Objects.equals(recRegUser, that.recRegUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recRegId, regulationId, recordDetailId, recordDetailField, recRegParamter, recRegOff, recRegTime, recRegUser);
    }
}
