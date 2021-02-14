package 인터페이스;

public class BananaComputer implements Computer {

	@Override
	public void internet() {
		System.out.println("바나나컴퓨터로 와이파이를 연결하여 인터넷하다.");
	}

	@Override
	public void keyboard() {
		System.out.println("블루투스 기능이 가능한 키보드를 사용하다.");
	}

	@Override
	public void mouse() {
		System.out.println("손목보호를 위해 양쪽으로 벌어지는 두 개의 버튼이 있는 사용하다.");

	}

}
