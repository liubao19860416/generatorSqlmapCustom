package com.crt.openapi.modules.apiinterface.domain.dao;

import com.crt.openapi.modules.apiinterface.domain.entity.ApiInterface;
import com.crt.openapi.modules.apiinterface.domain.entity.ApiInterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiInterfaceMapper {
    int countByExample(ApiInterfaceExample example);

    int deleteByExample(ApiInterfaceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApiInterface record);

    int insertSelective(ApiInterface record);

    List<ApiInterface> selectByExample(ApiInterfaceExample example);

    ApiInterface selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApiInterface record, @Param("example") ApiInterfaceExample example);

    int updateByExample(@Param("record") ApiInterface record, @Param("example") ApiInterfaceExample example);

    int updateByPrimaryKeySelective(ApiInterface record);

    int updateByPrimaryKey(ApiInterface record);
}