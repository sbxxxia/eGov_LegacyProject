package com.sbxxxia.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbxxxia.web.domains.UserDTO;
import com.sbxxxia.web.enums.Messenger;

@RestController
@RequestMapping("/account")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/login/form")
	public String loginForm() {
		logger.info("----------------로그인 화면 진입 ---------------");
		return "user/Login.tiles";
	}
	
	@PostMapping("/users")
	public Messenger join(@RequestBody UserDTO userDTO) {
		System.out.println("넘어온 회원정보"+userDTO.toString());
		return Messenger.SUCCESS;
	}
}