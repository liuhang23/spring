package com.smartlab.spring.dao;

import org.springframework.stereotype.Repository;

import com.smartlab.spring.Aop.Logger;
import com.smartlab.spring.model.User;

//实现用户数据接口   等于完成了<bean id="userDao" class="com.smartlab.spring.UserDao"/>
//@Component("userDao")    //公共的创建bean的Annotation
@Repository("userDao")   //@Repository一般用于DAO的注入 
public class UserDao implements IUserDao {
    //抽象方法
	public  void add(User user){
		Logger.info("UserDao添加了用户");
		System.out.println("添加了"+user);
	};
	public  void delete(int id){
		System.out.println("delete:"+id);
	};
	public  User load(int id){
		System.out.println("load:"+id);
		 return null;
	};
}
