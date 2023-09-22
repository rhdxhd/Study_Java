package pack06.game;

import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class Mini_Project {
	public static void main(String[] args) {

		
//		첫 미니 프로젝트 자바
//		//Scanner sc = new Scanner(System.in);
//		//Random r = new Random();
//		//1.이 프로그램은 무한반복하는 프로그램 입니다.
//		//콘솔창(1.게임시작 , -1.게임종료)
//		//2.1번을 누르면 게임을 시작하고 -1을 입력하면 게임을 종료한다.
//		//enter Key를 누르면!
//		//컴퓨터가 주사위를 굴립니다. r.nextInt(6)+1;
//		//enter Key를 누르면!
//		//사용자가 주사위를 굴립니다. r.nextInt(6)+1;
//		//눈금이 더 높은 팀이 이기는 게임입니다.
//
//		+ 기능 추가 자유.
	
		
		
		Scanner sc = new Scanner(System.in);
		
						
		
		while(true) {
			System.out.println("1.게임시작, -1.게임종료");
			
			String str = sc.nextLine();
			//int userNum = Integer.parseInt(sc.nextLine());    => 위아래줄 두줄 합쳐서 이렇게 한줄로 사용도 가능함
			int userNum = Integer.parseInt(str);
			if(userNum == -1) {
				System.out.println("-1. 게임종료");
				break;
			}else if (userNum == 1) {
				System.out.println("1. 게임시작");
				System.out.println("게임을 시작합니다.");
				
				
				
				System.out.println("컴퓨터가 주사위를 굴립니다. 엔터키를 눌러주세요.");
				sc.nextLine();
				Random r1 = new Random();
				int randomNumber1 = r1.nextInt(6)+1; //r1 사용
				System.out.println("컴퓨터 숫자: " + randomNumber1);
				
				
				System.out.println();
				System.out.println("엔터키를 눌러 사용자가 주사위를 굴려주세요.");
				sc.nextLine();
				int userNum1 = r1.nextInt(6)+1;	 //r1 재사용 가능							
				System.out.println("사용자 숫자: " + userNum1);
				
				
				System.out.println();
					if(randomNumber1 > userNum1) {
						System.out.println("컴퓨터가 이겼습니다.");
						break;
						}else if (randomNumber1 < userNum1) {
							System.out.println("사용자가 이겼습니다.");
							break;
						} else {
							System.out.println("비겼습니다. 다시하려면 1번 / 종료하려면-1번");
						}	
					

			} else {
				System.out.println("1 또는 -1을 입력하세요.");
				
			} // else
			
	
			
			
} //while	
} //main
}// class
