package 인터페이스;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 그래픽이벤트처리 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		JButton b = new JButton("나를 눌러요");
		f.add(b);
		
		이벤트처리클래스 e = new 이벤트처리클래스();
		b.addActionListener(e);
		f.setVisible(true);
	}

}
