package com.smartlab.spring.dao;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.smartlab.spring.Aop.Logger;
import com.smartlab.spring.model.User;

//代理类  
@Component("userProxyDao")
// <bean id="" class=""/>
public class UserProxyDao implements IUserDao {
	private IUserDao userDao;

	public void add(User user) {
		Logger.info("UserProxyDao添加了用户");
		userDao.add(user);
	}

	public void delete(int id) {
		Logger.info("删除了用户");
		userDao.delete(id);
	}

	public User load(int id) {
		return userDao.load(id);
	}

	// setter/getter
	public IUserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

}
