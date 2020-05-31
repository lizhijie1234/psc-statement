package com.psc.statement.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "wind_field_site", schema = "psc1", catalog = "")
public class WindFieldSiteEntity {
    private int id;
    private BigDecimal altitude;
    private int deviceId;
    private String explaination;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String ultilization;
    private String windFieldName;
    private String image;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "altitude")
    public BigDecimal getAltitude() {
        return altitude;
    }

    public void setAltitude(BigDecimal altitude) {
        this.altitude = altitude;
    }

    @Basic
    @Column(name = "device_id")
    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "explaination")
    public String getExplaination() {
        return explaination;
    }

    public void setExplaination(String explaination) {
        this.explaination = explaination;
    }

    @Basic
    @Column(name = "latitude")
    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude")
    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "ultilization")
    public String getUltilization() {
        return ultilization;
    }

    public void setUltilization(String ultilization) {
        this.ultilization = ultilization;
    }

    @Basic
    @Column(name = "wind_field_name")
    public String getWindFieldName() {
        return windFieldName;
    }

    public void setWindFieldName(String windFieldName) {
        this.windFieldName = windFieldName;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WindFieldSiteEntity that = (WindFieldSiteEntity) o;
        return id == that.id &&
                deviceId == that.deviceId &&
                Objects.equals(altitude, that.altitude) &&
                Objects.equals(explaination, that.explaination) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(ultilization, that.ultilization) &&
                Objects.equals(windFieldName, that.windFieldName) &&
                Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, altitude, deviceId, explaination, latitude, longitude, ultilization, windFieldName, image);
    }
}
