package pack01.exif;

public class Ex01_If {
	public static void main(String[] args) {
		// main메소드(함수,기능)
		// javaProject에서 프로그램의 시작점을 구분하기위한 메소드==>main
		// 블럭킹 : { }
		// 어떤 문장이나 메소드, 클래스 등등의 구역(지역)을 의미함.
		// 지역 블럭킹이 열리면 '{' 메모리에 올라가고
		// 지역 블럭킹 끝 '}' 메모리에서 내림을 반복한다. ==> 이게 자바 프로그램임
		// 클래스 지역을 제외하고 선언되거나 초기화 되는 모든 변수는 우리가
		// '지역 변수'라고 하며 해당 지역에서만 사용이 가능하다 ==>지역화폐와 같은 것..
		// if( 조건식 ) {
		// 위와 같은 형태를 if문 지역이라고 함. : 조건식이 true일때만 해당 지역은 코드 실행이 된다.
		// }
		
		// 만약에 점수가 100점이라면 "장학금을 받음"도 실행이되고,
		// 전교 1등입니다가 출력되게 해보기.
		
		int score = 100;
		if (score >= 90) { // <= 조건식에 score가 90점 이상이라면을 넣어보자
			int if_var1 = 100;  // if 지역안에 변수 선언 또는 초기화해보기. 사용해보기
			System.out.println("90점 이상이여서 장학금 받음." + if_var1);
			if (score == 100) {
				int if_var2 = 100;  // if - if 지역안에 변수 선언 또는 초기화해보기. 사용해보기
				System.out.println("전교 1등입니다" + if_var1 + if_var2);
			}
			// System.out.println(if_var2) if지역 밖에서 사용 불가 {}
		}
		// System.out.println(if_var1) if지역 밖에서 사용 불가 {}
		

		

		System.out.println("무조건 실행 됨.");

		// 코드 전체 선택 : ctrl + a
		// 코드 줄 정리 : ctrl + shift + f

	} // end Mainmethod
} // end Class
