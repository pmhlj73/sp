package org.kg.myapp.emp.model.dao;

import org.kg.myapp.emp.model.vo.LoginMemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginMemberRepository implements ILoginMemberRepository {
	
	@Autowired
	JdbcTemplate jdbctemplate; 

	@Override
	public void insertLoginMember(LoginMemberVO mem) {
		String sql = "insert into login_member values(login_member_seq.nextVal,?,?,?,?)";
		jdbctemplate.update(sql, mem.getUserId(), mem.getUserPassword(),
				mem.getUserName(), mem.getFileId());
	}

}
