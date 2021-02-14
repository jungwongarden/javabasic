package 제어문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.FlowLayout;

public class 나의버튼들 {
	static int count = 0;
	
	public static void main(String[] args) {
		// RAM에 복사해서 부품들을 써보자.
		JFrame f = new JFrame();
		f.setSize(1300, 1000);
		int[] seat = new int[500];
		for (int i = 0; i < 500; i++) {
			JButton btnNewButton = new JButton(i + "");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand(); // 버튼위의 글자를 가지고 올 수 있음
					JOptionPane.showMessageDialog(f, s + "번 예약함.");
					btnNewButton.setEnabled(false); //클릭기능 없애버림
					btnNewButton.setBackground(Color.red);
					int s2 = Integer.parseInt(s);
					seat[s2] = 1; //해당index자리의 값을 1로 변경하면, 예약되었다라고 처리!
					System.out.println(s2 + ": " + seat[s2]);
				}
			});
			f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			f.getContentPane().add(btnNewButton);
		}
		
		
		JButton result = new JButton("결제하기");
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//배열의 값 중 1인 것을 찾아서 위치를 프린트!
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						System.out.println("예약된 좌석번호는 >> " + i);
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, count * 10000 + "원 결제하세요.");
			}
		});
		result.setBackground(Color.pink);
		f.getContentPane().add(result);
		
		
		
		f.setVisible(true);
	}
}
