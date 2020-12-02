package org.kg.myapp.user.model.dao;

import org.kg.myapp.user.model.vo.UserVO;

public interface IUserService {

	void insertUser(UserVO userVO);
	UserVO getUserById(String userId);
	UserVO getUserByIndex(int userIndex);
	String getPassword(String userId);
}
