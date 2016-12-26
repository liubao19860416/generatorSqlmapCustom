package com.crt.message.domain.entity2;

public class PfModelUrl {
    // 模版code
    private String pfModelCode;

    // 适用范围
    private String applicableScope;

    // 跳转url
    private String hrefUrl;

    // icon地址
    private String icoUrl;

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

    public String getHrefUrl() {
        return hrefUrl;
    }

    public void setHrefUrl(String hrefUrl) {
        this.hrefUrl = hrefUrl == null ? null : hrefUrl.trim();
    }

    public String getIcoUrl() {
        return icoUrl;
    }

    public void setIcoUrl(String icoUrl) {
        this.icoUrl = icoUrl == null ? null : icoUrl.trim();
    }
}