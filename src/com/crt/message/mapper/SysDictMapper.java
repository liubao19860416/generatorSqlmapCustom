package com.crt.message.mapper;

import com.crt.message.domain.entity.SysDict;
import com.crt.message.domain.entity.SysDictKey;

public interface SysDictMapper {
    int deleteByPrimaryKey(SysDictKey key);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(SysDictKey key);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);
}