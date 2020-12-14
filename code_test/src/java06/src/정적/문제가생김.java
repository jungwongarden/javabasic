package 정적;

public class 문제가생김 {

	public static void main(String[] args) {
		int x = 100;
		
		//에러가 발생하면, 프로그램이 중단
		//자바에서는 에러가 발생하면 중단시키지않고,
		//그 부분만 실행의 예외라고 보고, 그 부분을 포기하게 하고
		//다음을 이이서 실행하게 할 수 있다.
		//예외처리
		try {
			System.out.println(x/0);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생하여 처리함.");
		}
		
		System.out.println("내가 계속 실행될까요..");
	}

}
