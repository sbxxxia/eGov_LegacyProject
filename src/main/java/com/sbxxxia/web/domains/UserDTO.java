package com.sbxxxia.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UserDTO {
	private String userid, password;
}