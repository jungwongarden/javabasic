package 그래픽프로그램;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽2{
	static JButton b1, b2;
	
	public static void main(String[] args) {
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

		//추상메서드를 가지고 있는 인터페이스와 추상클래스는 new를 할 수 없다.!
		//인터페이스에서 정의한 추상메서드를 완벽하게 구현한 "익명클래스"에 대한 객체생성
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("빨간버튼을 눌렀군요!");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("노란버튼을 눌렀군요!");
			}
		});

		f.setVisible(true);

	}

	
}
