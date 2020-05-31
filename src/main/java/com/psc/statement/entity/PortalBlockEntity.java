package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "portal_block", schema = "psc1", catalog = "")
public class PortalBlockEntity {
    private int id;
    private String blockName;
    private int blockDictId;
    private String blockDescription;
    private String image;
    private int organizationId;
    private Integer createId;
    private Timestamp createTime;
    private Integer editId;
    private Timestamp editTime;
    private String userType;
    private String extend1;
    private String blockType;
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
    @Column(name = "block_name")
    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    @Basic
    @Column(name = "block_dict_id")
    public int getBlockDictId() {
        return blockDictId;
    }

    public void setBlockDictId(int blockDictId) {
        this.blockDictId = blockDictId;
    }

    @Basic
    @Column(name = "block_description")
    public String getBlockDescription() {
        return blockDescription;
    }

    public void setBlockDescription(String blockDescription) {
        this.blockDescription = blockDescription;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
    @Column(name = "block_type")
    public String getBlockType() {
        return blockType;
    }

    public void setBlockType(String blockType) {
        this.blockType = blockType;
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
        PortalBlockEntity that = (PortalBlockEntity) o;
        return id == that.id &&
                blockDictId == that.blockDictId &&
                organizationId == that.organizationId &&
                Objects.equals(blockName, that.blockName) &&
                Objects.equals(blockDescription, that.blockDescription) &&
                Objects.equals(image, that.image) &&
                Objects.equals(createId, that.createId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(editId, that.editId) &&
                Objects.equals(editTime, that.editTime) &&
                Objects.equals(userType, that.userType) &&
                Objects.equals(extend1, that.extend1) &&
                Objects.equals(blockType, that.blockType) &&
                Objects.equals(extend2, that.extend2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, blockName, blockDictId, blockDescription, image, organizationId, createId, createTime, editId, editTime, userType, extend1, blockType, extend2);
    }
}
