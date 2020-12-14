package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// + - * / %(나머지)
		// RAM저장공간에는 아무값이나 넣을 수 있고,
		// 프로그램 중간에 값이 변할 수도 있음.
		// 저장공간: 변수(variable), 저장공간: 변수명
		// int x = 300;
		int x; // ram에 공간이 만들어진다!!
		// x를 포함하는 괄호안에서만 생존 가능!선언!!
		// 선언의 위치가 생존할 수 있는 범위!
		// 선언을 할 때 ram에 공간이 만들어진다.!

		x = 10;

		int y = 100;
		
		System.out.println("덧셈의 결과는 " + (x + y));
		System.out.println("뺄셈의 결과는 " + (x - y));
		System.out.println("곱셈의 결과는 " + (x * y));
		System.out.println("나눗셈의 결과는 " + (x / y));
		System.out.println("나머지의 결과는 " + (x % y));

	}

}
