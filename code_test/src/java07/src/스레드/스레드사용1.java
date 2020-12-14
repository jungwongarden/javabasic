package 스레드;

public class 스레드사용1 {

	public static void main(String[] args) {
		// 부품을 사용하려면, new!
		별스레드 t1 = new 별스레드();
		골뱅이스레드 t2 = new 골뱅이스레드();
		// 스레드부품으로 만들어진 객체의 기능을 사용
		// cpu에게 스레드 등록
		t1.start();
		t2.start();
		
	}

}
