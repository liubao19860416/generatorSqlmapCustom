package com.crt.message.mapper;

import com.crt.message.domain.entity.PfModelUrl;
import com.crt.message.domain.entity.PfModelUrlKey;

public interface PfModelUrlMapper {
    int deleteByPrimaryKey(PfModelUrlKey key);

    int insert(PfModelUrl record);

    int insertSelective(PfModelUrl record);

    PfModelUrl selectByPrimaryKey(PfModelUrlKey key);

    int updateByPrimaryKeySelective(PfModelUrl record);

    int updateByPrimaryKey(PfModelUrl record);
}