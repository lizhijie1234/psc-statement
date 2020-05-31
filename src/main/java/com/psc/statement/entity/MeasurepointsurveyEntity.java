package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "measurepointsurvey", schema = "psc1", catalog = "")
public class MeasurepointsurveyEntity {
    private int id;
    private int measurePointId;
    private int longitude;
    private Timestamp suveyTime;
    private int suveyPersonId;
    private String status;
    private int latitude;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "measurePointId")
    public int getMeasurePointId() {
        return measurePointId;
    }

    public void setMeasurePointId(int measurePointId) {
        this.measurePointId = measurePointId;
    }

    @Basic
    @Column(name = "longitude")
    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "suveyTime")
    public Timestamp getSuveyTime() {
        return suveyTime;
    }

    public void setSuveyTime(Timestamp suveyTime) {
        this.suveyTime = suveyTime;
    }

    @Basic
    @Column(name = "suveyPersonId")
    public int getSuveyPersonId() {
        return suveyPersonId;
    }

    public void setSuveyPersonId(int suveyPersonId) {
        this.suveyPersonId = suveyPersonId;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "latitude")
    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeasurepointsurveyEntity that = (MeasurepointsurveyEntity) o;
        return id == that.id &&
                measurePointId == that.measurePointId &&
                longitude == that.longitude &&
                suveyPersonId == that.suveyPersonId &&
                latitude == that.latitude &&
                Objects.equals(suveyTime, that.suveyTime) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, measurePointId, longitude, suveyTime, suveyPersonId, status, latitude);
    }
}
