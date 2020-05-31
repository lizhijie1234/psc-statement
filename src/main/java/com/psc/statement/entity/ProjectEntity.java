package com.psc.statement.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "project", schema = "psc1", catalog = "")
public class ProjectEntity {
    private int id;
    private String code;
    private String name;
    private Date approvalYear;
    private String province;
    private String city;
    private String district;
    private String location;
    private double longitude;
    private double latitude;
    private String mineType;
    private Integer workOrgId;
    private Integer workPersonId;
    private Integer supervisionOrgId;
    private Integer supervisionPersonId;
    private String explorer;
    private String exploreLicense;
    private Timestamp exploreLicenseStartTime;
    private Timestamp exploreLicenseEndTime;
    private Timestamp startYear;
    private Timestamp endYear;
    private Double projectBudget;
    private Double approveBudget;
    private Double accumulatePay;
    private Double fundSettlement;
    private String expertOpinionEconomy;
    private String expertOpinionTechnology;
    private String projectDescribe;
    private int projectState;
    private String founder;
    private Timestamp createTime;
    private String modifier;
    private Timestamp updateTime;
    private String taskBook;
    private Timestamp taskBookSubmitTime;
    private String projectDesign;
    private Timestamp projectDesignSubmitTime;
    private String projectDesignOpinionEconomic;
    private Timestamp projectDesignOpinionEconomicSubmitTime;
    private String projectDesignOpinionTechnology;
    private Timestamp projectDesignOpinionTechnologySubmitTime;
    private String projectDesignReply;
    private Timestamp projectDesignReplySubmitTime;
    private String projectSupervisionTaskBook;
    private Timestamp projectSupervisionTaskBookSubmitTime;
    private String supervisionPlan;
    private Timestamp supervisionPlanSubmitTime;
    private String workContract;
    private Timestamp workContractPlanSubmitTime;
    private String supervisionContractSubmitTime;
    private Timestamp supervisionContract;
    private String cooperationWorkInvestContract;
    private Timestamp cooperationWorkInvestContractSubmitTime;
    private String appendInvestContract;
    private Timestamp appendInvestContractSubmitTime;
    private String fieldCheckData;
    private Timestamp fieldCheckDataSubmitTime;
    private String fieldCheckApply;
    private Timestamp fieldCheckApplySubmitTime;
    private String fieldCheckOpinionBook;
    private Timestamp fieldCheckOpinionBookSubmitTime;
    private String projectResultReport;
    private Timestamp projectResultReportSubmitTime;
    private String projectReportReviewOpinion;
    private Timestamp projectReportReviewOpinionSubmitTime;
    private String projectCollectionProve;
    private Timestamp projectCollectionProveSubmitTime;
    private Integer amountResource;
    private Byte isMine;
    private String mineCountExplain;
    private Integer wutanWorkload;
    private Integer hautanWorkload;
    private Integer shandigongchengWorkload;
    private Integer zuantanWorkload;
    private Integer wutanCompletedWorkload;
    private Integer huatanCompletedWorkload;
    private Integer shandigongchengCompletedWorkload;
    private Integer zuantanCompletedWorkload;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
    @Column(name = "approval_year")
    public Date getApprovalYear() {
        return approvalYear;
    }

