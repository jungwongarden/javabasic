package 정적;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class 네이버증권정보시스템 {

	public static void main(String[] args) {
		JFrame f = new JFrame("네이버 증권 정보 시스템");
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(300, 400);
		
		JButton btnNewButton = new JButton("주요회사크롤링");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//전체 크롤링 기능쓰면 됨.
				네이버증권크롤링 naver = new 네이버증권크롤링();
				naver.crawl();
			}
		});
		JButton btnNewButton_1 = new JButton("카카오크롤링");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 26));
		f.getContentPane().add(btnNewButton_1, BorderLayout.SOUTH);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//전체 크롤링 기능쓰면 됨.
				네이버증권크롤링 naver = new 네이버증권크롤링();
				naver.one();
			}
		});
		f.setVisible(true);
		
	}

}
