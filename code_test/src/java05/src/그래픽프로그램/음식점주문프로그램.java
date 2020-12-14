package 그래픽프로그램;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 음식점주문프로그램 {
	static int count;// 전역변수는 자동 초기화(0으로 초기화)
	static int 짬뽕카운트, 우동카운트, 짜장카운트;
	static int 짬뽕금액 = 6000, 우동금액 = 4500, 짜장금액 = 5000;
	static int 전체금액;
	static int 짬뽕계산, 우동계산, 짜장계산;
	private static JTextField t1;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(564, 427);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("개수입력");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(285, 18, 96, 36);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setBackground(Color.PINK);
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("굴림", Font.BOLD, 25));
		t1.setBounds(380, 21, 131, 36);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JLabel t2 = new JLabel("");
		t2.setIcon(new ImageIcon("D:\\alicia\\java05\\main.png"));
		t2.setBounds(60, 76, 435, 248);
		f.getContentPane().add(t2);

		JLabel lblNewLabel_2 = new JLabel("지불할 총 금액");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(92, 339, 174, 36);
		f.getContentPane().add(lblNewLabel_2);

		t3 = new JTextField();
		t3.setBackground(Color.PINK);
		t3.setForeground(Color.RED);
		t3.setFont(new Font("굴림", Font.BOLD, 25));
		t3.setColumns(10);
		t3.setBounds(257, 337, 206, 36);
		f.getContentPane().add(t3);

		JButton b1 = new JButton("짬뽕");
		b1.setFont(new Font("굴림", Font.BOLD, 15));
		b1.setBackground(Color.GREEN);
		b1.setBounds(31, 10, 71, 56);
		f.getContentPane().add(b1);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				t1.setText(String.valueOf(count));
				ImageIcon icon = new ImageIcon("1.png");
				t2.setIcon(icon);
				짬뽕카운트++;
				짬뽕계산 = 짬뽕카운트 * 짬뽕금액;
				전체금액 = 짬뽕계산 + 우동계산 + 짜장계산;
				t3.setText(String.valueOf(전체금액));
			}
		});

		JButton b2 = new JButton("우동");
		b2.setFont(new Font("굴림", Font.BOLD, 15));
		b2.setBackground(Color.CYAN);
		b2.setBounds(114, 10, 71, 56);
		f.getContentPane().add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				t1.setText(String.valueOf(count));
				ImageIcon icon = new ImageIcon("2.png");
				t2.setIcon(icon);
				우동카운트++;
				우동계산 = 우동카운트 * 우동금액;
				전체금액 = 짬뽕계산 + 우동계산 + 짜장계산;
				t3.setText(String.valueOf(전체금액));
			}
		});
		
		JButton b3 = new JButton("짜장");
		b3.setFont(new Font("굴림", Font.BOLD, 15));
		b3.setBackground(Color.MAGENTA);
		b3.setBounds(195, 10, 71, 56);
		f.getContentPane().add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				t1.setText(String.valueOf(count));
				ImageIcon icon = new ImageIcon("2.png");
				t2.setIcon(icon);
				짜장카운트++;
				짜장계산 = 짜장카운트 * 짜장금액;
				전체금액 = 짬뽕계산 + 우동계산 + 짜장계산;
				t3.setText(String.valueOf(전체금액));
			}
		});
		
		f.setVisible(true);
	}
}
