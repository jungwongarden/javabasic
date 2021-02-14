package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범만들기 {
	static int start = 2;

	public static void main(String[] args) {
		String[] title = { "소울", "커넥트", "원더우먼", "화양연화", "아이엠히어" };
		String[] img = { "1.png", "2.png", "3.png", "4.png", "5.png" };
		double[] jumsu = { 99.9, 88.8, 77.7, 66.6, 55.5 };
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setBackground(Color.GREEN);
		f.setSize(562, 548);

		JLabel t1 = new JLabel(title[start]);
		t1.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(t1, BorderLayout.NORTH);

		ImageIcon icon = new ImageIcon(img[start]);
		JLabel t2 = new JLabel(icon);
		f.getContentPane().add(t2, BorderLayout.CENTER);

		JLabel t3 = new JLabel(jumsu[start] + "");
		t3.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(t3, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("<<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 왼쪽 버튼을 누르면 현재 위치에서 -1을 해주어야 한다.
				// start에 현재 위치값이 들어있음.
				if(start != 0) {
					start--;
					t1.setText(title[start]);
					ImageIcon icon = new ImageIcon(img[start]);
					t2.setIcon(icon);
					t3.setText(jumsu[start] + "");
				}else {
					JOptionPane.showMessageDialog(f, "왼쪽의 끝입니다.");
				}
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton(">>>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start != 4) {
					start++;
					t1.setText(title[start]);
					ImageIcon icon = new ImageIcon(img[start]);
					t2.setIcon(icon);
					t3.setText(jumsu[start] + "");
				}else {
					JOptionPane.showMessageDialog(f, "오른쪽의 끝입니다.");
				}
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);
	}

}

