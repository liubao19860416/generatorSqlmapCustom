package com.crt.openapi.modules.apiinterface.domain.dao;

import com.crt.openapi.modules.apiinterface.domain.entity.ApiSysDict;
import com.crt.openapi.modules.apiinterface.domain.entity.ApiSysDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiSysDictMapper {
    int countByExample(ApiSysDictExample example);

    int deleteByExample(ApiSysDictExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApiSysDict record);

    int insertSelective(ApiSysDict record);

    List<ApiSysDict> selectByExample(ApiSysDictExample example);

    ApiSysDict selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApiSysDict record, @Param("example") ApiSysDictExample example);

    int updateByExample(@Param("record") ApiSysDict record, @Param("example") ApiSysDictExample example);

    int updateByPrimaryKeySelective(ApiSysDict record);

    int updateByPrimaryKey(ApiSysDict record);
}