package org.kg.myapp.user.controller;

import java.io.IOException;

import org.kg.myapp.emp.model.dao.IFileService;
import org.kg.myapp.emp.model.vo.FileVO;
import org.kg.myapp.user.model.dao.IUserService;
import org.kg.myapp.user.model.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

	@Autowired
	IUserService userService;
	
	@Autowired
	IFileService fileService;
	
	@Transactional("txManager")
	@PostMapping(value="/user/insertdata")
	public String insertUser(UserVO user, MultipartFile file, RedirectAttributes redi) throws IOException {
		
		if(file != null && !file.isEmpty()) {
			FileVO newFile = new FileVO();
			newFile.setFileName(file.getOriginalFilename());
			newFile.setFileSize(file.getSize());
			newFile.setFileContentType(file.getContentType());
			newFile.setFileData(file.getBytes());
			user.setFileId(fileService.getMaxFileId()+1);
			fileService.uploadFile(newFile);
		} 
		userService.insertUser(user); 
		redi.addFlashAttribute("message", "회원 가입에 성공하였습니다.");
		return "redirect:/login";
	}
	
}
