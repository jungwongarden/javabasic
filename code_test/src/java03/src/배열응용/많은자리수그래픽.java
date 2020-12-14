package 배열응용;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 많은자리수그래픽 {

	public static void main(String[] args) {
		//f2: 해결책 제시
		//한꺼번에  import: 컨트롤+쉬프트+o(영문)
		JFrame	f = new JFrame();
		
		for (int i = 0; i < 500; i++) {
			JButton b = new JButton();
			b.setText(i+"");
			f.add(b);
		}
		f.setSize(1000, 800);
		f.setTitle("나의 많은 버튼들");
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		System.out.println("확인용입니다.");
		String s = "홍길동";
		
		f.setVisible(true);
	}

}
