package pack02.variabletype;

public class Ex02_Decimal {
	public static void main(String[] args) {
		short short1;
		int int1;
		long long1;
		
		short1 = 32767;
		int1 = 1234567890;
		long1 = 12345678901L;//long타입 뒤에는 int가(자동으로 int로 인식하기때문) 아니라 Long이다 라는
							 //구분자로 'L'을 붙인다. (소문자도 되지만 헷갈리기 때문에 대문자사용)
		
		System.out.println(short1);
		System.out.println(int1);
		System.out.println(long1);
		
		
		char char1 = 65535;
		System.out.println(char1);
		System.out.println("chart1은 왜 출력이 안됨??");
		
	}
}
