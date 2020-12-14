package 스레드;

public class 증가스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("증가: " + i);
			try {
				Thread.sleep(300);//0.3초
			} catch (InterruptedException e) {
				System.out.println("cpu에게 스레드 잠재우기 요청 에러!!");
			}
		}
	}
}
