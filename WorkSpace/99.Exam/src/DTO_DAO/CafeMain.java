package DTO_DAO;

import java.util.Scanner;

public class CafeMain {
	public static void main(String[] args) {
		CafeDAO dao = new CafeDAO();
		InfoDTO info = new InfoDTO();
		Scanner sc = new Scanner(System.in);

		// 로그인 ↓
		while (true) {
			System.out.println("아이디/비밀번호를 입력하세요");
			while (true) {
				if (dao.login(info) == 1) {
					System.out.println("성공. 상품목록으로 이동합니다");
					break;
				} else {
					System.out.println("다시 입력");
				}
			}

			// 리스트 ↓

			// MenuDTO beverage = new MenuDTO(1, "아메리카노" , 2500);
			// MenuDTO beverage = new MenuDTO(2, "카푸치노" , 3000);
			// MenuDTO beverage = new MenuDTO(2, "카푸치노" , 3000);

		
//			dao.listAll(beverages); menuDto에서 가져오기 
			System.out.println("선택하세요. 0.개인정보수정  1.주문하기");
			String input = sc.nextLine();
			if (input.equals("0")) {
				System.out.println("개인정보수정 선택");
				dao.change(info); // 메소드를 가져온다
				//continue; 
			} else if (input.equals("1")) {
				System.out.println("주문하기. 금액투입하세요.");
			}

//		Scanner sc = new Scanner(System.in);
//		int inputPrice = Integer.parseInt(sc.nextLine());
//		MenuDTO dto = new MenuDTO();
//		dto.setPrice(inputPrice);
//		System.out.println(dto.getName());

		}
	}
}