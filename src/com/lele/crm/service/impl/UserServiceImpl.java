package com.lele.crm.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.lele.crm.dao.UserDao;
import com.lele.crm.domain.User;
import com.lele.crm.service.UserService;
import com.lele.crm.utils.MD5Utils;
/**
 * 用户管理的Service的实现类
 * @author lele
 *
 */
@Transactional
public class UserServiceImpl implements UserService {

	//注入DAO：
	private UserDao userDao;
	
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	//业务层注册用户的方法
	public void regist(User user) {
		//对密码进行加密处理:
		user.setUser_password(MD5Utils.md5(user.getUser_password()));
		user.setUser_state("1");
		//调用DAO
		userDao.save(user);
	}


	@Override
	//业务层用户登陆的方法
	public User login(User user) {
		user.setUser_password(MD5Utils.md5(user.getUser_password()));
		//调用DAO
		return userDao.login(user);
	}

}
