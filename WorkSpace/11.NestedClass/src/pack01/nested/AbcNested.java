package pack01.nested;

import pack01.nested.AbcNested.Abc1.Test.Test_Sub; //외부에 있는 클래스를 여기서 쓰겠다. 경로지정

public class AbcNested {
	public static class Abc1 {
		public class Test{
			public class Test_Sub{
				public int test = 10;
				public void method() {
					System.out.println("메인에서 test 변수랑 method호출해보기");
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Test_Sub sub = new AbcNested.Abc1().new Test().new Test_Sub();
		sub.method();
	}
	
	
	
	
	
	
}
