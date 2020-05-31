package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "daily_rain_record", schema = "psc1", catalog = "")
public class DailyRainRecordEntity {
    private int id;
    private int year;
    private int month;
    private int day;
    private double precipitation;
    private int stationId;
    private double longitude;
    private double latitude;
    private boolean runoff;
    private String observer;
    private String examiner;
    private int state;
    private String remark;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "year")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Basic
    @Column(name = "month")
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Basic
    @Column(name = "day")
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
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
    @Column(name = "stationId")
    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    @Basic
    @Column(name = "longitude")
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "latitude")
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "runoff")
    public boolean isRunoff() {
        return runoff;
    }

    public void setRunoff(boolean runoff) {
        this.runoff = runoff;
    }

    @Basic
    @Column(name = "observer")
    public String getObserver() {
        return observer;
    }

    public void setObserver(String observer) {
        this.observer = observer;
    }

    @Basic
    @Column(name = "examiner")
    public String getExaminer() {
        return examiner;
    }

    public void setExaminer(String examiner) {
        this.examiner = examiner;
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
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DailyRainRecordEntity that = (DailyRainRecordEntity) o;
        return id == that.id &&
                year == that.year &&
                month == that.month &&
                day == that.day &&
                Double.compare(that.precipitation, precipitation) == 0 &&
                stationId == that.stationId &&
                Double.compare(that.longitude, longitude) == 0 &&
                Double.compare(that.latitude, latitude) == 0 &&
                runoff == that.runoff &&
                state == that.state &&
                Objects.equals(observer, that.observer) &&
                Objects.equals(examiner, that.examiner) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year, month, day, precipitation, stationId, longitude, latitude, runoff, observer, examiner, state, remark);
    }
}
