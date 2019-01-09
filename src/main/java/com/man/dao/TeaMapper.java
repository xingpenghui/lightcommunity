package com.man.dao;

import com.man.pojo.Tea;

public interface TeaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tea record);

    int insertSelective(Tea record);

    Tea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tea record);

    int updateByPrimaryKey(Tea record);
}