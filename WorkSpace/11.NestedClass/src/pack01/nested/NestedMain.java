package pack01.nested;

import pack01.nested.Nested.NesInner;
import pack01.nested.Nested.NesInner2;

public class NestedMain {
	public static void main(String[] args) {
		
	//static은 항상 메모리에 먼저 올라가는 성질이 있음 -> 바로 사용
	Nested.field2 = 10;  // 스태틱 클래스이름.
	Nested.method2();

	
	
	
	//인스턴스 멤버 접근 방법
	Nested nas = new Nested(); // -> 1.인스턴스멤버 호출가능 하게 함 // 인스턴스화한 변수 nas는 객체임
	nas.field = 20;
	nas.method();
	
	
	
	
	
	
	
	NesInner nes = nas.new NesInner(); //-> 2.클래스 안에 클래스 호출할때 1,2번 만들면됨.
		// NesInner naa = new Nested().new NesInner(); // <- 위에 1번 Nested nas = new Nested(); 객체 안만들었으면 1,2과정 한번에 이렇게 한줄로 쓰면됨.
	
	nes.iField = "ABC";
	nes.iMethod();
	
	
	
	
	
	System.out.println(NesInner2.sField2);  // = System.out.println(Nested.NesInner2.sField2);
	NesInner2 nes2 = new Nested.NesInner2();
	nes2.iField = "ABC";
	nes2.iMethod();
	
	}
}