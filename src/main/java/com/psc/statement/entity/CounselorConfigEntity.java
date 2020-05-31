package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "counselor_config", schema = "psc1", catalog = "")
public class CounselorConfigEntity {
    private int id;
    private Integer cancelLimit;
    private Integer cancelPunish;
    private Integer duration;
    private Integer perdayNumber;
    private Integer sanction;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cancel_limit")
    public Integer getCancelLimit() {
        return cancelLimit;
    }

    public void setCancelLimit(Integer cancelLimit) {
        this.cancelLimit = cancelLimit;
    }

    @Basic
    @Column(name = "cancel_punish")
    public Integer getCancelPunish() {
        return cancelPunish;
    }

    public void setCancelPunish(Integer cancelPunish) {
        this.cancelPunish = cancelPunish;
    }

    @Basic
    @Column(name = "duration")
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "perday_number")
    public Integer getPerdayNumber() {
        return perdayNumber;
    }

    public void setPerdayNumber(Integer perdayNumber) {
        this.perdayNumber = perdayNumber;
    }

    @Basic
    @Column(name = "sanction")
    public Integer getSanction() {
        return sanction;
    }

    public void setSanction(Integer sanction) {
        this.sanction = sanction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CounselorConfigEntity that = (CounselorConfigEntity) o;
        return id == that.id &&
                Objects.equals(cancelLimit, that.cancelLimit) &&
                Objects.equals(cancelPunish, that.cancelPunish) &&
                Objects.equals(duration, that.duration) &&
                Objects.equals(perdayNumber, that.perdayNumber) &&
                Objects.equals(sanction, that.sanction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cancelLimit, cancelPunish, duration, perdayNumber, sanction);
    }
}
