package DTO_DAO;

public class InfoDTO {
// 관리자 , 유저 개인정보 비밀번호
	private String userId = "user", userPw= "user1", managerId="admin", managerPw="admin1";
	int memuList ;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerPw() {
		return managerPw;
	}
	public void setManagerPw(String managerPw) {
		this.managerPw = managerPw;
	}
	public int getMemuList() {
		return memuList;
	}
	public void setMemuList(int memuList) {
		this.memuList = memuList;
	} 

	
}
