package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lindi_info", schema = "psc1", catalog = "")
public class LindiInfoEntity {
    private int id;
    private String afforestationMethod;
    private Double averageCrownDiameter;
    private Double canopyDensity;
    private Double coverage;
    private Double plantSpacing;
    private Double rowSpacing;
    private Double standAge;
    private String treeSpecie;
    private Double undergrowthVegetationAverageHeight;
    private String undergrowthVegetationMainType;
    private String undergrowthVegetationType;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "afforestation_method")
    public String getAfforestationMethod() {
        return afforestationMethod;
    }

    public void setAfforestationMethod(String afforestationMethod) {
        this.afforestationMethod = afforestationMethod;
    }

    @Basic
    @Column(name = "average_crown_diameter")
    public Double getAverageCrownDiameter() {
        return averageCrownDiameter;
    }

    public void setAverageCrownDiameter(Double averageCrownDiameter) {
        this.averageCrownDiameter = averageCrownDiameter;
    }

    @Basic
    @Column(name = "canopy_density")
    public Double getCanopyDensity() {
        return canopyDensity;
    }

    public void setCanopyDensity(Double canopyDensity) {
        this.canopyDensity = canopyDensity;
    }

    @Basic
    @Column(name = "coverage")
    public Double getCoverage() {
        return coverage;
    }

    public void setCoverage(Double coverage) {
        this.coverage = coverage;
    }

    @Basic
    @Column(name = "plant_spacing")
    public Double getPlantSpacing() {
        return plantSpacing;
    }

    public void setPlantSpacing(Double plantSpacing) {
        this.plantSpacing = plantSpacing;
    }

    @Basic
    @Column(name = "row_spacing")
    public Double getRowSpacing() {
        return rowSpacing;
    }

    public void setRowSpacing(Double rowSpacing) {
        this.rowSpacing = rowSpacing;
    }

    @Basic
    @Column(name = "stand_age")
    public Double getStandAge() {
        return standAge;
    }

    public void setStandAge(Double standAge) {
        this.standAge = standAge;
    }

    @Basic
    @Column(name = "tree_specie")
    public String getTreeSpecie() {
        return treeSpecie;
    }

    public void setTreeSpecie(String treeSpecie) {
        this.treeSpecie = treeSpecie;
    }

    @Basic
    @Column(name = "undergrowth_vegetation_average_height")
    public Double getUndergrowthVegetationAverageHeight() {
        return undergrowthVegetationAverageHeight;
    }

    public void setUndergrowthVegetationAverageHeight(Double undergrowthVegetationAverageHeight) {
        this.undergrowthVegetationAverageHeight = undergrowthVegetationAverageHeight;
    }

    @Basic
    @Column(name = "undergrowth_vegetation_main_type")
    public String getUndergrowthVegetationMainType() {
        return undergrowthVegetationMainType;
    }

    public void setUndergrowthVegetationMainType(String undergrowthVegetationMainType) {
        this.undergrowthVegetationMainType = undergrowthVegetationMainType;
    }

    @Basic
    @Column(name = "undergrowth_vegetation_type")
    public String getUndergrowthVegetationType() {
        return undergrowthVegetationType;
    }

    public void setUndergrowthVegetationType(String undergrowthVegetationType) {
        this.undergrowthVegetationType = undergrowthVegetationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LindiInfoEntity that = (LindiInfoEntity) o;
        return id == that.id &&
                Objects.equals(afforestationMethod, that.afforestationMethod) &&
                Objects.equals(averageCrownDiameter, that.averageCrownDiameter) &&
                Objects.equals(canopyDensity, that.canopyDensity) &&
                Objects.equals(coverage, that.coverage) &&
                Objects.equals(plantSpacing, that.plantSpacing) &&
                Objects.equals(rowSpacing, that.rowSpacing) &&
                Objects.equals(standAge, that.standAge) &&
                Objects.equals(treeSpecie, that.treeSpecie) &&
                Objects.equals(undergrowthVegetationAverageHeight, that.undergrowthVegetationAverageHeight) &&
                Objects.equals(undergrowthVegetationMainType, that.undergrowthVegetationMainType) &&
                Objects.equals(undergrowthVegetationType, that.undergrowthVegetationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, afforestationMethod, averageCrownDiameter, canopyDensity, coverage, plantSpacing, rowSpacing, standAge, treeSpecie, undergrowthVegetationAverageHeight, undergrowthVegetationMainType, undergrowthVegetationType);
    }
}
