package com.crt.openapi.modules.apiinterface.domain.dao;

import com.crt.openapi.modules.apiinterface.domain.entity.ApiUsers;
import com.crt.openapi.modules.apiinterface.domain.entity.ApiUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiUsersMapper {
    int countByExample(ApiUsersExample example);

    int deleteByExample(ApiUsersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApiUsers record);

    int insertSelective(ApiUsers record);

    List<ApiUsers> selectByExample(ApiUsersExample example);

    ApiUsers selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApiUsers record, @Param("example") ApiUsersExample example);

    int updateByExample(@Param("record") ApiUsers record, @Param("example") ApiUsersExample example);

    int updateByPrimaryKeySelective(ApiUsers record);

    int updateByPrimaryKey(ApiUsers record);
}