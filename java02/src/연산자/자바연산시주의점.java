package 연산자;

public class 자바연산시주의점 {

	public static void main(String[] args) {
		// 자바연산시주의점
		
		int x = 100; //=: 대입연산자, 할당연산자
		int y = 200;
		
		//System.out.println(x + y);
		int sum = x + y;
		System.out.println("두 수의 합은 "  + sum);
		int count = 7;
		System.out.println(sum / count);
		//자바는 정수와 정수의 계산은 무조건 정수!!!
		
		//자바는 계산할 때 하나라도 실수이면 무조건 실수!!!
		//처음에 int로 지정된 변수라면 사라질 때까지 int로 사용해야 한다.
		//변수에 들어가는 타입을 중간에 변경 불가능
		System.out.println(sum/(double)count);
		
	}

}




