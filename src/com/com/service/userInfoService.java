package com.com.service;

import java.util.List;

import com.com.model.userInfo;

public interface userInfoService {
	/**
	 * 根据用户id查询数据
	 * @param id
	 * @return
	 */
	public userInfo getuserInfo(int id);
	
	public List<userInfo> selectByPrimaryList(userInfo model);
}
