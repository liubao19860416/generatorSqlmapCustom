package com.crt.message.domain.entity;

import java.util.Date;

public class MsgPush extends MsgPushKey {
    // 业务code
    private String code;

    // 接收人id
    private String recipientNo;

    // 接收人姓名
    private String recipientName;

    // 标题
    private String title;

    // 内容
    private String content;

    // 发送渠道
    private String sendChnannel;

    // 业务模块
    private String businessId;

    // 模版id
    private String pfModelCode;

    // 推送类型,组推,群推,单推
    private String pushType;

    // 消息id
    private String msgId;

    // 发送结果状态
    private String status;

    // 已读时间
    private Date readTime;

    // 异常码
    private String errCode;

    // 异常消息
    private String errMsg;

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

    public String getRecipientNo() {
        return recipientNo;
    }

    public void setRecipientNo(String recipientNo) {
        this.recipientNo = recipientNo == null ? null : recipientNo.trim();
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName == null ? null : recipientName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSendChnannel() {
        return sendChnannel;
    }

    public void setSendChnannel(String sendChnannel) {
        this.sendChnannel = sendChnannel == null ? null : sendChnannel.trim();
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public String getPfModelCode() {
        return pfModelCode;
    }

    public void setPfModelCode(String pfModelCode) {
        this.pfModelCode = pfModelCode == null ? null : pfModelCode.trim();
    }

    public String getPushType() {
        return pushType;
    }

    public void setPushType(String pushType) {
        this.pushType = pushType == null ? null : pushType.trim();
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getReadTime() {
        return readTime;
    }

    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode == null ? null : errCode.trim();
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg == null ? null : errMsg.trim();
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