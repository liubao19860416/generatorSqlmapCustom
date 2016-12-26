package com.crt.message.mapper;

import com.crt.message.domain.entity.SwitchChannelAdm;
import com.crt.message.domain.entity.SwitchChannelAdmKey;

public interface SwitchChannelAdmMapper {
    int deleteByPrimaryKey(SwitchChannelAdmKey key);

    int insert(SwitchChannelAdm record);

    int insertSelective(SwitchChannelAdm record);

    SwitchChannelAdm selectByPrimaryKey(SwitchChannelAdmKey key);

    int updateByPrimaryKeySelective(SwitchChannelAdm record);

    int updateByPrimaryKey(SwitchChannelAdm record);
}