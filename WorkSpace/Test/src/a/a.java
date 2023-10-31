package a;

import java.util.concurrent.ForkJoinTask;

public class a {
	public static void main(String[] args) {
		
		Object obj = new String("A");

		System.out.println(obj instanceof String);
		String a = (String) obj; // a는 스트링에 해당하는 메소드들을 쓸수있음.
		// object자체로 기능하는게 아니고 실제 객체는 a이고 a는 object로 가는 주소를 가지고있고,
		// obj가 a에게 객체에 대한 주소를 넘겨준것.
		
		obj = new int[5]; // obj는 인트배열의 기능은 못쓰지만 (자식요소에대한)배열의 주소는 가지고있음.
		// 실제로 쓸려면 아래와 같이 ↓ 다른곳에 넣어야 쓸수있다.
		int[] arry = (int[]) obj; // (처음에 만들어질때 배열에 만들어져서) 배열에 넣고 쓰라.
		System.out.println(arry.length);
		// obj.length -> 오류남
		// String a = (String) obj;
		// obj.substring -> 오류남. substring은 스트링이 쓸수 있는 기능중에 하나임.
		String str = new String("B");
		// new int[5]에 대한 주소 -> obj담고 -> obj를 새로운 arry담아서 기능을 씀
	}
	
	static void b(Object o) {
		if (o instanceof String) {
			String str = (String) o;
			System.out.println("스트링 길이 출력:" + str.length());
		} else if (o instanceof int[]) {
			int[] arrs = (int[]) o;
			System.out.println("배열 길이 출력:" + arrs.length);
		}
	}
}