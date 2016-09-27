package com.crt.openapi.modules.apiinterface.domain.dao;

import com.crt.openapi.modules.apiinterface.domain.entity.ApiApp;
import com.crt.openapi.modules.apiinterface.domain.entity.ApiAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiAppMapper {
    int countByExample(ApiAppExample example);

    int deleteByExample(ApiAppExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApiApp record);

    int insertSelective(ApiApp record);

    List<ApiApp> selectByExample(ApiAppExample example);

    ApiApp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApiApp record, @Param("example") ApiAppExample example);

    int updateByExample(@Param("record") ApiApp record, @Param("example") ApiAppExample example);

    int updateByPrimaryKeySelective(ApiApp record);

    int updateByPrimaryKey(ApiApp record);
}