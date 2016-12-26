package com.crt.message.mapper2;

import com.crt.message.domain.entity2.MsgSms;

public interface MsgSmsMapper {
    int insert(MsgSms record);

    int insertSelective(MsgSms record);
}