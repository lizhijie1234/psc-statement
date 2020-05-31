package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "organization", schema = "psc1", catalog = "")
public class OrganizationEntity {
    private int id;
    private String name;
    private Integer adminId;
    private String address;
    private String info;
    private String homeUrl;
    private String province;
    private String city;
    private String district;
    private Integer parentId;
    private String uniformSocialCreditCode;
    private Date createTime;
    private Date approvalTime;
    private Date stopServiceTime;
    private String status;
    private String type;
    private String logo;
    private String abbr;
    private String adminUsername;
    private String adminTruename;
    private String adminPhone;
    private int statusNum;
    private Integer unitId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "admin_id")
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "info")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Basic
    @Column(name = "home_url")
    public String getHomeUrl() {
        return homeUrl;
    }

    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl;
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
    @Column(name = "parent_id")
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "uniform_social_credit_code")
    public String getUniformSocialCreditCode() {
        return uniformSocialCreditCode;
    }

    public void setUniformSocialCreditCode(String uniformSocialCreditCode) {
        this.uniformSocialCreditCode = uniformSocialCreditCode;
    }

    @Basic
    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "approval_time")
    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    @Basic
    @Column(name = "stop_service_time")
    public Date getStopServiceTime() {
        return stopServiceTime;
    }

    public void setStopServiceTime(Date stopServiceTime) {
        this.stopServiceTime = stopServiceTime;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Basic
    @Column(name = "abbr")
    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    @Basic
    @Column(name = "admin_username")
    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    @Basic
    @Column(name = "admin_truename")
    public String getAdminTruename() {
        return adminTruename;
    }

    public void setAdminTruename(String adminTruename) {
        this.adminTruename = adminTruename;
    }

    @Basic
    @Column(name = "admin_phone")
    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }

    @Basic
    @Column(name = "status_num")
    public int getStatusNum() {
        return statusNum;
    }

    public void setStatusNum(int statusNum) {
        this.statusNum = statusNum;
    }

    @Basic
    @Column(name = "unit_id")
    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganizationEntity that = (OrganizationEntity) o;
        return id == that.id &&
                statusNum == that.statusNum &&
                Objects.equals(name, that.name) &&
                Objects.equals(adminId, that.adminId) &&
                Objects.equals(address, that.address) &&
                Objects.equals(info, that.info) &&
                Objects.equals(homeUrl, that.homeUrl) &&
                Objects.equals(province, that.province) &&
                Objects.equals(city, that.city) &&
                Objects.equals(district, that.district) &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(uniformSocialCreditCode, that.uniformSocialCreditCode) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(approvalTime, that.approvalTime) &&
                Objects.equals(stopServiceTime, that.stopServiceTime) &&
                Objects.equals(status, that.status) &&
                Objects.equals(type, that.type) &&
                Objects.equals(logo, that.logo) &&
                Objects.equals(abbr, that.abbr) &&
                Objects.equals(adminUsername, that.adminUsername) &&
                Objects.equals(adminTruename, that.adminTruename) &&
                Objects.equals(adminPhone, that.adminPhone) &&
                Objects.equals(unitId, that.unitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, adminId, address, info, homeUrl, province, city, district, parentId, uniformSocialCreditCode, createTime, approvalTime, stopServiceTime, status, type, logo, abbr, adminUsername, adminTruename, adminPhone, statusNum, unitId);
    }
}
