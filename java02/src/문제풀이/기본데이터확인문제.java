package 문제풀이;

public class 기본데이터확인문제 {

	public static void main(String[] args) {
		int 체육 = 66, 수학 = 77, 영어 = 88, 국어 = 99;

		int sum = 체육 + 수학 + 영어 + 국어; //산술연산자
		System.out.println("더한 값은 " + sum);
		double avg = (double)sum / 4;
		//cpu가 ram에 들어있는 int타입의 값을 가지고와서
		//     타입(형)을 double변환해서 사용할 수 있음.
		//     (변경하고 싶은 타입명)변수명
		//     타입변환(형변환)
		System.out.println("평균은 " + avg);
		
		System.out.println("=========");
		
		final double PI = 3.14; //상수
		double r = 2.2;
		double result = PI * r * r;
		System.out.printf("원의 면적은 %.2f", result);
		// PI = 3.1456;//상수는 변경 불가
		
		
		
		
		
		
		
		
	}

}
