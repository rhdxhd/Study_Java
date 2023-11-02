package junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pack01.jdbc.MemeberDAO;

class TestMemberDAO {

	//@DisplayName("연결 테스트")
	//@Test
	void connTest() {
		MemeberDAO dao = new MemeberDAO();
		assertTrue(dao.isConnection());

		// dao.checkConnection();
	}

	@DisplayName("멤버테이블 조회")
	@Test
	void selectMember() {
		MemeberDAO dao = new MemeberDAO();
		dao.selectMember();
	}

	//@DisplayName("등록 멤버 인서트")
	//@Test
	void insertMember() {
		MemeberDAO dao = new MemeberDAO();
		dao.insertMember("us1", "aa");
	}

	@DisplayName("회원 정보 수정")
	@Test
	void updateMemeber() {
		MemeberDAO dao = new MemeberDAO();
		dao.updateMember("a", "edit");
	}
	
	
	
	
	
}
