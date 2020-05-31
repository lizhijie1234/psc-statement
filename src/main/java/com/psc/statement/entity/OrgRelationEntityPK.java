package com.psc.statement.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class OrgRelationEntityPK implements Serializable {
    private int ancestor;
    private int descendant;

    @Column(name = "ancestor")
    @Id
    public int getAncestor() {
        return ancestor;
    }

    public void setAncestor(int ancestor) {
        this.ancestor = ancestor;
    }

    @Column(name = "descendant")
    @Id
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
        OrgRelationEntityPK that = (OrgRelationEntityPK) o;
        return ancestor == that.ancestor &&
                descendant == that.descendant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ancestor, descendant);
    }
}
