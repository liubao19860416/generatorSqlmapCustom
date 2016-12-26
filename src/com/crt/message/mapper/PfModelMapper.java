package com.crt.message.mapper;

import com.crt.message.domain.entity.PfModel;
import com.crt.message.domain.entity.PfModelKey;

public interface PfModelMapper {
    int deleteByPrimaryKey(PfModelKey key);

    int insert(PfModel record);

    int insertSelective(PfModel record);

    PfModel selectByPrimaryKey(PfModelKey key);

    int updateByPrimaryKeySelective(PfModel record);

    int updateByPrimaryKey(PfModel record);
}