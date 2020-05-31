package com.psc.statement.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "basic_infomation_of_minor_drainage_basin", schema = "psc1", catalog = "")
public class BasicInfomationOfMinorDrainageBasinEntity {
    private int id;
    private BigDecimal altitude;
    private BigDecimal averageAltitude;
    private BigDecimal basinLength;
    private BigDecimal basinShapeFactor;
    private int climaticCharacteristicsId;
    private String code;
    private BigDecimal drainageArea;
    private Integer drainageCharacteristic;
    private String feild1;
    private BigDecimal gullyDensity;
    private BigDecimal highestAltitude;
    private String landUseStructure;
    private BigDecimal latitude;
    private String location;
    private BigDecimal longitude;
    private BigDecimal lowestAltitude;
    private BigDecimal mainChannelVerticalGradient;
    private Integer slopeClassification;
    private int socioeconomicStatusId;
    private int soilErosionId;

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
    @Column(name = "average_altitude")
    public BigDecimal getAverageAltitude() {
        return averageAltitude;
    }

    public void setAverageAltitude(BigDecimal averageAltitude) {
        this.averageAltitude = averageAltitude;
    }

    @Basic
    @Column(name = "basin_length")
    public BigDecimal getBasinLength() {
        return basinLength;
    }

    public void setBasinLength(BigDecimal basinLength) {
        this.basinLength = basinLength;
    }

    @Basic
    @Column(name = "basin_shape_factor")
    public BigDecimal getBasinShapeFactor() {
        return basinShapeFactor;
    }

    public void setBasinShapeFactor(BigDecimal basinShapeFactor) {
        this.basinShapeFactor = basinShapeFactor;
    }

    @Basic
    @Column(name = "climatic_characteristics_id")
    public int getClimaticCharacteristicsId() {
        return climaticCharacteristicsId;
    }

    public void setClimaticCharacteristicsId(int climaticCharacteristicsId) {
        this.climaticCharacteristicsId = climaticCharacteristicsId;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "drainage_area")
    public BigDecimal getDrainageArea() {
        return drainageArea;
    }

    public void setDrainageArea(BigDecimal drainageArea) {
        this.drainageArea = drainageArea;
    }

    @Basic
    @Column(name = "drainage_characteristic")
    public Integer getDrainageCharacteristic() {
        return drainageCharacteristic;
    }

    public void setDrainageCharacteristic(Integer drainageCharacteristic) {
        this.drainageCharacteristic = drainageCharacteristic;
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
    @Column(name = "gully_density")
    public BigDecimal getGullyDensity() {
        return gullyDensity;
    }

    public void setGullyDensity(BigDecimal gullyDensity) {
        this.gullyDensity = gullyDensity;
    }

    @Basic
    @Column(name = "highest_altitude")
    public BigDecimal getHighestAltitude() {
        return highestAltitude;
    }

    public void setHighestAltitude(BigDecimal highestAltitude) {
        this.highestAltitude = highestAltitude;
    }

    @Basic
    @Column(name = "land_use_structure")
    public String getLandUseStructure() {
        return landUseStructure;
    }

    public void setLandUseStructure(String landUseStructure) {
        this.landUseStructure = landUseStructure;
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
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
    @Column(name = "lowest_altitude")
    public BigDecimal getLowestAltitude() {
        return lowestAltitude;
    }

    public void setLowestAltitude(BigDecimal lowestAltitude) {
        this.lowestAltitude = lowestAltitude;
    }

    @Basic
    @Column(name = "main_channel_vertical_gradient")
    public BigDecimal getMainChannelVerticalGradient() {
        return mainChannelVerticalGradient;
    }

    public void setMainChannelVerticalGradient(BigDecimal mainChannelVerticalGradient) {
        this.mainChannelVerticalGradient = mainChannelVerticalGradient;
    }

    @Basic
    @Column(name = "slope_classification_")
    public Integer getSlopeClassification() {
        return slopeClassification;
    }

    public void setSlopeClassification(Integer slopeClassification) {
        this.slopeClassification = slopeClassification;
    }

    @Basic
    @Column(name = "socioeconomic_status_id")
    public int getSocioeconomicStatusId() {
        return socioeconomicStatusId;
    }

    public void setSocioeconomicStatusId(int socioeconomicStatusId) {
        this.socioeconomicStatusId = socioeconomicStatusId;
    }

    @Basic
    @Column(name = "soil_erosion_id")
    public int getSoilErosionId() {
        return soilErosionId;
    }

    public void setSoilErosionId(int soilErosionId) {
        this.soilErosionId = soilErosionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicInfomationOfMinorDrainageBasinEntity that = (BasicInfomationOfMinorDrainageBasinEntity) o;
        return id == that.id &&
                climaticCharacteristicsId == that.climaticCharacteristicsId &&
                socioeconomicStatusId == that.socioeconomicStatusId &&
                soilErosionId == that.soilErosionId &&
                Objects.equals(altitude, that.altitude) &&
                Objects.equals(averageAltitude, that.averageAltitude) &&
                Objects.equals(basinLength, that.basinLength) &&
                Objects.equals(basinShapeFactor, that.basinShapeFactor) &&
                Objects.equals(code, that.code) &&
                Objects.equals(drainageArea, that.drainageArea) &&
                Objects.equals(drainageCharacteristic, that.drainageCharacteristic) &&
                Objects.equals(feild1, that.feild1) &&
                Objects.equals(gullyDensity, that.gullyDensity) &&
                Objects.equals(highestAltitude, that.highestAltitude) &&
                Objects.equals(landUseStructure, that.landUseStructure) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(location, that.location) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(lowestAltitude, that.lowestAltitude) &&
                Objects.equals(mainChannelVerticalGradient, that.mainChannelVerticalGradient) &&
                Objects.equals(slopeClassification, that.slopeClassification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, altitude, averageAltitude, basinLength, basinShapeFactor, climaticCharacteristicsId, code, drainageArea, drainageCharacteristic, feild1, gullyDensity, highestAltitude, landUseStructure, latitude, location, longitude, lowestAltitude, mainChannelVerticalGradient, slopeClassification, socioeconomicStatusId, soilErosionId);
    }
}
