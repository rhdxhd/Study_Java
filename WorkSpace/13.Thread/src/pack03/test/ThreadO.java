package pack03.test;

import java.util.Scanner;

public class ThreadO extends Thread{
	public ThreadO() {
		setName("ThreadO");
	}
	
	
	@Override
	public void run() {
		for (int i = 1; i =< 100; i++) {
			System.out.println(getName() + " 실행중");
		}
		
	}
	
	}


