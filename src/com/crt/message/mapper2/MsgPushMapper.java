package com.crt.message.mapper2;

import com.crt.message.domain.entity2.MsgPush;

public interface MsgPushMapper {
    int insert(MsgPush record);

    int insertSelective(MsgPush record);
}