package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 일기장로그인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(690, 688);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\java-ws\\java05\\diary.png"));
		lblNewLabel.setBounds(29, 30, 633, 246);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uC544 \uC774 \uB514:");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(29, 332, 144, 57);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC:");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(29, 407, 165, 57);
		f.getContentPane().add(lblNewLabel_1_1);

		t1 = new JTextField();
		t1.setForeground(Color.RED);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(183, 345, 406, 44);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setForeground(Color.RED);
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(183, 408, 406, 44);
		f.getContentPane().add(t2);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1, t2에 입력한 텍스를 가지고와서,
				// 컨트롤+쉬프트+f(자동포맷 정리)
				String id = t1.getText(); // "root"
				String pw = t2.getText(); // "1234"
				
				// 내가 설정한 id/pw와 일치하는지 비교!
				// ==는 사용불가능! (기본형비교만)
				// &&: 논리연산자, and연산자 <-> ||, or연산자
				if(id.equals("root") && pw.equals("1234")) {
					//일기쓰는 화면을 띄워라!
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();					
				}else {
					JOptionPane.showMessageDialog(f, "로그인정보 잘못되어서, 로그인 실패");
				}
				// 맞으면, 일기쓸 수 있는 화면을 띄우고,
				// 안맞으면, 맞지않다는 메시지 출력
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\java-ws\\java05\\login.png"));
		btnNewButton.setBounds(29, 503, 306, 126);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\java-ws\\java05\\reset.png"));
		btnNewButton_1.setBounds(386, 503, 235, 126);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);

	}
}
