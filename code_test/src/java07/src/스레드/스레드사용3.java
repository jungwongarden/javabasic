package 스레드;

public class 스레드사용3 {

	public static void main(String[] args) {
		카운터 t1 = new 카운터();
		그림 t2 = new 그림();
		타이머 t3 = new 타이머();

		t1.start();
		t2.start();
		t3.start();
	}
}
