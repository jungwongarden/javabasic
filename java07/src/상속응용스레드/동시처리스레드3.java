package 상속응용스레드;

public class 동시처리스레드3 {

	public static void main(String[] args) {
		//스레드를 사용
		카운터쓰레드 t1 = new 카운터쓰레드();
		이미지쓰레드 t2 = new 이미지쓰레드();
		시각쓰레드 t3 = new 시각쓰레드();
		
		//cpu에 스레드를 등록
		t1.start();
		t2.start();
		t3.start();

	}

}
