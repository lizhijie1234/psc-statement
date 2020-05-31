package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "org_role_privilege", schema = "psc1", catalog = "")
public class OrgRolePrivilegeEntity {
    private int id;
    private int roleId;
    private int privilegeId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "role_id")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "privilege_id")
    public int getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(int privilegeId) {
        this.privilegeId = privilegeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrgRolePrivilegeEntity that = (OrgRolePrivilegeEntity) o;
        return id == that.id &&
                roleId == that.roleId &&
                privilegeId == that.privilegeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleId, privilegeId);
    }
}
