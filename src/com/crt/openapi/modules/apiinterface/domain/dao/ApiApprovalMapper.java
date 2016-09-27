package com.crt.openapi.modules.apiinterface.domain.dao;

import com.crt.openapi.modules.apiinterface.domain.entity.ApiApproval;
import com.crt.openapi.modules.apiinterface.domain.entity.ApiApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiApprovalMapper {
    int countByExample(ApiApprovalExample example);

    int deleteByExample(ApiApprovalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApiApproval record);

    int insertSelective(ApiApproval record);

    List<ApiApproval> selectByExample(ApiApprovalExample example);

    ApiApproval selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApiApproval record, @Param("example") ApiApprovalExample example);

    int updateByExample(@Param("record") ApiApproval record, @Param("example") ApiApprovalExample example);

    int updateByPrimaryKeySelective(ApiApproval record);

    int updateByPrimaryKey(ApiApproval record);
}