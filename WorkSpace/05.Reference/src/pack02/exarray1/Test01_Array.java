package pack02.exarray1;

public class Test01_Array {
	public static void main(String[] args) {
		//int형 데이터타입을 묶어놓은 배열 intArray를 선언한다.
		//intArray를 크기 10을 주고 초기화를 한다.
		//------------- ↓ 어려우면 하나씩 하드코딩해보기 ---------------
		//for문을 이용해서 전체 배열에 값을 할당한다.
		//for문을 이용해서 전체 배열에 값을 출력한다.
		//for문을 이용해서 전체 배열의 평균값을 출력한다.
		
		
		//데이터타입[] 변수명 = new 데이터타입[크기]
		
		int[] intArray = new int[10];  //10칸이 준비됨. int형 변수가 10개 있음. intArray[0]~intArray[9]
						//int num0 = 10;
//		intArray[0] = 10;
//		intArray[1] = 20;
//		intArray[2] = 30;
//		intArray[3] = 40;
//		intArray[4] = 50;
		System.out.println("변수 크기 : " + intArray.length);
		for(int i=0; i<intArray.length; i++) {
						//num0 =i;
			intArray[i] = i;
			
//			intArray[i]++;
//			++intArray[i];
						//syso(num0);
			
			sum += intArray[i];
			System.out.println(intArray[i]);
		}
		System.out.println(sum/intArray.length);	
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[] intArray;
		intArray = new int[10];
		
		intArray[0]=1;
		intArray[1]=2;
		intArray[2]=3;
		intArray[3]=4;
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
				
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		
		
	}
}
