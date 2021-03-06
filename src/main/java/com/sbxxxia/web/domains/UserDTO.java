package com.sbxxxia.web.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Lazy
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class UserDTO {
	private String userid, password, name, birthday, gender, telephone, regDate, accessCode;
}