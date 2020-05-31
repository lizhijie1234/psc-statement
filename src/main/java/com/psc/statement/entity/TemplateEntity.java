package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "template", schema = "psc1", catalog = "")
public class TemplateEntity {
    private int id;
    private int templateName;
    private String template;
    private int status;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer createPersonId;
    private Integer updatePersonId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "template_name")
    public int getTemplateName() {
        return templateName;
    }

    public void setTemplateName(int templateName) {
        this.templateName = templateName;
    }

    @Basic
    @Column(name = "template")
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "create_person_id")
    public Integer getCreatePersonId() {
        return createPersonId;
    }

    public void setCreatePersonId(Integer createPersonId) {
        this.createPersonId = createPersonId;
    }

    @Basic
    @Column(name = "update_person_id")
    public Integer getUpdatePersonId() {
        return updatePersonId;
    }

    public void setUpdatePersonId(Integer updatePersonId) {
        this.updatePersonId = updatePersonId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemplateEntity that = (TemplateEntity) o;
        return id == that.id &&
                templateName == that.templateName &&
                status == that.status &&
                Objects.equals(template, that.template) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(createPersonId, that.createPersonId) &&
                Objects.equals(updatePersonId, that.updatePersonId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, templateName, template, status, createTime, updateTime, createPersonId, updatePersonId);
    }
}
