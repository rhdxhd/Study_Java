package pack03.exfor;

public class Ex01_For {
	public static void main(String[] args) {
		//모든 제어문은 자신의 지역을 가지며 (블럭킹) 지역은 중첩이 가능하다.
		//제어문 - 반복문 ( 어떤 변수와 변수를 이용한 조건을 주고 그 조건이 true일 동안 반복 실행 )
		// for(1.초기값(변수 초기화), <- 2.이거일때 조건만듬(true일때 반복), 4.변수 증감식){
			// 3.반복 구간
		//}
		//for(int i=0; i<10 ; i++){
			//반복 구간
		//}
		
		//행 번호 옆에 더블 클릭 : 브레이크(킹) 포인트 여기서 멈춤.
		// F6(StepOver) 코드 한줄 실행.
		// F8(Resume) 다음 브레이킹 포인트로 이동
		//(없으면 프로그램 계속 돈다.)
		
		 
		for(int i=0; i<10; i++) { //증감식 빼먹으면 안됨. (빼먹으면 무한루프 걸림. 콘솔에서 중지버튼 눌러서 중지시킬 수 있음)
			System.out.println(i + " 반복 ");
		}
		
				
		
		//1. for문 만 이용해서 1~10까지의 수 중 짝수만 출력
		for(int i=0; i<=10; i+=2) { 
			System.out.println(i);
		
		}
		
		//2. for문 만 이용해서 1~10까지의 수 중 홀수만 출력
		for(int i=1; i<10; i+=2) {
			System.out.println(i);
		}
		
		
		
	}// main

}
