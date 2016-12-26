package com.crt.message.mapper;

import com.crt.message.domain.entity.MsgSms;
import com.crt.message.domain.entity.MsgSmsKey;

public interface MsgSmsMapper {
    int deleteByPrimaryKey(MsgSmsKey key);

    int insert(MsgSms record);

    int insertSelective(MsgSms record);

    MsgSms selectByPrimaryKey(MsgSmsKey key);

    int updateByPrimaryKeySelective(MsgSms record);

    int updateByPrimaryKey(MsgSms record);
}