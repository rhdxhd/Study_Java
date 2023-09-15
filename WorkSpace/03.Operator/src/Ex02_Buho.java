
public class Ex02_Buho {
public static void main(String[] args) {
	//부호 : 양수인지 음수인지를 판단할수있는 기호 + , -
	int number = -100;
	
	int result1 = +number;
	int result2 = -number;
	// result1의 값?
	// result2의 값?
	System.out.println(result1);
	System.out.println(result2);
	
		
	System.out.println(" (+number) result1 : " + result1); // 플러스 넘버를 했을때 result1값은 : -100이다.
	System.out.println(" (+number) number * 1 = number(-100)");
						//플러스 넘버를 했을때, 넘버에 *1을 곱한 값이 되고, 그 결과 넘버는 -100이 된다 
	System.out.println(" (-number) result2 : " + result2); // 마이너스 넘버를 했을때 result2값은 : 100이다.
	System.out.println(" (-number) number * -1 = number(100)");
						//마이너스 넘버를 했을때, 넘버에 -1을 곱한 값이 되고, 그 결과 넘버는 100이 된다
	
	
	// 많이 쓰는 부호는 -일까 +일까?
	// - 부호는 부호를 반전 시키는 규칙이 있음. (+는 아무 규칙이 없다.)
	int result3 = number *-1;
	System.out.println(result3);
}
}
