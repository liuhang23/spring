package com.smartlab.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.smartlab.spring.action.UserAction;
import com.smartlab.spring.model.User;


public class CodeTest {
	
	//创建Spring的工厂
   private BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml"); 
  
   @Test
   public void testUser(){
	   UserAction ua1 = factory.getBean("userAction", UserAction.class);
	   User user =new User(1,"航大");
	   ua1.setUser(user);
	   ua1.add();
	   ua1.delete();
	   ua1.load();
//	   UserAction ua2 = factory.getBean("userAction", UserAction.class);
//	   //User user2 = new User(2,"航");
//	  // ua2.setUser(user2);
//	  // ua2.add();
//	   //bean的作用域 scope="singleton/prototype/request/"
//	   System.out.println(ua1==ua2);
   }
   
   
   
}
