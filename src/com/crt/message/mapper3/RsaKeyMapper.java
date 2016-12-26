package com.crt.message.mapper3;

import com.crt.message.domain.entity3.RsaKey;
import com.crt.message.domain.entity3.RsaKeyKey;

public interface RsaKeyMapper {
    int deleteByPrimaryKey(RsaKeyKey key);

    int insert(RsaKey record);

    int insertSelective(RsaKey record);

    RsaKey selectByPrimaryKey(RsaKeyKey key);

    int updateByPrimaryKeySelective(RsaKey record);

    int updateByPrimaryKey(RsaKey record);
}