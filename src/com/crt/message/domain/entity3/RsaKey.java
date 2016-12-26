package com.crt.message.domain.entity3;

import java.util.Date;

public class RsaKey extends RsaKeyKey {
    // 业务code,暂时无用
    private String code;

    // 唯一标识商户号
    private String outerId;

    // 应用apptoken
    private String appToken;

    // rsa钥匙(openapi对应公钥)
    private String rsaKey;

    // 失效期
    private Date experiedDate;

    // 密钥状态,0为有效,1表示公钥自然失效;2表示公钥作废;
    private Integer status;

    // 简单描述信息
    private String description;

    // 备注信息
    private String remark;

    // 排序
    private Integer sort;

    // 删除标记位0,未删除,1,删除
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

    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId == null ? null : outerId.trim();
    }

    public String getAppToken() {
        return appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken == null ? null : appToken.trim();
    }

    public String getRsaKey() {
        return rsaKey;
    }

    public void setRsaKey(String rsaKey) {
        this.rsaKey = rsaKey == null ? null : rsaKey.trim();
    }

    public Date getExperiedDate() {
        return experiedDate;
    }

    public void setExperiedDate(Date experiedDate) {
        this.experiedDate = experiedDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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