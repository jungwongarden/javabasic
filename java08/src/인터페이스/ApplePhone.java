package 인터페이스;

//ApplePhone class는 Phone interface에 따라 구현됨(implements)
public class ApplePhone implements Phone {

	//일반 메서드
	@Override
	public void internet() {
		System.out.println("애플폰으로 인터넷하다.");
	}

	@Override
	public void call() {
		System.out.println("애플폰으로 전화하다.");

	}

	@Override
	public void text() {
		System.out.println("애플폰으로 문자하다");

	}

	@Override
	public void kakao() {
		System.out.println("애플폰으로 카톡하다.");
	}
}
