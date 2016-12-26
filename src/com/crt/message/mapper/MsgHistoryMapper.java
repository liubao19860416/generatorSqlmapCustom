package com.crt.message.mapper;

import com.crt.message.domain.entity.MsgHistory;
import com.crt.message.domain.entity.MsgHistoryKey;

public interface MsgHistoryMapper {
    int deleteByPrimaryKey(MsgHistoryKey key);

    int insert(MsgHistory record);

    int insertSelective(MsgHistory record);

    MsgHistory selectByPrimaryKey(MsgHistoryKey key);

    int updateByPrimaryKeySelective(MsgHistory record);

    int updateByPrimaryKey(MsgHistory record);
}