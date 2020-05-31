package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "testee", schema = "psc1", catalog = "")
public class TesteeEntity {
    private int id;
    private String username;
    private String trueName;
    private String password;
    private String personNumber;
    private String residentId;
    private Integer dptId;
    private String type;
    private Date birthday;
    private String sex;
    private String province;
    private String city;
    private String nation;
    private String contactsPhone;
    private String qq;
    private String wechat;
    private String emil;
    private Timestamp admissionDate;
    private Boolean isUrban;
    private Boolean isAccommodation;
    private Boolean isSingleParent;
    private Boolean isOrphan;
    private String maritalStatus;
    private Boolean isLiveWithParent;
    private String isOnlyChild;
    private Integer familyRanking;
    private String address;
    private String fatherName;
    private String fatherPhone;
    private String motherName;
    private String motherPhone;
    private String rewardsAndPunishments;
    private String hobby;
    private String speciality;
    private String brotherSister;
    private String imgUrl;
    private String resume;
    private String status;
    private Timestamp createDate;
    private Integer orgId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "true_name")
    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
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
    @Column(name = "person_number")
    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    @Basic
    @Column(name = "resident_id")
    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    @Basic
    @Column(name = "dpt_id")
    public Integer getDptId() {
        return dptId;
    }

    public void setDptId(Integer dptId) {
        this.dptId = dptId;
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
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
    @Column(name = "contacts_phone")
    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    @Basic
    @Column(name = "qq")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "wechat")
    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    @Basic
    @Column(name = "emil")
    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    @Basic
    @Column(name = "admission_date")
    public Timestamp getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Timestamp admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Basic
    @Column(name = "is_urban")
    public Boolean getUrban() {
        return isUrban;
    }

    public void setUrban(Boolean urban) {
        isUrban = urban;
    }

    @Basic
    @Column(name = "is_accommodation")
    public Boolean getAccommodation() {
        return isAccommodation;
    }

    public void setAccommodation(Boolean accommodation) {
        isAccommodation = accommodation;
    }

    @Basic
    @Column(name = "is_single_parent")
    public Boolean getSingleParent() {
        return isSingleParent;
    }

    public void setSingleParent(Boolean singleParent) {
        isSingleParent = singleParent;
    }

    @Basic
    @Column(name = "is_orphan")
    public Boolean getOrphan() {
        return isOrphan;
    }

    public void setOrphan(Boolean orphan) {
        isOrphan = orphan;
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
    @Column(name = "is_live_with_parent")
    public Boolean getLiveWithParent() {
        return isLiveWithParent;
    }

    public void setLiveWithParent(Boolean liveWithParent) {
        isLiveWithParent = liveWithParent;
    }

    @Basic
    @Column(name = "is_only_child")
    public String getIsOnlyChild() {
        return isOnlyChild;
    }

    public void setIsOnlyChild(String isOnlyChild) {
        this.isOnlyChild = isOnlyChild;
    }

    @Basic
    @Column(name = "family_ranking")
    public Integer getFamilyRanking() {
        return familyRanking;
    }

    public void setFamilyRanking(Integer familyRanking) {
        this.familyRanking = familyRanking;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "father_name")
    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Basic
    @Column(name = "father_phone")
    public String getFatherPhone() {
        return fatherPhone;
    }

    public void setFatherPhone(String fatherPhone) {
        this.fatherPhone = fatherPhone;
    }

    @Basic
    @Column(name = "mother_name")
    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    @Basic
    @Column(name = "mother_phone")
    public String getMotherPhone() {
        return motherPhone;
    }

    public void setMotherPhone(String motherPhone) {
        this.motherPhone = motherPhone;
    }

    @Basic
    @Column(name = "rewards_and_punishments")
    public String getRewardsAndPunishments() {
        return rewardsAndPunishments;
    }

    public void setRewardsAndPunishments(String rewardsAndPunishments) {
        this.rewardsAndPunishments = rewardsAndPunishments;
    }

    @Basic
    @Column(name = "hobby")
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Basic
    @Column(name = "speciality")
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Basic
    @Column(name = "brother_sister")
    public String getBrotherSister() {
        return brotherSister;
    }

    public void setBrotherSister(String brotherSister) {
        this.brotherSister = brotherSister;
    }

    @Basic
    @Column(name = "img_url")
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Basic
    @Column(name = "resume")
    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
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
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "org_id")
    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TesteeEntity that = (TesteeEntity) o;
        return id == that.id &&
                Objects.equals(username, that.username) &&
                Objects.equals(trueName, that.trueName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(personNumber, that.personNumber) &&
                Objects.equals(residentId, that.residentId) &&
                Objects.equals(dptId, that.dptId) &&
                Objects.equals(type, that.type) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(province, that.province) &&
                Objects.equals(city, that.city) &&
                Objects.equals(nation, that.nation) &&
                Objects.equals(contactsPhone, that.contactsPhone) &&
                Objects.equals(qq, that.qq) &&
                Objects.equals(wechat, that.wechat) &&
                Objects.equals(emil, that.emil) &&
                Objects.equals(admissionDate, that.admissionDate) &&
                Objects.equals(isUrban, that.isUrban) &&
                Objects.equals(isAccommodation, that.isAccommodation) &&
                Objects.equals(isSingleParent, that.isSingleParent) &&
                Objects.equals(isOrphan, that.isOrphan) &&
                Objects.equals(maritalStatus, that.maritalStatus) &&
                Objects.equals(isLiveWithParent, that.isLiveWithParent) &&
                Objects.equals(isOnlyChild, that.isOnlyChild) &&
                Objects.equals(familyRanking, that.familyRanking) &&
                Objects.equals(address, that.address) &&
                Objects.equals(fatherName, that.fatherName) &&
                Objects.equals(fatherPhone, that.fatherPhone) &&
                Objects.equals(motherName, that.motherName) &&
                Objects.equals(motherPhone, that.motherPhone) &&
                Objects.equals(rewardsAndPunishments, that.rewardsAndPunishments) &&
                Objects.equals(hobby, that.hobby) &&
                Objects.equals(speciality, that.speciality) &&
                Objects.equals(brotherSister, that.brotherSister) &&
                Objects.equals(imgUrl, that.imgUrl) &&
                Objects.equals(resume, that.resume) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(orgId, that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, trueName, password, personNumber, residentId, dptId, type, birthday, sex, province, city, nation, contactsPhone, qq, wechat, emil, admissionDate, isUrban, isAccommodation, isSingleParent, isOrphan, maritalStatus, isLiveWithParent, isOnlyChild, familyRanking, address, fatherName, fatherPhone, motherName, motherPhone, rewardsAndPunishments, hobby, speciality, brotherSister, imgUrl, resume, status, createDate, orgId);
    }
}
