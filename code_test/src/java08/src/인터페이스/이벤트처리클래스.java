package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 이벤트처리클래스 implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 눌렀음.");
	}
}