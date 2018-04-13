package com.com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.com.model.userInfo;
import com.com.service.userInfoService;
import com.com.service.dao.userInfoMapper;

@Service @Transactional
public class userInfoServiceImpl implements userInfoService {
	
	@Resource
	private userInfoMapper userInfoMapper;
	
	@Override
	public userInfo getuserInfo(int id) {
		return userInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<userInfo> selectByPrimaryList(userInfo model) {
		return userInfoMapper.selectByPrimaryList(model);
	}
}
