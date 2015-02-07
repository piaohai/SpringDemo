package edu.xautjzd.service.impl;

import edu.xautjzd.dao.IUserDao;
import edu.xautjzd.service.IUserService;

public class UserService implements IUserService {

	private IUserDao userDao;
	
	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public void processAdd() {
		System.out.println("-------------from UserService.processAdd()");  
		userDao.add();
	}

}
