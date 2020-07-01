package com.sbxxxia.web.services;

import org.springframework.stereotype.Component;

@Component
public interface UserService {
	public void save();
	public void update();
	public void findOne();
	public void findAll();
	public void count();
	public void delete();
	public void findByEmailAndUserId(String email, String userid);
	public void findByEmailOrUserId();
	public void findByCreatedAtBetween();
	public void findByAgeGraterThanEqual();
	public void findByNameLike();
	public void findByJobIsNull();
	public void findByEmailAndUserId();
}
