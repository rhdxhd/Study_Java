package pack02.exarray1;

public class Test02_Array {
	public static void main(String[] args) {
		// 1. 구구단의 2단 결과를 모두 저장할수있는 배열을 자유롭게 만들고, 저장 후 출력하기
		// 2~18 <- 모두 저장 되어야함
		int[] gugudanArr = new int[9];
		gugudanArr[0] = 2;
		gugudanArr[1] = 4;
		gugudanArr[2] = 6;
		gugudanArr[3] = 8;
		gugudanArr[4] = 10; // i(0) -> 8
		for (int i = 0; i < gugudanArr.length; i++) {
			gugudanArr[i] = (i + 1) * 2; // 1~9, +1 <-0~8
		}
		System.out.println("여기에 브레이크"); // 여기서 디버그 이용하면 전체 과정 쭉 볼수있음

		// 2. 배열을 이용하여, 배열에 다음의 값들이 for문을 이용해서 저장 되게 하고 출력하기.
		// 0 : ★
		// 1 : ★★
		// 2 : ★★★
		// 3 : ★★★★
		// 4 : ★★★★★

		String[] starArr = new String[5];
		for (int i = 0; i < starArr.length; i++) {
			if (i == 0) {
				starArr[i] = "★";
			} else {
				starArr[i] = starArr[i - 1] + "★";
			}
		}
		System.out.println("");
		for (int i = 1; i < starArr.length; i++) {
			String star = "";
			for (int j = 0; j < i; j++) {
				star += "★";
			}
			starArr[i - 1] = star;
		}
	}
}
