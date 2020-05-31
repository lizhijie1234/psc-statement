package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "role_privilege", schema = "psc1", catalog = "")
public class RolePrivilegeEntity {
    private int id;
    private Integer privilegeId;
    private Integer roleId;
    private String level;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "privilege_id")
    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    @Basic
    @Column(name = "role_id")
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolePrivilegeEntity that = (RolePrivilegeEntity) o;
        return id == that.id &&
                Objects.equals(privilegeId, that.privilegeId) &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, privilegeId, roleId, level);
    }
}
