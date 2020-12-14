package °´Ã¼ÁöÇâÇü;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class ±×·¡ÇÈ°è»ê±â {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(378, 494);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\alicia\\java0304\\dog.png"));
		lblNewLabel.setBounds(35, 10, 308, 226);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7901");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 30));
		lblNewLabel_1.setBounds(23, 257, 94, 40);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("±¼¸²", Font.BOLD, 30));
		t1.setBounds(129, 257, 191, 40);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC22B\uC7902");
		lblNewLabel_1_1.setFont(new Font("±¼¸²", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(23, 322, 94, 40);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setBackground(Color.YELLOW);
		t2.setFont(new Font("±¼¸²", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(129, 322, 191, 40);
		f.getContentPane().add(t2);
		
		JButton b1 = new JButton("+");
		b1.setFont(new Font("±¼¸²", Font.BOLD, 40));
		b1.setBounds(23, 384, 71, 59);
		f.getContentPane().add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = t1.getText();
				String n2 = t2.getText();
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				JOptionPane.showMessageDialog(f, n11 + n22);
			}
		});
		
		JButton b2 = new JButton("-");
		b2.setFont(new Font("±¼¸²", Font.BOLD, 40));
		b2.setBounds(106, 384, 71, 59);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("*");
		b3.setFont(new Font("±¼¸²", Font.BOLD, 40));
		b3.setBounds(189, 384, 71, 59);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("/");
		b4.setFont(new Font("±¼¸²", Font.BOLD, 40));
		b4.setBounds(272, 384, 71, 59);
		f.getContentPane().add(b4);
		
		f.setVisible(true);
	}
}
