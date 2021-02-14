package 상속응용스레드;

public class 이미지쓰레드 extends Thread {

	@Override
	public void run() {
		String[] img = {"1.png", "2.png", "3.png", "4.png", "5.png"};
		for (int i = 0; i < 5; i++) {
			System.out.println("이미지>>  " + img[i]);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("CPU요청 중 에러발생!!");
			}//5초만에 실행함.!
		}
	}
	
}
