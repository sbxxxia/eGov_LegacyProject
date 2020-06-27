package com.sbxxxia.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/join/form")
	public String joinForm() {
		logger.info("----------------회원가입 화면 진입 ---------------");
		return "user/Join.tiles";
	}
	
	@GetMapping("/login/form")
	public String loginForm() {
		logger.info("----------------로그인 화면 진입 ---------------");
		return "user/Login.tiles";
	}
}