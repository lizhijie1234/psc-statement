package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "org_relation", schema = "psc1", catalog = "")
@IdClass(OrgRelationEntityPK.class)
public class OrgRelationEntity {
    private int ancestor;
    private int descendant;

    @Id
    @Column(name = "ancestor")
    public int getAncestor() {
        return ancestor;
    }

    public void setAncestor(int ancestor) {
        this.ancestor = ancestor;
    }

    @Id
    @Column(name = "descendant")
    public int getDescendant() {
        return descendant;
    }

    public void setDescendant(int descendant) {
        this.descendant = descendant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrgRelationEntity that = (OrgRelationEntity) o;
        return ancestor == that.ancestor &&
                descendant == that.descendant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ancestor, descendant);
    }
}
