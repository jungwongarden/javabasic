package 상속응용스레드;

import java.util.Date;

public class 시각쓰레드 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			Date date = new Date();
			System.out.println("현재시각: " + date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("CPU요청 중 에러발생!!");
			}//1초만에 실행함.!
		}
	}
	
}
