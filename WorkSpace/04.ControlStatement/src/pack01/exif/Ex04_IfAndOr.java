package pack01.exif;

public class Ex04_IfAndOr {
public static void main(String[] args) {
	//조건식 : 반드시 true, false를 반환 받는 식.
	// boolean에 담을 수 있는 값. (==조건식)
	
//	int score = 91;
//	boolean isCheckUp90 = score >=90;
//	boolean isCheckUp80 = score >=80;
//	if(isCheckUp90 && isCheckUp80) {
//		System.out.println("A");
//	}else if(isCheckUp90 || isCheckUp80) {
//		System.out.println("B");
//	}else {
//		System.out.println("A B X");
//	}
	
	
	int number = 10;
	//홀수 인지, 짝수 인지 판단. + 조건식의 연결을 통해, 3의 배수인지 여부도 같이 출력.
	// 						+ if문 중첩을 이용하여,
	//number 9 : 홀수 이며, 3의 배수임.
	//number 10 : 짝수 이며, 3의 배수 아님.
	
	
	
		//1번째 방법
		//1. 삼항 연산자 활용.
	String result = number % 3 == 0 ? "3배수" : "3배수x" ;
	if(number%2 == 0) {
		System.out.println("짝수" + result);
		//2.삼항 연산자 가독성 없어서 잘 사용 x (삼항 연산자는 가독성이 떨어짐)
		//System.out.println("짝수" + (number % 3 == 0 ? "3배수" : "3배수x"));
	}else {
		System.out.println("홀수" + result);
		//2.삼항 연산자 가독성 없어서 잘 사용 x (삼항 연산자는 가독성이 떨어짐
		//System.out.println("홀수"+ (number % 3 == 0 ? "3배수" : "3배수x"));
	}
	
	
	
	
	
	//2번째 방법
	if(number%2==0 && number%3==0) {
		System.out.println("짝수, 3의배수");
	}else if (number%2==1 && number%3==0) {
		System.out.println("홀수, 3의배수");
	}else if (number%2==0 && number%3!=0) {
		System.out.println("짝수, 3의배수 아님");
	}else if (number%2==1 && number%3!=0) {
		System.out.println("홀수, 3의배수 아님");
	}
	
	
	
	
	//3번째 방법
	if(number%2 == 0) {
		//System.out.println("짝수");
		if(number%3 == 0) {
			System.out.println("짝수 3o");
		}else {
			System.out.println("짝수 3x");
		}
	}else {
		if(number%3 == 0 ) {
			System.out.println("홀수 3o");
		}else {
			System.out.println("홀수 3x");
		}
	}
	
	
	
	
	
	
	
	
}
}
