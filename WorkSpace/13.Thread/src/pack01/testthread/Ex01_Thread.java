package pack01.testthread;

import java.awt.Toolkit;

public class Ex01_Thread {
	//자바 애플리케이션이 실행되는 동안은 Thread라는 객체가 동작
	//Window로 부터 소리를 제공받아 사용 (Toolkit) : 별로 중요하지 않음. 공부x
	
	public static void main(String[] args) {
		Toolkit tookit = Toolkit.getDefaultToolkit();
		tookit.beep();
		//for문은 컴퓨터 속도에 따라 차이가 있지만 0.0001초 내 5번 동작
		//Thread.sleep : 동작중인 프로세스를 휴지 시킴(잠깐 딜레이)  : 1000    -> 천이 일초임
		for (int i = 0; i < 5; i++) {
			tookit.beep();
			System.out.println("띠로롱");
			try {
				//진행중인 쓰레드(작업)이 슬립을 만났을때 오류가 생길 가능성이 있음 -> 강제로 try{}catch{}
				//File (IO)
				Thread.sleep(1000 * 2); // -> 2초 쉬어라
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
