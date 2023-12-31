package pack04.lamda;

public class Main {
	public static void main(String[] args) {	
		//1.()파라메터부
		//2.->
		//3.{}
		
		LamdaInter lamda = new LamdaInter() {
			 @Override
			public void method(Object o, Object o2) {
				System.out.println("람다 메소드"+o);
				
			}
		};
		
		lamda.method("", "");
		//인터페이스의 구조를 정확히 모르는 사람은 해독하는게 힘듬. (가독성은 없지만, 코드가 줄어듬)
		lamda = (o, o2)->{
			System.out.println("람다 메소드"+o);
		};
		
		lamda.method("", "");
		//자료구조.forEach(dto-> 코드부   )
		//String[] arrs = new String[]{"1","2"};
		//arrs.
		
		// ↓ 이런 forEach형식에서도 소괄호 방향키 이런식으로 쓸수있음.
		// 소괄호 방향키 이런게 정렬방식에서도 나옴	
	}

}
