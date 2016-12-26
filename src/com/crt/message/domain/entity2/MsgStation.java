package com.crt.message.domain.entity2;

import java.util.Date;

public class MsgStation {
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

    // 发送平台:app或pc
    private String applicableScope;

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

    public String getApplicableScope() {
        return applicableScope;
    }

    public void setApplicableScope(String applicableScope) {
        this.applicableScope = applicableScope == null ? null : applicableScope.trim();
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
}