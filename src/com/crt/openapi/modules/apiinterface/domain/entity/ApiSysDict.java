package com.crt.openapi.modules.apiinterface.domain.entity;

public class ApiSysDict {
    private Long id;

    private String code;

    private String lable;

    private String type;

    private String description;

    private Integer sort;

    private String delFlag;

    private String creater;

    private String createrDate;

    private String update;

    private String updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable == null ? null : lable.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

    public String getCreaterDate() {
        return createrDate;
    }

    public void setCreaterDate(String createrDate) {
        this.createrDate = createrDate == null ? null : createrDate.trim();
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update == null ? null : update.trim();
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate == null ? null : updateDate.trim();
    }
}