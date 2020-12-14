package 연산자;

public class 산술연산자2 {

	public static void main(String[] args) {
		// 컨트롤+쉬프트+f: 자동포맷
		int sum = 333; // 총점
		int count = 5; // 인원

		System.out.println(sum / count);
		//자바는 cpu가 연산할 때, int로 바꾸어서 계산
		//int와 int의 연산 결과는 무조건 int!
		
		//소수점을 살리는 double타입의 데이터를 원하면,
		//하나라도 double이면, 무조건 double
		double avg = (double)sum / count;
		//강제로타입변환(강제형변환)
		//cpu가 ram에 있는 데이터를 가져다가
		//강제로 타입을 변환하는 것
		//sum + 1;
		System.out.println("평균은 " + avg);
	}

}





