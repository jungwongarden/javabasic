package 제어문;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력
		String data = JOptionPane.showInputDialog("나이를 입력해주세요.");// 100

		// 처리(내년 나이)
		int age = Integer.parseInt(data);//"100"->100
		int nextAge = age + 1;
		//낙타표기법
		
		// 출력
		JOptionPane.showMessageDialog(null, "내년 나이는 " + nextAge);
		
		
	}

}
