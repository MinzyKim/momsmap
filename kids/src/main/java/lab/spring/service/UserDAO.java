package lab.spring.service;
import java.util.List;

import lab.spring.model.UserVO; 

public interface UserDAO { 
	
	public List<UserVO> getUserList() throws Exception; 
	public UserVO getUserInfo(String userid) throws Exception; 
	public int insertUser(UserVO userVO) throws Exception; 
	public int updateUser(UserVO userVO) throws Exception; 
	
	}

