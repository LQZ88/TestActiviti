package com.com.service.dao;

import java.util.List;

import com.com.model.userInfo;

public interface userInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(userInfo record);

    int insertSelective(userInfo record);

    userInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(userInfo record);

    int updateByPrimaryKey(userInfo record);
    
    List<userInfo> selectByPrimaryList(userInfo model);
}