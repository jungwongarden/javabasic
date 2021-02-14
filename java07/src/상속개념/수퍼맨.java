package 상속개념;

public class 수퍼맨  extends 맨{
	//멤버변수3, 멤버메서드2(먹다,달리다)
	
	public void 날다() {
		먹다();
		System.out.println(name + "가 하늘을 날다.");
	}
	
	//기존에 있던 것을 다시 한번 똑같이 써주면 기존에 있던 것을 덮어씀.
	//오버라이드(재정의)
	public void 달리다() {
		System.out.println("하늘을 날며 아주 빨리 달리다.");
	}
}
