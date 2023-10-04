package pack01.exceptioncode;

import java.text.ParseException;

public class Ex02_Number {
	public static void main(String[] args) {
		// 1. 숫자 외에 값을 숫자로 바꾸려고 하면 오류가 발생(예외)
		//WrapperClass, 대문자로 시작하는 Double.parseDouble("3.14");
		String str = "ㅠㅜㅜ"; //경우의 수가 많은 경우 -> try catch 사용하면 됨.
		if(str.equals("ㅠㅜ")) {
			
		}else {
			Double.parseDouble(str);  // 형식상으로 str를 숫자로 바꾸는 식자체는 문제가 없지만, 내용상으로 str이 문자인데, (ㅠㅜㅜ)가 숫자가 될 수 없음.
									  // 문자 "10"인 경우는 숫자로 바꾸면 10인데, 이것은 숫자가 될 수 있음.
		}
				
		// 2. 어떤수를 0으로 나누려고 하면 오류가 발생(예외)
		// 코드가 있는 상태에서 if문으로 오류가 안나게 수정해보기
		int number2 = 0;
		if (number2 != 0) {
			System.out.println(10 / number2);
		} else {
			System.out.println("0이기 때문에 나누기 안됨. by zero 오류 발생");
		}
	}
}
