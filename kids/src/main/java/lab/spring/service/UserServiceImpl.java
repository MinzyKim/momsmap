package lab.spring.service;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab.spring.model.UserVO;
import java.util.List; 
import javax.inject.Inject; 
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 
import org.springframework.stereotype.Service;
 


@Service("UserService") 

public class UserServiceImpl implements UserService{
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class); 
	
	@Autowired private UserDAO userDAO; 
	
	public List<UserVO> getUserList() throws Exception { 
		
		return userDAO.getUserList(); } 
	
	public UserVO getUserInfo(String uid) throws Exception {
		
		return userDAO.getUserInfo(uid); } 
	
	public void insertUser(UserVO userVO) throws Exception { 
		userDAO.insertUser(userVO); } 
	
	public void updateUser(UserVO userVO) throws Exception { 
		
		userDAO.updateUser(userVO); } 
	 } 
	

