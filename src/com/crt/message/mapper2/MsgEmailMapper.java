package com.crt.message.mapper2;

import com.crt.message.domain.entity2.MsgEmail;

public interface MsgEmailMapper {
    int insert(MsgEmail record);

    int insertSelective(MsgEmail record);
}