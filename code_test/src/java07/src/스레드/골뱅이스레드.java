package 스레드;

public class 골뱅이스레드 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("@");
			//예외처리(네트워크, 파일, 외부자원을 사용)
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("cpu에게 스레드 잠재우기 요청 에러!!");
			}
		}
	}
}
