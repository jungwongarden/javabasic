package 순차문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(445, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(12, 52, 162, 83);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(186, 73, 220, 46);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC:");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(12, 145, 162, 83);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBackground(Color.YELLOW);
		t2.setBounds(186, 166, 220, 46);
		f.getContentPane().add(t2);
		
		JLabel t3 = new JLabel("\uACB0\uACFC\uBCF4\uC5EC\uC9C0\uB294 \uBD80\uBD84");
		t3.setForeground(Color.RED);
		t3.setFont(new Font("굴림", Font.PLAIN, 30));
		t3.setBounds(35, 365, 371, 86);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778\uD655\uC778");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBounds(35, 265, 204, 86);
		f.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1.입력
				String id = t1.getText();
				String pw = t2.getText();
				
				//2.처리
				String result = "";
				if (id.equals("root") && pw.equals("1234")) {
					result = "로그인 성공";
				} else {
					result = "로그인 실패";
				}
				
				//3.출력
				t3.setText(result);
			}
		});
		JButton btnNewButton_1 = new JButton("\uC9C0\uC6B0\uAE30");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setBounds(266, 265, 140, 86);
		f.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//입력한값지우기
				t1.setText("");
				t2.setText("");
			}
		});
		f.setVisible(true);
	}
}
