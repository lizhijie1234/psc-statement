package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "statistic_scale", schema = "psc1", catalog = "")
public class StatisticScaleEntity {
    private int id;
    private String city;
    private String district;
    private Integer evaluateNumber;
    private Integer organizationId;
    private String organizationType;
    private String province;
    private Integer scaleId;
    private String scaleName;
    private Date statisticDate;
    private Integer warningNumber;
    private Integer defaultFlag;
    private Integer factorId;
    private String factorName;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "evaluate_number")
    public Integer getEvaluateNumber() {
        return evaluateNumber;
    }

    public void setEvaluateNumber(Integer evaluateNumber) {
        this.evaluateNumber = evaluateNumber;
    }

    @Basic
    @Column(name = "organization_id")
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "organization_type")
    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    @Basic
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "scale_id")
    public Integer getScaleId() {
        return scaleId;
    }

    public void setScaleId(Integer scaleId) {
        this.scaleId = scaleId;
    }

    @Basic
    @Column(name = "scale_name")
    public String getScaleName() {
        return scaleName;
    }

    public void setScaleName(String scaleName) {
        this.scaleName = scaleName;
    }

    @Basic
    @Column(name = "statistic_date")
    public Date getStatisticDate() {
        return statisticDate;
    }

    public void setStatisticDate(Date statisticDate) {
        this.statisticDate = statisticDate;
    }

    @Basic
    @Column(name = "warning_number")
    public Integer getWarningNumber() {
        return warningNumber;
    }

    public void setWarningNumber(Integer warningNumber) {
        this.warningNumber = warningNumber;
    }

    @Basic
    @Column(name = "default_flag")
    public Integer getDefaultFlag() {
        return defaultFlag;
    }

    public void setDefaultFlag(Integer defaultFlag) {
        this.defaultFlag = defaultFlag;
    }

    @Basic
    @Column(name = "factor_id")
    public Integer getFactorId() {
        return factorId;
    }

    public void setFactorId(Integer factorId) {
        this.factorId = factorId;
    }

    @Basic
    @Column(name = "factor_name")
    public String getFactorName() {
        return factorName;
    }

    public void setFactorName(String factorName) {
        this.factorName = factorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatisticScaleEntity that = (StatisticScaleEntity) o;
        return id == that.id &&
                Objects.equals(city, that.city) &&
                Objects.equals(district, that.district) &&
                Objects.equals(evaluateNumber, that.evaluateNumber) &&
                Objects.equals(organizationId, that.organizationId) &&
                Objects.equals(organizationType, that.organizationType) &&
                Objects.equals(province, that.province) &&
                Objects.equals(scaleId, that.scaleId) &&
                Objects.equals(scaleName, that.scaleName) &&
                Objects.equals(statisticDate, that.statisticDate) &&
                Objects.equals(warningNumber, that.warningNumber) &&
                Objects.equals(defaultFlag, that.defaultFlag) &&
                Objects.equals(factorId, that.factorId) &&
                Objects.equals(factorName, that.factorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, district, evaluateNumber, organizationId, organizationType, province, scaleId, scaleName, statisticDate, warningNumber, defaultFlag, factorId, factorName);
    }
}
