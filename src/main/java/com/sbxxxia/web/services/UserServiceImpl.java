package com.sbxxxia.web.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbxxxia.web.mappers.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired UserMapper userMapper;

	/* (non-Javadoc)
	 * @see com.sbxxxia.web.services.UserService#save()
	 */
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.sbxxxia.web.services.UserService#update()
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.sbxxxia.web.services.UserService#findOne()
	 */
	@Override
	public void findOne() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.sbxxxia.web.services.UserService#findAll()
	 */
	@Override
	public void findAll() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.sbxxxia.web.services.UserService#count()
	 */
	@Override
	public void count() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.sbxxxia.web.services.UserService#delete()
	 */
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.sbxxxia.web.services.UserService#findByEmailAndUserId(java.lang.String, java.lang.String)
	 */
	@Override
	public void findByEmailAndUserId(String email, String userid) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.sbxxxia.web.services.UserService#findByEmailOrUserId()
	 */
	@Override
	public void findByEmailOrUserId() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.sbxxxia.web.services.UserService#findByCreatedAtBetween()
	 */
	@Override
	public void findByCreatedAtBetween() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.sbxxxia.web.services.UserService#findByAgeGraterThanEqual()
	 */
	@Override
	public void findByAgeGraterThanEqual() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.sbxxxia.web.services.UserService#findByNameLike()
	 */
	@Override
	public void findByNameLike() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.sbxxxia.web.services.UserService#findByJobIsNull()
	 */
	@Override
	public void findByJobIsNull() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.sbxxxia.web.services.UserService#findByEmailAndUserId()
	 */
	@Override
	public void findByEmailAndUserId() {
		// TODO Auto-generated method stub
		
	}

}
