package pack01.method;

public class Calculator {
	//calculator  클래스는 계산기 기능을 가진 클래스 입니다.
	// 기능 4가지를 구현해보기
	// 기능 1) plus <= 두 수를 입력받아 두 수의 합을 바로 출력하는 메소드 반환x
	//     2)minus <-  두 수를 입력받아 두 수의 빼기를 바로 출력하는 메소드 반환 ㅌ
	//     3) mul <- 두 수의 곱하기를 메소드 호출부로 반환해줏는 메소드 - > 출력은 계산기 메인에서 함
	//     3) div <- 두 수의 나누기를 메소드 호출부로 반환해줏는 메소드 - > 출력은 계산기 메인에서 함

	public void plus (int a, int b) {
		System.out.println(a+b);
	}
	
	public void minus(int a, int b) {
		System.out.println(a-b);
		
	}
	public int mul(int a, int b) {
		return a*b;
	}

}

