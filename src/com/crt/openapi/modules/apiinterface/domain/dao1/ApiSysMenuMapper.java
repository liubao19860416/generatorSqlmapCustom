package com.crt.openapi.modules.apiinterface.domain.dao1;

import com.crt.openapi.modules.apiinterface.domain.entity1.ApiSysMenu;
import com.crt.openapi.modules.apiinterface.domain.entity1.ApiSysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiSysMenuMapper {
    int countByExample(ApiSysMenuExample example);

    int deleteByExample(ApiSysMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApiSysMenu record);

    int insertSelective(ApiSysMenu record);

    List<ApiSysMenu> selectByExample(ApiSysMenuExample example);

    ApiSysMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApiSysMenu record, @Param("example") ApiSysMenuExample example);

    int updateByExample(@Param("record") ApiSysMenu record, @Param("example") ApiSysMenuExample example);

    int updateByPrimaryKeySelective(ApiSysMenu record);

    int updateByPrimaryKey(ApiSysMenu record);
}