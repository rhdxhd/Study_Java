
public class Ex07_Oper {
public static void main(String[] args) {
	//삼항 연산자: 4장에서 배우는 조건문(if)을 많이 이용해. 조건식을 비교 연산후 어떤 결과 값을 받고 싶을때 사용.
	//(if)를 쓰기 귀찮을때 삼항 연산자를 많이 사용함
	//조건식을 연산하여 true가 나올때, false가 나올때의 결과를 어떤 값으로 받고싶음.
	//ex) 1과2를 비교 후 참이 나오면 "참입니다", 거짓(false)이면 "참이 아닙니다!"라는 문자를 받고싶음
	// 조건식이 먼저 들어감. 물음표가 들어감.
	// 조건식(비교연산자) ? "참" : "거짓"

	int age = 10;
	String result = age == 10 ? "초딩3학년" : "초등3x" ;  // 초등3x-> 초등 3학년 아님
							//      "참"   :  "거짓"
	System.out.println(result);


	int score = 71; // A~ ... 등급
	// 사용 빈도가 낮기 때문에 외우거나 복습.
	String grade = score > 90 ? "A" : score > 80 ? "b" : score > 70 ? "C" : "E"; // 60점이라서 true에 해당하는 거없으면 E
	System.out.println(grade);



}
}
