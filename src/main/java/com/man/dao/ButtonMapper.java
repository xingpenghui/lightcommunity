package com.man.dao;

import com.man.pojo.Button;

public interface ButtonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Button record);

    int insertSelective(Button record);

    Button selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Button record);

    int updateByPrimaryKey(Button record);
}