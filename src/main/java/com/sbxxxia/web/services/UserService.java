package com.sbxxxia.web.services;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public interface UserService {
	public void save();
	public void update();
	public void findOne();
	public void findAll();
	public void count();
	public void delete();
	public void findByEmailAndUserid(String email, String userid);
	public void findByEmailOrUserid(String email, String userid);
	public void findByCreatedAtBetween(Date fromDate, Date toDate);
	public void findByAgeGraterThanEqual(int age);
	public void findByNameLike(String name);
	public void findByAccessCodeIsNull();
	public void findByGenderLike(String gender);
	public void findByEmailOrderByNameAsc(String email);
}
