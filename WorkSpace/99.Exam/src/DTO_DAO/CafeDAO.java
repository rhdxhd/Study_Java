package DTO_DAO;

public class CafeDAO {
	public void list(MenuDTO beverage) {
		System.out.println(beverage.getNum() + ". " + beverage.getName() + " : " + beverage.getPrice() + "원");
	}
	
	
	
	public void listAll(MenuDTO[] beverages) {
		for(int i=0; i<beverages.length; i++) {
			list(beverages[i]);
		}
	}
	
	

}