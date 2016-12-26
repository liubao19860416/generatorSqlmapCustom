package com.crt.message.domain.entity;

import java.util.Date;

public class SwitchChannelAdm extends SwitchChannelAdmKey {
    // 业务code
    private String code;

    // 用户名
    private String userAdm;

    // 密码
    private String userPwd;

    // 渠道
    private String channel;

    // 开关
    private String switchCode;

    // 删除标记
    private Boolean delFlag;

    // 创建人
    private String createBy;

    // 修改人
    private String updateBy;

    // 
    private Date createTime;

    // 
    private Date updateTime;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

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