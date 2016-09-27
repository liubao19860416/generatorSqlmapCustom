package com.crt.openapi.modules.apiinterface.domain.entity;

public class ApiRole {
    private Long id;

    private String roleName;

    private String remark;

    private String delFlag;

    private String sort;

    private String status;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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