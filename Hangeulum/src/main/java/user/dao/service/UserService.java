package user.dao.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import user.bean.UserDTO;

public interface UserService {

	public void join(UserDTO userDTO);

	public String isExistId(String id);

	public String login(Model model,HttpServletRequest request);

	
//
}
