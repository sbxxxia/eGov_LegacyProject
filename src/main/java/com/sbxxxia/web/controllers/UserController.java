package com.sbxxxia.web.controllers;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sbxxxia.web.domains.UserDTO;
import com.sbxxxia.web.services.UserService;

@RestController
@RequestMapping("/account")
@SessionAttributes({"session"})
public class UserController {
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired UserService userService;
	
	@PostMapping("/users")
	public boolean join(@RequestBody UserDTO user) {
		userService.register(user);
		return true;
	}
	
	@PostMapping("/login")
	public UserDTO login(HttpSession session, @RequestBody UserDTO user) {
		UserDTO returnUser = userService.findByUseridAndPassword(user);
		session.setAttribute("session", returnUser);
		return returnUser;
	}
}