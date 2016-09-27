package com.crt.openapi.modules.apiinterface.domain.dao;

import com.crt.openapi.modules.apiinterface.domain.entity.ApiUsersRRole;
import com.crt.openapi.modules.apiinterface.domain.entity.ApiUsersRRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiUsersRRoleMapper {
    int countByExample(ApiUsersRRoleExample example);

    int deleteByExample(ApiUsersRRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApiUsersRRole record);

    int insertSelective(ApiUsersRRole record);

    List<ApiUsersRRole> selectByExample(ApiUsersRRoleExample example);

    ApiUsersRRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApiUsersRRole record, @Param("example") ApiUsersRRoleExample example);

    int updateByExample(@Param("record") ApiUsersRRole record, @Param("example") ApiUsersRRoleExample example);

    int updateByPrimaryKeySelective(ApiUsersRRole record);

    int updateByPrimaryKey(ApiUsersRRole record);
}