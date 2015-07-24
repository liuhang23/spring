package com.smartlab.spring.dao;

import com.smartlab.spring.model.LogInfo;
import com.smartlab.spring.model.User;

//用户数据接口
public interface IMessageDao {
    //抽象方法
	@LogInfo("添加了留言信息")
	public abstract void add();
	public abstract void delete();
	public abstract User load();
}
