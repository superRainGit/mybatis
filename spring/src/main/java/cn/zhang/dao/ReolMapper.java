package cn.zhang.dao;

import cn.zhang.model.Reol;

public interface ReolMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Reol record);

    int insertSelective(Reol record);

    Reol selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Reol record);

    int updateByPrimaryKey(Reol record);
}