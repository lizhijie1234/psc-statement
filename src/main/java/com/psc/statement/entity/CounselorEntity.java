package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "counselor", schema = "psc1", catalog = "")
public class CounselorEntity {
    private int id;
    private String auditFeedback;
    private Timestamp auditTime;
    private Integer auditorId;
    private String avatar;
    private Date birthday;
    private String certificate;
    private Timestamp createTime;
    private String email;
    private String gender;
    private String idImage1;
    private String idImage2;
    private String information;
    private String maritalStatus;
    private String password;
    private String phoneNumber;
    private Double score;
    private String specialty;
    private String status;
    private String truename;
    private Integer unitId;
    private String username;
    private String workingExperience;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "audit_feedback")
    public String getAuditFeedback() {
        return auditFeedback;
    }

    public void setAuditFeedback(String auditFeedback) {
        this.auditFeedback = auditFeedback;
    }

    @Basic
    @Column(name = "audit_time")
    public Timestamp getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Timestamp auditTime) {
        this.auditTime = auditTime;
    }

    @Basic
    @Column(name = "auditor_id")
    public Integer getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Integer auditorId) {
        this.auditorId = auditorId;
    }

    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
    @Column(name = "certificate")
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
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
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "id_image1")
    public String getIdImage1() {
        return idImage1;
    }

    public void setIdImage1(String idImage1) {
        this.idImage1 = idImage1;
    }

    @Basic
    @Column(name = "id_image2")
    public String getIdImage2() {
        return idImage2;
    }

    public void setIdImage2(String idImage2) {
        this.idImage2 = idImage2;
    }

    @Basic
    @Column(name = "information")
    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Basic
    @Column(name = "marital_status")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
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
    @Column(name = "phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "score")
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Basic
    @Column(name = "specialty")
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
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
    @Column(name = "truename")
    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    @Basic
    @Column(name = "unit_id")
    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "working_experience")
    public String getWorkingExperience() {
        return workingExperience;
    }

    public void setWorkingExperience(String workingExperience) {
        this.workingExperience = workingExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CounselorEntity that = (CounselorEntity) o;
        return id == that.id &&
                Objects.equals(auditFeedback, that.auditFeedback) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(auditorId, that.auditorId) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(certificate, that.certificate) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(email, that.email) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(idImage1, that.idImage1) &&
                Objects.equals(idImage2, that.idImage2) &&
                Objects.equals(information, that.information) &&
                Objects.equals(maritalStatus, that.maritalStatus) &&
                Objects.equals(password, that.password) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(score, that.score) &&
                Objects.equals(specialty, that.specialty) &&
                Objects.equals(status, that.status) &&
                Objects.equals(truename, that.truename) &&
                Objects.equals(unitId, that.unitId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(workingExperience, that.workingExperience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, auditFeedback, auditTime, auditorId, avatar, birthday, certificate, createTime, email, gender, idImage1, idImage2, information, maritalStatus, password, phoneNumber, score, specialty, status, truename, unitId, username, workingExperience);
    }
}
