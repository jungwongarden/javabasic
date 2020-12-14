package 클래스만들기;

public class 계산기 {
	//멤버메서드
	//매개체 역할의 변수:매개변수, 파라메터(입력값을 저장하는 변수)
	public int add(int x, int y) {
		return x + y;
	}
	public void minus(int x, double y) {
		System.out.println(x - y + "을 빼다.");
	}
	public int mul(int price, int count) {
		return price * count;
	}
	public void div() {
		//void: 보이드, 돌려줄값(return값)이 없다.
		System.out.println("나누다.");
	}
	
}
