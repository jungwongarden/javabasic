package 스레드;

public class 스레드사용2 {

	public static void main(String[] args) {
		증가스레드 add = new 증가스레드();
		감소스레드 minus = new 감소스레드();
		//cpu에 등록
		add.start();
		minus.start();
		
	}

}
