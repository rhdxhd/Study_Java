package pack05.etc;

public class Ex03_Continue {
	public static void main(String[] args) {
		//continue : 계속한다. ( to be continue -> 다음에 계속 )
		//-> 반복문을 종료한게 아니라, continue 밑의 코드를 실행하지 않고 -> 반복문을 계속 하는것.
		//n%2 == 0,1
		System.out.println(-3%2);
		// & : 1 2 4 8 16 32 64 128 256 512 1024 . . .
		// 1: 0001 -> 홀수는 1로 끝나고 짝수는 0으로 끝나네-> 000 1 * 1 = 1
		// 2: 0010 -> 홀수는 1로 끝나고 짝수는 0으로 끝나네-> 001 0 * 1 = 0
		// 3: 0011 -> 홀수는 1로 끝나고 짝수는 0으로 끝나네-> 001 1 * 1 = 1
		// 4: 0100 -> 홀수는 1로 끝나고 짝수는 0으로 끝나네-> 010 0 * 1 = 1
		// 5: 0101 -> 홀수는 1로 끝나고 짝수는 0으로 끝나네-> 010 1 * 1 = 1  // 이걸 이용하면 마이너스에(음수) 대한 홀짝 처리 가능해진다.
		
		
		int oddSum = 0; //홀수의 누적합
		for(int i=1; i<=10; i++) {
			if((i&1)!=1) {
				continue;
			}
			oddSum += i;
		}
		System.out.println(oddSum);
		
		
		
				
		
		
		
		
		
	}
}