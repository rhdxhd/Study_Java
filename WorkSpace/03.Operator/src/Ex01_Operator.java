
public class Ex01_Operator {
	public static void main(String[] args) {
		// int형 변수num1과 num2에 각각 2와 3을 담고 초기화
		int num1 = 2, num2 = 3;
		//int num2 = 2;
		//int num2 = 3;
		// System.out.println(1+1);
		// - , * , /
		// ctrl + alt + 방향 위 아래 : 복사
		System.out.println("num1 + num2 =" + ( num1 + num2)); //syso(값하나)
		System.out.println("num1 - num2 =" + ( num1 - num2)); //syso(값하나)
		System.out.println("num1 * num2 =" + ( num1 * num2)); //syso(값하나)
		System.out.println("num1 / num2 =" + ( num1 / num2)); //syso(값하나)
		
		System.out.println("2로 나누고 나머지가 0이면 짝수" + (num1%2)); 
		System.out.println("2로 나누고 나머지가 1이면 홀수" + (num2%2)); 
		
		//짝수 뒤에 0은 값이 0이 나오는지 확인한 것.
		//홀수 뒤에 1은 값이 1이 나오는지 확인한 것.
		
}
}