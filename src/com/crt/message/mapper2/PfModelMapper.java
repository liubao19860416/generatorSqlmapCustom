package com.crt.message.mapper2;

import com.crt.message.domain.entity2.PfModel;

public interface PfModelMapper {
    int insert(PfModel record);

    int insertSelective(PfModel record);
}