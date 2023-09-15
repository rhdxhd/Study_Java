
public class Ex03_Operator {
	public static void main(String[] args) {
		// ++, --
		//복습해도됨. 엄청 많이씀, 증감, 가감 (현실에서는 안씀)
		int num1 = 1 , num2 = 1;
						
		
		num1++; // 변수+1
		// num2++; -> ++num2;로 바꿔도 값이 똑같이 나옴? 
		++num2;
		
		//1.    ↑연산하고(이미 끝내고), ↓ 출력해봄 - 2줄
		
		System.out.println(num1);
		System.out.println(num2);
		// ※ 선행 연산: 변수 앞에 증감식을 사용, 후행 연산: 변수 뒤에 증감식을 사용 ※ //		
		
				
		
		
		//2.    ↓ 연산과 출력을 한줄에 쓰는데 연산의 순서를 출력 앞에 할것이냐 뒤에 할것이냐
		System.out.println(num1++);	 // syso로 출력을 하는데, 일단 기존 num1의 값을 출력하고 syso 출력이후에 나중에 더해서 값만 따로 가지고있을 것인지.
		System.out.println(++num2);  // 아니면 출력하기전에 더해서 나온 값을 syso 출력할때 애초에 출력해서 보여줄 것인지
		
		
		System.out.println(" 증감식 종료 후 num1: " + num1); 
		System.out.println(" 증감식 종료 후 num2: " + num2); 
	}

}
