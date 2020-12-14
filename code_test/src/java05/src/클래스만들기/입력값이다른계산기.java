package 클래스만들기;

public class 입력값이다른계산기 {
	// 자바에서는 메서드이름을 똑같이 만들어줄 수 있다.
	// 반드시 입력값이 달라야 한다.
	// 메서드 이름을 똑같이 만들어줄 수 있다.
	// 하나의 이름인 add로 여러가지 형태의 메서드를 구현
	//=> 다형성(overloading,오버로딩)
	public void add(int x, int y) {
		System.out.println(x + y);
	}

	public void add(int x, double y) {
		System.out.println(x + y);
	}

	public void add(String x, String y) {
		System.out.println(x + y);
	}

	public void add(String x, int y) {
		System.out.println(x + y + "일");
	}

	public void add(double x, double y) {
		System.out.println(x + y);
	}
}
