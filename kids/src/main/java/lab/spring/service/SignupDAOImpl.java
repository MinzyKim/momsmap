package lab.spring.service;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lab.spring.model.UserVO;

@Repository
public class SignupDAOImpl implements SignupDAO {
 
    @Inject
    private SqlSession session;
 // 매퍼 
	
    @Override
    public void insertMember(UserVO VO) {
        session.insert("insertMember",VO);
    }
}