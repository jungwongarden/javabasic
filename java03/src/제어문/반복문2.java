package 제어문;

public class 반복문2 {

	public static void main(String[] args) {
		//횟수 지정해서 반복하는 경우 : for문
		//컨트롤+스페이스바 : 자동완성 기능
		//특정한 횟수만큼 반복하고자 하는 경우의 i변수의 역할 
		//=> 횟수를 카운트해주는 역할
		//for(시작값;조건식;증감식){
		//   반복할 내용
		//}
		for (int i = 0; i < 3; i++) { //i++: 증감연산자
			System.out.println("반복문입니다..>> " + i);
		}
		
		//내이름을 500번 반복해서 프린트+i값 함께 출력
		int j = 0; //시작값
		while (j < 500) { //조건식
			System.out.println("홍길동");
			j++; //증감식
		}
		
		
	}

}
