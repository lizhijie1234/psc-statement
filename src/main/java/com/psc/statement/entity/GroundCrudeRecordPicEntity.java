package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ground_crude_record_pic", schema = "psc1", catalog = "")
public class GroundCrudeRecordPicEntity {
    private int id;
    private int groundCrudeRecordId;
    private String pic;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ground_crude_record_id")
    public int getGroundCrudeRecordId() {
        return groundCrudeRecordId;
    }

    public void setGroundCrudeRecordId(int groundCrudeRecordId) {
        this.groundCrudeRecordId = groundCrudeRecordId;
    }

    @Basic
    @Column(name = "pic")
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroundCrudeRecordPicEntity that = (GroundCrudeRecordPicEntity) o;
        return id == that.id &&
                groundCrudeRecordId == that.groundCrudeRecordId &&
                Objects.equals(pic, that.pic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groundCrudeRecordId, pic);
    }
}
