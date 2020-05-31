package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "flow_calculate_coefficient", schema = "psc1", catalog = "")
public class FlowCalculateCoefficientEntity {
    private int id;
    private Double angle;
    private String cd;
    private int currentFacility;
    private String drainageBasinId;
    private String drainageBasinName;
    private Double weirWidth;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "angle")
    public Double getAngle() {
        return angle;
    }

    public void setAngle(Double angle) {
        this.angle = angle;
    }

    @Basic
    @Column(name = "cd")
    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    @Basic
    @Column(name = "current_facility")
    public int getCurrentFacility() {
        return currentFacility;
    }

    public void setCurrentFacility(int currentFacility) {
        this.currentFacility = currentFacility;
    }

    @Basic
    @Column(name = "drainage_basin_id")
    public String getDrainageBasinId() {
        return drainageBasinId;
    }

    public void setDrainageBasinId(String drainageBasinId) {
        this.drainageBasinId = drainageBasinId;
    }

    @Basic
    @Column(name = "drainage_basin_name")
    public String getDrainageBasinName() {
        return drainageBasinName;
    }

    public void setDrainageBasinName(String drainageBasinName) {
        this.drainageBasinName = drainageBasinName;
    }

    @Basic
    @Column(name = "weir_width")
    public Double getWeirWidth() {
        return weirWidth;
    }

    public void setWeirWidth(Double weirWidth) {
        this.weirWidth = weirWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowCalculateCoefficientEntity that = (FlowCalculateCoefficientEntity) o;
        return id == that.id &&
                currentFacility == that.currentFacility &&
                Objects.equals(angle, that.angle) &&
                Objects.equals(cd, that.cd) &&
                Objects.equals(drainageBasinId, that.drainageBasinId) &&
                Objects.equals(drainageBasinName, that.drainageBasinName) &&
                Objects.equals(weirWidth, that.weirWidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, angle, cd, currentFacility, drainageBasinId, drainageBasinName, weirWidth);
    }
}
