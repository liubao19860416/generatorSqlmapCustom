package com.crt.message.mapper;

import com.crt.message.domain.entity.MsgPush;
import com.crt.message.domain.entity.MsgPushKey;

public interface MsgPushMapper {
    int deleteByPrimaryKey(MsgPushKey key);

    int insert(MsgPush record);

    int insertSelective(MsgPush record);

    MsgPush selectByPrimaryKey(MsgPushKey key);

    int updateByPrimaryKeySelective(MsgPush record);

    int updateByPrimaryKey(MsgPush record);
}