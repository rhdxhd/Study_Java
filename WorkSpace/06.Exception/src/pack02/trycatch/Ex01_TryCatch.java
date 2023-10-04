package pack02.trycatch;

public class Ex01_TryCatch {
	public static void main(String[] args) {
		String str = "10aa";
		
		//예외가 발생 할 것 같은 코드를 구분 할 수 있어야함
		//try블럭, catch블럭을 이용해서 개발자가 정한 방향으로 프로그램이 정상 작동
		//try{ 
			//예외 코드?
		//}catch(Exception e) {
			//오류발생 시 실행
		//}
		
		try {
			Double.parseDouble(str); // "10" -> 10.0
		}catch (Exception e) {
			System.out.println("오류 발생");
			System.out.println(e.getMessage()); // 예외 메세지 호출. 예외 메시지만 출력하고자 할 때 사용할 수 있음.
			e.printStackTrace(); // <=원래 나오던 오류코드를 출력함. 단, 앞에서랑은 다르게 프로그램은 중단되지 않음.
		}
		System.out.println(str);
		
	}
}
