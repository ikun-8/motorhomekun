package com.ikun.user.mapper;

import com.ikun.user.pojo.Collect;

import java.util.List;

public interface CollectMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Collect record);

    int insertSelective(Collect record);

    List<Collect> selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);

    int remove(Collect c);

    Collect que(Collect c);
}