package pack01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemeberDAO {
	private Connection conn;

	public boolean isConnection() {
		// url, user, password => Properties파일(접속정보가 파일로 저장되어있는 것)Stream으로 파일읽어오기.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hanul";
		String password = "0000";
		try {
			conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed()) { // 통신이 닫혔냐
				System.out.println("열림");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void selectMember() {
		ArrayList<MemberDTO> list = new ArrayList<>();
		if (isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement(" SELECT * FROM MEMBER ");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					MemberDTO dto = new MemberDTO(rs.getString("id"), rs.getString("pw"));
					list.add(dto)
					//System.out.println(rs.getString("id") + " " + rs.getString("pw"));
				}

				// System.out.println(rs.getRow());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void insertMember(MemberDTO dto) {
		if (isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement(" INSERT INTO MEMBER VALUES ( ? , ? ) ");
				ps.setString(1, dto.getId());
				ps.setString(2, dto.getPw());
				int result = ps.executeUpdate();
				// conn.commit(); // ※확정되지 않은 작업이 있는 테이블 조회 시 연결 실패 뜸. 이 경우를 LOCK이라고 함※
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	
	public void updateMember(MemberDTO dto) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("UPDATE MEMBER "
						+ "SET PW = ? "
						+ "WHERE ID= ? ");
				ps.setString(1, dto.getPw());
				ps.setString(2, dto.getId());
				int result = ps.executeUpdate();
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
