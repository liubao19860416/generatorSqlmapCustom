package com.crt.message.mapper3;

import com.crt.message.domain.entity3.RsaOptHistory;
import com.crt.message.domain.entity3.RsaOptHistoryKey;

public interface RsaOptHistoryMapper {
    int deleteByPrimaryKey(RsaOptHistoryKey key);

    int insert(RsaOptHistory record);

    int insertSelective(RsaOptHistory record);

    RsaOptHistory selectByPrimaryKey(RsaOptHistoryKey key);

    int updateByPrimaryKeySelective(RsaOptHistory record);

    int updateByPrimaryKey(RsaOptHistory record);
}