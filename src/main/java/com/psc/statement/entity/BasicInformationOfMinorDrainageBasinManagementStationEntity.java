package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "basic_information_of_minor_drainage_basin_management_station", schema = "psc1", catalog = "")
public class BasicInformationOfMinorDrainageBasinManagementStationEntity {
    private int id;
    private Double altitude;
    private String currentFacility;
    private String feild1;
    private Double latitude;
    private String location;
    private Double longitude;
    private int minorDrainageBasinId;
    private String name;
    private Timestamp yearOfBuild;

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
    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    @Basic
    @Column(name = "current_facility")
    public String getCurrentFacility() {
        return currentFacility;
    }

    public void setCurrentFacility(String currentFacility) {
        this.currentFacility = currentFacility;
    }

    @Basic
    @Column(name = "feild1")
    public String getFeild1() {
        return feild1;
    }

    public void setFeild1(String feild1) {
        this.feild1 = feild1;
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
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
    @Column(name = "minor_drainage_basin_id")
    public int getMinorDrainageBasinId() {
        return minorDrainageBasinId;
    }

    public void setMinorDrainageBasinId(int minorDrainageBasinId) {
        this.minorDrainageBasinId = minorDrainageBasinId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "year_of_build")
    public Timestamp getYearOfBuild() {
        return yearOfBuild;
    }

    public void setYearOfBuild(Timestamp yearOfBuild) {
        this.yearOfBuild = yearOfBuild;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicInformationOfMinorDrainageBasinManagementStationEntity that = (BasicInformationOfMinorDrainageBasinManagementStationEntity) o;
        return id == that.id &&
                minorDrainageBasinId == that.minorDrainageBasinId &&
                Objects.equals(altitude, that.altitude) &&
                Objects.equals(currentFacility, that.currentFacility) &&
                Objects.equals(feild1, that.feild1) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(location, that.location) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(name, that.name) &&
                Objects.equals(yearOfBuild, that.yearOfBuild);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, altitude, currentFacility, feild1, latitude, location, longitude, minorDrainageBasinId, name, yearOfBuild);
    }
}
