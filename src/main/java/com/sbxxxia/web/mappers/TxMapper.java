package com.sbxxxia.web.mappers;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.sbxxxia.web.domains.UserDTO;

@Repository
public interface TxMapper {
	@Insert("insert into users (userid, password) "
			+ "values #{userid}, #{password}")
	public void insertUser(UserDTO user);
}
