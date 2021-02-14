package 상속응용스레드;

public class 엣쓰레드 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println("@");
		}
	}
}
