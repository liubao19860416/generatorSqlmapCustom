package com.crt.message.mapper2;

import com.crt.message.domain.entity2.MsgHistory;

public interface MsgHistoryMapper {
    int insert(MsgHistory record);

    int insertSelective(MsgHistory record);
}