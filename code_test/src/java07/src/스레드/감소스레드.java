package 스레드;

public class 감소스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 100; i > 0; i--) {
			System.out.println("감소: " + i);
			try {
				Thread.sleep(300);//0.3초
			} catch (InterruptedException e) {
				System.out.println("cpu에게 스레드 잠재우기 요청 에러!!");
			}
		}
	}
}
