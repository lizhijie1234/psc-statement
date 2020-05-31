package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "unit", schema = "psc1", catalog = "")
public class UnitEntity {
    private int id;
    private String address;
    private Integer adminId;
    private String adminPhone;
    private String adminTrueName;
    private String adminUsername;
    private Timestamp createTime;
    private String delFlag;
    private String info;
    private String isLeaf;
    private Integer level;
    private String logo;
    private String name;
    private Integer parentId;
    private String status;
    private String type;
    private String uniformSocialCreditCode;
    private Timestamp updateTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "admin_id")
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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
    @Column(name = "admin_true_name")
    public String getAdminTrueName() {
        return adminTrueName;
    }

    public void setAdminTrueName(String adminTrueName) {
        this.adminTrueName = adminTrueName;
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
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "del_flag")
    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
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
    @Column(name = "is_leaf")
    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    @Basic
    @Column(name = "level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "uniform_social_credit_code")
    public String getUniformSocialCreditCode() {
        return uniformSocialCreditCode;
    }

    public void setUniformSocialCreditCode(String uniformSocialCreditCode) {
        this.uniformSocialCreditCode = uniformSocialCreditCode;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitEntity that = (UnitEntity) o;
        return id == that.id &&
                Objects.equals(address, that.address) &&
                Objects.equals(adminId, that.adminId) &&
                Objects.equals(adminPhone, that.adminPhone) &&
                Objects.equals(adminTrueName, that.adminTrueName) &&
                Objects.equals(adminUsername, that.adminUsername) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(delFlag, that.delFlag) &&
                Objects.equals(info, that.info) &&
                Objects.equals(isLeaf, that.isLeaf) &&
                Objects.equals(level, that.level) &&
                Objects.equals(logo, that.logo) &&
                Objects.equals(name, that.name) &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(status, that.status) &&
                Objects.equals(type, that.type) &&
                Objects.equals(uniformSocialCreditCode, that.uniformSocialCreditCode) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, adminId, adminPhone, adminTrueName, adminUsername, createTime, delFlag, info, isLeaf, level, logo, name, parentId, status, type, uniformSocialCreditCode, updateTime);
    }
}
