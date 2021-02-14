package 제어문;

import javax.swing.JOptionPane;

public class 반복문1 {

	public static void main(String[] args) {
		//조건이 맞는 동안(true이면) 반복을 수행한다.
		while (true) { //무한루프
			String data = JOptionPane.showInputDialog("종료하실래요? 1)예, 2)아니오");
			int data2 = Integer.parseInt(data);
			if (data2 == 1) {
				JOptionPane.showMessageDialog(null, "종료합니다.");
				break; //while문 종료
			} else {
				JOptionPane.showMessageDialog(null, "계속 진행합니다.");
			}
		}
	}

}
