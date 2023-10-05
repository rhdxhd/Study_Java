

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.수동모드 2.자동모드");
		String opt = sc.nextLine();
		if (opt.equals("1")) {
			System.out.println("숫자를 6번 입력하세요");
			int[] numbers = new int[6];
			for (int j = 0; j < numbers.length; j++) {
				int Num = Integer.parseInt(sc.nextLine());
				numbers[j] = Num;
			}
			System.out.println(Arrays.toString(numbers));
			} else if (opt.equals("2")) {
			int[] arry = new int[6];
			for (int i = 0; i < 6; i++) {
				Random random = new Random();
				int ran = random.nextInt(44) + 1;
				arry[i] = ran;
			
			
			
			}
			System.out.println(Arrays.toString(arry));
		}

		int[] arry = new int[6];
		for (int i = 0; i < 6; i++) {
			Random random = new Random();
			int ran = random.nextInt(44) + 1;
			arry[i] = ran;
		}
		System.out.println("로또번호");
		System.out.println(Arrays.toString(arry));

	}
}
