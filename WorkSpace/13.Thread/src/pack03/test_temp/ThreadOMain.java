package pack03.test_temp;

import java.util.Scanner;

public class ThreadOMain {

	public static void main(String[] args) {

		ThreadO t1 = new ThreadO();
//		t1.start();
		
		for (int i = 1; i < 101; i++) {
			System.out.println("영화" + i + " 다운로드중");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("기타 오류");
			}
			
//		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine();
//		while (true) {
//			if (input.equals("영화")) {
//				Thread t1 = new ThreadO( new Runnable() {
//				 public void run() {
//					 System.out.println(getName() + "% 다운로드중");
//					 
//					 
//					 
//				 }
//				 };	
					
				}
				

			
		}


}