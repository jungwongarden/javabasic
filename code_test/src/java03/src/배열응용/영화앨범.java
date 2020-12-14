package 배열응용;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class 영화앨범 {
	static int now = 2; //현재 위치

	public static void main(String[] args) {
		// 영화제목 배열
		String[] name = { "삼진그룹", "담보", "위플래쉬", "미스터트롯", "소리도없이" };

		// 영화포스트 배열
		String[] img = { "001.png", "002.png", "003.png", "004.png", "005.png" };

		// 평점 배열
		double[] jumsu = { 9.8, 8.8, 7.8, 6.8, 5.8 };

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setTitle("영화 앨범 만들기");
		f.setSize(447, 485);

		JButton left = new JButton("<<");
		left.setBackground(Color.GREEN);
		left.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(left, BorderLayout.WEST);
		
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now--;
				System.out.println("왼쪽 버튼을 눌렀음>> " + now);
			}
		});
		
		
		JButton right = new JButton(">>");
		right.setBackground(Color.GREEN);
		right.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now++;
				System.out.println("오른쪽 버튼을 눌렀음>> " + now);
			}
		});
		
		JLabel title = new JLabel(name[2]);
		title.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(title, BorderLayout.NORTH);

		JLabel avg = new JLabel(jumsu[2] + "");
		avg.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(avg, BorderLayout.SOUTH);

		JLabel poster = new JLabel("");
		poster.setIcon(new ImageIcon(img[2]));
		f.getContentPane().add(poster, BorderLayout.CENTER);
		f.setVisible(true);

	}

}
