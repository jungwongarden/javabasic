package 예외처리;

public class 예외처리Main2 {

	public static void main(String[] args) {
		에러발생3 error = new 에러발생3();
		try {
			error.call();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("call()을 호출한 main()에서 에러를 처리함.");
		}
		System.out.println("에러발생후 실행될까요..!!!!!");
		System.out.println("에러발생후 실행될까요..!!!!!");
		System.out.println("에러발생후 실행될까요..!!!!!");
		System.out.println("에러발생후 실행될까요..!!!!!");

	}

}
