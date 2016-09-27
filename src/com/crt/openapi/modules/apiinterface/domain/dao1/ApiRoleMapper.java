package com.crt.openapi.modules.apiinterface.domain.dao1;

import com.crt.openapi.modules.apiinterface.domain.entity1.ApiRole;
import com.crt.openapi.modules.apiinterface.domain.entity1.ApiRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiRoleMapper {
    int countByExample(ApiRoleExample example);

    int deleteByExample(ApiRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApiRole record);

    int insertSelective(ApiRole record);

    List<ApiRole> selectByExample(ApiRoleExample example);

    ApiRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApiRole record, @Param("example") ApiRoleExample example);

    int updateByExample(@Param("record") ApiRole record, @Param("example") ApiRoleExample example);

    int updateByPrimaryKeySelective(ApiRole record);

    int updateByPrimaryKey(ApiRole record);
}