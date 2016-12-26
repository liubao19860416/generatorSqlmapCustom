package com.crt.message.mapper;

import com.crt.message.domain.entity.MsgStation;
import com.crt.message.domain.entity.MsgStationKey;

public interface MsgStationMapper {
    int deleteByPrimaryKey(MsgStationKey key);

    int insert(MsgStation record);

    int insertSelective(MsgStation record);

    MsgStation selectByPrimaryKey(MsgStationKey key);

    int updateByPrimaryKeySelective(MsgStation record);

    int updateByPrimaryKey(MsgStation record);
}