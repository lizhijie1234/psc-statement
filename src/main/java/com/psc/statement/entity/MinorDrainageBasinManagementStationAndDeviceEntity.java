package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "minor_drainage_basin_management_station_and_device", schema = "psc1", catalog = "")
public class MinorDrainageBasinManagementStationAndDeviceEntity {
    private int id;
    private int deviceId;
    private int minorDrainageBasinManagementStationId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "device_id")
    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "minor_drainage_basin_management_station_id")
    public int getMinorDrainageBasinManagementStationId() {
        return minorDrainageBasinManagementStationId;
    }

    public void setMinorDrainageBasinManagementStationId(int minorDrainageBasinManagementStationId) {
        this.minorDrainageBasinManagementStationId = minorDrainageBasinManagementStationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinorDrainageBasinManagementStationAndDeviceEntity that = (MinorDrainageBasinManagementStationAndDeviceEntity) o;
        return id == that.id &&
                deviceId == that.deviceId &&
                minorDrainageBasinManagementStationId == that.minorDrainageBasinManagementStationId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deviceId, minorDrainageBasinManagementStationId);
    }
}
