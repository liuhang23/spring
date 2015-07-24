package com.smartlab.spring.dao;

import com.smartlab.spring.model.LogInfo;
import com.smartlab.spring.model.User;

//用户数据接口
public interface IUserDao {
    //抽象方法
	@LogInfo("添加用户信息")
	public abstract void add(User user);
	@LogInfo("删除用户信息")
	public abstract void delete(int id);
	public abstract User load(int id);
}
