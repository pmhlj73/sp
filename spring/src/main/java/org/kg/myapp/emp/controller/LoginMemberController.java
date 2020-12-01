package org.kg.myapp.emp.controller;

import org.kg.myapp.emp.model.dao.ILoginMemberService;
import org.kg.myapp.emp.model.vo.LoginMemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/loginMember")
public class LoginMemberController {

	@Autowired
	ILoginMemberService loginMemberService;
	
	@GetMapping(value="/")		 
	public String empMain() {
		return "loginMember/home";		// servlet-context에서 /WEB-INF/views/ 밑으로 들어가게 경로를 지정
	}
	
	@GetMapping(value="/insert")
	public String insertMember(LoginMemberVO mem) {
		loginMemberService.insertLoginMember(mem);
		return "loginMember/insert";
	}
}
