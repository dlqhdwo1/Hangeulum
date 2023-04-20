package user.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import user.bean.UserDTO;

@Repository
@Transactional
public class UserDAOMybatis implements UserDAO {
	@Autowired
	private SqlSession sqlsession;

	
	
	
	@Override
	public void join(UserDTO userDTO) {

		sqlsession.insert("userSQL.join",userDTO);
		System.out.println("회원가입성공");

	}

	@Override
	public UserDTO getUser(String id) {

		return sqlsession.selectOne("userSQL.getUser",id);
	}

	@Override
	public String login(Model model,HttpServletRequest request) {
		
		String id = sqlsession.selectOne("userSQL.login", model);
		
		HttpSession session = request.getSession();

		
		session.setAttribute("id", id);
		
		String id2 = (String)session.getAttribute("id");
		System.out.println(id2);

		if(id!=null) {

			return "success";
		}
		else{
			return "fail";
		}

	}
}