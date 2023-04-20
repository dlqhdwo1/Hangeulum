package user.dao.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO = null;


	
	@Override
	public void join(UserDTO userDTO) {
		userDAO.join(userDTO);
		
	}



	@Override
	public String isExistId(String id) {
		UserDTO userDTO = userDAO.getUser(id);
		

		if(userDTO ==null)
			return "non_exist";
		else
			return "exist";
	}



	@Override
	public String login(Model model,HttpServletRequest request) {
		 return userDAO.login(model,request);
		
		
	}

}
