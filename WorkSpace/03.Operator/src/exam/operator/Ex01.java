package exam.operator;

public class Ex01 {
	public static void main(String[] args) {
		int num1=2, num2=4 ;
		//변수는 대입 연산자, 복합 대입연산자 또는 증감식을 제외하고 내요이 절대 안바뀜.
		//1. num1과num2의 사칙연산과 나머지를 구하기 (연산식으로 결과 출력)
		//(출력)
		System.out.println("num1+num2="+ (num1+num2));
		System.out.println("num1-num2="+ (num1-num2));
		System.out.println("num1*num2="+ (num1*num2));
		System.out.println("num1/num2="+ (num1/num2));
		System.out.println("num1%num2="+ (num1%num2));
		
		//2. num1을 마이너스로 반전 시키고 출력하기. 출력 후에는 다시 양수 2로 반전 시키기.
		num1 = -num1;
		System.out.println(num1);
		num1 = -num1;
		System.out.println(num1);
		System.out.println("num1:"+ num1 + "  num2:" + num2);
		
		//3. num1을 증감식을 이용하여 1증가 시키고 num2는 증감식을 이용하여 1마이너스 시키기.
		num1++; // 기존 변수에 +1
		num2--; // 기존 변수에 -1
		System.out.println(num1);
		System.out.println(num2);
		 
		System.out.println(++num1); //선행 먼저 증감식 실행 후 해당 코드줄에있는 명령어 실행 
		System.out.println(num2--); // 후행은 출력 후 나중에 명령어 실행. 출력을하고 내가 하는 명령을 나중에 실행.
		System.out.println(num2);
		
		//4. 비교 연산자 3가지를 이용하여 두 변수를 비교하고 결과를 출력하기.
		// ==(같다), !=(다르다), <(초과), >(미만), <=(이상), >=(이하)
		System.out.println("num1==num2 " + (num1==num2));
		System.out.println("num1!=num2 " + (num1!=num2));
		System.out.println("num1<num2 " + (num1<num2));
		
		boolean ex1 = 1 < 4;
		System.out.println(ex1);
		
		boolean ex2 = 2 > 4;
		System.out.println(ex2);
		
		boolean ex3 = 3 >= 2;
		System.out.println(ex3);
		
		//5. 비교 연산자 1개를 사용하는데 AND또는 OR연산자를 이용하여 비교 연산자 1개를 더 연결 시키고 결과출력
		System.out.println("num1==num2 && num1!=num2 " + (num1==num2 && num1!=num2));
		
		boolean ex4 = 1 > 7 && 2 <= 4;
		System.out.println(ex4);
		
		boolean ex5 = 1 > 7 || 2 <= 4;
		System.out.println(ex5);
		
		
		//6. 복합 대입연산자 또는 변수의 현재값에 1을 더하기 (num1,num2 둘다 적용)
		num1 = num1 + 1; //변수에 1 더하기
		num2+=1; // 복합대입연산자
		System.out.println(num1);
		System.out.println(num2);
		
		//7. 삼항 연산자 하나를 이용하여 비교하고 그 결과를 String형태로 받아서 결과 출력
		
		String resultStr = (num1==num2) ? "같다" : (num1>num2) ? "num1큼" : "num2큼" ;
		System.out.println(resultStr);
		
		
		int score = 100;
		String result = score == 100 ? "합격" : "불합격" ;
		System.out.println(result);
		
		
		int score1 = 80;
		String result1 = score1 >= 90 ? "합격" : score1 >= 80 ? "대기" : "불합격" ;
		System.out.println(result1);
	
		String score2;
		score2 = 8 > 9 ? "참" : "거짓" ;
		System.out.println(score2);
		
		String v3;
		v3 = 15+"";
		System.out.println(v3);
	}

}
