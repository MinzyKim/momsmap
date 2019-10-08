package lab.spring.service;


import java.util.List; 
import javax.inject.Inject; 
import org.apache.ibatis.session.SqlSession; 
import org.springframework.stereotype.Repository;

import lab.spring.model.UserVO; 


@Repository
public class UserDAOImpl implements UserDAO{ 
	
	@Inject 
	private SqlSession sqlSession; 
	

	public List<UserVO> getUserList() throws Exception {
		
		return sqlSession.selectList("lab.mybatis.user.UserMapper.getUserList"); } 
	
	public UserVO getUserInfo(String uid) throws Exception { 
		
		return sqlSession.selectOne("lab.mybatis.user.UserMapper.getUserInfo", uid); }

	public int insertUser(UserVO userVO) throws Exception { 
		
		return sqlSession.insert("lab.mybatis.user.UserMapper.insertUser", userVO); } 
	
	public int updateUser(UserVO userVO) throws Exception { 
		
		return sqlSession.update("lab.mybatis.user.UserMapper.updateUser", userVO); } 
	
	
	}

