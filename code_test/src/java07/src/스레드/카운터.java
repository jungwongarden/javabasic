package 스레드;

public class 카운터 extends Thread {

	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("cpu에게 스레드 잠재우기 요청 에러!!");
			}
		}
	}
}
