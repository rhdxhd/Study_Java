package pack02.trycatch;

public class Ex02_TryCatchFinal {
	public static void main(String[] args) {

		try {
			System.out.println("코드1");
			System.out.println("코드2");
		} catch (Exception e) {
			// try의 코드가 예외를(오류) 발생했을때 실행
			System.out.println("코드3");
		} finally {
			// 무조건 실행되어야 하는 코드를 넣어줌.
			System.out.println("코드4");
		}
		
		
		
		try {
			System.out.println("1.물조절");
			System.out.println("2.가스불 ON");
			System.out.println(0/0);  //이걸 넣으면 오류 발생
//			System.out.println("3.가스불 OFF");   중복된 부분 finally에 한번만 적음
//			System.out.println("4.종료(요리 끝 식사)");
		} catch (Exception e) {
			// try의 코드가 예외를(오류) 발생했을때 실행
			System.out.println("예외 발생(물넘침 이슈)");
//			System.out.println("3.가스불 OFF");   중복된 부분 finally에 한번만 적음
//			System.out.println("4.종료");
		} finally {
			// 무조건 실행되어야 하는 코드를 넣어줌.
			System.out.println("3.가스불 OFF");
			System.out.println("4.종료");
		}	
	}
}