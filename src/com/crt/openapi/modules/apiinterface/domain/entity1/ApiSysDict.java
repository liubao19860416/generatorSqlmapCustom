package com.crt.openapi.modules.apiinterface.domain.entity1;

import java.util.Date;

public class ApiSysDict {
    /**
     * 主键
     */
    // 主键
    private String id;

    /**
     * 编码(1xxxx,2xxxx)
     */
    // 编码(1xxxx,2xxxx)
    private String code;

    /**
     * 标签
     */
    // 标签
    private String lable;

    /**
     * 缩写
     */
    // 缩写
    private String abbreviation;

    /**
     * 类型(1-xx,2-xx)
     */
    // 类型(1-xx,2-xx)
    private String type;

    /**
     * 描述
     */
    // 描述
    private String description;

    /**
     * 排序
     */
    // 排序
    private Integer sort;

    /**
     * 删除标示(0:正常,1:删除)
     */
    // 删除标示(0:正常,1:删除)
    private String delFlag;

    /**
     * 创建人
     */
    // 创建人
    private String creater;

    /**
     * 创建时间
     */
    // 创建时间
    private Date createTime;

    /**
     * 修改人
     */
    // 修改人
    private String updater;

    /**
     * 修改时间
     */
    // 修改时间
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}