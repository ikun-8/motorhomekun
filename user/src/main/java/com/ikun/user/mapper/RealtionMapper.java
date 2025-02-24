package com.ikun.user.mapper;

import com.ikun.user.pojo.Realtion;

public interface RealtionMapper {
    Integer selectConcern(int id);
    Integer selectFans(int id);
    int insert(Realtion record);

    int insertSelective(Realtion record);
}