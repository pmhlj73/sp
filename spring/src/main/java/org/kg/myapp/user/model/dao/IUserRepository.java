package org.kg.myapp.user.model.dao;

import org.kg.myapp.user.model.vo.UserVO;

public interface IUserRepository {

	void insertUser(UserVO userVO);
	UserVO getUserById(String userId);
	UserVO getUserByIndex(int userIndex);
	
}
