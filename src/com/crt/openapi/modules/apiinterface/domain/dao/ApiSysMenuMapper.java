package com.crt.openapi.modules.apiinterface.domain.dao;

import com.crt.openapi.modules.apiinterface.domain.entity.ApiSysMenu;
import com.crt.openapi.modules.apiinterface.domain.entity.ApiSysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiSysMenuMapper {
    int countByExample(ApiSysMenuExample example);

    int deleteByExample(ApiSysMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApiSysMenu record);

    int insertSelective(ApiSysMenu record);

    List<ApiSysMenu> selectByExample(ApiSysMenuExample example);

    ApiSysMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApiSysMenu record, @Param("example") ApiSysMenuExample example);

    int updateByExample(@Param("record") ApiSysMenu record, @Param("example") ApiSysMenuExample example);

    int updateByPrimaryKeySelective(ApiSysMenu record);

    int updateByPrimaryKey(ApiSysMenu record);
}