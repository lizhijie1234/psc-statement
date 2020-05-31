package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "department_user", schema = "psc1", catalog = "")
public class DepartmentUserEntity {
    private int id;
    private Date birthday;
    private String birthplace;
    private Integer departmentId;
    private String gender;
    private String identityNumber;
    private String info;
    private String isCity;
    private String isInResidence;
    private String isLiveWithParents;
    private String isSingleParent;
    private String nation;
    private Integer orgnizationId;
    private String password;
    private String photoUrl;
    private String truename;
    private String userType;
    private String username;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "birthplace")
    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
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
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "identity_number")
    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
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
    @Column(name = "is_city")
    public String getIsCity() {
        return isCity;
    }

    public void setIsCity(String isCity) {
        this.isCity = isCity;
    }

    @Basic
    @Column(name = "is_in_residence")
    public String getIsInResidence() {
        return isInResidence;
    }

    public void setIsInResidence(String isInResidence) {
        this.isInResidence = isInResidence;
    }

    @Basic
    @Column(name = "is_live_with_parents")
    public String getIsLiveWithParents() {
        return isLiveWithParents;
    }

    public void setIsLiveWithParents(String isLiveWithParents) {
        this.isLiveWithParents = isLiveWithParents;
    }

    @Basic
    @Column(name = "is_single_parent")
    public String getIsSingleParent() {
        return isSingleParent;
    }

    public void setIsSingleParent(String isSingleParent) {
        this.isSingleParent = isSingleParent;
    }

    @Basic
    @Column(name = "nation")
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "photo_url")
    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Basic
    @Column(name = "truename")
    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentUserEntity that = (DepartmentUserEntity) o;
        return id == that.id &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(birthplace, that.birthplace) &&
                Objects.equals(departmentId, that.departmentId) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(identityNumber, that.identityNumber) &&
                Objects.equals(info, that.info) &&
                Objects.equals(isCity, that.isCity) &&
                Objects.equals(isInResidence, that.isInResidence) &&
                Objects.equals(isLiveWithParents, that.isLiveWithParents) &&
                Objects.equals(isSingleParent, that.isSingleParent) &&
                Objects.equals(nation, that.nation) &&
                Objects.equals(orgnizationId, that.orgnizationId) &&
                Objects.equals(password, that.password) &&
                Objects.equals(photoUrl, that.photoUrl) &&
                Objects.equals(truename, that.truename) &&
                Objects.equals(userType, that.userType) &&
                Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, birthday, birthplace, departmentId, gender, identityNumber, info, isCity, isInResidence, isLiveWithParents, isSingleParent, nation, orgnizationId, password, photoUrl, truename, userType, username);
    }
}
