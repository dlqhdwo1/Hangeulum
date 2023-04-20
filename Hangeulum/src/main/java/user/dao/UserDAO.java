package user.dao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import user.bean.UserDTO;

public interface UserDAO {
	public void join(UserDTO userDTO);

	public UserDTO getUser(String id);

	public String login(Model model,HttpServletRequest request);
		
	
}
