package com.psc.statement.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "jingliu_info", schema = "psc1", catalog = "")
public class JingliuInfoEntity {
    private int id;
    private String aim;
    private BigDecimal altitude;
    private Double area;
    private Timestamp buildYear;
    private Integer collectingTanks;
    private Double collectingTankscas;
    private String conservationMeasures;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String observation;
    private String purpose;
    private String qCode;
    private String remark;
    private Integer shuntLevel1;
    private Double shuntLevel1Cas;
    private Integer shuntLevel2;
    private Double shuntLevel2Cas;
    private Double slope;
    private Double slopeAspect;
    private Double slopeLength;
    private String slopePosition;
    private Double slopeWidth;
    private String soilThickness;
    private String soilType;
    private Integer tapHoleNum1;
    private Integer tapHoleNum2;
    private Integer zType;
    private Integer zId;
    private Integer deviceId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "aim")
    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
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
    @Column(name = "area")
    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Basic
    @Column(name = "build_year")
    public Timestamp getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(Timestamp buildYear) {
        this.buildYear = buildYear;
    }

    @Basic
    @Column(name = "collecting_tanks")
    public Integer getCollectingTanks() {
        return collectingTanks;
    }

    public void setCollectingTanks(Integer collectingTanks) {
        this.collectingTanks = collectingTanks;
    }

    @Basic
    @Column(name = "collecting_tankscas")
    public Double getCollectingTankscas() {
        return collectingTankscas;
    }

    public void setCollectingTankscas(Double collectingTankscas) {
        this.collectingTankscas = collectingTankscas;
    }

    @Basic
    @Column(name = "conservation_measures")
    public String getConservationMeasures() {
        return conservationMeasures;
    }

    public void setConservationMeasures(String conservationMeasures) {
        this.conservationMeasures = conservationMeasures;
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
    @Column(name = "observation")
    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Basic
    @Column(name = "purpose")
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Basic
    @Column(name = "q_code")
    public String getqCode() {
        return qCode;
    }

    public void setqCode(String qCode) {
        this.qCode = qCode;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "shunt_level1")
    public Integer getShuntLevel1() {
        return shuntLevel1;
    }

    public void setShuntLevel1(Integer shuntLevel1) {
        this.shuntLevel1 = shuntLevel1;
    }

    @Basic
    @Column(name = "shunt_level1cas")
    public Double getShuntLevel1Cas() {
        return shuntLevel1Cas;
    }

    public void setShuntLevel1Cas(Double shuntLevel1Cas) {
        this.shuntLevel1Cas = shuntLevel1Cas;
    }

    @Basic
    @Column(name = "shunt_level2")
    public Integer getShuntLevel2() {
        return shuntLevel2;
    }

    public void setShuntLevel2(Integer shuntLevel2) {
        this.shuntLevel2 = shuntLevel2;
    }

    @Basic
    @Column(name = "shunt_level2cas")
    public Double getShuntLevel2Cas() {
        return shuntLevel2Cas;
    }

    public void setShuntLevel2Cas(Double shuntLevel2Cas) {
        this.shuntLevel2Cas = shuntLevel2Cas;
    }

    @Basic
    @Column(name = "slope")
    public Double getSlope() {
        return slope;
    }

    public void setSlope(Double slope) {
        this.slope = slope;
    }

    @Basic
    @Column(name = "slope_aspect")
    public Double getSlopeAspect() {
        return slopeAspect;
    }

    public void setSlopeAspect(Double slopeAspect) {
        this.slopeAspect = slopeAspect;
    }

    @Basic
    @Column(name = "slope_length")
    public Double getSlopeLength() {
        return slopeLength;
    }

    public void setSlopeLength(Double slopeLength) {
        this.slopeLength = slopeLength;
    }

    @Basic
    @Column(name = "slope_position")
    public String getSlopePosition() {
        return slopePosition;
    }

    public void setSlopePosition(String slopePosition) {
        this.slopePosition = slopePosition;
    }

    @Basic
    @Column(name = "slope_width")
    public Double getSlopeWidth() {
        return slopeWidth;
    }

    public void setSlopeWidth(Double slopeWidth) {
        this.slopeWidth = slopeWidth;
    }

    @Basic
    @Column(name = "soil_thickness")
    public String getSoilThickness() {
        return soilThickness;
    }

    public void setSoilThickness(String soilThickness) {
        this.soilThickness = soilThickness;
    }

    @Basic
    @Column(name = "soil_type")
    public String getSoilType() {
        return soilType;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    @Basic
    @Column(name = "tap_hole_num1")
    public Integer getTapHoleNum1() {
        return tapHoleNum1;
    }

    public void setTapHoleNum1(Integer tapHoleNum1) {
        this.tapHoleNum1 = tapHoleNum1;
    }

    @Basic
    @Column(name = "tap_hole_num2")
    public Integer getTapHoleNum2() {
        return tapHoleNum2;
    }

    public void setTapHoleNum2(Integer tapHoleNum2) {
        this.tapHoleNum2 = tapHoleNum2;
    }

    @Basic
    @Column(name = "z_type")
    public Integer getzType() {
        return zType;
    }

    public void setzType(Integer zType) {
        this.zType = zType;
    }

    @Basic
    @Column(name = "z_id")
    public Integer getzId() {
        return zId;
    }

    public void setzId(Integer zId) {
        this.zId = zId;
    }

    @Basic
    @Column(name = "device_id")
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JingliuInfoEntity that = (JingliuInfoEntity) o;
        return id == that.id &&
                Objects.equals(aim, that.aim) &&
                Objects.equals(altitude, that.altitude) &&
                Objects.equals(area, that.area) &&
                Objects.equals(buildYear, that.buildYear) &&
                Objects.equals(collectingTanks, that.collectingTanks) &&
                Objects.equals(collectingTankscas, that.collectingTankscas) &&
                Objects.equals(conservationMeasures, that.conservationMeasures) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(observation, that.observation) &&
                Objects.equals(purpose, that.purpose) &&
                Objects.equals(qCode, that.qCode) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(shuntLevel1, that.shuntLevel1) &&
                Objects.equals(shuntLevel1Cas, that.shuntLevel1Cas) &&
                Objects.equals(shuntLevel2, that.shuntLevel2) &&
                Objects.equals(shuntLevel2Cas, that.shuntLevel2Cas) &&
                Objects.equals(slope, that.slope) &&
                Objects.equals(slopeAspect, that.slopeAspect) &&
                Objects.equals(slopeLength, that.slopeLength) &&
                Objects.equals(slopePosition, that.slopePosition) &&
                Objects.equals(slopeWidth, that.slopeWidth) &&
                Objects.equals(soilThickness, that.soilThickness) &&
                Objects.equals(soilType, that.soilType) &&
                Objects.equals(tapHoleNum1, that.tapHoleNum1) &&
                Objects.equals(tapHoleNum2, that.tapHoleNum2) &&
                Objects.equals(zType, that.zType) &&
                Objects.equals(zId, that.zId) &&
                Objects.equals(deviceId, that.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, aim, altitude, area, buildYear, collectingTanks, collectingTankscas, conservationMeasures, latitude, longitude, observation, purpose, qCode, remark, shuntLevel1, shuntLevel1Cas, shuntLevel2, shuntLevel2Cas, slope, slopeAspect, slopeLength, slopePosition, slopeWidth, soilThickness, soilType, tapHoleNum1, tapHoleNum2, zType, zId, deviceId);
    }
}
