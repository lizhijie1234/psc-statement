package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sediment_box_info", schema = "psc1", catalog = "")
public class SedimentBoxInfoEntity {
    private int id;
    private double boxWeight;
    private String sedimentBoxId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "box_weight")
    public double getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(double boxWeight) {
        this.boxWeight = boxWeight;
    }

    @Basic
    @Column(name = "sediment_box_id")
    public String getSedimentBoxId() {
        return sedimentBoxId;
    }

    public void setSedimentBoxId(String sedimentBoxId) {
        this.sedimentBoxId = sedimentBoxId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SedimentBoxInfoEntity that = (SedimentBoxInfoEntity) o;
        return id == that.id &&
                Double.compare(that.boxWeight, boxWeight) == 0 &&
                Objects.equals(sedimentBoxId, that.sedimentBoxId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, boxWeight, sedimentBoxId);
    }
}
