package 정적;

import javax.swing.JOptionPane;

public class 다양한스태틱메서드 {

	public static void main(String[] args) {
		String money = "10000";
		//int로 바꾸는 기능만 쓰고 싶은 경우
		//특정한 메서드만 사용하고 싶은 경우
		//일반 메서드는 꼭 객체생성후, 힙영역에
		//멤버변수 복사한 후 사용 가능
		int money2 = Integer.parseInt(money);
		String name = JOptionPane.showInputDialog("이름입력");
	}

}
