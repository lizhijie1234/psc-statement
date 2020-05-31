package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "portal_region", schema = "psc1", catalog = "")
public class PortalRegionEntity {
    private int id;
    private int regionNumber;
    private int blockId;
    private int organizationId;
    private Integer createId;
    private Timestamp createTime;
    private Integer editId;
    private Timestamp editTime;
    private String userType;
    private String extend1;
    private String extend2;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "region_number")
    public int getRegionNumber() {
        return regionNumber;
    }

    public void setRegionNumber(int regionNumber) {
        this.regionNumber = regionNumber;
    }

    @Basic
    @Column(name = "block_id")
    public int getBlockId() {
        return blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }

    @Basic
    @Column(name = "organization_id")
    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "create_id")
    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
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
    @Column(name = "edit_id")
    public Integer getEditId() {
        return editId;
    }

    public void setEditId(Integer editId) {
        this.editId = editId;
    }

    @Basic
    @Column(name = "edit_time")
    public Timestamp getEditTime() {
        return editTime;
    }

    public void setEditTime(Timestamp editTime) {
        this.editTime = editTime;
    }

    @Basic
    @Column(name = "user_type")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "extend1")
    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    @Basic
    @Column(name = "extend2")
    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PortalRegionEntity that = (PortalRegionEntity) o;
        return id == that.id &&
                regionNumber == that.regionNumber &&
                blockId == that.blockId &&
                organizationId == that.organizationId &&
                Objects.equals(createId, that.createId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(editId, that.editId) &&
                Objects.equals(editTime, that.editTime) &&
                Objects.equals(userType, that.userType) &&
                Objects.equals(extend1, that.extend1) &&
                Objects.equals(extend2, that.extend2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, regionNumber, blockId, organizationId, createId, createTime, editId, editTime, userType, extend1, extend2);
    }
}
