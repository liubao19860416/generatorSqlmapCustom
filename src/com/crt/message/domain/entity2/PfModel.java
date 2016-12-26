package com.crt.message.domain.entity2;

public class PfModel {
    // 模版名称
    private String templateName;

    // 模版内容
    private String context;

    // 模版类型
    private String templatType;

    // 发送方式 1.群发,2.组发,3.指定人发
    private String sendMethod;

    // 审批状态
    private String status;

    // 备注
    private String remark;

    // 排序
    private Integer sort;

    // 审批人
    private String checkBy;

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public String getTemplatType() {
        return templatType;
    }

    public void setTemplatType(String templatType) {
        this.templatType = templatType == null ? null : templatType.trim();
    }

    public String getSendMethod() {
        return sendMethod;
    }

    public void setSendMethod(String sendMethod) {
        this.sendMethod = sendMethod == null ? null : sendMethod.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getCheckBy() {
        return checkBy;
    }

    public void setCheckBy(String checkBy) {
        this.checkBy = checkBy == null ? null : checkBy.trim();
    }
}