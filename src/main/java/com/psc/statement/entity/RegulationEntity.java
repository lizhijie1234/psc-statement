package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "regulation", schema = "psc1", catalog = "")
public class RegulationEntity {
    private int regulationId;
    private String regulationType;
    private String regulationName;
    private String regulationMethod;
    private String regulationParameter;

    @Id
    @Column(name = "regulation_id")
    public int getRegulationId() {
        return regulationId;
    }

    public void setRegulationId(int regulationId) {
        this.regulationId = regulationId;
    }

    @Basic
    @Column(name = "regulation_type")
    public String getRegulationType() {
        return regulationType;
    }

    public void setRegulationType(String regulationType) {
        this.regulationType = regulationType;
    }

    @Basic
    @Column(name = "regulation_name")
    public String getRegulationName() {
        return regulationName;
    }

    public void setRegulationName(String regulationName) {
        this.regulationName = regulationName;
    }

    @Basic
    @Column(name = "regulation_method")
    public String getRegulationMethod() {
        return regulationMethod;
    }

    public void setRegulationMethod(String regulationMethod) {
        this.regulationMethod = regulationMethod;
    }

    @Basic
    @Column(name = "regulation_parameter")
    public String getRegulationParameter() {
        return regulationParameter;
    }

    public void setRegulationParameter(String regulationParameter) {
        this.regulationParameter = regulationParameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegulationEntity that = (RegulationEntity) o;
        return regulationId == that.regulationId &&
                Objects.equals(regulationType, that.regulationType) &&
                Objects.equals(regulationName, that.regulationName) &&
                Objects.equals(regulationMethod, that.regulationMethod) &&
                Objects.equals(regulationParameter, that.regulationParameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regulationId, regulationType, regulationName, regulationMethod, regulationParameter);
    }
}
