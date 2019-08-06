package lab.spring.service;

import java.util.HashMap;
import java.util.List;

import lab.spring.model.KinderInfoVO;
import lab.spring.model.SafetyVO;
import lab.spring.model.UserVO;




public interface MapService {
	public List<KinderInfoVO> findKinderList();
	//public List<UserVO> findUser(String condition, String keyword);
	public UserVO login(String uid, String upwd);
	public List<SafetyVO> findSafety(List<String> safety_arr);
	public List<SafetyVO> getSafetyList(HashMap<String, String> safety_arr);
}
