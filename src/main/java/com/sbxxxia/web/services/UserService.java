package com.sbxxxia.web.services;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.sbxxxia.web.domains.UserDTO;

@Component
public interface UserService {
	public void save();
	public void update();
	public void findOne();
	public void findAll();
	public void count();
	public void delete();
	public UserDTO findByUseridAndPassword(UserDTO user); //로그인
	public void findByEmailOrUserid(String email, String userid);
	public void findByCreatedAtBetween(Date fromDate, Date toDate);
	public void findByAgeGraterThanEqual(int age);
	public void findByNameLike(String name);
	public void findByAccessCodeIsNull();
	public void findByGenderLike(String gender);
	public void findByEmailOrderByNameAsc(String email);
	public void register(UserDTO user); //회원가입
}
