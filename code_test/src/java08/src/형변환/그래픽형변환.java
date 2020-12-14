package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 그래픽형변환 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("나는 1번버튼");
		JButton b2 = new JButton("나는 2번버튼");
		f.add(b1); //Component자리(부모, 큰)<---JButton(자식, 작): 자동형변환
		f.add(b2);
		f.setVisible(true);
	}

}
