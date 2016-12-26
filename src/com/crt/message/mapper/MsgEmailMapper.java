package com.crt.message.mapper;

import com.crt.message.domain.entity.MsgEmail;
import com.crt.message.domain.entity.MsgEmailKey;

public interface MsgEmailMapper {
    int deleteByPrimaryKey(MsgEmailKey key);

    int insert(MsgEmail record);

    int insertSelective(MsgEmail record);

    MsgEmail selectByPrimaryKey(MsgEmailKey key);

    int updateByPrimaryKeySelective(MsgEmail record);

    int updateByPrimaryKey(MsgEmail record);
}