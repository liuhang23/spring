package com.smartlab.spring.dao;

import org.springframework.stereotype.Repository;

import com.smartlab.spring.Aop.Logger;
import com.smartlab.spring.model.User;

//实现用户数据接口   等于完成了<bean id="userDao" class="com.smartlab.spring.UserDao"/>
//@Component("userDao")    //公共的创建bean的Annotation
@Repository("messageDao")   //@Repository一般用于DAO的注入 
public class MessageDao implements IMessageDao{
    //抽象方法
	public  void add(){
		Logger.info("UserDao添加了用户");
		System.out.println("msg add");
	};
	public  void delete(){
		System.out.println("msg delete");
	};
	public  User load(){
		System.out.println("msg load");
		 return null;
	};
}
