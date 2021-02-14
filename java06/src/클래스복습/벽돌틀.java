package 클래스복습;

public class 벽돌틀 {
	//멤버변수, 성질
	//전역변수(글로벌변수), 자동초기화시켜줌.
	int x = 0;
	int y = 0;
	String color = null; //참조형은 null로 초기화
	
	//입력값이 없는 클래스이름과 동일한 메서드가 자동생성이 된다.
	//new 벽돌틀()생성시, 이 메서드가 자동 실행이된다.!
	//객체 생성시, 꼭 실행해주어야 부분이 여기에 넣으면 꼭 실행시키기 위함.
	//new를 가지고 객체생성시 자동으로 실행해주는 메서드
	//생성자 메서드(생성자, constructor)
	public 벽돌틀() {
		System.out.println("벽톨이 만들어짐.");
	}
	
	public 벽돌틀(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}


	//멤버메서드, 동작
	public void 쌓다() {
		int move = 50; //지역변수(로컬변수), 자동초기화x
		System.out.println(move + "만큼 벽돌을 쌓다.");
	}

	@Override
	public String toString() {
		return "벽돌틀 [x=" + x + ", y=" + y + ", color=" + color + "]";
	}
	
}
