package DTO_DAO;

import java.util.Scanner;

public class CafeDAO {
	Scanner sc = new Scanner(System.in);
//	InfoDTO info = new InfoDTO();
	// 로그인 ↓
	
	
	public int login(InfoDTO info) {
		//Scanner sc = new Scanner(System.in);
		String idInput = sc.nextLine();
		String pwInput = sc.nextLine();
		
		if ((idInput.equals(info.getUserId()) && pwInput.equals(info.getUserPw())) || (idInput.equals(info.getManagerId()) && pwInput.equals(info.getManagerPw()))) {
			System.out.println("로그인되었습니다.");
			return 1;
		}else {
			System.out.println("아이디/비밀번호 오류");
			return 0;
		}
		
	}
	
	
	
	// 리스트 ↓
	
	public void list(MenuDTO dto) {//기능 : 번호, 음료이름, 가격
		System.out.println(dto.getNum() + ". " + dto.getName() + " : " + dto.getPrice() + "원");

	}
	
	
	
	public void listAll(MenuDTO dtos) { //배열 : 음료 리스트
		for(int i=0; i<dtos.length; i++) {
			list(dtos[i]);
		}
	}
	
	
	
	
	// 개인정보 수정
	
	public void change(InfoDTO info) {
		System.out.println("변경할 비밀번호 입력하세요");
		info.setUserPw(sc.nextLine());
		System.out.println(info.getUserPw() + "(으)로 변경 성공");
		System.out.println("재로그인 해주세요.");
	}

	
	
	
	// 주문하기
	
	public void order(MenuDTO menu) {
		int inputPrice = Integer.parseInt(sc.nextLine()); // 투입금액
		System.out.println("메뉴 선택하세요");
		int inputPrice2 = Integer.parseInt(sc.nextLine()); // 메뉴
//	 inputPrice - 
	}
	
	

	

}