package pack02.threadattr;

import java.util.Scanner;

public class XxxThreadMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
		XxxThread thread = new XxxThread(number);
		thread.start();
	}
}