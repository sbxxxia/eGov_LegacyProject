package com.sbxxxia.web.tx;

import org.springframework.stereotype.Component;

import com.sbxxxia.web.domains.UserDTO;

@Component
public interface TxService {
	public void inserUser(UserDTO user);
}
