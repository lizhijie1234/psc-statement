package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "generator", schema = "psc1", catalog = "")
public class GeneratorEntity {
    private String sequenceName;
    private Long nextVal;

    @Id
    @Column(name = "sequence_name")
    public String getSequenceName() {
        return sequenceName;
    }

    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
    }

    @Basic
    @Column(name = "next_val")
    public Long getNextVal() {
        return nextVal;
    }

    public void setNextVal(Long nextVal) {
        this.nextVal = nextVal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneratorEntity that = (GeneratorEntity) o;
        return Objects.equals(sequenceName, that.sequenceName) &&
                Objects.equals(nextVal, that.nextVal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequenceName, nextVal);
    }
}
