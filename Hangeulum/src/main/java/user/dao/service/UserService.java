package user.dao.service;


import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;


import user.bean.UserDTO;

public interface UserService {

	public void join(UserDTO userDTO);

	public String isExistId(String id);

	public String login(Map<String,String> map);

	public String kakaologin(String kakao_emai);

	public String findIdComplete(Map<String, String> map);

	public String findpasswordcomplete(Map<String, String> map);

	public void changepassword(Map<String, String> map);

	

	
//
}
