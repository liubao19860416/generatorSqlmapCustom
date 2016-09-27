package com.crt.openapi.modules.apiinterface.domain.entity1;

import java.util.Date;

public class ApiApp {
    /**
     * 主键
     */
    // 主键
    private Integer id;

    /**
     * 应用ID
     */
    // 应用ID
    private String appId;

    /**
     * 主键
     */
    // 主键
    private String orgId;

    /**
     * 组织名称
     */
    // 组织名称
    private String appName;

    /**
     * 名称缩写
     */
    // 名称缩写
    private String appNameAbbreviation;

    /**
     * 应用私钥
     */
    // 应用私钥
    private String appSecret;

    /**
     * TOKEN令牌
     */
    // TOKEN令牌
    private String token;

    /**
     * 状态(0-启动 1-禁用(禁用后不可订阅发布,已订阅可以调用))
     */
    // 状态(0-启动 1-禁用(禁用后不可订阅发布,已订阅可以调用))
    private String status;

    /**
     * 删除标示(0:正常,1:删除)
     */
    // 删除标示(0:正常,1:删除)
    private String delFlag;

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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getAppNameAbbreviation() {
        return appNameAbbreviation;
    }

    public void setAppNameAbbreviation(String appNameAbbreviation) {
        this.appNameAbbreviation = appNameAbbreviation == null ? null : appNameAbbreviation.trim();
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
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