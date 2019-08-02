package lab.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab.spring.dao.DataDAO;
import lab.spring.model.KinderInfoVO;


@Service("MapService")
public class MapSeviceImpl implements MapService{
	
//	public List<UserVO> findUser(String condition, String keyword) {
//		return dao.findUser(condition, keyword);
//	}

	@Autowired
	private DataDAO dao;
	

	public List<KinderInfoVO> findKinderList() {
		return dao.findKinderList();
	}
	
	
	
}