    public void setApprovalYear(Date approvalYear) {
        this.approvalYear = approvalYear;
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
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "longitude")
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "latitude")
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "mine_type")
    public String getMineType() {
        return mineType;
    }

    public void setMineType(String mineType) {
        this.mineType = mineType;
    }

    @Basic
    @Column(name = "work_org_id")
    public Integer getWorkOrgId() {
        return workOrgId;
    }

    public void setWorkOrgId(Integer workOrgId) {
        this.workOrgId = workOrgId;
    }

    @Basic
    @Column(name = "work_person_id")
    public Integer getWorkPersonId() {
        return workPersonId;
    }

    public void setWorkPersonId(Integer workPersonId) {
        this.workPersonId = workPersonId;
    }

    @Basic
    @Column(name = "supervision_org_id")
    public Integer getSupervisionOrgId() {
        return supervisionOrgId;
    }

    public void setSupervisionOrgId(Integer supervisionOrgId) {
        this.supervisionOrgId = supervisionOrgId;
    }

    @Basic
    @Column(name = "supervision_person_id")
    public Integer getSupervisionPersonId() {
        return supervisionPersonId;
    }

    public void setSupervisionPersonId(Integer supervisionPersonId) {
        this.supervisionPersonId = supervisionPersonId;
    }

    @Basic
    @Column(name = "explorer")
    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer;
    }

    @Basic
    @Column(name = "explore_license")
    public String getExploreLicense() {
        return exploreLicense;
    }

    public void setExploreLicense(String exploreLicense) {
        this.exploreLicense = exploreLicense;
    }

    @Basic
    @Column(name = "explore_license_start_time")
    public Timestamp getExploreLicenseStartTime() {
        return exploreLicenseStartTime;
    }

    public void setExploreLicenseStartTime(Timestamp exploreLicenseStartTime) {
        this.exploreLicenseStartTime = exploreLicenseStartTime;
    }

    @Basic
    @Column(name = "explore_license_end_time")
    public Timestamp getExploreLicenseEndTime() {
        return exploreLicenseEndTime;
    }

    public void setExploreLicenseEndTime(Timestamp exploreLicenseEndTime) {
        this.exploreLicenseEndTime = exploreLicenseEndTime;
    }

    @Basic
    @Column(name = "start_year")
    public Timestamp getStartYear() {
        return startYear;
    }

    public void setStartYear(Timestamp startYear) {
        this.startYear = startYear;
    }

    @Basic
    @Column(name = "end_year")
    public Timestamp getEndYear() {
        return endYear;
    }

    public void setEndYear(Timestamp endYear) {
        this.endYear = endYear;
    }

    @Basic
    @Column(name = "project_budget")
    public Double getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(Double projectBudget) {
        this.projectBudget = projectBudget;
    }

    @Basic
    @Column(name = "approve_budget")
    public Double getApproveBudget() {
        return approveBudget;
    }

    public void setApproveBudget(Double approveBudget) {
        this.approveBudget = approveBudget;
    }

    @Basic
    @Column(name = "accumulate_pay")
    public Double getAccumulatePay() {
        return accumulatePay;
    }

    public void setAccumulatePay(Double accumulatePay) {
        this.accumulatePay = accumulatePay;
    }

    @Basic
    @Column(name = "fund_settlement")
    public Double getFundSettlement() {
        return fundSettlement;
    }

    public void setFundSettlement(Double fundSettlement) {
        this.fundSettlement = fundSettlement;
    }

    @Basic
    @Column(name = "expert_opinion_economy")
    public String getExpertOpinionEconomy() {
        return expertOpinionEconomy;
    }

    public void setExpertOpinionEconomy(String expertOpinionEconomy) {
        this.expertOpinionEconomy = expertOpinionEconomy;
    }

    @Basic
    @Column(name = "expert_opinion_technology")
    public String getExpertOpinionTechnology() {
        return expertOpinionTechnology;
    }

    public void setExpertOpinionTechnology(String expertOpinionTechnology) {
        this.expertOpinionTechnology = expertOpinionTechnology;
    }

    @Basic
    @Column(name = "project_describe")
    public String getProjectDescribe() {
        return projectDescribe;
    }

    public void setProjectDescribe(String projectDescribe) {
        this.projectDescribe = projectDescribe;
    }

    @Basic
    @Column(name = "project_state")
    public int getProjectState() {
        return projectState;
    }

    public void setProjectState(int projectState) {
        this.projectState = projectState;
    }

    @Basic
    @Column(name = "founder")
    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
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
    @Column(name = "modifier")
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "task_book")
    public String getTaskBook() {
        return taskBook;
    }

    public void setTaskBook(String taskBook) {
        this.taskBook = taskBook;
    }

    @Basic
    @Column(name = "task_book_submit_time")
    public Timestamp getTaskBookSubmitTime() {
        return taskBookSubmitTime;
    }

    public void setTaskBookSubmitTime(Timestamp taskBookSubmitTime) {
        this.taskBookSubmitTime = taskBookSubmitTime;
    }

    @Basic
    @Column(name = "project_design")
    public String getProjectDesign() {
        return projectDesign;
    }

    public void setProjectDesign(String projectDesign) {
        this.projectDesign = projectDesign;
    }

    @Basic
    @Column(name = "project_design_submit_time")
    public Timestamp getProjectDesignSubmitTime() {
        return projectDesignSubmitTime;
    }

    public void setProjectDesignSubmitTime(Timestamp projectDesignSubmitTime) {
        this.projectDesignSubmitTime = projectDesignSubmitTime;
    }

    @Basic
    @Column(name = "project_design_opinion_economic")
    public String getProjectDesignOpinionEconomic() {
        return projectDesignOpinionEconomic;
    }

    public void setProjectDesignOpinionEconomic(String projectDesignOpinionEconomic) {
        this.projectDesignOpinionEconomic = projectDesignOpinionEconomic;
    }

    @Basic
    @Column(name = "project_design_opinion_economic_submit_time")
    public Timestamp getProjectDesignOpinionEconomicSubmitTime() {
        return projectDesignOpinionEconomicSubmitTime;
    }

    public void setProjectDesignOpinionEconomicSubmitTime(Timestamp projectDesignOpinionEconomicSubmitTime) {
        this.projectDesignOpinionEconomicSubmitTime = projectDesignOpinionEconomicSubmitTime;
    }

    @Basic
    @Column(name = "project_design_opinion_technology")
    public String getProjectDesignOpinionTechnology() {
        return projectDesignOpinionTechnology;
    }

    public void setProjectDesignOpinionTechnology(String projectDesignOpinionTechnology) {
        this.projectDesignOpinionTechnology = projectDesignOpinionTechnology;
    }

    @Basic
    @Column(name = "project_design_opinion_technology_submit_time")
    public Timestamp getProjectDesignOpinionTechnologySubmitTime() {
        return projectDesignOpinionTechnologySubmitTime;
    }

    public void setProjectDesignOpinionTechnologySubmitTime(Timestamp projectDesignOpinionTechnologySubmitTime) {
        this.projectDesignOpinionTechnologySubmitTime = projectDesignOpinionTechnologySubmitTime;
    }

    @Basic
    @Column(name = "project_design_reply")
    public String getProjectDesignReply() {
        return projectDesignReply;
    }

    public void setProjectDesignReply(String projectDesignReply) {
        this.projectDesignReply = projectDesignReply;
    }

    @Basic
    @Column(name = "project_design_reply_submit_time")
    public Timestamp getProjectDesignReplySubmitTime() {
        return projectDesignReplySubmitTime;
    }

    public void setProjectDesignReplySubmitTime(Timestamp projectDesignReplySubmitTime) {
        this.projectDesignReplySubmitTime = projectDesignReplySubmitTime;
    }

    @Basic
    @Column(name = "project_supervision_task_book")
    public String getProjectSupervisionTaskBook() {
        return projectSupervisionTaskBook;
    }

    public void setProjectSupervisionTaskBook(String projectSupervisionTaskBook) {
        this.projectSupervisionTaskBook = projectSupervisionTaskBook;
    }

    @Basic
    @Column(name = "project_supervision_task_book_submit_time")
    public Timestamp getProjectSupervisionTaskBookSubmitTime() {
        return projectSupervisionTaskBookSubmitTime;
    }

    public void setProjectSupervisionTaskBookSubmitTime(Timestamp projectSupervisionTaskBookSubmitTime) {
        this.projectSupervisionTaskBookSubmitTime = projectSupervisionTaskBookSubmitTime;
    }

    @Basic
    @Column(name = "supervision_plan")
    public String getSupervisionPlan() {
        return supervisionPlan;
    }

    public void setSupervisionPlan(String supervisionPlan) {
        this.supervisionPlan = supervisionPlan;
    }

    @Basic
    @Column(name = "supervision_plan_submit_time")
    public Timestamp getSupervisionPlanSubmitTime() {
        return supervisionPlanSubmitTime;
    }

    public void setSupervisionPlanSubmitTime(Timestamp supervisionPlanSubmitTime) {
        this.supervisionPlanSubmitTime = supervisionPlanSubmitTime;
    }

    @Basic
    @Column(name = "work_contract")
    public String getWorkContract() {
        return workContract;
    }

    public void setWorkContract(String workContract) {
        this.workContract = workContract;
    }

    @Basic
    @Column(name = "work_contract_plan_submit_time")
    public Timestamp getWorkContractPlanSubmitTime() {
        return workContractPlanSubmitTime;
    }

    public void setWorkContractPlanSubmitTime(Timestamp workContractPlanSubmitTime) {
        this.workContractPlanSubmitTime = workContractPlanSubmitTime;
    }

    @Basic
    @Column(name = "supervision_contract_submit_time")
    public String getSupervisionContractSubmitTime() {
        return supervisionContractSubmitTime;
    }

    public void setSupervisionContractSubmitTime(String supervisionContractSubmitTime) {
        this.supervisionContractSubmitTime = supervisionContractSubmitTime;
    }

    @Basic
    @Column(name = "supervision_contract")
    public Timestamp getSupervisionContract() {
        return supervisionContract;
    }

    public void setSupervisionContract(Timestamp supervisionContract) {
        this.supervisionContract = supervisionContract;
    }

    @Basic
    @Column(name = "cooperation_work_invest_contract")
    public String getCooperationWorkInvestContract() {
        return cooperationWorkInvestContract;
    }

    public void setCooperationWorkInvestContract(String cooperationWorkInvestContract) {
        this.cooperationWorkInvestContract = cooperationWorkInvestContract;
    }

    @Basic
    @Column(name = "cooperation_work_invest_contract_submit_time")
    public Timestamp getCooperationWorkInvestContractSubmitTime() {
        return cooperationWorkInvestContractSubmitTime;
    }

    public void setCooperationWorkInvestContractSubmitTime(Timestamp cooperationWorkInvestContractSubmitTime) {
        this.cooperationWorkInvestContractSubmitTime = cooperationWorkInvestContractSubmitTime;
    }

    @Basic
    @Column(name = "append_invest_contract")
    public String getAppendInvestContract() {
        return appendInvestContract;
    }

    public void setAppendInvestContract(String appendInvestContract) {
        this.appendInvestContract = appendInvestContract;
    }

    @Basic
    @Column(name = "append_invest_contract_submit_time")
    public Timestamp getAppendInvestContractSubmitTime() {
        return appendInvestContractSubmitTime;
    }

    public void setAppendInvestContractSubmitTime(Timestamp appendInvestContractSubmitTime) {
        this.appendInvestContractSubmitTime = appendInvestContractSubmitTime;
    }

    @Basic
    @Column(name = "field_check_data")
    public String getFieldCheckData() {
        return fieldCheckData;
    }

    public void setFieldCheckData(String fieldCheckData) {
        this.fieldCheckData = fieldCheckData;
    }

    @Basic
    @Column(name = "field_check_data_submit_time")
    public Timestamp getFieldCheckDataSubmitTime() {
        return fieldCheckDataSubmitTime;
    }

    public void setFieldCheckDataSubmitTime(Timestamp fieldCheckDataSubmitTime) {
        this.fieldCheckDataSubmitTime = fieldCheckDataSubmitTime;
    }

    @Basic
    @Column(name = "field_check_apply")
    public String getFieldCheckApply() {
        return fieldCheckApply;
    }

    public void setFieldCheckApply(String fieldCheckApply) {
        this.fieldCheckApply = fieldCheckApply;
    }

    @Basic
    @Column(name = "field_check_apply_submit_time")
    public Timestamp getFieldCheckApplySubmitTime() {
        return fieldCheckApplySubmitTime;
    }

    public void setFieldCheckApplySubmitTime(Timestamp fieldCheckApplySubmitTime) {
        this.fieldCheckApplySubmitTime = fieldCheckApplySubmitTime;
    }

    @Basic
    @Column(name = "field_check_opinion_book")
    public String getFieldCheckOpinionBook() {
        return fieldCheckOpinionBook;
    }

    public void setFieldCheckOpinionBook(String fieldCheckOpinionBook) {
        this.fieldCheckOpinionBook = fieldCheckOpinionBook;
    }

    @Basic
    @Column(name = "field_check_opinion_book_submit_time")
    public Timestamp getFieldCheckOpinionBookSubmitTime() {
        return fieldCheckOpinionBookSubmitTime;
    }

    public void setFieldCheckOpinionBookSubmitTime(Timestamp fieldCheckOpinionBookSubmitTime) {
        this.fieldCheckOpinionBookSubmitTime = fieldCheckOpinionBookSubmitTime;
    }

    @Basic
    @Column(name = "project_result_report")
    public String getProjectResultReport() {
        return projectResultReport;
    }

    public void setProjectResultReport(String projectResultReport) {
        this.projectResultReport = projectResultReport;
    }

    @Basic
    @Column(name = "project_result_report_submit_time")
    public Timestamp getProjectResultReportSubmitTime() {
        return projectResultReportSubmitTime;
    }

    public void setProjectResultReportSubmitTime(Timestamp projectResultReportSubmitTime) {
        this.projectResultReportSubmitTime = projectResultReportSubmitTime;
    }

    @Basic
    @Column(name = "project_report_review_opinion")
    public String getProjectReportReviewOpinion() {
        return projectReportReviewOpinion;
    }

    public void setProjectReportReviewOpinion(String projectReportReviewOpinion) {
        this.projectReportReviewOpinion = projectReportReviewOpinion;
    }

    @Basic
    @Column(name = "project_report_review_opinion_submit_time")
    public Timestamp getProjectReportReviewOpinionSubmitTime() {
        return projectReportReviewOpinionSubmitTime;
    }

    public void setProjectReportReviewOpinionSubmitTime(Timestamp projectReportReviewOpinionSubmitTime) {
        this.projectReportReviewOpinionSubmitTime = projectReportReviewOpinionSubmitTime;
    }

    @Basic
    @Column(name = "project_collection_prove")
    public String getProjectCollectionProve() {
        return projectCollectionProve;
    }

    public void setProjectCollectionProve(String projectCollectionProve) {
        this.projectCollectionProve = projectCollectionProve;
    }

    @Basic
    @Column(name = "project_collection_prove_submit_time")
    public Timestamp getProjectCollectionProveSubmitTime() {
        return projectCollectionProveSubmitTime;
    }

    public void setProjectCollectionProveSubmitTime(Timestamp projectCollectionProveSubmitTime) {
        this.projectCollectionProveSubmitTime = projectCollectionProveSubmitTime;
    }

    @Basic
    @Column(name = "amount_resource")
    public Integer getAmountResource() {
        return amountResource;
    }

    public void setAmountResource(Integer amountResource) {
        this.amountResource = amountResource;
    }

    @Basic
    @Column(name = "is_mine")
    public Byte getIsMine() {
        return isMine;
    }

    public void setIsMine(Byte isMine) {
        this.isMine = isMine;
    }

    @Basic
    @Column(name = "mine_count_explain")
    public String getMineCountExplain() {
        return mineCountExplain;
    }

    public void setMineCountExplain(String mineCountExplain) {
        this.mineCountExplain = mineCountExplain;
    }

    @Basic
    @Column(name = "wutan_workload")
    public Integer getWutanWorkload() {
        return wutanWorkload;
    }

    public void setWutanWorkload(Integer wutanWorkload) {
        this.wutanWorkload = wutanWorkload;
    }

    @Basic
    @Column(name = "hautan_workload")
    public Integer getHautanWorkload() {
        return hautanWorkload;
    }

    public void setHautanWorkload(Integer hautanWorkload) {
        this.hautanWorkload = hautanWorkload;
    }

    @Basic
    @Column(name = "shandigongcheng_workload")
    public Integer getShandigongchengWorkload() {
        return shandigongchengWorkload;
    }

    public void setShandigongchengWorkload(Integer shandigongchengWorkload) {
        this.shandigongchengWorkload = shandigongchengWorkload;
    }

    @Basic
    @Column(name = "zuantan_workload")
    public Integer getZuantanWorkload() {
        return zuantanWorkload;
    }

    public void setZuantanWorkload(Integer zuantanWorkload) {
        this.zuantanWorkload = zuantanWorkload;
    }

    @Basic
    @Column(name = "wutan_completed_workload")
    public Integer getWutanCompletedWorkload() {
        return wutanCompletedWorkload;
    }

    public void setWutanCompletedWorkload(Integer wutanCompletedWorkload) {
        this.wutanCompletedWorkload = wutanCompletedWorkload;
    }

    @Basic
    @Column(name = "huatan_completed_workload")
    public Integer getHuatanCompletedWorkload() {
        return huatanCompletedWorkload;
    }

    public void setHuatanCompletedWorkload(Integer huatanCompletedWorkload) {
        this.huatanCompletedWorkload = huatanCompletedWorkload;
    }

    @Basic
    @Column(name = "shandigongcheng_completed_workload")
    public Integer getShandigongchengCompletedWorkload() {
        return shandigongchengCompletedWorkload;
    }

    public void setShandigongchengCompletedWorkload(Integer shandigongchengCompletedWorkload) {
        this.shandigongchengCompletedWorkload = shandigongchengCompletedWorkload;
    }

    @Basic
    @Column(name = "zuantan_completed_workload")
    public Integer getZuantanCompletedWorkload() {
        return zuantanCompletedWorkload;
    }

    public void setZuantanCompletedWorkload(Integer zuantanCompletedWorkload) {
        this.zuantanCompletedWorkload = zuantanCompletedWorkload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectEntity that = (ProjectEntity) o;
        return id == that.id &&
                Double.compare(that.longitude, longitude) == 0 &&
                Double.compare(that.latitude, latitude) == 0 &&
                projectState == that.projectState &&
                Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(approvalYear, that.approvalYear) &&
                Objects.equals(province, that.province) &&
                Objects.equals(city, that.city) &&
                Objects.equals(district, that.district) &&
                Objects.equals(location, that.location) &&
                Objects.equals(mineType, that.mineType) &&
                Objects.equals(workOrgId, that.workOrgId) &&
                Objects.equals(workPersonId, that.workPersonId) &&
                Objects.equals(supervisionOrgId, that.supervisionOrgId) &&
                Objects.equals(supervisionPersonId, that.supervisionPersonId) &&
                Objects.equals(explorer, that.explorer) &&
                Objects.equals(exploreLicense, that.exploreLicense) &&
                Objects.equals(exploreLicenseStartTime, that.exploreLicenseStartTime) &&
                Objects.equals(exploreLicenseEndTime, that.exploreLicenseEndTime) &&
                Objects.equals(startYear, that.startYear) &&
                Objects.equals(endYear, that.endYear) &&
                Objects.equals(projectBudget, that.projectBudget) &&
                Objects.equals(approveBudget, that.approveBudget) &&
                Objects.equals(accumulatePay, that.accumulatePay) &&
                Objects.equals(fundSettlement, that.fundSettlement) &&
                Objects.equals(expertOpinionEconomy, that.expertOpinionEconomy) &&
                Objects.equals(expertOpinionTechnology, that.expertOpinionTechnology) &&
                Objects.equals(projectDescribe, that.projectDescribe) &&
                Objects.equals(founder, that.founder) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifier, that.modifier) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(taskBook, that.taskBook) &&
                Objects.equals(taskBookSubmitTime, that.taskBookSubmitTime) &&
                Objects.equals(projectDesign, that.projectDesign) &&
                Objects.equals(projectDesignSubmitTime, that.projectDesignSubmitTime) &&
                Objects.equals(projectDesignOpinionEconomic, that.projectDesignOpinionEconomic) &&
                Objects.equals(projectDesignOpinionEconomicSubmitTime, that.projectDesignOpinionEconomicSubmitTime) &&
                Objects.equals(projectDesignOpinionTechnology, that.projectDesignOpinionTechnology) &&
                Objects.equals(projectDesignOpinionTechnologySubmitTime, that.projectDesignOpinionTechnologySubmitTime) &&
                Objects.equals(projectDesignReply, that.projectDesignReply) &&
                Objects.equals(projectDesignReplySubmitTime, that.projectDesignReplySubmitTime) &&
                Objects.equals(projectSupervisionTaskBook, that.projectSupervisionTaskBook) &&
                Objects.equals(projectSupervisionTaskBookSubmitTime, that.projectSupervisionTaskBookSubmitTime) &&
                Objects.equals(supervisionPlan, that.supervisionPlan) &&
                Objects.equals(supervisionPlanSubmitTime, that.supervisionPlanSubmitTime) &&
                Objects.equals(workContract, that.workContract) &&
                Objects.equals(workContractPlanSubmitTime, that.workContractPlanSubmitTime) &&
                Objects.equals(supervisionContractSubmitTime, that.supervisionContractSubmitTime) &&
                Objects.equals(supervisionContract, that.supervisionContract) &&
                Objects.equals(cooperationWorkInvestContract, that.cooperationWorkInvestContract) &&
                Objects.equals(cooperationWorkInvestContractSubmitTime, that.cooperationWorkInvestContractSubmitTime) &&
                Objects.equals(appendInvestContract, that.appendInvestContract) &&
                Objects.equals(appendInvestContractSubmitTime, that.appendInvestContractSubmitTime) &&
                Objects.equals(fieldCheckData, that.fieldCheckData) &&
                Objects.equals(fieldCheckDataSubmitTime, that.fieldCheckDataSubmitTime) &&
                Objects.equals(fieldCheckApply, that.fieldCheckApply) &&
                Objects.equals(fieldCheckApplySubmitTime, that.fieldCheckApplySubmitTime) &&
                Objects.equals(fieldCheckOpinionBook, that.fieldCheckOpinionBook) &&
                Objects.equals(fieldCheckOpinionBookSubmitTime, that.fieldCheckOpinionBookSubmitTime) &&
                Objects.equals(projectResultReport, that.projectResultReport) &&
                Objects.equals(projectResultReportSubmitTime, that.projectResultReportSubmitTime) &&
                Objects.equals(projectReportReviewOpinion, that.projectReportReviewOpinion) &&
                Objects.equals(projectReportReviewOpinionSubmitTime, that.projectReportReviewOpinionSubmitTime) &&
                Objects.equals(projectCollectionProve, that.projectCollectionProve) &&
                Objects.equals(projectCollectionProveSubmitTime, that.projectCollectionProveSubmitTime) &&
                Objects.equals(amountResource, that.amountResource) &&
                Objects.equals(isMine, that.isMine) &&
                Objects.equals(mineCountExplain, that.mineCountExplain) &&
                Objects.equals(wutanWorkload, that.wutanWorkload) &&
                Objects.equals(hautanWorkload, that.hautanWorkload) &&
                Objects.equals(shandigongchengWorkload, that.shandigongchengWorkload) &&
                Objects.equals(zuantanWorkload, that.zuantanWorkload) &&
                Objects.equals(wutanCompletedWorkload, that.wutanCompletedWorkload) &&
                Objects.equals(huatanCompletedWorkload, that.huatanCompletedWorkload) &&
                Objects.equals(shandigongchengCompletedWorkload, that.shandigongchengCompletedWorkload) &&
                Objects.equals(zuantanCompletedWorkload, that.zuantanCompletedWorkload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, approvalYear, province, city, district, location, longitude, latitude, mineType, workOrgId, workPersonId, supervisionOrgId, supervisionPersonId, explorer, exploreLicense, exploreLicenseStartTime, exploreLicenseEndTime, startYear, endYear, projectBudget, approveBudget, accumulatePay, fundSettlement, expertOpinionEconomy, expertOpinionTechnology, projectDescribe, projectState, founder, createTime, modifier, updateTime, taskBook, taskBookSubmitTime, projectDesign, projectDesignSubmitTime, projectDesignOpinionEconomic, projectDesignOpinionEconomicSubmitTime, projectDesignOpinionTechnology, projectDesignOpinionTechnologySubmitTime, projectDesignReply, projectDesignReplySubmitTime, projectSupervisionTaskBook, projectSupervisionTaskBookSubmitTime, supervisionPlan, supervisionPlanSubmitTime, workContract, workContractPlanSubmitTime, supervisionContractSubmitTime, supervisionContract, cooperationWorkInvestContract, cooperationWorkInvestContractSubmitTime, appendInvestContract, appendInvestContractSubmitTime, fieldCheckData, fieldCheckDataSubmitTime, fieldCheckApply, fieldCheckApplySubmitTime, fieldCheckOpinionBook, fieldCheckOpinionBookSubmitTime, projectResultReport, projectResultReportSubmitTime, projectReportReviewOpinion, projectReportReviewOpinionSubmitTime, projectCollectionProve, projectCollectionProveSubmitTime, amountResource, isMine, mineCountExplain, wutanWorkload, hautanWorkload, shandigongchengWorkload, zuantanWorkload, wutanCompletedWorkload, huatanCompletedWorkload, shandigongchengCompletedWorkload, zuantanCompletedWorkload);
    }
}
