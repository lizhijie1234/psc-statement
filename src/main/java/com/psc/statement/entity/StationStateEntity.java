package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "station_state", schema = "psc1", catalog = "")
public class StationStateEntity {
    private int id;
    private Timestamp endTime;
    private int minuteCount;
    private int raining;
    private int rainingState;
    private Timestamp startTime;
    private String stationId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "end_time")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "minute_count")
    public int getMinuteCount() {
        return minuteCount;
    }

    public void setMinuteCount(int minuteCount) {
        this.minuteCount = minuteCount;
    }

    @Basic
    @Column(name = "raining")
    public int getRaining() {
        return raining;
    }

    public void setRaining(int raining) {
        this.raining = raining;
    }

    @Basic
    @Column(name = "raining_state")
    public int getRainingState() {
        return rainingState;
    }

    public void setRainingState(int rainingState) {
        this.rainingState = rainingState;
    }

    @Basic
    @Column(name = "start_time")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "station_id")
    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StationStateEntity that = (StationStateEntity) o;
        return id == that.id &&
                minuteCount == that.minuteCount &&
                raining == that.raining &&
                rainingState == that.rainingState &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(stationId, that.stationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, endTime, minuteCount, raining, rainingState, startTime, stationId);
    }
}
