package 제어문.순차문;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 입력화면만들기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(400, 400);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setForeground(Color.RED);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(172, 109, 173, 54);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC22B\uC7901");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(42, 109, 103, 52);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7902");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(42, 184, 103, 52);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setForeground(Color.RED);
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBackground(Color.YELLOW);
		t2.setBounds(172, 184, 173, 54);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\java-ws\\java02\\cal.png"));
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_2.setBounds(30, 0, 315, 99);
		f.getContentPane().add(lblNewLabel_2);
		
		JButton plus = new JButton("\uB354\uD558\uAE30");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//plus라는 버튼을 클릭하면, actionPerformed{내용}
				//내용부분이 실행되게 규칙을 설정되어있는 상태!
				System.out.println("더하기 버튼을 누르셨군요.!");
				String n1 = t1.getText(); //"200"
				String n2 = t2.getText(); //"100"
				//산술연산을 위해서는 n1,n2에 들어있는 데이터를 
				//int로 바꾸어주어야 한다.
				int n11 = Integer.parseInt(n1); //200<-"200"
				int n22 = Integer.parseInt(n2);
				JOptionPane.showMessageDialog(f, n11 + n22);
			}
		});
		
		plus.setBackground(Color.CYAN);
		plus.setFont(new Font("굴림", Font.BOLD, 30));
		plus.setBounds(42, 264, 143, 74);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("\uBE7C \uAE30");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("빼기 버튼을 누르셨군요.!");
			}
		});
		minus.setFont(new Font("굴림", Font.BOLD, 30));
		minus.setBackground(Color.CYAN);
		minus.setBounds(211, 264, 129, 74);
		f.getContentPane().add(minus);
		f.setVisible(true);

	}
}
