package com.sbxxxia.web.services;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbxxxia.web.domains.UserDTO;
import com.sbxxxia.web.mappers.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired UserMapper userMapper;
	@Autowired UserDTO user;

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void count() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDTO findByUseridAndPassword(UserDTO param) {
		return userMapper.selectUseridByIdPassword(param);
		
	}

	@Override
	public void findByEmailOrUserid(String email, String userid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByCreatedAtBetween(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByAgeGraterThanEqual(int age) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByNameLike(String name) {
		// TODO Auto-generated method stub
		//
	}

	@Override
	public void findByAccessCodeIsNull() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByGenderLike(String gender) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByEmailOrderByNameAsc(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register(UserDTO param) {
		userMapper.insertUser(param);
	}

}
