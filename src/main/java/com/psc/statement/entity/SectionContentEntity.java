package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "section_content", schema = "psc1", catalog = "")
public class SectionContentEntity {
    private int id;
    private Integer auditPersonId;
    private Timestamp auditTime;
    private String content;
    private Integer enteringPersonId;
    private Integer orgnizationId;
    private Integer pageView;
    private Timestamp releaseTime;
    private Integer sectionId;
    private String source;
    private String state;
    private String title;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "audit_person_id")
    public Integer getAuditPersonId() {
        return auditPersonId;
    }

    public void setAuditPersonId(Integer auditPersonId) {
        this.auditPersonId = auditPersonId;
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
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "entering_person_id")
    public Integer getEnteringPersonId() {
        return enteringPersonId;
    }

    public void setEnteringPersonId(Integer enteringPersonId) {
        this.enteringPersonId = enteringPersonId;
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
    @Column(name = "page_view")
    public Integer getPageView() {
        return pageView;
    }

    public void setPageView(Integer pageView) {
        this.pageView = pageView;
    }

    @Basic
    @Column(name = "release_time")
    public Timestamp getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Timestamp releaseTime) {
        this.releaseTime = releaseTime;
    }

    @Basic
    @Column(name = "section_id")
    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    @Basic
    @Column(name = "source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SectionContentEntity that = (SectionContentEntity) o;
        return id == that.id &&
                Objects.equals(auditPersonId, that.auditPersonId) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(content, that.content) &&
                Objects.equals(enteringPersonId, that.enteringPersonId) &&
                Objects.equals(orgnizationId, that.orgnizationId) &&
                Objects.equals(pageView, that.pageView) &&
                Objects.equals(releaseTime, that.releaseTime) &&
                Objects.equals(sectionId, that.sectionId) &&
                Objects.equals(source, that.source) &&
                Objects.equals(state, that.state) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, auditPersonId, auditTime, content, enteringPersonId, orgnizationId, pageView, releaseTime, sectionId, source, state, title);
    }
}
