package com.man.dao;

import com.man.pojo.Caption;

public interface CaptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Caption record);

    int insertSelective(Caption record);

    Caption selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Caption record);

    int updateByPrimaryKey(Caption record);
}