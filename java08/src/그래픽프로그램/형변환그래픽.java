package 그래픽프로그램;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 형변환그래픽 {

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.setSize(500, 500);
		
		//FlowLayout flow = new FlowLayout();
		f.setLayout(new FlowLayout()); //자동형변환 (큰<--작)
		
		JButton b = new JButton();
		b.setText("나는 버튼");
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀음.");
				
			}
		});
		
		JLabel l = new JLabel();
		l.setText("나는 라벨");
		
		f.add(b); //Component(부모, 큰) <---- JButton(자식, 작), 자동형변환
		f.add(l); //Component          <---- JLabel
			      //하나의 이름으로 다양한 형태를 구현하는 특징!!
				  //            다       형                  성(다형성)=> overloading(오버로딩)
		
		f.setVisible(true);
	}

}
