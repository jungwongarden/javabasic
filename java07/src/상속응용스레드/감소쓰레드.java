package 상속응용스레드;

public class 감소쓰레드 extends Thread {
	@Override
	public void run() {
		for (int i = 5000; i >= 0; i--) {
			System.out.println("감소>> " + i);
		}
	}
	
}
