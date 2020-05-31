package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "counselor_schedule", schema = "psc1", catalog = "")
public class CounselorScheduleEntity {
    private int id;
    private Integer counselorId;
    private Date date;
    private Timestamp endTime;
    private Integer reservedCount;
    private Integer serveCount;
    private Timestamp startTime;
    private Byte status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "counselor_id")
    public Integer getCounselorId() {
        return counselorId;
    }

    public void setCounselorId(Integer counselorId) {
        this.counselorId = counselorId;
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
    @Column(name = "end_time")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "reserved_count")
    public Integer getReservedCount() {
        return reservedCount;
    }

    public void setReservedCount(Integer reservedCount) {
        this.reservedCount = reservedCount;
    }

    @Basic
    @Column(name = "serve_count")
    public Integer getServeCount() {
        return serveCount;
    }

    public void setServeCount(Integer serveCount) {
        this.serveCount = serveCount;
    }

    @Basic
    @Column(name = "start_time")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "status")
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CounselorScheduleEntity that = (CounselorScheduleEntity) o;
        return id == that.id &&
                Objects.equals(counselorId, that.counselorId) &&
                Objects.equals(date, that.date) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(reservedCount, that.reservedCount) &&
                Objects.equals(serveCount, that.serveCount) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, counselorId, date, endTime, reservedCount, serveCount, startTime, status);
    }
}
