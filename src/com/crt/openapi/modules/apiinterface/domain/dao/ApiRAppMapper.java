package com.crt.openapi.modules.apiinterface.domain.dao;

import com.crt.openapi.modules.apiinterface.domain.entity.ApiRApp;
import com.crt.openapi.modules.apiinterface.domain.entity.ApiRAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiRAppMapper {
    int countByExample(ApiRAppExample example);

    int deleteByExample(ApiRAppExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApiRApp record);

    int insertSelective(ApiRApp record);

    List<ApiRApp> selectByExample(ApiRAppExample example);

    ApiRApp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApiRApp record, @Param("example") ApiRAppExample example);

    int updateByExample(@Param("record") ApiRApp record, @Param("example") ApiRAppExample example);

    int updateByPrimaryKeySelective(ApiRApp record);

    int updateByPrimaryKey(ApiRApp record);
}