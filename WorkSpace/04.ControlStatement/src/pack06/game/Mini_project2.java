package pack06.game;

import java.util.Random;
import java.util.Scanner;

public class Mini_project2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.게임시작  2.게임종료");
			String inputNum = sc.nextLine();

			int inputNum1 = Integer.parseInt(inputNum);
			if (inputNum1 == 1) {
				System.out.println("게임시작");
				System.out.println("난이도를 선택하세요. 1.상  2.중  3.하");
				inputNum = sc.nextLine();
				inputNum1 = Integer.parseInt(inputNum);

				while (true) {
					Random u = new Random();
					int ranNum1 = 0;  // int는 null을 쓸수없으니까 임의의 숫자 아무거나 넣음. 여기서는 0을 넣음. 1도되고 2도되고.. 아무숫자나.
					if(inputNum1 ==3) {
						ranNum1 = u.nextInt(100) + 1;
						System.out.println("난이도 하를 선택하셨습니다.");
					}else if(inputNum1 == 2) {
						ranNum1 = u.nextInt(1000) + 1;
						System.out.println("난이도 중를 선택하셨습니다.");
					}else if(inputNum1 == 1) {
						ranNum1 = u.nextInt(1000) + 1;
						System.out.println("난이도 상를 선택하셨습니다.");
					}
					
					
					for (int i = 10; i >= 1; i--) { // 이부분 위치 생각하기
						System.out.println("숫자를 입력해주세요."); // 이부분
						String inputNum4 = sc.nextLine();
						int inputNum5 = Integer.parseInt(inputNum4);
						if (inputNum5 >= ranNum1) {
							System.out.println("Low");
							System.out.println("남은기회 : " + i);

						} else if (inputNum5 <= ranNum1) {
							System.out.println("High");
							System.out.println("남은기회 : " + i);
						} else if (inputNum5 == ranNum1) {
							System.out.println("정답");
							break;
						}
					}
					
//				         	↑↑↑↑    아래 3개 단락을 위에 처럼 간략하게 정리 가능					
//					if (inputNum1 == 3) {
//						Random u = new Random();
//						int ranNum1 = u.nextInt(100) + 1;
//						System.out.println("난이도 하를 선택하셨습니다.");
//						for (int i = 10; i >= 1; i--) { // 이부분 위치 생각하기
//							System.out.println("숫자를 입력해주세요."); // 이부분
//							String inputNum4 = sc.nextLine();
//							int inputNum5 = Integer.parseInt(inputNum4);
//							if (inputNum5 >= ranNum1) {
//								System.out.println("Low");
//								System.out.println("남은기회 : " + i);
//
//							} else if (inputNum5 <= ranNum1) {
//								System.out.println("High");
//								System.out.println("남은기회 : " + i);
//							} else if (inputNum5 == ranNum1) {
//								System.out.println("정답");
//								break;
//							}
//						}
//
//					} else if (inputNum1 == 2) {
//						Random u1 = new Random();
//						int ranNum2 = u1.nextInt(1000) + 1;
//						System.out.println("난이도 중을 선택하셨습니다.");
//						for (int i = 10; i >= 1; i--) {
//							System.out.println("숫자를 입력해주세요.");
//							String inputNum12 = sc.nextLine();
//							int inputNum13 = Integer.parseInt(inputNum12);
//							if (inputNum13 >= ranNum2) {
//								System.out.println("Low");
//								System.out.println("남은기회 : " + i);
//							} else if (inputNum13 <= ranNum2) {
//								System.out.println("High");
//								System.out.println("남은기회 : " + i);
//							} else if (inputNum13 == ranNum2) {
//								System.out.println("정답");
//								break;
//
//							}
//						}
//
//					} else if (inputNum1 == 1) {
//						Random u2 = new Random();
//						int ranNum3 = u2.nextInt(10000) + 1;
//						System.out.println("난이도 상을 선택하셨습니다.");
//						for (int i = 10; i >= 1; i--) {
//							System.out.println("숫자를 입력해주세요.");
//							String inputNum14 = sc.nextLine();
//							int inputNum15 = Integer.parseInt(inputNum14);
//							if (inputNum15 >= ranNum3) {
//								System.out.println("Low");
//								System.out.println("남은기회 : " + i);
//							} else if (inputNum15 <= ranNum3) {
//								System.out.println("High");
//								System.out.println("남은 기회 : " + i);
//							} else if (inputNum15 == ranNum3) {
//								System.out.println("정답");
//								break;
//							}
//						}
//					}
				}
			} else if (inputNum1 == 2) {
				System.out.println("게임종료");
				break;
			} else {
				System.out.println("1번 또는 2번을 입력하세요.");
			}
		}
	}
}
