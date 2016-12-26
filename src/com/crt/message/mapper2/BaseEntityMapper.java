package com.crt.message.mapper2;

import com.crt.message.domain.entity2.BaseEntity;

public interface BaseEntityMapper {
    int insert(BaseEntity record);

    int insertSelective(BaseEntity record);
}