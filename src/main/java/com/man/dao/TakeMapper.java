package com.man.dao;

import com.man.pojo.Take;

public interface TakeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Take record);

    int insertSelective(Take record);

    Take selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Take record);

    int updateByPrimaryKey(Take record);
}