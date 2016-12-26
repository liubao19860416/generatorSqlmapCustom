package com.crt.message.mapper;

import com.crt.message.domain.entity.MemberMapping;
import com.crt.message.domain.entity.MemberMappingKey;

public interface MemberMappingMapper {
    int deleteByPrimaryKey(MemberMappingKey key);

    int insert(MemberMapping record);

    int insertSelective(MemberMapping record);

    MemberMapping selectByPrimaryKey(MemberMappingKey key);

    int updateByPrimaryKeySelective(MemberMapping record);

    int updateByPrimaryKey(MemberMapping record);
}