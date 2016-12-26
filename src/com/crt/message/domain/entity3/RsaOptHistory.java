package com.crt.message.domain.entity3;

import java.util.Date;

public class RsaOptHistory extends RsaOptHistoryKey {
    // 应用apptoken
    private String appToken;

    // 原始签名数据
    private String originalData;

    // rsa签名
    private String rsaSign;

    // 操作类型,1表示上传公钥记录;2表示公钥修改;3表示公钥失效;4表示验证签名
    private Integer optType;

    // 该次操作耗时
    private Long usedTime;

    // 当前密钥状态,0为有效,1表示公钥自然失效;2表示公钥作废;3表示公钥不存在
    private Integer status;

    // 当前密钥失效时间
    private Date experiedDate;

    // 当前对应的rsa钥匙
    private String rsaKey;

    // 操作结果:0表示成功，1表示公钥不存在,2表示公钥失效;3表示公钥作废
    private Integer result;

    // 备注信息
    private String remark;

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

    public String getAppToken() {
        return appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken == null ? null : appToken.trim();
    }

    public String getOriginalData() {
        return originalData;
    }

    public void setOriginalData(String originalData) {
        this.originalData = originalData == null ? null : originalData.trim();
    }

    public String getRsaSign() {
        return rsaSign;
    }

    public void setRsaSign(String rsaSign) {
        this.rsaSign = rsaSign == null ? null : rsaSign.trim();
    }

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
    }

    public Long getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Long usedTime) {
        this.usedTime = usedTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getExperiedDate() {
        return experiedDate;
    }

    public void setExperiedDate(Date experiedDate) {
        this.experiedDate = experiedDate;
    }

    public String getRsaKey() {
        return rsaKey;
    }

    public void setRsaKey(String rsaKey) {
        this.rsaKey = rsaKey == null ? null : rsaKey.trim();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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