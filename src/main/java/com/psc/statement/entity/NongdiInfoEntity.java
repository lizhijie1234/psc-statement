package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "nongdi_info", schema = "psc1", catalog = "")
public class NongdiInfoEntity {
    private int id;
    private String crop;
    private Timestamp cultivationDate;
    private Double density;
    private Double grainYield;
    private Timestamp harvestDate;
    private Double plantSpacing;
    private Double pureFertilizerAmount;
    private Double ridgeSpacing;
    private Double rowSpacing;
    private String seedingMethod;
    private String sitePreparationMethod;
    private Timestamp sowingDate;
    private Double strawYield;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "crop")
    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    @Basic
    @Column(name = "cultivation_date")
    public Timestamp getCultivationDate() {
        return cultivationDate;
    }

    public void setCultivationDate(Timestamp cultivationDate) {
        this.cultivationDate = cultivationDate;
    }

    @Basic
    @Column(name = "density")
    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    @Basic
    @Column(name = "grain_yield")
    public Double getGrainYield() {
        return grainYield;
    }

    public void setGrainYield(Double grainYield) {
        this.grainYield = grainYield;
    }

    @Basic
    @Column(name = "harvest_date")
    public Timestamp getHarvestDate() {
        return harvestDate;
    }

    public void setHarvestDate(Timestamp harvestDate) {
        this.harvestDate = harvestDate;
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
    @Column(name = "pure_fertilizer_amount")
    public Double getPureFertilizerAmount() {
        return pureFertilizerAmount;
    }

    public void setPureFertilizerAmount(Double pureFertilizerAmount) {
        this.pureFertilizerAmount = pureFertilizerAmount;
    }

    @Basic
    @Column(name = "ridge_spacing")
    public Double getRidgeSpacing() {
        return ridgeSpacing;
    }

    public void setRidgeSpacing(Double ridgeSpacing) {
        this.ridgeSpacing = ridgeSpacing;
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
    @Column(name = "seeding_method")
    public String getSeedingMethod() {
        return seedingMethod;
    }

    public void setSeedingMethod(String seedingMethod) {
        this.seedingMethod = seedingMethod;
    }

    @Basic
    @Column(name = "site_preparation_method")
    public String getSitePreparationMethod() {
        return sitePreparationMethod;
    }

    public void setSitePreparationMethod(String sitePreparationMethod) {
        this.sitePreparationMethod = sitePreparationMethod;
    }

    @Basic
    @Column(name = "sowing_date")
    public Timestamp getSowingDate() {
        return sowingDate;
    }

    public void setSowingDate(Timestamp sowingDate) {
        this.sowingDate = sowingDate;
    }

    @Basic
    @Column(name = "straw_yield")
    public Double getStrawYield() {
        return strawYield;
    }

    public void setStrawYield(Double strawYield) {
        this.strawYield = strawYield;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NongdiInfoEntity that = (NongdiInfoEntity) o;
        return id == that.id &&
                Objects.equals(crop, that.crop) &&
                Objects.equals(cultivationDate, that.cultivationDate) &&
                Objects.equals(density, that.density) &&
                Objects.equals(grainYield, that.grainYield) &&
                Objects.equals(harvestDate, that.harvestDate) &&
                Objects.equals(plantSpacing, that.plantSpacing) &&
                Objects.equals(pureFertilizerAmount, that.pureFertilizerAmount) &&
                Objects.equals(ridgeSpacing, that.ridgeSpacing) &&
                Objects.equals(rowSpacing, that.rowSpacing) &&
                Objects.equals(seedingMethod, that.seedingMethod) &&
                Objects.equals(sitePreparationMethod, that.sitePreparationMethod) &&
                Objects.equals(sowingDate, that.sowingDate) &&
                Objects.equals(strawYield, that.strawYield);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, crop, cultivationDate, density, grainYield, harvestDate, plantSpacing, pureFertilizerAmount, ridgeSpacing, rowSpacing, seedingMethod, sitePreparationMethod, sowingDate, strawYield);
    }
}
