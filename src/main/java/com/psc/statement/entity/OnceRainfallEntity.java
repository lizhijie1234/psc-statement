package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "once_rainfall", schema = "psc1", catalog = "")
public class OnceRainfallEntity {
    private int id;
    private int duration;
    private double e;
    private Timestamp endTime;
    private double i30;
    private double precipitation;
    private double r;
    private Timestamp startTime;
    private String stationId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "duration")
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "e")
    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
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
    @Column(name = "i30")
    public double getI30() {
        return i30;
    }

    public void setI30(double i30) {
        this.i30 = i30;
    }

    @Basic
    @Column(name = "precipitation")
    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    @Basic
    @Column(name = "r")
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
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
    @Column(name = "station_id")
    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnceRainfallEntity that = (OnceRainfallEntity) o;
        return id == that.id &&
                duration == that.duration &&
                Double.compare(that.e, e) == 0 &&
                Double.compare(that.i30, i30) == 0 &&
                Double.compare(that.precipitation, precipitation) == 0 &&
                Double.compare(that.r, r) == 0 &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(stationId, that.stationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, duration, e, endTime, i30, precipitation, r, startTime, stationId);
    }
}
