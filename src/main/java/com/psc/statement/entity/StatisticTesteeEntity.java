package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "statistic_testee", schema = "psc1", catalog = "")
public class StatisticTesteeEntity {
    private int id;
    private Integer age;
    private Date birthday;
    private String city;
    private String district;
    private Integer evaluateId;
    private Integer evaluateTimes;
    private String grade;
    private Integer organizationId;
    private String organizationType;
    private String province;
    private String sex;
    private Boolean isSingleParent;
    private Date statisticDate;
    private Boolean isUrban;
    private Integer warningTimes;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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
    @Column(name = "evaluate_id")
    public Integer getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Integer evaluateId) {
        this.evaluateId = evaluateId;
    }

    @Basic
    @Column(name = "evaluate_times")
    public Integer getEvaluateTimes() {
        return evaluateTimes;
    }

    public void setEvaluateTimes(Integer evaluateTimes) {
        this.evaluateTimes = evaluateTimes;
    }

    @Basic
    @Column(name = "grade")
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
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
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "is_single_parent")
    public Boolean getSingleParent() {
        return isSingleParent;
    }

    public void setSingleParent(Boolean singleParent) {
        isSingleParent = singleParent;
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
    @Column(name = "is_urban")
    public Boolean getUrban() {
        return isUrban;
    }

    public void setUrban(Boolean urban) {
        isUrban = urban;
    }

    @Basic
    @Column(name = "warning_times")
    public Integer getWarningTimes() {
        return warningTimes;
    }

    public void setWarningTimes(Integer warningTimes) {
        this.warningTimes = warningTimes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatisticTesteeEntity that = (StatisticTesteeEntity) o;
        return id == that.id &&
                Objects.equals(age, that.age) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(city, that.city) &&
                Objects.equals(district, that.district) &&
                Objects.equals(evaluateId, that.evaluateId) &&
                Objects.equals(evaluateTimes, that.evaluateTimes) &&
                Objects.equals(grade, that.grade) &&
                Objects.equals(organizationId, that.organizationId) &&
                Objects.equals(organizationType, that.organizationType) &&
                Objects.equals(province, that.province) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(isSingleParent, that.isSingleParent) &&
                Objects.equals(statisticDate, that.statisticDate) &&
                Objects.equals(isUrban, that.isUrban) &&
                Objects.equals(warningTimes, that.warningTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, birthday, city, district, evaluateId, evaluateTimes, grade, organizationId, organizationType, province, sex, isSingleParent, statisticDate, isUrban, warningTimes);
    }
}
