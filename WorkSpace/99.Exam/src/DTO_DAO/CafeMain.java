package DTO_DAO;

import java.util.Scanner;

public class CafeMain {
	public static void main(String[] args) {
		
	//MenuDTO beverage = new MenuDTO(1, "아메리카노" , 2500);
	//MenuDTO beverage = new MenuDTO(2, "카푸치노" , 3000);
	//MenuDTO beverage = new MenuDTO(2, "카푸치노" , 3000);
	

		MenuDTO[] beverages = new MenuDTO[3];
		beverages[0] = new MenuDTO(1, "아메리카노" , 2500);
		beverages[1] = new MenuDTO(2, "카푸치노" , 3000);
		beverages[2] = new MenuDTO(3, "카페라떼" , 3000);
	
	
	
	
	CafeDAO dao = new CafeDAO();
	dao.listAll(beverages);
	
	Scanner sc = new Scanner(System.in);
	int inputPrice = Integer.parseInt(sc.nextLine());
	MenuDTO dto = new MenuDTO();
	dto.setPrice(inputPrice);
	System.out.println(dto.getName());
		
	}
}