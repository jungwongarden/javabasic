package 문제풀기;

import java.net.ServerSocket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {

	public static void main(String[] args) {
		// ctrl + d(한줄삭제)
		JFrame f = new JFrame();
		JButton b = new JButton("나는 버튼....!!!!");
		f.add(b);
		ImageIcon i = new ImageIcon("car.jpg");
		b.setIcon(i);
		//ServerSocket server = new ServerSocket();
		f.setSize(1000, 500);
		f.setVisible(true);
	}

}
