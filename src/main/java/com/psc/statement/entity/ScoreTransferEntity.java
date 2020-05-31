package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "score_transfer", schema = "psc1", catalog = "")
public class ScoreTransferEntity {
    private int id;
    private Integer factorId;
    private Double originScore;
    private Double standardScore;

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
    @Column(name = "origin_score")
    public Double getOriginScore() {
        return originScore;
    }

    public void setOriginScore(Double originScore) {
        this.originScore = originScore;
    }

    @Basic
    @Column(name = "standard_score")
    public Double getStandardScore() {
        return standardScore;
    }

    public void setStandardScore(Double standardScore) {
        this.standardScore = standardScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoreTransferEntity that = (ScoreTransferEntity) o;
        return id == that.id &&
                Objects.equals(factorId, that.factorId) &&
                Objects.equals(originScore, that.originScore) &&
                Objects.equals(standardScore, that.standardScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, factorId, originScore, standardScore);
    }
}
