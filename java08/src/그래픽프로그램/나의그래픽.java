package 그래픽프로그램;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 implements ActionListener {
	static JButton b1, b2;
	
	public static void main(String[] args) {
		//static메서드는 객체생성하지 않아도 접근할 수 있는 메서드
		//static메서드내에서 사용하는 전역변수는 static이여야한다.
		JFrame f = new JFrame();
		f.setSize(600, 300);

		b1 = new JButton("나를 눌러요");
		b2 = new JButton("나도 눌러요");

		f.setLayout(new FlowLayout());

		f.add(b1);
		f.add(b2);

		b1.setFont(new Font("궁서", Font.BOLD, 100));
		b1.setBackground(Color.RED);

		b2.setFont(new Font("굴림", Font.ITALIC, 100));
		b2.setBackground(Color.YELLOW);

		
		b1.addActionListener(new 나의그래픽());
		b2.addActionListener(new 나의그래픽());

		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("빨간 버튼을 누름.!");
		}else {
			System.out.println("노란 버튼을 누름.!");
		}
	}

}
