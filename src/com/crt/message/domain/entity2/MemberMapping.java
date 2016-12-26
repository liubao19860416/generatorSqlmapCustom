package com.crt.message.domain.entity2;

import java.util.Date;

public class MemberMapping {
    // 用户id
    private String membeId;

    // 用户名
    private String memberName;

    // 推送cid
    private String clientId;

    // 手机类型信息
    private String phoneType;

    // 创建时间
    private Date createTime;

    // 更新时间
    private Date updateTime;

    public String getMembeId() {
        return membeId;
    }

    public void setMembeId(String membeId) {
        this.membeId = membeId == null ? null : membeId.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType == null ? null : phoneType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}