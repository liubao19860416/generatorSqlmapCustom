package com.crt.message.domain.entity2;

import java.util.Date;

public class SwitchChannelAdm {
    // 用户名
    private String userAdm;

    // 密码
    private String userPwd;

    // 渠道
    private String channel;

    // 开关
    private String switchCode;

    // 
    private Date createTime;

    // 
    private Date updateTime;

    public String getUserAdm() {
        return userAdm;
    }

    public void setUserAdm(String userAdm) {
        this.userAdm = userAdm == null ? null : userAdm.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getSwitchCode() {
        return switchCode;
    }

    public void setSwitchCode(String switchCode) {
        this.switchCode = switchCode == null ? null : switchCode.trim();
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