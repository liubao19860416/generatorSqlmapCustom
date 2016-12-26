package com.crt.message.domain.entity;

import java.util.Date;

public class PfModelUrl extends PfModelUrlKey {
    // 业务code
    private String code;

    // 模版code
    private String pfModelCode;

    // 适用范围
    private String applicableScope;

    // 跳转url
    private String hrefUrl;

    // icon地址
    private String icoUrl;

    // 删除标记位
    private Boolean delFlag;

    // 创建人
    private String createBy;

    // 更新人
    private String updateBy;

    // 创建时间
    private Date createDate;

    // 更新时间
    private Date updateDate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPfModelCode() {
        return pfModelCode;
    }

    public void setPfModelCode(String pfModelCode) {
        this.pfModelCode = pfModelCode == null ? null : pfModelCode.trim();
    }

    public String getApplicableScope() {
        return applicableScope;
    }

    public void setApplicableScope(String applicableScope) {
        this.applicableScope = applicableScope == null ? null : applicableScope.trim();
    }

    public String getHrefUrl() {
        return hrefUrl;
    }

    public void setHrefUrl(String hrefUrl) {
        this.hrefUrl = hrefUrl == null ? null : hrefUrl.trim();
    }

    public String getIcoUrl() {
        return icoUrl;
    }

    public void setIcoUrl(String icoUrl) {
        this.icoUrl = icoUrl == null ? null : icoUrl.trim();
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}