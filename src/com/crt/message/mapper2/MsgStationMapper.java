package com.crt.message.mapper2;

import com.crt.message.domain.entity2.MsgStation;

public interface MsgStationMapper {
    int insert(MsgStation record);

    int insertSelective(MsgStation record);
}