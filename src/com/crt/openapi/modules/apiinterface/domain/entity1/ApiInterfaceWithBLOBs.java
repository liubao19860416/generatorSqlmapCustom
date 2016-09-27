package com.crt.openapi.modules.apiinterface.domain.entity1;

public class ApiInterfaceWithBLOBs extends ApiInterface {
    /**
     * 接口描述
     */
    // 接口描述
    private String apiDesc;

    /**
     * 测试案例
     */
    // 测试案例
    private String testCase;

    public String getApiDesc() {
        return apiDesc;
    }

    public void setApiDesc(String apiDesc) {
        this.apiDesc = apiDesc == null ? null : apiDesc.trim();
    }

    public String getTestCase() {
        return testCase;
    }

    public void setTestCase(String testCase) {
        this.testCase = testCase == null ? null : testCase.trim();
    }
}