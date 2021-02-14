package 예외처리;

public class 에러발생2 {
	public void call() {
		try {
			System.out.println(3/0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("내가 예외처리함.");
		}
	}
}
