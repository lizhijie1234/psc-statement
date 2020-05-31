package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "work_record", schema = "psc1", catalog = "")
public class WorkRecordEntity {
    private int id;
    private int userId;
    private Timestamp loginIn;
    private Timestamp loginOut;
    private String things;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "login_in")
    public Timestamp getLoginIn() {
        return loginIn;
    }

    public void setLoginIn(Timestamp loginIn) {
        this.loginIn = loginIn;
    }

    @Basic
    @Column(name = "login_out")
    public Timestamp getLoginOut() {
        return loginOut;
    }

    public void setLoginOut(Timestamp loginOut) {
        this.loginOut = loginOut;
    }

    @Basic
    @Column(name = "things")
    public String getThings() {
        return things;
    }

    public void setThings(String things) {
        this.things = things;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkRecordEntity that = (WorkRecordEntity) o;
        return id == that.id &&
                userId == that.userId &&
                Objects.equals(loginIn, that.loginIn) &&
                Objects.equals(loginOut, that.loginOut) &&
                Objects.equals(things, that.things);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, loginIn, loginOut, things);
    }
}
