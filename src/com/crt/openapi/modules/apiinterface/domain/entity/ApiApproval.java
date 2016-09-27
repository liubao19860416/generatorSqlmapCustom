package com.crt.openapi.modules.apiinterface.domain.entity;

public class ApiApproval {
    private Long id;

    private Long appId;

    private Long apiId;

    private String applyDate;

    private String remark;

    private String postil;

    private String applyStatus;

    private String approvalBy;

    private String approvalDate;

    private String creater;

    private String createrDate;

    private String updater;

    private String updaterDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Long getApiId() {
        return apiId;
    }

    public void setApiId(Long apiId) {
        this.apiId = apiId;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate == null ? null : applyDate.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPostil() {
        return postil;
    }

    public void setPostil(String postil) {
        this.postil = postil == null ? null : postil.trim();
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus == null ? null : applyStatus.trim();
    }

    public String getApprovalBy() {
        return approvalBy;
    }

    public void setApprovalBy(String approvalBy) {
        this.approvalBy = approvalBy == null ? null : approvalBy.trim();
    }

    public String getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(String approvalDate) {
        this.approvalDate = approvalDate == null ? null : approvalDate.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getCreaterDate() {
        return createrDate;
    }

    public void setCreaterDate(String createrDate) {
        this.createrDate = createrDate == null ? null : createrDate.trim();
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public String getUpdaterDate() {
        return updaterDate;
    }

    public void setUpdaterDate(String updaterDate) {
        this.updaterDate = updaterDate == null ? null : updaterDate.trim();
    }
}