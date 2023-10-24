package pack01.nested;

public class Nested {
	// 멤버 : 클래스의 중괄호 사이의 모든 것 -> 변수, 메소드, 클래스 등
	// 멤버의 종류 :
	// 1. 인스턴스 멤버(스태틱이 안붙은거) : 클래스가 인스턴스화(객체) 과정을 거쳐야만 사용가능
	// 접근방법: 객체. (점찍으면 다 나옴)
	// 2. 스태틱 멤버 : 클래스에 접근만 하면 사용 가능.
	// 접근방법: 클래스. (점찍으면 다 나옴)
	// 구분하는 방법 :

	
	
	public int field; // -> 필드라고함. (깊이 들어가자면 객체도 될 수 있음) , 필드: 전역변수. 변수 선언해놓은.
	// 지역변수는 필드가 아님. 지역변수는 메소드의 멤버임.

	public void method() {
		System.out.println("메소드1" + field2);
	}

	
	
	// Nested nas = new Nested(); ->만약에 method2안에 말고 전역으로 빼면 오류 나는 이유는
	// static은 이미 메모리에 올라가 있기때문에, 위에서 아래로 가는 순서 상관없이 이미 그 이전에 메모리에 올라가 있는것임.
	// 그래서 static위에 Nested nas = new Nested();이걸쓰더라도 이미 static이 올라가 있는 상태라 오류가 남

	public static int field2; // -> 다른클래스에서 같은 이름의 스태틱 변수(field2) 만들 수 있음. 대신 앞에 클래스 이름이 다름.

	public static void method2() {
		Nested nas = new Nested();
		System.out.println("메소드2" + nas.field);
	}
	
	
	
	
	
	
	
		
	
	
	// 인스턴스 멤버 : 인스턴스 클래스
	public class NesInner {
		
		public NesInner() {
		}

		// public static sField1;  //-> 오류 왜날까 ?
		String iField;

		public void iMethod() {
			System.out.println("iMethod");
		}
	}

		
	// 스태틱 멤버 : 스태틱 클래스
	public static class NesInner2 {
		static String sField2 = "ON";
		String iField;

		public void iMethod() {
			System.out.println("static");
		}
	}

	
	
	
	
	
	
	
	
	
	
	public void nesIneer3() {
		class NesInner3 {
			String iField;

			public void iMethod() {
				System.out.println("메소드");
			}
		}
//nesIneer3은 여기다가 만들면됨.
		NesInner3 nes = new NesInner3();
		nes.iField = "lv";
		nes.iMethod();  // -> 불러와서 위에 iMethod()실행됨. 그 안에 syso출력됨.
		System.out.println(nes.iField);
	}

	
	
	public void method4() { // <-이런경우 어떻게 했나 생각하면서 method3 해보기.
		int num = 10;
	}

	
	
	
	
	
	
	
	


}
