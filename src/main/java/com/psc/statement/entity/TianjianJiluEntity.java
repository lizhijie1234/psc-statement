package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tianjian_jilu", schema = "psc1", catalog = "")
public class TianjianJiluEntity {
    private int id;
    private int qid;
    private String aim;
    private Date date;
    private String fieldOperation;
    private String tool;
    private Double soilTillageDepth;
    private String noteTaker;
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
    @Column(name = "Aim")
    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "Field_operation")
    public String getFieldOperation() {
        return fieldOperation;
    }

    public void setFieldOperation(String fieldOperation) {
        this.fieldOperation = fieldOperation;
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
    @Column(name = "Soil_tillage_depth")
    public Double getSoilTillageDepth() {
        return soilTillageDepth;
    }

    public void setSoilTillageDepth(Double soilTillageDepth) {
        this.soilTillageDepth = soilTillageDepth;
    }

    @Basic
    @Column(name = "Note_taker")
    public String getNoteTaker() {
        return noteTaker;
    }

    public void setNoteTaker(String noteTaker) {
        this.noteTaker = noteTaker;
    }

    @Basic
    @Column(name = "Auditor")
    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    @Basic
    @Column(name = "State")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "Remark")
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
        TianjianJiluEntity that = (TianjianJiluEntity) o;
        return id == that.id &&
                qid == that.qid &&
                Objects.equals(aim, that.aim) &&
                Objects.equals(date, that.date) &&
                Objects.equals(fieldOperation, that.fieldOperation) &&
                Objects.equals(tool, that.tool) &&
                Objects.equals(soilTillageDepth, that.soilTillageDepth) &&
                Objects.equals(noteTaker, that.noteTaker) &&
                Objects.equals(auditor, that.auditor) &&
                Objects.equals(state, that.state) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qid, aim, date, fieldOperation, tool, soilTillageDepth, noteTaker, auditor, state, remark, status);
    }
}
