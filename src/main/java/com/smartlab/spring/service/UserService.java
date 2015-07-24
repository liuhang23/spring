package com.smartlab.spring.service;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.smartlab.spring.dao.IMessageDao;
import com.smartlab.spring.dao.IUserDao;
import com.smartlab.spring.model.User;

//用户数据接口
//@Component("userAction")   <bean id="" class="">
@Service("userService")  //业务层一般使用@Service
public class UserService  implements IUserService{
	private IUserDao userDao;
	
	private IMessageDao messageDao;
	
    //抽象方法
	public  void add(User user){
		messageDao.add();
		messageDao.delete();
		userDao.add(user);
	};
	public  void delete(int id){
		userDao.delete(id);
	};
	public  User load(int id){
		return userDao.load(id);
	}
	
	
	//setter/getter
	
	public IUserDao getUserDao() {
		return userDao;
	}
	//默认通过名称注入,在JSR330中提供了@Inject来注入
	//@Resource(name="userProxyDao")
	@Resource(name="userDynamicDao")
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	public IMessageDao getMessageDao() {
		return messageDao;
	}
	@Resource(name="messageDynamicDao")
	public void setMessageDao(IMessageDao messageDao) {
		this.messageDao = messageDao;
	};
	
	
	
}
