package com.psc.statement.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "climatic_characteristics", schema = "psc1", catalog = "")
public class ClimaticCharacteristicsEntity {
    private int id;
    private BigDecimal accumulatedTemperature;
    private BigDecimal annualAverageTemperature;
    private BigDecimal annualEvaporation;
    private BigDecimal annualMaximumTemperature;
    private BigDecimal annualMinimumTemperature;
    private BigDecimal averageAnnualPrecipitation;
    private String feild1;
    private BigDecimal frostFreeSeason;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "accumulated_temperature")
    public BigDecimal getAccumulatedTemperature() {
        return accumulatedTemperature;
    }

    public void setAccumulatedTemperature(BigDecimal accumulatedTemperature) {
        this.accumulatedTemperature = accumulatedTemperature;
    }

    @Basic
    @Column(name = "annual_average_temperature")
    public BigDecimal getAnnualAverageTemperature() {
        return annualAverageTemperature;
    }

    public void setAnnualAverageTemperature(BigDecimal annualAverageTemperature) {
        this.annualAverageTemperature = annualAverageTemperature;
    }

    @Basic
    @Column(name = "annual_evaporation")
    public BigDecimal getAnnualEvaporation() {
        return annualEvaporation;
    }

    public void setAnnualEvaporation(BigDecimal annualEvaporation) {
        this.annualEvaporation = annualEvaporation;
    }

    @Basic
    @Column(name = "annual_maximum_temperature")
    public BigDecimal getAnnualMaximumTemperature() {
        return annualMaximumTemperature;
    }

    public void setAnnualMaximumTemperature(BigDecimal annualMaximumTemperature) {
        this.annualMaximumTemperature = annualMaximumTemperature;
    }

    @Basic
    @Column(name = "annual_minimum_temperature")
    public BigDecimal getAnnualMinimumTemperature() {
        return annualMinimumTemperature;
    }

    public void setAnnualMinimumTemperature(BigDecimal annualMinimumTemperature) {
        this.annualMinimumTemperature = annualMinimumTemperature;
    }

    @Basic
    @Column(name = "average_annual_precipitation")
    public BigDecimal getAverageAnnualPrecipitation() {
        return averageAnnualPrecipitation;
    }

    public void setAverageAnnualPrecipitation(BigDecimal averageAnnualPrecipitation) {
        this.averageAnnualPrecipitation = averageAnnualPrecipitation;
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
    @Column(name = "frost_free_season")
    public BigDecimal getFrostFreeSeason() {
        return frostFreeSeason;
    }

    public void setFrostFreeSeason(BigDecimal frostFreeSeason) {
        this.frostFreeSeason = frostFreeSeason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClimaticCharacteristicsEntity that = (ClimaticCharacteristicsEntity) o;
        return id == that.id &&
                Objects.equals(accumulatedTemperature, that.accumulatedTemperature) &&
                Objects.equals(annualAverageTemperature, that.annualAverageTemperature) &&
                Objects.equals(annualEvaporation, that.annualEvaporation) &&
                Objects.equals(annualMaximumTemperature, that.annualMaximumTemperature) &&
                Objects.equals(annualMinimumTemperature, that.annualMinimumTemperature) &&
                Objects.equals(averageAnnualPrecipitation, that.averageAnnualPrecipitation) &&
                Objects.equals(feild1, that.feild1) &&
                Objects.equals(frostFreeSeason, that.frostFreeSeason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accumulatedTemperature, annualAverageTemperature, annualEvaporation, annualMaximumTemperature, annualMinimumTemperature, averageAnnualPrecipitation, feild1, frostFreeSeason);
    }
}
