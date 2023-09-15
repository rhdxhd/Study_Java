
public class Ex08_Oper {
public static void main(String[] args) {
	//복합대입연산자. (대입) =< - 어떤 변수에 값을 할당 할때 사용함.
	
	int result = 0 ;
	// result =result + 10; // 변수에은  0+ 10의 결과가 할당.
	result +=10 ; // int x
	System.out.println(result); // 원래 resurlt는 0인데, 원래 result 0에다가 10을 더해, result(10+10)
	result -=5 ; //원래 내가 가지고있던 값에다가 -5를 하겠다 ; result = result -5;
	System.out.println(result);
	result *=3; // result = result *3;
	System.out.println(result);
	result /=5;
	System.out.println(result);
	result %=2; //2로 나눴을때 나머지가 몇이 남냐
	System.out.println(result);
	
	
	
}
}
