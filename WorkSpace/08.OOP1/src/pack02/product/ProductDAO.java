package pack02.product;

public class ProductDAO {
	public void display(ProductDTO dto) {
		System.out.println(dto.getNum() + "." + dto.getName() + ":" + dto.getPrice());
	}
	
	public void displays(ProductDTO[] dtos) {
		for(int i=0; i<dtos.length; i++) {
			display(dtos[i]);
		}
	}
	public ProductDTO[] name() {
		ProductDTO[] dtos = new ProductDTO[5];
		

		dtos[0] =  new ProductDTO(1 , 6900 , "스카프");
		dtos[1] = new ProductDTO(2 , 5700 , "마늘");
		dtos[2] = new ProductDTO(3 , 3600 , "커피");
		dtos[3] = new ProductDTO(4 , 3600 , "커피");
		dtos[4] = new ProductDTO(5 , 3600 , "커피");
					
		return dtos;
	}
}