package com.man.dao;

import com.man.pojo.Stylecocolum;

public interface StylecocolumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stylecocolum record);

    int insertSelective(Stylecocolum record);

    Stylecocolum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stylecocolum record);

    int updateByPrimaryKey(Stylecocolum record);
}