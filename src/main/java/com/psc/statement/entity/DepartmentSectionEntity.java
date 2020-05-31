package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "department_section", schema = "psc1", catalog = "")
public class DepartmentSectionEntity {
    private int id;
    private String info;
    private String name;
    private Integer number;
    private Integer orgnizationId;
    private String url;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "number")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Basic
    @Column(name = "orgnization_id")
    public Integer getOrgnizationId() {
        return orgnizationId;
    }

    public void setOrgnizationId(Integer orgnizationId) {
        this.orgnizationId = orgnizationId;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentSectionEntity that = (DepartmentSectionEntity) o;
        return id == that.id &&
                Objects.equals(info, that.info) &&
                Objects.equals(name, that.name) &&
                Objects.equals(number, that.number) &&
                Objects.equals(orgnizationId, that.orgnizationId) &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, info, name, number, orgnizationId, url);
    }
}
