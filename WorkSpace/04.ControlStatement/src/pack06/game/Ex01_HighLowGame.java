package pack06.game;

import java.util.Random;
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
		
				
		
		Scanner sc = new Scanner(System.in);  // '스캐너 불러온다'라는 고정식 // sc는 바꿀수있음.

		 while(true) { // 하루종일 돌아간다.. 무한반복인데 종료하고싶으면 break를 넣어라.
			 System.out.println("실행중...");
			 String str = sc.nextLine(); //엔터를 쳐야지 내가 입력한 str을 다음으로 진행하겠다.보여주겠다.
			 //.nextLine(); 이것은 무조건 문자열로 String 받아서 숫자로 바꿔줘야함.
			 
			 // System.out.println(str+1);
			 
			 int userNum = Integer.parseInt(str); // 입력없이 엔터치면 오류: 입력된 문자열이 없는데 숫자로 바꿔야해서 오류남
			 System.out.println(userNum+1);
			 if(userNum == -1) {
				 System.out.println("프로그램을 종료 합니다.");
				 break;
			 }
			 //사용자가 -1을 입력하면 종료가 되는 프로그램 만들기, 그전에는 계속해서 프로그램이 실행중.
		 }
		 
		 
		 
		 
		 
		 
		 
		 

		 // Scanner sc = new Scanner(System.in);   위에서 썼기 때문에 자동적용. 위에 안썼으면 써야함.
		 Random random = new Random(); // Random 초기화식 : Random이라는 기능을 쓰겠다 !
		 // Random 기능으로 뽑아서 그 숫자를 누군가 받아줘야함. int에서 받아주겠다. -> 숫자로 변환해야함
		 int randomNumber = random.nextInt(100)+1; //1~100    (.nextInt(100) -> 0~99 ; 0부터 99까지 뽑겠다. 100가지)
		 System.out.println(randomNumber); //컴퓨터가 랜덤으로 뽑은수에서 +1 한것을 출력해줌(위에서 +1해서)
		 System.out.println("하이로우게임 입니다. 랜덤한 숫자를 맞춰주세요");
		 while(true) { // 하루종일 돌아라. break까지
			 System.out.println("숫자를 입력해주세요");
			 String str = sc.nextLine(); //여기에 멈춰있는 상태,  sc.nextLine(); 문자열로 받음. 숫자로 바꿔야함
			 int userNum = Integer.parseInt(str);
			 if(randomNumber == userNum) {
				 System.out.println("정답! 축하");
				 break;
			 }else if(randomNumber > userNum) {
				 System.out.println("High!");
			 }else if(randomNumber < userNum) { //여기서 else만 쓰면 뒤에 if가 안나와서 조건을 못씀.
				 System.out.println("Low!");
			 }
			 
		 }
			 
			 
//			 if(userNum == -1) {
//				 System.out.println("프로그램을 종료 합니다.");
//				 break;
//			 }else if(userNum==1) {
//			 }
//			 
//			 
	 
	
		 
		 
		 
		 // 시도횟수
		 // 게임시작, 종료
		 // 1~100까지가 아니라 사용자가 입력한 난이도만큼 범위 커스텀
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
