package 그래픽프로그램;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 일기쓰기화면 {
	private static JTextField t1;
	private static JTextField t2;

	public void open() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC624\uB298\uC758 \uB0A0\uC9DC");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(48, 81, 208, 72);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC624\uB298\uC758 \uC81C\uBAA9");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(48, 198, 208, 72);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC624\uB298\uC758 \uB0B4\uC6A9");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(48, 336, 208, 72);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("굴림", Font.BOLD, 35));
		t1.setBounds(295, 90, 355, 63);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.BOLD, 35));
		t2.setColumns(10);
		t2.setBounds(295, 198, 355, 63);
		f.getContentPane().add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setForeground(Color.BLUE);
		t3.setFont(new Font("Monospaced", Font.BOLD, 35));
		t3.setRows(5);
		t3.setBounds(295, 313, 355, 156);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("\uD30C\uC77C\uC5D0 \uC77C\uAE30 \uC800\uC7A5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String day = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				
				try {
					FileWriter f = new FileWriter(day + ".txt");
					f.write(day + "\n"); //\n은 엔터가 들어감.
					f.write(title + "\n");
					f.write(content + "\n");
					f.close();
				} catch (IOException e1) {
					System.out.println("파일을 만들어 내용을 쓰는 중 에러가 발생함.!");
				}
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton.setBounds(75, 538, 562, 100);
		f.getContentPane().add(btnNewButton);
		f.setSize(700, 700);
		f.setVisible(true);
	}
}
