package 예외처리;

public class 에러발생 {

	public static void main(String[] args) {
		System.out.println("1. 프로그램이 시작됩니다.");
		
		try {
			//에러가 발생한 것은 같은 코드
			System.out.println("2. 프로그램 실행 " + 3/0);
		} catch (Exception e) {
			//에러가 발생했을 때 처리 코드
			e.printStackTrace(); //에러정보 출력
			System.out.println("0으로 나누어서 이부분은 실행이 되지 않음.");
		}
		//에러가 발생하면, 에러가 발생한 이후는 실행이 되지 않음.
		//에러가 발생하더라고, 그 에러가 발생한 부분만 실행에서 제외시키는 처리를 하게되면
		//계속 이어서 실행하게 할 수 있다.
		System.out.println("3. 내가 실행이 과연 될까요??");
	}
}
