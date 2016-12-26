package com.crt.message.mapper2;

import com.crt.message.domain.entity2.SysDict;

public interface SysDictMapper {
    int insert(SysDict record);

    int insertSelective(SysDict record);
}