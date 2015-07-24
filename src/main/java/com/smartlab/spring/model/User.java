package com.smartlab.spring.model;

public class User {
	private Integer id;
	private String username;
	//构造函数
	public User(){
		
	}
	
	public User(Integer id,String username){
		super();
		this.id = id;
		this.username = username;
	}
	
	//setter/getter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	@Override
	public String toString(){
		return "User[id="+id+",用户名="+username+"]";
	}
	
	

}
