package pack01.exif;

public class Test01_If {
	public static void main(String[] args) {
		int num = 9;
		//if문을 이용해서 num에 담김 숫자가 홀수인지 짝수인지를 판단하는 프로그램을 완성하세요.
		//if문을 두개 각가 다른지역으로 이용하여,
		
		//num의 값은 : n 입니다.
		//해당 숫자 n은 짝수 입니다.
		
		//num의 값은 : n 입니다.
		//해당 숫자 n은 홀수 입니다.
		
		System.out.println("num의 값은 : " + num + "입니다.");
				
		if(num%2 == 0) {
			System.out.println("짝수");
			System.out.println("해당 숫자 "+ num + "은 짝수 입니다.");
		}
		if(num%2 == 1) {
			System.out.println("홀수");
			System.out.println("해당 숫자 "+ num + "은 홀수 입니다.");
		}	
	}
}
