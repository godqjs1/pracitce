package kr.co.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.test.User1DAO;
import kr.co.test.User1VO;


@Service
public class User1Service {
	@Autowired
	private User1DAO dao;

	public void insertUser1(User1VO vo) {
		dao.insertUser1(vo);
	}
//	public User1VO selectUser1(String uid) {
//		return dao.selectUser1(uid);
//	}
//	public List<User1VO> selectUser1s() {
//		return dao.selectUser1s();
//	}
//	public void updateUser1(User1VO vo) {
//		dao.updateUser1(vo);
//	}
//	public void deleteUser1(String uid) {
//		dao.deleteUser1(uid);
//	}
}