package com.psc.statement.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "soil_erosion", schema = "psc1", catalog = "")
public class SoilErosionEntity {
    private int id;
    private BigDecimal averageSedimentRunoffModulusOfDrainageBasin;
    private BigDecimal averageSoilThickness;
    private BigDecimal comprehensiveReclamationOfRiverBasin;
    private String feild1;
    private String mainSoilType;
    private BigDecimal soilErosionModulus;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "average_sediment_runoff_modulus_of_drainage_basin")
    public BigDecimal getAverageSedimentRunoffModulusOfDrainageBasin() {
        return averageSedimentRunoffModulusOfDrainageBasin;
    }

    public void setAverageSedimentRunoffModulusOfDrainageBasin(BigDecimal averageSedimentRunoffModulusOfDrainageBasin) {
        this.averageSedimentRunoffModulusOfDrainageBasin = averageSedimentRunoffModulusOfDrainageBasin;
    }

    @Basic
    @Column(name = "average_soil_thickness")
    public BigDecimal getAverageSoilThickness() {
        return averageSoilThickness;
    }

    public void setAverageSoilThickness(BigDecimal averageSoilThickness) {
        this.averageSoilThickness = averageSoilThickness;
    }

    @Basic
    @Column(name = "comprehensive_reclamation_of_river_basin")
    public BigDecimal getComprehensiveReclamationOfRiverBasin() {
        return comprehensiveReclamationOfRiverBasin;
    }

    public void setComprehensiveReclamationOfRiverBasin(BigDecimal comprehensiveReclamationOfRiverBasin) {
        this.comprehensiveReclamationOfRiverBasin = comprehensiveReclamationOfRiverBasin;
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
    @Column(name = "main_soil_type")
    public String getMainSoilType() {
        return mainSoilType;
    }

    public void setMainSoilType(String mainSoilType) {
        this.mainSoilType = mainSoilType;
    }

    @Basic
    @Column(name = "soil_erosion_modulus")
    public BigDecimal getSoilErosionModulus() {
        return soilErosionModulus;
    }

    public void setSoilErosionModulus(BigDecimal soilErosionModulus) {
        this.soilErosionModulus = soilErosionModulus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoilErosionEntity that = (SoilErosionEntity) o;
        return id == that.id &&
                Objects.equals(averageSedimentRunoffModulusOfDrainageBasin, that.averageSedimentRunoffModulusOfDrainageBasin) &&
                Objects.equals(averageSoilThickness, that.averageSoilThickness) &&
                Objects.equals(comprehensiveReclamationOfRiverBasin, that.comprehensiveReclamationOfRiverBasin) &&
                Objects.equals(feild1, that.feild1) &&
                Objects.equals(mainSoilType, that.mainSoilType) &&
                Objects.equals(soilErosionModulus, that.soilErosionModulus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, averageSedimentRunoffModulusOfDrainageBasin, averageSoilThickness, comprehensiveReclamationOfRiverBasin, feild1, mainSoilType, soilErosionModulus);
    }
}
