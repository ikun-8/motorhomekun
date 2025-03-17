package com.ikun.user.mapper;

import com.ikun.user.pojo.Realtion;

public interface RealtionMapper {
    int insert(Realtion record);

    int insertSelective(Realtion record);
}