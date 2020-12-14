package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 많은자리수그래픽 {
	static int count = 0;

	public static void main(String[] args) {
		// f2: 해결책 제시
		// 한꺼번에 import: 컨트롤+쉬프트+o(영문)
		JFrame f = new JFrame();
		// 예매상황을 저장하는 배열
		int[] seat = new int[200];

		for (int i = 0; i < 200; i++) {
			JButton b = new JButton();
			b.setText(i + "");
			f.add(b);

			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(e.getActionCommand());
					String choice = e.getActionCommand();
					int choice2 = Integer.parseInt(choice);
					seat[choice2] = 1;
					count++;
					JOptionPane.showMessageDialog(f, choice + "번 좌석이 예매되었습니다.");
					f.setTitle("현재 예매수: " + count + "매");
					JButton b2 = (JButton) e.getSource();
					b2.setBackground(Color.RED);
					b2.setEnabled(false);
				}
			});

		}
		f.setSize(800, 600);
		f.setTitle("나의 많은 버튼들");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		System.out.println("확인용입니다.");
		String s = "홍길동";

		JButton money = new JButton("결제하기");
		f.add(money);
		money.setBackground(Color.yellow);
		money.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//배열에 1이 몇 개인지 세어보세요.
				int count2 = 0;
				String seatNo = "";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count2++;
						seatNo = seatNo + " " + i;
					}
				}
				//최종 결제금액 알려주세요.!
				int payment = count2 * 10000;
				JOptionPane.showMessageDialog(f, "당신의 예매한 좌석번호는 " + seatNo);
				JOptionPane.showMessageDialog(f, "최종 결제금액은" + payment + "원");
			}
		});

		f.setVisible(true);
	}

}
