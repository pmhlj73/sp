package org.kg.myapp.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.kg.myapp.emp.model.dao.IEmpService;
import org.kg.myapp.emp.model.vo.EmpVO;
import org.kg.myapp.emp.util.EmpValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/emp") // 앞으로 이 컨트롤러는 무조건 emp안으로 들어오게 된다
public class EmpController {
	
	
	
	@Autowired
	IEmpService empService;

	@GetMapping(value="/")		 
	public String empMain() {
		return "emp/home";		// servlet-context에서 /WEB-INF/views/ 밑으로 들어가게 경로를 지정
	}
	
	@GetMapping(value="/count")
	public String empCount(@RequestParam(value="deptId", required=false, defaultValue="0") int deptId, Model model) { //requestparam이 name을 가져오는것 안쓰면 뒤에 변수명이름을 맞춰줘야함
		if(deptId==0) {
			model.addAttribute("count", empService.getEmpCount());
		} else {
			model.addAttribute("count", empService.getEmpCount(deptId));
		}
		return "emp/count";
		
		// 들어오는 주소와 나가는주소가 같으면 String 말고 void타입으로 해도된다
	}
	///
	@GetMapping(value="/list")
	public String empList(Model model) {
		model.addAttribute("empList" , empService.getEmpList());
		return "emp/list";
	}
	
	@GetMapping(value="/{employeeId}")
	public String getEmployees(@PathVariable int employeeId, Model model) {
		model.addAttribute("emp",empService.getEmpInfo(employeeId));
		return "emp/view";
	}
	
	@GetMapping(value="/search")
	public String searchEmployee(String name, Model model) {
		model.addAttribute("empList",empService.getSearchList(name));
		return "emp/list";
	}
	///
	
	@GetMapping(value="/deptList")
	public String getEmployeeListByDeptId(int deptId, Model model) {
		model.addAttribute("empList", empService.getListByDept(deptId));
		return "emp/list";
	}
	
	@GetMapping(value="/maxSalary")
	public String getMaxEmployee(Model model) {
		model.addAttribute("empList", empService.getMaxEmployeeByDept());
		return "emp/list";
	}
	
	@GetMapping(value="/insert")
	public String insertEmployee(Model model) {
		model.addAttribute("emp", new EmpVO());
		model.addAttribute("jobList", empService.getAllJobId());
		model.addAttribute("manList", empService.getAllManagerId());
		model.addAttribute("deptList", empService.getAllDeptId());
		return "emp/insert";
	}
	
	@PostMapping(value="/insert")// 검사를 진행할 곳에 @Valid를 붙임. 유효성 객체 다음에 BindingResult를 붙여서 써야함
	public String insetEmployee(@ModelAttribute("emp") @Valid EmpVO emp, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("jobList", empService.getAllJobId());
			model.addAttribute("manList", empService.getAllManagerId());
			model.addAttribute("deptList", empService.getAllDeptId());
			return "emp/insert";
		}
		empService.insertEmp(emp);
		return "redirect:/emp/list";
	}
	
	@ExceptionHandler(RuntimeException.class)
	public String runtime(HttpServletRequest request, Exception e, Model model) {
		model.addAttribute("url", request.getRequestURI());
		model.addAttribute("exception", e);
		return "error/runtime";
		
	}
	
	
}
