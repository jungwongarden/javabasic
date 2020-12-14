package 스레드;

import java.util.Date;

public class 타이머 extends Thread {

	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			Date date = new Date();
			System.out.println("시각: " + date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("cpu에게 스레드 잠재우기 요청 에러!!");
			}
		}
	}
}
