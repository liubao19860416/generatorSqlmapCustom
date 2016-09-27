package com.crt.openapi.modules.apiinterface.domain.entity1;

import java.util.Date;

public class ApiSysMenu {
    /**
     * 主键
     */
    // 主键
    private Integer id;

    /**
     * 用户ID
     */
    // 用户ID
    private String userId;

    /**
     * name
     */
    // name
    private String name;

    /**
     * href
     */
    // href
    private String href;

    /**
     * remark
     */
    // remark
    private String remark;

    /**
     * del_flag
     */
    // del_flag
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
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