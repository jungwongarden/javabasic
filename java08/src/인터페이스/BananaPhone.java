package 인터페이스;

//ApplePhone class는 Phone interface에 따라 구현됨(implements)
public abstract class BananaPhone implements Phone {

	//클래스에서 규칙을 추가하고 싶은 경우, 추상메서드로 
	//규칙을 추가할 수 있다.
	//추상메서드는 불완전하기 때문에 그 클래스도 불완전한 클래스
	//클래스이름앞에 abstract!!라고 써주어야 한다.
	//추상클래스!
	public abstract void gps();//추상메서드 추가

	@Override
	public void call() {
		System.out.println("바나나폰으로 전화하다.");
	}

	@Override
	public void text() {
		System.out.println("바나나폰으로 문자하다.");
		
	}

	@Override
	public void kakao() {
		System.out.println("바나나폰으로 카톡하다.");
		
	}

	@Override
	public void internet() {
		System.out.println("바나나폰으로 인터넷하다.");
		
	}

	
}
