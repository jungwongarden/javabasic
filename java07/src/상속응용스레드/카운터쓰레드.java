package 상속응용스레드;

public class 카운터쓰레드 extends Thread {

	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운터 : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("CPU요청 중 에러발생!!");
			}//0.5초만에 실행함.!
		}
	}
	
}
