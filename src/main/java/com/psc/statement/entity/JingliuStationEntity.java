package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "jingliu_station", schema = "psc1", catalog = "")
public class JingliuStationEntity {
    private int id;
    private int jingliuId;
    private Boolean representStation;
    private int stationId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "jingliu_id")
    public int getJingliuId() {
        return jingliuId;
    }

    public void setJingliuId(int jingliuId) {
        this.jingliuId = jingliuId;
    }

    @Basic
    @Column(name = "represent_station")
    public Boolean getRepresentStation() {
        return representStation;
    }

    public void setRepresentStation(Boolean representStation) {
        this.representStation = representStation;
    }

    @Basic
    @Column(name = "station_id")
    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JingliuStationEntity that = (JingliuStationEntity) o;
        return id == that.id &&
                jingliuId == that.jingliuId &&
                stationId == that.stationId &&
                Objects.equals(representStation, that.representStation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jingliuId, representStation, stationId);
    }
}
