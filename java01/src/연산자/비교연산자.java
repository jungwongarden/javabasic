package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		// ==, !=, >(초과), >=(이상)
		// 1) 비교의 결과는 반드시 boolean(true,false!)
		// 2) 비교 연산자는 기본 데이터만 비교가능하다.
		//              ---------정수,실수,문자,논리

		int num1 = 200;
		int num2 = 100;
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		
		
	}

}
