package com.crt.openapi.modules.apiinterface.domain.dao1;

import com.crt.openapi.modules.apiinterface.domain.entity1.ApiInterface;
import com.crt.openapi.modules.apiinterface.domain.entity1.ApiInterfaceExample;
import com.crt.openapi.modules.apiinterface.domain.entity1.ApiInterfaceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiInterfaceMapper {
    int countByExample(ApiInterfaceExample example);

    int deleteByExample(ApiInterfaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApiInterfaceWithBLOBs record);

    int insertSelective(ApiInterfaceWithBLOBs record);

    List<ApiInterfaceWithBLOBs> selectByExampleWithBLOBs(ApiInterfaceExample example);

    List<ApiInterface> selectByExample(ApiInterfaceExample example);

    ApiInterfaceWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApiInterfaceWithBLOBs record, @Param("example") ApiInterfaceExample example);

    int updateByExampleWithBLOBs(@Param("record") ApiInterfaceWithBLOBs record, @Param("example") ApiInterfaceExample example);

    int updateByExample(@Param("record") ApiInterface record, @Param("example") ApiInterfaceExample example);

    int updateByPrimaryKeySelective(ApiInterfaceWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ApiInterfaceWithBLOBs record);

    int updateByPrimaryKey(ApiInterface record);
}