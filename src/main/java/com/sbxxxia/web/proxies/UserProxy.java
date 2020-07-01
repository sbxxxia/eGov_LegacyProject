package com.sbxxxia.web.proxies;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sbxxxia.web.domains.UserDTO;
import com.sbxxxia.web.enums.Sql;
import com.sbxxxia.web.mappers.TxMapper;
import com.sbxxxia.web.mappers.UserMapper;

@Component("manager")
public class UserProxy extends Proxy {
	@Autowired TxMapper txMapper;
	@Autowired Box<String> box;
	
	public String makeBirthday() {
		// 팀플할 때 로직 각자 생각할 것(정규분포에 따른 랜덤 값 생성 자바)
		// 특정 확률 분포를 따르는 난수 생성
		// 가우스 정규분포
		
		// 1970 ~ 2010
		String birthday = "";
		return birthday;
	}
	
	public String makeGender() {
		List<String> genderText = Arrays.asList("M","F");
		Collections.shuffle(genderText); // 섞임
		return genderText.get(0); // 예를 들어 만명을 만들면 성비를 섞어줌
	}
	
	public String makeUserid() {
		List<String> useridText = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
		Collections.shuffle(useridText);
		return useridText.get(0); // 아이디 자릿수
	}
	
	public String makeName() {
		return ""; // 하나를 만듦
	}
	
	public String makeTelephone() {
		return "";
	}
	
	
	public UserDTO makeUser() {
		return new UserDTO(makeUserid(), makeName(), "1", makeBirthday(), makeGender(), makeTelephone(), makeRegDate(), makeAccessCode());
	}
	
	/**
	 * @return
	 */
	private String makeAccessCode() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return
	 */
	private String makeRegDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void insertUsers(int count) {
		for(int i=0; i<count; i++) {
			txMapper.insertUser(makeUser());
		}
	}
	
	public void truncateUsers() {
		box.clear();
		box.put("TRUNCATE_USERS", Sql.TRUNCATE_USERS.toString());
		UserMapper.truncateUser(box.get());
	}
}
