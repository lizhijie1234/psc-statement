package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "scale", schema = "psc1", catalog = "")
public class ScaleEntity {
    private int id;
    private Timestamp createTime;
    private Integer creatorId;
    private String creatorName;
    private Integer departmentId;
    private Integer factorDescriptionOrder;
    private String fileKey;
    private String info;
    private String instruction;
    private Integer isImage;
    private Timestamp modifyTime;
    private String name;
    private Integer organizationId;
    private String organizationName;
    private String saveScale;
    private String state;
    private Integer suitableAgeEnd;
    private Integer suitableAgeStart;
    private String suitableGender;
    private Integer timeLimit;
    private String type;
    private String verifyText;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "creator_id")
    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    @Basic
    @Column(name = "creator_name")
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    @Basic
    @Column(name = "department_id")
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "factor_description_order")
    public Integer getFactorDescriptionOrder() {
        return factorDescriptionOrder;
    }

    public void setFactorDescriptionOrder(Integer factorDescriptionOrder) {
        this.factorDescriptionOrder = factorDescriptionOrder;
    }

    @Basic
    @Column(name = "file_key")
    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
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
    @Column(name = "instruction")
    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @Basic
    @Column(name = "is_image")
    public Integer getIsImage() {
        return isImage;
    }

    public void setIsImage(Integer isImage) {
        this.isImage = isImage;
    }

    @Basic
    @Column(name = "modify_time")
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
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
    @Column(name = "organization_id")
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "organization_name")
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Basic
    @Column(name = "save_scale")
    public String getSaveScale() {
        return saveScale;
    }

    public void setSaveScale(String saveScale) {
        this.saveScale = saveScale;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "suitable_age_end")
    public Integer getSuitableAgeEnd() {
        return suitableAgeEnd;
    }

    public void setSuitableAgeEnd(Integer suitableAgeEnd) {
        this.suitableAgeEnd = suitableAgeEnd;
    }

    @Basic
    @Column(name = "suitable_age_start")
    public Integer getSuitableAgeStart() {
        return suitableAgeStart;
    }

    public void setSuitableAgeStart(Integer suitableAgeStart) {
        this.suitableAgeStart = suitableAgeStart;
    }

    @Basic
    @Column(name = "suitable_gender")
    public String getSuitableGender() {
        return suitableGender;
    }

    public void setSuitableGender(String suitableGender) {
        this.suitableGender = suitableGender;
    }

    @Basic
    @Column(name = "time_limit")
    public Integer getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
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
    @Column(name = "verify_text")
    public String getVerifyText() {
        return verifyText;
    }

    public void setVerifyText(String verifyText) {
        this.verifyText = verifyText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScaleEntity that = (ScaleEntity) o;
        return id == that.id &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(creatorId, that.creatorId) &&
                Objects.equals(creatorName, that.creatorName) &&
                Objects.equals(departmentId, that.departmentId) &&
                Objects.equals(factorDescriptionOrder, that.factorDescriptionOrder) &&
                Objects.equals(fileKey, that.fileKey) &&
                Objects.equals(info, that.info) &&
                Objects.equals(instruction, that.instruction) &&
                Objects.equals(isImage, that.isImage) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(name, that.name) &&
                Objects.equals(organizationId, that.organizationId) &&
                Objects.equals(organizationName, that.organizationName) &&
                Objects.equals(saveScale, that.saveScale) &&
                Objects.equals(state, that.state) &&
                Objects.equals(suitableAgeEnd, that.suitableAgeEnd) &&
                Objects.equals(suitableAgeStart, that.suitableAgeStart) &&
                Objects.equals(suitableGender, that.suitableGender) &&
                Objects.equals(timeLimit, that.timeLimit) &&
                Objects.equals(type, that.type) &&
                Objects.equals(verifyText, that.verifyText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createTime, creatorId, creatorName, departmentId, factorDescriptionOrder, fileKey, info, instruction, isImage, modifyTime, name, organizationId, organizationName, saveScale, state, suitableAgeEnd, suitableAgeStart, suitableGender, timeLimit, type, verifyText);
    }
}
