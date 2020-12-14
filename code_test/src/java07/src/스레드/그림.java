package 스레드;

public class 그림 extends Thread {

	@Override
	public void run() {
		String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
		for (int i = 0; i < list.length ; i++) {
			System.out.println("이미지: " + list[i]);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("cpu에게 스레드 잠재우기 요청 에러!!");
			}
		}
	}
}
