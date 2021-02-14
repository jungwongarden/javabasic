package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 연산자는 cpu가 "기호"를 통해서 간단한 처리를 하는 것.
		// + - *(곱하기) /(나누기, 몫) %(나누기, 나머지) : 산술계산시 사용하는 기호(연산자)
		// 산술연산자
		int num1 = 200;
		int num2 = 100;
		//저장공간에 들어가는 데이터는 계속 변할 수 있음.
		//저장공간=> 변수
		//저장공간이름=> 변수명
		
		//num1 + num2; //200 + 100
		System.out.println(num1 + num2);
		int num3 = num1 + num2;
		System.out.println("더한 결과값은 " + num3);
		
		

	}

}
