package pack06.game;

import java.util.Scanner;

public class Ex01_HighLowGame {
	public static void main(String[] args) {
		//스캐너를 통해서 입력을 받는다. 입력 된 데이터는 변수에 저장.
		//스캐너를 통해 입력받은 값에 +10한 결과를 출력.
		//단, 입력은 반드시 숫자값만한다.
		
		//1.스캐너로 입력을 받아와서, 받은 값 출력하기
		//2.입력을 숫자만하고 출력하기.
		//3.바꾸기,
		//4.더해서 출력 -끝-

		//Scanner sc = new Scanner(System.in);
		//String str = sc.nextLine();
		
		//기본형 데이터 타입 : byte, short, int, long, float, double, boolean,  . . . 
		//String -> int, String, -> double: WrapperClass
		int intValue = Integer.parseInt("10"); //데이터 타입은 숫자로 변환하는 parse기능이 존재 
		System.out.println(intValue+10);
		System.out.println("10" + 10 + 10);
		System.out.println(10 + 10 + "10");
	
		
		//syso -> 콘솔창에 출력
		//scanner -> 콘솔창에 입력
		
		
		
		//Scanner sc = new Scanner(System.in);//스캐너의 초기화 식: int i = 1;
		//String str = sc.nextLine(); // sc.nextLine(); 이거는 내가 엔터칠때까지 기다린다라는 뜻
		
		
		
		
		
		 while(true) {
			 System.out.println("실행중...");
			 String str = sc.nextLine();
			 //사용자가 -1을 입력하면 종료가 되는 프로그램 만들기, 그전에는 계속해서 프로그램이 실행중.
		 }
	}

}
