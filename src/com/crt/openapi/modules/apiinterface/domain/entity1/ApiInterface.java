package com.crt.openapi.modules.apiinterface.domain.entity1;

import java.util.Date;

public class ApiInterface {
    /**
     * 主键
     */
    // 主键
    private Integer id;

    /**
     * 接口ID
     */
    // 接口ID
    private String apiId;

    /**
     * 接口名称
     */
    // 接口名称
    private String apiName;

    /**
     * 目标url
     */
    // 目标url
    private String targetUrl;

    /**
     * 沙箱目标url
     */
    // 沙箱目标url
    private String sandboxTargetUrl;

    /**
     * 状态(1-草稿 2-发布 3-阻塞 4-过时 5-冻结 6-退役)
     */
    // 状态(1-草稿 2-发布 3-阻塞 4-过时 5-冻结 6-退役)
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

    /**
     * 版本号
     */
    // 版本号
    private String version;

    /**
     * 组织ID
     */
    // 组织ID
    private String orgId;

    /**
     * 应用ID
     */
    // 应用ID
    private String appId;

    /**
     * 栏目编码
     */
    // 栏目编码
    private String columnCode;

    /**
     * 授权(1-公开 2-仅组织内可见 3-仅授权组织可见 4-授权组织不可见)
     */
    // 授权(1-公开 2-仅组织内可见 3-仅授权组织可见 4-授权组织不可见)
    private String auth;

    /**
     * 授权组织编码,多个默认以","分隔
     */
    // 授权组织编码,多个默认以","分隔
    private String authCodes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId == null ? null : apiId.trim();
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl == null ? null : targetUrl.trim();
    }

    public String getSandboxTargetUrl() {
        return sandboxTargetUrl;
    }

    public void setSandboxTargetUrl(String sandboxTargetUrl) {
        this.sandboxTargetUrl = sandboxTargetUrl == null ? null : sandboxTargetUrl.trim();
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getColumnCode() {
        return columnCode;
    }

    public void setColumnCode(String columnCode) {
        this.columnCode = columnCode == null ? null : columnCode.trim();
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth == null ? null : auth.trim();
    }

    public String getAuthCodes() {
        return authCodes;
    }

    public void setAuthCodes(String authCodes) {
        this.authCodes = authCodes == null ? null : authCodes.trim();
    }
}