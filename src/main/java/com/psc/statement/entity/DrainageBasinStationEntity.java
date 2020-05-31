package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "drainage_basin_station", schema = "psc1", catalog = "")
public class DrainageBasinStationEntity {
    private int id;
    private int drainageBasinId;
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
    @Column(name = "drainage_basin_id")
    public int getDrainageBasinId() {
        return drainageBasinId;
    }

    public void setDrainageBasinId(int drainageBasinId) {
        this.drainageBasinId = drainageBasinId;
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
        DrainageBasinStationEntity that = (DrainageBasinStationEntity) o;
        return id == that.id &&
                drainageBasinId == that.drainageBasinId &&
                stationId == that.stationId &&
                Objects.equals(representStation, that.representStation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, drainageBasinId, representStation, stationId);
    }
}
