package com.psc.statement.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "measure_point", schema = "psc1", catalog = "")
public class MeasurePointEntity {
    private int id;
    private BigDecimal altitude;
    private String details;
    private String images;
    private int jingliuId;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Integer measureMethod;
    private String measurePointName;
    private String measurePointNumber;
    private Integer measurePointType;
    private int minorDrainageBasinId;
    private int deviceId;

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
    @Column(name = "details")
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Basic
    @Column(name = "images")
    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Basic
    @Column(name = "jingliu_id")
    public int getJingliuId() {
        return jingliuId;
    }

    public void setJingliuId(int jingliuId) {
        this.jingliuId = jingliuId;
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
    @Column(name = "measure_method")
    public Integer getMeasureMethod() {
        return measureMethod;
    }

    public void setMeasureMethod(Integer measureMethod) {
        this.measureMethod = measureMethod;
    }

    @Basic
    @Column(name = "measure_point_name")
    public String getMeasurePointName() {
        return measurePointName;
    }

    public void setMeasurePointName(String measurePointName) {
        this.measurePointName = measurePointName;
    }

    @Basic
    @Column(name = "measure_point_number")
    public String getMeasurePointNumber() {
        return measurePointNumber;
    }

    public void setMeasurePointNumber(String measurePointNumber) {
        this.measurePointNumber = measurePointNumber;
    }

    @Basic
    @Column(name = "measure_point_type")
    public Integer getMeasurePointType() {
        return measurePointType;
    }

    public void setMeasurePointType(Integer measurePointType) {
        this.measurePointType = measurePointType;
    }

    @Basic
    @Column(name = "minor_drainage_basin_id")
    public int getMinorDrainageBasinId() {
        return minorDrainageBasinId;
    }

    public void setMinorDrainageBasinId(int minorDrainageBasinId) {
        this.minorDrainageBasinId = minorDrainageBasinId;
    }

    @Basic
    @Column(name = "device_id")
    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeasurePointEntity that = (MeasurePointEntity) o;
        return id == that.id &&
                jingliuId == that.jingliuId &&
                minorDrainageBasinId == that.minorDrainageBasinId &&
                deviceId == that.deviceId &&
                Objects.equals(altitude, that.altitude) &&
                Objects.equals(details, that.details) &&
                Objects.equals(images, that.images) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(measureMethod, that.measureMethod) &&
                Objects.equals(measurePointName, that.measurePointName) &&
                Objects.equals(measurePointNumber, that.measurePointNumber) &&
                Objects.equals(measurePointType, that.measurePointType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, altitude, details, images, jingliuId, latitude, longitude, measureMethod, measurePointName, measurePointNumber, measurePointType, minorDrainageBasinId, deviceId);
    }
}
