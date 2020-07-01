package com.sbxxxia.web.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbxxxia.web.domains.UserDTO;
import com.sbxxxia.web.mappers.TxMapper;

@Service
@Transactional
public class TxServiceImpl implements TxService{
	@Autowired TxMapper txMapper;
	/* (non-Javadoc)
	 * @see com.sbxxxia.web.tx.TxService#inserUser(com.sbxxxia.web.domains.UserDTO)
	 */
	@Override
	public void inserUser(UserDTO user) {
		// TODO Auto-generated method stub
		
	}

}
