
package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 음식주문 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		//f는 참조형 변수(주소)
		//이 주소를 가지고 멤버변수를 접근해서 값을 넣을 수도 있고,
		//이 주소를 가지고 멤버메서드를 사용할 수도 있다.
		f.setSize(500, 500);
		f.setVisible(true);
		
		String name = JOptionPane.showInputDialog("이름을 입력");
		JOptionPane.showMessageDialog(f, "당신의 이름은 " + name);
		
		
		
		
		
		
		
		
		
	}

}

