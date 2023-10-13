package DTO_DAO;

public class MenuDTO {
	//상품 메뉴판

	
	private String name;
	private int money, refund, num, price;
	
	String[] menu = {"1" , "아메리카노" , "2000"};
	String[] menu1 = {"2" , "아메리카노" , "2000"};
	String[] menu2 = {"3" , "아메리카노" , "2000"};
	public MenuDTO(int num, String name, int price) {
		this.name = name;
		this.num = num;
		this.price = price;
	}
	
	public MenuDTO() {
	}

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getNum() {
		return num;
	}




	public void setNum(int num) {
		this.num = num;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		if(price<0) {
			this.name = "금액 입력 오류";
		}else {
			this.price = price;
	}
}



	
	
}
