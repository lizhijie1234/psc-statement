package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tbl_plot_coverage_info", schema = "psc1", catalog = "")
public class TblPlotCoverageInfoEntity {
    private int id;
    private int siteId;
    private int sequence;
    private String observationPoint;
    private int vegetationCoverage;
    private int groundCoverage;
    private int crownDensity;
    private int averageVegetationHeight;
    private String coveragePhoto;
    private String densityPhoto;
    private int coveragePhotoNumber;
    private int densityPhotoNumber;
    private int coveragePhotoResult;
    private int densityPhotoResult;
    private Date recordDate;
    private String recorder;
    private String reviewer;
    private Timestamp reviewDate;
    private int reviewStatus;
    private String reviewInfo;
    private boolean ifRunoff;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "site_id")
    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Basic
    @Column(name = "sequence")
    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    @Basic
    @Column(name = "observation_point")
    public String getObservationPoint() {
        return observationPoint;
    }

    public void setObservationPoint(String observationPoint) {
        this.observationPoint = observationPoint;
    }

    @Basic
    @Column(name = "vegetation_coverage")
    public int getVegetationCoverage() {
        return vegetationCoverage;
    }

    public void setVegetationCoverage(int vegetationCoverage) {
        this.vegetationCoverage = vegetationCoverage;
    }

    @Basic
    @Column(name = "ground_coverage")
    public int getGroundCoverage() {
        return groundCoverage;
    }

    public void setGroundCoverage(int groundCoverage) {
        this.groundCoverage = groundCoverage;
    }

    @Basic
    @Column(name = "crown_density")
    public int getCrownDensity() {
        return crownDensity;
    }

    public void setCrownDensity(int crownDensity) {
        this.crownDensity = crownDensity;
    }

    @Basic
    @Column(name = "average_vegetation_height")
    public int getAverageVegetationHeight() {
        return averageVegetationHeight;
    }

    public void setAverageVegetationHeight(int averageVegetationHeight) {
        this.averageVegetationHeight = averageVegetationHeight;
    }

    @Basic
    @Column(name = "coverage_photo")
    public String getCoveragePhoto() {
        return coveragePhoto;
    }

    public void setCoveragePhoto(String coveragePhoto) {
        this.coveragePhoto = coveragePhoto;
    }

    @Basic
    @Column(name = "density_photo")
    public String getDensityPhoto() {
        return densityPhoto;
    }

    public void setDensityPhoto(String densityPhoto) {
        this.densityPhoto = densityPhoto;
    }

    @Basic
    @Column(name = "coverage_photo_number")
    public int getCoveragePhotoNumber() {
        return coveragePhotoNumber;
    }

    public void setCoveragePhotoNumber(int coveragePhotoNumber) {
        this.coveragePhotoNumber = coveragePhotoNumber;
    }

    @Basic
    @Column(name = "density_photo_number")
    public int getDensityPhotoNumber() {
        return densityPhotoNumber;
    }

    public void setDensityPhotoNumber(int densityPhotoNumber) {
        this.densityPhotoNumber = densityPhotoNumber;
    }

    @Basic
    @Column(name = "coverage_photo_result")
    public int getCoveragePhotoResult() {
        return coveragePhotoResult;
    }

    public void setCoveragePhotoResult(int coveragePhotoResult) {
        this.coveragePhotoResult = coveragePhotoResult;
    }

    @Basic
    @Column(name = "density_photo_result")
    public int getDensityPhotoResult() {
        return densityPhotoResult;
    }

    public void setDensityPhotoResult(int densityPhotoResult) {
        this.densityPhotoResult = densityPhotoResult;
    }

    @Basic
    @Column(name = "record_date")
    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    @Basic
    @Column(name = "recorder")
    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    @Basic
    @Column(name = "reviewer")
    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    @Basic
    @Column(name = "review_date")
    public Timestamp getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Timestamp reviewDate) {
        this.reviewDate = reviewDate;
    }

    @Basic
    @Column(name = "review_status")
    public int getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(int reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    @Basic
    @Column(name = "review_info")
    public String getReviewInfo() {
        return reviewInfo;
    }

    public void setReviewInfo(String reviewInfo) {
        this.reviewInfo = reviewInfo;
    }

    @Basic
    @Column(name = "if_runoff")
    public boolean isIfRunoff() {
        return ifRunoff;
    }

    public void setIfRunoff(boolean ifRunoff) {
        this.ifRunoff = ifRunoff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblPlotCoverageInfoEntity that = (TblPlotCoverageInfoEntity) o;
        return id == that.id &&
                siteId == that.siteId &&
                sequence == that.sequence &&
                vegetationCoverage == that.vegetationCoverage &&
                groundCoverage == that.groundCoverage &&
                crownDensity == that.crownDensity &&
                averageVegetationHeight == that.averageVegetationHeight &&
                coveragePhotoNumber == that.coveragePhotoNumber &&
                densityPhotoNumber == that.densityPhotoNumber &&
                coveragePhotoResult == that.coveragePhotoResult &&
                densityPhotoResult == that.densityPhotoResult &&
                reviewStatus == that.reviewStatus &&
                ifRunoff == that.ifRunoff &&
                Objects.equals(observationPoint, that.observationPoint) &&
                Objects.equals(coveragePhoto, that.coveragePhoto) &&
                Objects.equals(densityPhoto, that.densityPhoto) &&
                Objects.equals(recordDate, that.recordDate) &&
                Objects.equals(recorder, that.recorder) &&
                Objects.equals(reviewer, that.reviewer) &&
                Objects.equals(reviewDate, that.reviewDate) &&
                Objects.equals(reviewInfo, that.reviewInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, siteId, sequence, observationPoint, vegetationCoverage, groundCoverage, crownDensity, averageVegetationHeight, coveragePhoto, densityPhoto, coveragePhotoNumber, densityPhotoNumber, coveragePhotoResult, densityPhotoResult, recordDate, recorder, reviewer, reviewDate, reviewStatus, reviewInfo, ifRunoff);
    }
}
