package 상속응용스레드;

public class 동시처리스레드1 {

	public static void main(String[] args) {
		//스레드클래스를 상속을 받아서 내 스레드를 만든다.
		//동시에 처리하고 싶은 내용이 2개라면, 스레드를 2개 만든다.
		
		//스레드를 사용
		별쓰레드 t1 = new 별쓰레드();
		엣쓰레드 t2 = new 엣쓰레드();
		
		//cpu에 스레드를 등록
		t1.start();
		t2.start();

	}

}
