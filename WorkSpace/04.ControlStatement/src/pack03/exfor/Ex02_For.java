package pack03.exfor;

public class Ex02_For {
	public static void main(String[] args) {
		//(for문을 안보고) 1~20까지 반복하는 for문 만들기
		//콘솔에 숫자 1~20나오면 성공!
		//print <- 옆으로 출력(줄바꿈안함)
		for(int i = 1; i<21; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i = 1; i<=20; i++) {
			System.out.println(i);
		}
				
		//for문 내부에 조건문을 이용하여 홀수인지 짝수인지를 숫자 뒤에 붙여서 출력해보기.
		//ex) 1 홀수
		//	  2 짝수
		//조건문 if로 한번 풀기
		//switch로 한번 풀기		
		
		for(int i=1; i<=20; i++) {
			if(i%2==1) {
			System.out.print(i + " 홀수 ");
		}else {
			System.out.println(i + " 짝수 ");
		}
		}

		for(int i=1; i<21; i++) {
		switch(i%2) {
		case 1:
			System.out.println(i+"홀수");
			break;
		default:
			System.out.println(i+"짝수");
			break;
		}
		}		
}
}
