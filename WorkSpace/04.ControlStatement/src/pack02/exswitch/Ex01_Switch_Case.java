package pack02.exswitch;

public class Ex01_Switch_Case {
	public static void main(String[] args) {
		// 사용빈도가 상대적으로 if문 보다는 낮기 때문에 더 중요한 것은 "if문"
		// 선택문 이라고함 (switch - case)
		// 다중 if문 (if else-if)를 간략하게 표현
		// 값을 기준으로만 판단이 가능함. (복잡한 조건에는 사용이 까다롭다. ) <= 이런 제한 사항때문에 실무에서는 많이 사용 안함
		// 정해진 메뉴가 숫자 또는 정확한 문자로 되어있는 경우 가끔 사용함
		// switch ( 기준값 ) != if(조건식)   //   (참고 : if는 조건식)
		// case 값 : 
		// 값이 case (값)과 같은 경우 실행
		// break; <= 종료시킴. (제어문의 탈출. 가장 가까운 제어문의 중괄호 블럭킹 빠져나감. break를 까먹으면 아래 조건도 계속 실행시킴)
		int number = 10;
		switch(number%2) { // 1은 홀수, 0은 짝수
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
			
						
			
			// 3의 배수인지도 같이 판단이 가능할까? 가능하다면 풀어보기. (삼항연사자 사용하지말고 풀어보기)
		
			
			
			
		} // switch지역
	}
}
