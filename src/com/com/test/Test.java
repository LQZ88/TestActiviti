package com.com.test;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.com.model.userInfo;
import com.com.service.userInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/config/bean-config/springbean-config.xml" })
public class Test {
	@Resource
	private userInfoService userInfoService;
	@org.junit.Test
    public void toTest(){
		userInfo getuserInfo = userInfoService.getuserInfo(2);
		System.out.println(getuserInfo.getUserName());
	}
}
