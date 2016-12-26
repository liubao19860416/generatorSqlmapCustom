package com.crt.message.mapper2;

import com.crt.message.domain.entity2.MemberMapping;

public interface MemberMappingMapper {
    int insert(MemberMapping record);

    int insertSelective(MemberMapping record);
}