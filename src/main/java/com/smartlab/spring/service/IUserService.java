package com.smartlab.spring.service;

import com.smartlab.spring.model.User;

//用户服务接口
public interface IUserService {
    //抽象方法
	public abstract void add(User user);
	public abstract void delete(int id);
	public abstract User load(int id);
}
