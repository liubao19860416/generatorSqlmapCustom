package com.crt.openapi.modules.apiinterface.domain.dao1;

import com.crt.openapi.modules.apiinterface.domain.entity1.ApiRoleRMemu;
import com.crt.openapi.modules.apiinterface.domain.entity1.ApiRoleRMemuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiRoleRMemuMapper {
    int countByExample(ApiRoleRMemuExample example);

    int deleteByExample(ApiRoleRMemuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApiRoleRMemu record);

    int insertSelective(ApiRoleRMemu record);

    List<ApiRoleRMemu> selectByExample(ApiRoleRMemuExample example);

    ApiRoleRMemu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApiRoleRMemu record, @Param("example") ApiRoleRMemuExample example);

    int updateByExample(@Param("record") ApiRoleRMemu record, @Param("example") ApiRoleRMemuExample example);

    int updateByPrimaryKeySelective(ApiRoleRMemu record);

    int updateByPrimaryKey(ApiRoleRMemu record);
}