package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "rain_data", schema = "psc1", catalog = "")
public class RainDataEntity {
    private int id;
    private int duration;
    private double e;
    private double i30;
    private double precipitation;
    private double r;
    private int state;
    private String stationId;
    private Timestamp time;

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
    @Column(name = "state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Basic
    @Column(name = "station_id")
    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    @Basic
    @Column(name = "time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RainDataEntity that = (RainDataEntity) o;
        return id == that.id &&
                duration == that.duration &&
                Double.compare(that.e, e) == 0 &&
                Double.compare(that.i30, i30) == 0 &&
                Double.compare(that.precipitation, precipitation) == 0 &&
                Double.compare(that.r, r) == 0 &&
                state == that.state &&
                Objects.equals(stationId, that.stationId) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, duration, e, i30, precipitation, r, state, stationId, time);
    }
}
