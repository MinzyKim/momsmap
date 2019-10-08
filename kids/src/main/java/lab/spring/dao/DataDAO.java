package lab.spring.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lab.spring.model.BuildingVO;
import lab.spring.model.CommentVO;
import lab.spring.model.KinderInfoVO;
import lab.spring.model.MealVO;
import lab.spring.model.SafetyVO;
import lab.spring.model.SanitaryVO;
import lab.spring.model.TeacherVO;
import lab.spring.model.UserVO;

@Repository
public class DataDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public int addComment(CommentVO comment) {
		return sqlSession.insert("lab.mybatis.user.UserMapper.addComment",comment);		
	}
	
	public List<CommentVO> findCommentList(String kdid){
		return sqlSession.selectList("lab.mybatis.user.UserMapper.getCommentList",kdid);
	}
	
	public UserVO login(String uid, String upwd) {
		
		Object vo = null;
		HashMap<String, String> hm = new HashMap<String, String>(); 
		hm.put("uid", uid);
		hm.put("upwd", upwd);
		vo=sqlSession.selectOne("lab.mybatis.user.UserMapper.login", hm);
		
		return (UserVO)vo;
	}
	
	public List<KinderInfoVO> findKinderList(){
		return sqlSession.selectList("lab.mybatis.user.UserMapper.getKinderList");
	}
	
	public List<SafetyVO> findSafety(List<String> safety_arr){
		return sqlSession.selectList("lab.mybatis.user.UserMapper.findSafety");
	}
	
	public List<SafetyVO> getSafetyList(HashMap<String, String> safety_arr){
		List<SafetyVO> safetyList = null;
		 
		safetyList = sqlSession.selectList("lab.mybatis.user.UserMapper.getSafetyList", safety_arr);
		return safetyList;
	}
	
	public List<SanitaryVO> getSanitaryList(HashMap<String, String> sanitary_arr){
		List<SanitaryVO> sanitaryList = null;
		 
		sanitaryList = sqlSession.selectList("lab.mybatis.user.UserMapper.getSanitaryList", sanitary_arr);
		return sanitaryList;
	}
}
