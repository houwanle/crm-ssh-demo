package com.lele.crm.dao;

import com.lele.crm.domain.User;

/**
 * 用户管理的DAO的接口
 * @author lele
 *
 */
public interface UserDao {

	void save(User user);

	User login(User user);

}
