package 스레드;

//실(thread)단위로 부품을 만들어놓음.
public class 별스레드 extends Thread {
	//동시에 처리되는 스레드 단위로 만들어진 부품.
	
	//cpu가 동시에 처리될 내용!!!을 써주는 메서드
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("*");
			//예외처리(네트워크, 파일, 외부자원을 사용)
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("cpu에게 스레드 잠재우기 요청 에러!!");
			}
		}
	}
}
