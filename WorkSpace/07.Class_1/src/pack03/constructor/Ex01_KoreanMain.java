package pack03.constructor;

import java.util.Scanner;

public class Ex01_KoreanMain {
	
	//ctrl + click
	public static void main(String[] args) {
		Ex01_Korean korean1 = new Ex01_Korean("123456-7891234","홍길동");
		System.out.println(korean1.nation);
	
		System.out.println(korean1.name + korean1.ssn);
		
		Ex01_Korean korean2 = new Ex01_Korean("123456-987654","이철수");
		System.out.println(korean2.ssn);
		
	}
}