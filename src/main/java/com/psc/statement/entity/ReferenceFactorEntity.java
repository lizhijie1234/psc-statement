package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reference_factor", schema = "psc1", catalog = "")
public class ReferenceFactorEntity {
    private int id;
    private Integer factorId;
    private Integer referenceFactor;
    private Double weight;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "factor_id")
    public Integer getFactorId() {
        return factorId;
    }

    public void setFactorId(Integer factorId) {
        this.factorId = factorId;
    }

    @Basic
    @Column(name = "reference_factor")
    public Integer getReferenceFactor() {
        return referenceFactor;
    }

    public void setReferenceFactor(Integer referenceFactor) {
        this.referenceFactor = referenceFactor;
    }

    @Basic
    @Column(name = "weight")
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReferenceFactorEntity that = (ReferenceFactorEntity) o;
        return id == that.id &&
                Objects.equals(factorId, that.factorId) &&
                Objects.equals(referenceFactor, that.referenceFactor) &&
                Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, factorId, referenceFactor, weight);
    }
}
