package com.psc.statement.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "socioeconomic_status", schema = "psc1", catalog = "")
public class SocioeconomicStatusEntity {
    private int id;
    private BigDecimal farmLand;
    private String feilds1;
    private BigDecimal income;
    private Integer laborForseNum;
    private Integer peopleNum;
    private BigDecimal ruralgdp;
    private BigDecimal yieldOfGrain;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "farm_land")
    public BigDecimal getFarmLand() {
        return farmLand;
    }

    public void setFarmLand(BigDecimal farmLand) {
        this.farmLand = farmLand;
    }

    @Basic
    @Column(name = "feilds1")
    public String getFeilds1() {
        return feilds1;
    }

    public void setFeilds1(String feilds1) {
        this.feilds1 = feilds1;
    }

    @Basic
    @Column(name = "income")
    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    @Basic
    @Column(name = "labor_forse_num")
    public Integer getLaborForseNum() {
        return laborForseNum;
    }

    public void setLaborForseNum(Integer laborForseNum) {
        this.laborForseNum = laborForseNum;
    }

    @Basic
    @Column(name = "people_num")
    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    @Basic
    @Column(name = "ruralgdp")
    public BigDecimal getRuralgdp() {
        return ruralgdp;
    }

    public void setRuralgdp(BigDecimal ruralgdp) {
        this.ruralgdp = ruralgdp;
    }

    @Basic
    @Column(name = "yield_of_grain")
    public BigDecimal getYieldOfGrain() {
        return yieldOfGrain;
    }

    public void setYieldOfGrain(BigDecimal yieldOfGrain) {
        this.yieldOfGrain = yieldOfGrain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocioeconomicStatusEntity that = (SocioeconomicStatusEntity) o;
        return id == that.id &&
                Objects.equals(farmLand, that.farmLand) &&
                Objects.equals(feilds1, that.feilds1) &&
                Objects.equals(income, that.income) &&
                Objects.equals(laborForseNum, that.laborForseNum) &&
                Objects.equals(peopleNum, that.peopleNum) &&
                Objects.equals(ruralgdp, that.ruralgdp) &&
                Objects.equals(yieldOfGrain, that.yieldOfGrain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, farmLand, feilds1, income, laborForseNum, peopleNum, ruralgdp, yieldOfGrain);
    }
}
