package Practice;

public class DAO {

	DTO dto = new DTO();
	
	public boolean login(String id, String pw) {
		if(id.equals("hong") && pw.equals("12345")) {
			return true;
		}
		return false;
	}
	
	
	public void logout(String Id) {
		System.out.println(dto.getId() + "님이 로그 아웃 되었습니다");
		
	}
	
	
}
