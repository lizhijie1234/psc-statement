package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "statistic_organization", schema = "psc1", catalog = "")
public class StatisticOrganizationEntity {
    private int id;
    private String city;
    private Integer deviceUseFrequency;
    private Double deviceUseTime;
    private String district;
    private Integer organizationId;
    private String organizationType;
    private String province;
    private Date statisticDate;
    private Integer totalConsultNumber;
    private Integer totalConsultTimes;
    private Integer totalEvaluateNumber;
    private Integer totalEvaluateTimes;
    private Integer totalInterveneNumber;
    private Integer totalInterveneTimes;
    private Integer totalWarningNumber;
    private Integer totalWarningTimes;

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
    @Column(name = "device_use_frequency")
    public Integer getDeviceUseFrequency() {
        return deviceUseFrequency;
    }

    public void setDeviceUseFrequency(Integer deviceUseFrequency) {
        this.deviceUseFrequency = deviceUseFrequency;
    }

    @Basic
    @Column(name = "device_use_time")
    public Double getDeviceUseTime() {
        return deviceUseTime;
    }

    public void setDeviceUseTime(Double deviceUseTime) {
        this.deviceUseTime = deviceUseTime;
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
    @Column(name = "statistic_date")
    public Date getStatisticDate() {
        return statisticDate;
    }

    public void setStatisticDate(Date statisticDate) {
        this.statisticDate = statisticDate;
    }

    @Basic
    @Column(name = "total_consult_number")
    public Integer getTotalConsultNumber() {
        return totalConsultNumber;
    }

    public void setTotalConsultNumber(Integer totalConsultNumber) {
        this.totalConsultNumber = totalConsultNumber;
    }

    @Basic
    @Column(name = "total_consult_times")
    public Integer getTotalConsultTimes() {
        return totalConsultTimes;
    }

    public void setTotalConsultTimes(Integer totalConsultTimes) {
        this.totalConsultTimes = totalConsultTimes;
    }

    @Basic
    @Column(name = "total_evaluate_number")
    public Integer getTotalEvaluateNumber() {
        return totalEvaluateNumber;
    }

    public void setTotalEvaluateNumber(Integer totalEvaluateNumber) {
        this.totalEvaluateNumber = totalEvaluateNumber;
    }

    @Basic
    @Column(name = "total_evaluate_times")
    public Integer getTotalEvaluateTimes() {
        return totalEvaluateTimes;
    }

    public void setTotalEvaluateTimes(Integer totalEvaluateTimes) {
        this.totalEvaluateTimes = totalEvaluateTimes;
    }

    @Basic
    @Column(name = "total_intervene_number")
    public Integer getTotalInterveneNumber() {
        return totalInterveneNumber;
    }

    public void setTotalInterveneNumber(Integer totalInterveneNumber) {
        this.totalInterveneNumber = totalInterveneNumber;
    }

    @Basic
    @Column(name = "total_intervene_times")
    public Integer getTotalInterveneTimes() {
        return totalInterveneTimes;
    }

    public void setTotalInterveneTimes(Integer totalInterveneTimes) {
        this.totalInterveneTimes = totalInterveneTimes;
    }

    @Basic
    @Column(name = "total_warning_number")
    public Integer getTotalWarningNumber() {
        return totalWarningNumber;
    }

    public void setTotalWarningNumber(Integer totalWarningNumber) {
        this.totalWarningNumber = totalWarningNumber;
    }

    @Basic
    @Column(name = "total_warning_times")
    public Integer getTotalWarningTimes() {
        return totalWarningTimes;
    }

    public void setTotalWarningTimes(Integer totalWarningTimes) {
        this.totalWarningTimes = totalWarningTimes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatisticOrganizationEntity that = (StatisticOrganizationEntity) o;
        return id == that.id &&
                Objects.equals(city, that.city) &&
                Objects.equals(deviceUseFrequency, that.deviceUseFrequency) &&
                Objects.equals(deviceUseTime, that.deviceUseTime) &&
                Objects.equals(district, that.district) &&
                Objects.equals(organizationId, that.organizationId) &&
                Objects.equals(organizationType, that.organizationType) &&
                Objects.equals(province, that.province) &&
                Objects.equals(statisticDate, that.statisticDate) &&
                Objects.equals(totalConsultNumber, that.totalConsultNumber) &&
                Objects.equals(totalConsultTimes, that.totalConsultTimes) &&
                Objects.equals(totalEvaluateNumber, that.totalEvaluateNumber) &&
                Objects.equals(totalEvaluateTimes, that.totalEvaluateTimes) &&
                Objects.equals(totalInterveneNumber, that.totalInterveneNumber) &&
                Objects.equals(totalInterveneTimes, that.totalInterveneTimes) &&
                Objects.equals(totalWarningNumber, that.totalWarningNumber) &&
                Objects.equals(totalWarningTimes, that.totalWarningTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, deviceUseFrequency, deviceUseTime, district, organizationId, organizationType, province, statisticDate, totalConsultNumber, totalConsultTimes, totalEvaluateNumber, totalEvaluateTimes, totalInterveneNumber, totalInterveneTimes, totalWarningNumber, totalWarningTimes);
    }
}
