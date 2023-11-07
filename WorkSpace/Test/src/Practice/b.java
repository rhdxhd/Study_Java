package Practice;

import java.util.ArrayList;

public class b {
	public static void main(String[] args) {
		Object o;
		String st="안녕";
		int[] in= {1,2,3};
		ArrayList<Integer> ai = new ArrayList<>();
		o = st;
		b(o);
		
		b(in);
		b(ai);
	}
	
	
	static void b(Object o) {
		if(o instanceof String) {
			String str = (String)o; // 메소드 중 처리하는 하나의 과정으로 역할함.
			System.out.println("스트링 길이 출력:" + str.length());
		}else if (o instanceof int[]) {
			int[] arrs = (int[])o;
			System.out.println("배열 길이 출력:" + arrs.length);
		}else {
			System.out.println("에러");
		}
	}	
}