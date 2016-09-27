package com.crt.openapi.modules.apiinterface.domain.dao1;

import com.crt.openapi.modules.apiinterface.domain.entity1.ApiSysDict;
import com.crt.openapi.modules.apiinterface.domain.entity1.ApiSysDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiSysDictMapper {
    int countByExample(ApiSysDictExample example);

    int deleteByExample(ApiSysDictExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApiSysDict record);

    int insertSelective(ApiSysDict record);

    List<ApiSysDict> selectByExample(ApiSysDictExample example);

    ApiSysDict selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApiSysDict record, @Param("example") ApiSysDictExample example);

    int updateByExample(@Param("record") ApiSysDict record, @Param("example") ApiSysDictExample example);

    int updateByPrimaryKeySelective(ApiSysDict record);

    int updateByPrimaryKey(ApiSysDict record);
}