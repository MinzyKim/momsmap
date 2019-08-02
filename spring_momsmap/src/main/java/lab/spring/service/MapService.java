package lab.spring.service;

import java.util.List;

import lab.spring.model.KinderInfoVO;



public interface MapService {
	public List<KinderInfoVO> findKinderList();
	//public List<UserVO> findUser(String condition, String keyword);
}
