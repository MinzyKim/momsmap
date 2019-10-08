package lab.spring.service;

import java.util.HashMap;
import java.util.List;

import lab.spring.model.CommentVO;
import lab.spring.model.KinderInfoVO;
import lab.spring.model.SafetyVO;
import lab.spring.model.SanitaryVO;
import lab.spring.model.UserVO;




public interface MapService {
	public List<CommentVO> findCommentList(String kdid);
	public int addComment(CommentVO comment);
	
	public List<KinderInfoVO> findKinderList();
	public UserVO login(String uid, String upwd);
	public List<SafetyVO> findSafety(List<String> safety_arr);
	public List<SafetyVO> getSafetyList(HashMap<String, String> safety_arr);
	public List<SanitaryVO> getSanitaryList(HashMap<String, String> sanitary_arr);
}
