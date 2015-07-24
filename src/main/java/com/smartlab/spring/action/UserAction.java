package com.smartlab.spring.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.smartlab.spring.model.User;
import com.smartlab.spring.service.IUserService;

//用户的控制器
//@Component("userAction")   
@Controller("userAction")  //MVC的控制层一般使用@Controller
@Scope("prototype")       
public class UserAction {
	private User user;
    private int id;
    private IUserService userService;
    
    public void add(){
    	userService.add(user);
    }
    
    public void delete(){
    	userService.delete(id);
    }
    
    public void load(){
    	userService.load(id);
    }
    
    
    //
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public IUserService getUserService() {
		return userService;
	}
	
    @Resource 
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

    
    
    
}
