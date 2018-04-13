package com.com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.com.model.userInfo;
import com.com.service.userInfoService;

@Controller
@RequestMapping("/UserController")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Resource
	private userInfoService userInfoService;
	
	@RequestMapping("/totest.do")
	public String queryRePauseCount(HttpServletRequest request, HttpServletResponse response, userInfo model) {
		System.out.println(111);
		userInfo userInfo = userInfoService.getuserInfo(1);
		userInfoService.selectByPrimaryList(model);
		System.out.println(userInfo.getUserName());
		logger.info("1111111111111111111");
		return "/index";
	}
}
