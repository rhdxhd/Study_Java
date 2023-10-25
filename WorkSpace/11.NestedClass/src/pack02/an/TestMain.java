package pack02.an;

public class TestMain {
	public static void main(String[] args) {
		// TestClass에 있는 변수에 값 3을 할당. , 메소드 호출
		// 익명의 클래스 지역을 만들기. -> 일회성사용, {} 중괄호 사용
		TestClass tc = new TestClass() {
			int testField2 =30;
			@Override
			void testMethod() {
				//super.testMethod();
				System.out.println("익명의 지역에서 재정의" + testField2);
				
			}
		};
		tc.testField =3;
		tc.testMethod();

				
		
		//인터페이스도 인스턴스화가 가능함.
		//인터페이스의 규칙상 메소드는 반드시 구현되어 있어야함.
		TestInterface[] tiArr = new TestInterface[10]; // -> 배열도 가능
		TestInterface tiNull = null;	// -> 가능
		
		
		TestInterface ti = new TestInterface() {   //인터페이스를 상속받는 임시적으로 자식클래스를 만드는 것임.
				int num = 10;
				@Override
				public void method() {
					System.out.println("인터페이스 인스턴스화!" + num);
				}
		};  //중괄호 밖에 상위지역에 int num을 받을게 없기 때문에 일회성임.
			//인터페이스 상속받은 지역을 임시로 만들어 냈다..

		ti.method();
		
	}

}
