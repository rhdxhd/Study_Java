package pack03.typechange;

public class Ex04_CastingFinish {
	public static void main(String[] args) {
		//
		String str_v1 = "3.14"; // -> double 형태로 변화 후 +1 해보기: 4.1400000..
		String str_v2 = "100" ; // -> int 형태로 변환 후 +100을 해보기 200
		
		//double형태로 저장 된 값 4.14를 int 변수에 담아보기.
		//↑사용되는 캐스팅은 무엇일까요?
		
		//int형태로 변환 된 200의 값을 short에 담아보기.
		//↑사용되는 캐스팅은 무엇일까요?
		String a = "1.1";
		double b =Double.parseDouble(a);
		System.out.println(b);
		System.out.println(2.2+b);
		String c="4";
		int d = Integer.parseInt(c);
		System.out.println(d+2);
		
		
		
		
	}

}
