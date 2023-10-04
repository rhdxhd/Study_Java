package exam.array;

import java.util.Arrays;

public class Ex02_Array {
//	swap이라는 개념을 이용해서 1차원 배열에 들어있는 int값들을
//	오름 차순으로 정렬 하는 프로그램을 작성하세요.어떤 식으로 해도 상관은 없습니다.
//	{ 3 , 5 ,7 , 9 , 1 , 2 , 4 , 10}; 배열 준비 예시.
//
//	배열 정렬 후 결과 : { 1 , 2 , 3, 4 , 5 , 6 , 7 , 8 , 9 , 10 } ;
	
	public static void main(String[] args) {
		int[] array = {3, 5, 7, 9, 1, 2, 4, 10};
		//어떤 데이터 sorting(정렬) ==> database asc(오름차순), desc(내림차순)
		Arrays.sort(array); //java8버전 이상에서만 가능하며 java외에 언어에서는 없는 경우가 있음.
		System.out.println("정렬: " + Arrays.toString(array));
		
		
		for(int i=0; i<array.length; i++) {  //디버깅으로 과정 봐보기
			for(int idx=0; idx<array.length; idx++) {
				if(array[i] > array[idx]) { //   > 오름차순,  < 내림차순
					int temp = array[i];
					array[i] = array[idx];
					array[idx] = temp;
				}
			}
			System.out.println(Arrays.toString(array));
		}
	}	
}


//{ 3 , 5 ,7 , 9 , 1 , 2 , 4 , 10}; 배열 준비 예시.
//  1(고정), 5, 7, 9, 3, 2, 4, 10
//  1(고정), 2(고정), 7, 9, 5, 3, 4, 10
//  1(고정), 2(고정), 3(고정), 9, 7, 5, 4, 10