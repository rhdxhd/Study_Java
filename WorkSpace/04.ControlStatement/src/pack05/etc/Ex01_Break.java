package pack05.etc;

public class Ex01_Break {
	public static void main(String[] args) {
		//break : 현실에서 브레이크는 바퀴가 달린(자전거, 오토바이, 자동차 등)물체를 멈출때 사용한다.
		//자바에서는 제어문의 중지용으로 사용한다.(break1 => for, while, switch 하나를 멈춤.)
		//멈출 제어문 개수 == break문 개수 ==> 전체 제어문을 중지하는게 가능.
		int i=0;
		while(true) {
			System.out.println("브레이크로 제어문 중지");
			while(true) {
				System.out.println("1. break안넣으면 브레이크가 여기에는 없음"+"/"+ "2. break 넣으면 여기 탈출");
				break; //무한루프, break문 바로 밑에는 코드 작성이 무의미함. 작성오류 Unreachable code가 뜸.
			}
			break; // Unreachable code?
		}
		
		
		
		int j=0;
		while(true) {
			System.out.println("while실행중");
			if(j==999) {
				break;
			}
			j++; //안넣으면 무한루프
		}	
		
		
	}
}
