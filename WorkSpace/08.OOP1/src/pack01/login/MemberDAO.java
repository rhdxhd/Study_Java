package pack01.login;

public class MemberDAO {
	public void login(MemberDTO dto) {
		
	if(dto.id.equals("admin") && dto.pw.equals("admin1234") ) {
		System.out.println("login ok");
	} else {
		System.out.println("wrong");
	}

}
}