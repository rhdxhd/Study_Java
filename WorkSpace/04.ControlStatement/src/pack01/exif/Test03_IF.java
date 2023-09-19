package pack01.exif;

public class Test03_IF {
	public static void main(String[] args) {
		//char를 이용한 혈액형 분별 프로그램
		
		char bloodType = 'A'; // <= html, android등의 다른 플랫폰에서 오는 데이터 ? 
		
		if(bloodType == 'A' ) {
			System.out.println("A형 : 조금 소심");
		}else if(bloodType == 'B' ) {
			System.out.println("B형 : 조금 활발 ");
		}else if(bloodType =='O') {
			System.out.println("O형 : 조금 깐깐");
		}else {	
			System.out.println("AB형 또는 잘못된 입력");
		}
		
		
			// 내가 알고있는 대부분의 지역은 중첩이 가능하다.
			// ctrl + a : 전체 코드 마킹
			// ctrl + shift + f : 코드 줄 정리
			

	}
}
