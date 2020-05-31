package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "org_role", schema = "psc1", catalog = "")
public class OrgRoleEntity {
    private int id;
    private String name;
    private String roleDesc;
    private Integer orgId;
    private String info;

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
    @Column(name = "role_desc")
    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
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
    @Column(name = "info")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrgRoleEntity that = (OrgRoleEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(roleDesc, that.roleDesc) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(info, that.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, roleDesc, orgId, info);
    }
}
