package user.controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import user.bean.UserDTO;
import user.dao.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService = null;
	
	@GetMapping("joinForm")
	public String joinForm() {
		
		return "views/join";
	}

	@PostMapping("join")
	@ResponseBody
	public void join(@ModelAttribute UserDTO userDTO) {
		System.out.println(userDTO.getUseremail());
		
		userService.join(userDTO);
		
	}
	
	@PostMapping(value="isExistId")
	@ResponseBody
	public String isExistId(@RequestParam String id) {
		
		return userService.isExistId(id);  
	}
	
	@GetMapping(value="loginForm")
	public String loginForm() {
		
		return "views/loginForm";
	}
	
	
	@PostMapping(value="login")
	@ResponseBody
	public String login(@ModelAttribute UserDTO userDTO,Model model,
			HttpServletRequest request) {
		
		model.addAttribute("id", userDTO.getUserid());
		model.addAttribute("pwd", userDTO.getUserpassword());
	
		return userService.login(model,request);  
	}

}
