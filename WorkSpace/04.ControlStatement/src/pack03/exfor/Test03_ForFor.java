package pack03.exfor;

public class Test03_ForFor {
	public static void main(String[] args) {
	// 문제1) 2단 부터 9단 까지의 결과를 출력하는 프로그램을 for문의 중첩을 이용하여 해결하기.
	// 문제2) for문 중첩을 이용하여 다음과 같은 모양이 나오게 한다.
	// 문제3) 별만들기
	
	for(int i=2; i<=9; i++) {
	 	for(int j = 1; j<=9; j++) {
	 		System.out.print(i + " x " + j + " = " + (i*j)+ "\t");
	 	}
	 	System.out.println();
	}


//	System.out.println();
//	for(int i = 1 ; i<=9 ; i++) {
//		System.out.print(3*i + " ");
//	}
//	System.out.println();
//	for(int i = 1 ; i<=9 ; i++) {
//		System.out.print(4*i + " ");
//	}
//	for(int i = 1 ; i<=9 ; i++) {
//		System.out.print(5*i + " ");
//	}
//	for(int i = 1 ; i<=9 ; i++) {
//		System.out.print(6*i + " ");
//	}
//	for(int i = 1 ; i<=9 ; i++) {
//		System.out.print(7*i + " ");
//	}
	
	
		
	for(int i = 10; i>1; i--) { //거의 안씀
		System.out.println(i);
	}
	
	
	
	
	
	//문제) for문 중첩을 이용하여 다음과 같은 모양이 나오게한다.
			//★
			//★★
			//★★★
			//★★★★
			//★★★★★
	
	
	
	for(int i = 0; i<5; i++) {
		for(int j=0; j<=i; j++) {  //조건식이 true일때 반복문은 반복을 계속한다. (어떠헤 하면 내가 원하는 만큼만 true를 만들까?)
			System.out.print("★");
		}
		System.out.println();
	}
	
	
	
	
	//문제3) 직접 풀어보기.
			//★★★★★
			//★★★★
			//★★★
			//★★
			//★
	
	
	
	for(int i = 5; i>=1; i--) { // i는 5부터 1씩 마이너스 -> 1까지
		for(int j=1; j<=i; j++) {
			System.out.print("★");
	}
	System.out.println(); //줄바꿈
	}
	
	}	
}

