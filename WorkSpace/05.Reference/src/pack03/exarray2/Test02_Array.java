package pack03.exarray2;

import java.util.Arrays;

public class Test02_Array {
	public static void main(String[] args) {
		//데이터타입[] 배열이름 = new 데이터타입[크기];
		//강아지, 진돗개, 불독, 시츄의 "문자열"을 요소로 가지는 배열을 만들고 출력 dogs, dogArr
		//페르시안, 고양이, 노르웨이의 문자열을 요소로 가지는 배열을 만들고 출력 cats, catArr
			
		// ↑ 두 배열을 요소로 가진 배열을 만들고 출력
		
		
		
		
		//String[]dogs = new String[4];
		//dogs[0] = "진돗개";
		String[] dogs = {"강아지", "진돗개", "불독", "시츄"};
		String[] cats = {"페르시안", "고양이", "노르웨이"};
		for(int i=0; i<dogs.length; i++) {
			System.out.println(dogs[i] + " ");
		}
		//java 외에 다른 언어에서는 없을 확률이큼. for문으로 정확히 출력이 쉬우면 쓰기.
		System.out.println(Arrays.toString(cats)); //for문 대신 쓸수있는건데, for문 먼저 익숙해지고 쓰기
		String[][] animals = { dogs, cats };
		String[][] animalArr = new String[2][];
		animalArr[0] = dogs;
		animalArr[1] = cats;
		for(int i=0; i<animals.length; i++) {
			for(int j=0; j<animals[i].length; j++) {
				System.out.println(animals[i][j] + " ");
			}
			System.out.println();
		}
		//String[][][][][] arr4 = new String[4][5][6][7][];
		//3차원 배열의 경우 잘 사용 안함 -> 다차원 배열이 있다 정도말 알기..
		//String[][][] arr3 = new String[3][2][4];
		//강아지 , 진돗개 , 불독 , 시츄 의 "문자열"을 요소로 가지는 배열을 만들고 출력 dogs , dogArr
		//페르시안 , 고양이 , 노르웨이 의 "문자열"을 요소로 가지는 배열을 만들고 출력 cats , catArr
				
		//↑두 배열을 요소로 가진 배열을 만들고 출력 ex)이름 animals , animalArr
		
		
		
	}
}
