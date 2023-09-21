package pack04.exwhile;

public class Test02_WhileFor {
		public static void main(String[] args) {
			//1.구구단 2~9단을 출력하는데 for문 1개 while문 1개를 써서 출력.
			
			
			for(int i=2; i<10; i++) {
				for(int j=1; j<10; j++) {
					System.out.println(i*j);
				}
			}
				
			
			
			
			
			int i = 2;
			while(i<10) {
				int j = 1;
				while(j<10) {
					System.out.println(i*j);
					j++;
				}
				i++;
			}
			
			
			
			
			

			for(int k=2; k<=9; k++) {
				int j = 1;
				while(j<=9) {
					System.out.println(k*j);
					j++;
				}
			}
			
			


			
			int k = 2;
			while(k<=9) {
				for(int j=1; j<=0; j++) {
					System.out.println(k*j);
				}
				k++;
			}
			
			
			
			
			
			
			
	}
}
