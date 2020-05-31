package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "org_dpt", schema = "psc1", catalog = "")
public class OrgDptEntity {
    private int id;
    private String name;
    private int parentId;
    private String info;
    private String status;
    private Integer orgId;
    private String dptNo;

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
    @Column(name = "parent_id")
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
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
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "org_id")
    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "dpt_no")
    public String getDptNo() {
        return dptNo;
    }

    public void setDptNo(String dptNo) {
        this.dptNo = dptNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrgDptEntity that = (OrgDptEntity) o;
        return id == that.id &&
                parentId == that.parentId &&
                Objects.equals(name, that.name) &&
                Objects.equals(info, that.info) &&
                Objects.equals(status, that.status) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(dptNo, that.dptNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, parentId, info, status, orgId, dptNo);
    }
}
