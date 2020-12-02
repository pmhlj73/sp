package org.kg.myapp.login.controller;

import javax.servlet.http.HttpSession;

import org.kg.myapp.user.model.dao.IUserService;
import org.kg.myapp.user.model.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
	
	@Autowired
	IUserService userService;
	
	@Autowired
	BCryptPasswordEncoder bpe;

	@PostMapping(value="/login.do")
	public String login(String id, String pw, RedirectAttributes redi, HttpSession session) {
		String dbpw = userService.getPassword(id);
		if(bpe.matches(pw, dbpw)) {
			UserVO user = userService.getUserById(id);
			session.setAttribute("userId", id);
			session.setAttribute("user", user);
			return "redirect:/emp/";
		} else {
			redi.addFlashAttribute("message", "아이디 또는 비밀번호가 잘못되었습니다.");
			return "redirect:/login";
		}
	}
	
	@PostMapping(value="logout")
	public String logout(HttpSession session, RedirectAttributes redi) {
		UserVO user = (UserVO)session.getAttribute("user");
		session.invalidate();
		redi.addFlashAttribute("message", "안녕히가세요"+user.getUserName()+" 님");
		return "redirect:/login";
	}
	
}
