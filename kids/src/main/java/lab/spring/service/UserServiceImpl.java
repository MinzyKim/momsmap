package lab.spring.service;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import lab.spring.model.UserVO;

@Service
public class SignupServiceImpl implements SignupService {
 
    @Inject
    private SignupDAO dao;
 
    @Override
    public void insertMember(UserVO VO) {
        dao.insertMember(VO);
        
    }
}
