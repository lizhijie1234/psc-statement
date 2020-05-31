package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "guancaodi_info", schema = "psc1", catalog = "")
public class GuancaodiInfoEntity {
    private int id;
    private Double averageHeight;
    private Double biomass;
    private Double coverage;
    private Double forageYield;
    private Timestamp harvestDate;
    private String seedingMethod;
    private String shrubGrassSpecie;
    private Timestamp sowingDate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "average_height")
    public Double getAverageHeight() {
        return averageHeight;
    }

    public void setAverageHeight(Double averageHeight) {
        this.averageHeight = averageHeight;
    }

    @Basic
    @Column(name = "biomass")
    public Double getBiomass() {
        return biomass;
    }

    public void setBiomass(Double biomass) {
        this.biomass = biomass;
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
    @Column(name = "forage_yield")
    public Double getForageYield() {
        return forageYield;
    }

    public void setForageYield(Double forageYield) {
        this.forageYield = forageYield;
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
    @Column(name = "seeding_method")
    public String getSeedingMethod() {
        return seedingMethod;
    }

    public void setSeedingMethod(String seedingMethod) {
        this.seedingMethod = seedingMethod;
    }

    @Basic
    @Column(name = "shrub_grass_specie")
    public String getShrubGrassSpecie() {
        return shrubGrassSpecie;
    }

    public void setShrubGrassSpecie(String shrubGrassSpecie) {
        this.shrubGrassSpecie = shrubGrassSpecie;
    }

    @Basic
    @Column(name = "sowing_date")
    public Timestamp getSowingDate() {
        return sowingDate;
    }

    public void setSowingDate(Timestamp sowingDate) {
        this.sowingDate = sowingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuancaodiInfoEntity that = (GuancaodiInfoEntity) o;
        return id == that.id &&
                Objects.equals(averageHeight, that.averageHeight) &&
                Objects.equals(biomass, that.biomass) &&
                Objects.equals(coverage, that.coverage) &&
                Objects.equals(forageYield, that.forageYield) &&
                Objects.equals(harvestDate, that.harvestDate) &&
                Objects.equals(seedingMethod, that.seedingMethod) &&
                Objects.equals(shrubGrassSpecie, that.shrubGrassSpecie) &&
                Objects.equals(sowingDate, that.sowingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, averageHeight, biomass, coverage, forageYield, harvestDate, seedingMethod, shrubGrassSpecie, sowingDate);
    }
}
