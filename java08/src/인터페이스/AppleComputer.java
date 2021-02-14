package 인터페이스;

public class AppleComputer implements Computer {

	@Override
	public void internet() {
		System.out.println("애플컴퓨터로 랜선을 연결하여 인터넷하다.");
	}

	@Override
	public void keyboard() {
		System.out.println("애플모양의 키보드를 사용하다.");
	}

	@Override
	public void mouse() {
		System.out.println("애플모양의 무선 마우스를 사용하다.");

	}

}
