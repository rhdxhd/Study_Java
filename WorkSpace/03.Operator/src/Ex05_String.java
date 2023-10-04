
public class Ex05_String {
	public static void main(String[] args) {
		String str1 = "JDK" + 11 + 1.5 ; // =>str에는 어떤값이 담겼을까?
		String str2 = 1.2 + 11 + "JDk" ; //

	System.err.println(str1);
	System.err.println(str2);
	
	// 연산 순서는 현실과 같음. 연산은 왼쪽에서부터 오른쪽으로 한다.
	
	
	
	    String str3 = "JDK" + (11 + 1.5);
	    System.out.println(str3);
	    // 가로를 활용하면 숫자먼저 계산됨.
	    
	    
	}

}
