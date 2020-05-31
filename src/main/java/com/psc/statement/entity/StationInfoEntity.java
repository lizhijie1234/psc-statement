package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "station_info", schema = "psc1", catalog = "")
public class StationInfoEntity {
    private int id;
    private String stationCode;
    private String stationName;
    private Double longitude;
    private Double latitude;
    private Double altitude;
    private int deviceId;
    private String image;
    private String details;
    private Integer stationState;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "stationCode")
    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    @Basic
    @Column(name = "stationName")
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Basic
    @Column(name = "longitude")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "latitude")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "altitude")
    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    @Basic
    @Column(name = "deviceId")
    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "details")
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Basic
    @Column(name = "stationState")
    public Integer getStationState() {
        return stationState;
    }

    public void setStationState(Integer stationState) {
        this.stationState = stationState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StationInfoEntity that = (StationInfoEntity) o;
        return id == that.id &&
                deviceId == that.deviceId &&
                Objects.equals(stationCode, that.stationCode) &&
                Objects.equals(stationName, that.stationName) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(altitude, that.altitude) &&
                Objects.equals(image, that.image) &&
                Objects.equals(details, that.details) &&
                Objects.equals(stationState, that.stationState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stationCode, stationName, longitude, latitude, altitude, deviceId, image, details, stationState);
    }
}
