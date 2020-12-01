package org.kg.myapp.emp.model.dao;

import org.kg.myapp.emp.model.vo.LoginMemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginMemberService implements ILoginMemberService {

	@Autowired
	LoginMemberRepository loginMemberRepository;
	
	@Override
	public void insertLoginMember(LoginMemberVO mem) {
		loginMemberRepository.insertLoginMember(mem);
	}

}
