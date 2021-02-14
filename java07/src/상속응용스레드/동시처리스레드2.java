package 상속응용스레드;

public class 동시처리스레드2 {

	public static void main(String[] args) {
		//스레드를 사용
		증가쓰레드 t1 = new 증가쓰레드();
		감소쓰레드 t2 = new 감소쓰레드();
		
		//cpu에 스레드를 등록
		t1.start();
		t2.start();

	}

}
