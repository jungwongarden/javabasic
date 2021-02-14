package 상속응용스레드;

public class 증가쓰레드 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println("증가>>  " + i);
		}
	}
	
}
