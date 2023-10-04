package pack01.exceptioncode;

import java.util.Scanner;

public class Ex01_NullPointer {
	public static void main(String[] args) {

		// Ex01_프로젝트 실행 시, 콘솔에 NullPointer오류가 발생하게 코딩해보기.
		// 참조형 데이터타입은 아직 객체 참조를 시작하지 않음(null) 상태에서는 모든 기능 사용x
		
		
		
		Scanner scan = null;
		if (scan != null) { // 위에 Scanner scan = null;만 쓰면 오류가 뜨기때문에 if (scan != null)문도 같이 써주면 오류 사라짐.
			scan.nextLine(); // null이면 쓰지마라
		}
		// NullPointerException은 빈번하게 발생하는 오류코드 -> 회피방법이 간단함.
		// 객체를 사용할때 null이 아닌 상태에서만 쓰게끔 만들면 된다.
		// 제어문을 활용.
		
		String[] strs = null;
		if (strs != null) {  // null을 가진 참조타입이 발생하면 쓰지마라
			System.out.println(strs[0]);
		}

		System.out.println("여기");

	}
}
