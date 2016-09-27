package com.crt.openapi.modules.apiinterface.domain.entity1;

import java.util.Date;

public class ApiRole {
    /**
     * 主键
     */
    // 主键
    private Integer id;

    /**
     * 角色名称
     */
    // 角色名称
    private String roleName;

    /**
     * 备注
     */
    // 备注
    private String remark;

    /**
     * 删除标记
     */
    // 删除标记
    private String delFlag;

    /**
     * 排序
     */
    // 排序
    private String sort;

    /**
     * 审核状态
     */
    // 审核状态
    private String status;

    /**
     * 创建人
     */
    // 创建人
    private String creater;

    /**
     * 创建时间
     */
    // 创建时间
    private Date createTime;

    /**
     * 修改人
     */
    // 修改人
    private String updater;

    /**
     * 修改时间
     */
    // 修改时间
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}