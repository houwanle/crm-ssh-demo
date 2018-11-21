package com.lele.crm.service;

import com.lele.crm.domain.User;

/**
 * 用户管理的Service接口
 * @author lele
 *
 */
public interface UserService {

	void regist(User user);

	User login(User user);

}
