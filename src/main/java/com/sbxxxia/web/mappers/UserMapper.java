package com.sbxxxia.web.mappers;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.sbxxxia.web.domains.UserDTO;

@Repository
public interface UserMapper {
	public void insertUser(UserDTO user);
	public UserDTO selectUseridByIdPassword(UserDTO user);
	public int existId(String userid);
	public int countUsers();
	public void createDB(HashMap<String, String> paramMap);
	public void createUsers(HashMap<String, String> paramMap);
	public void dropUser(HashMap<String, String> paramMap);
	public void truncateUser(HashMap<String, String> paramMap);
}
