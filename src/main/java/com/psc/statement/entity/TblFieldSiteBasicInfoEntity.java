package com.psc.statement.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "tbl_field_site_basic_info", schema = "psc1", catalog = "")
public class TblFieldSiteBasicInfoEntity {
    private int id;
    private BigDecimal altitude;
    private int deviceId;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String siteName;
    private int siteNumber;

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
    @Column(name = "site_name")
    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    @Basic
    @Column(name = "site_number")
    public int getSiteNumber() {
        return siteNumber;
    }

    public void setSiteNumber(int siteNumber) {
        this.siteNumber = siteNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblFieldSiteBasicInfoEntity that = (TblFieldSiteBasicInfoEntity) o;
        return id == that.id &&
                deviceId == that.deviceId &&
                siteNumber == that.siteNumber &&
                Objects.equals(altitude, that.altitude) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(siteName, that.siteName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, altitude, deviceId, latitude, longitude, siteName, siteNumber);
    }
}
