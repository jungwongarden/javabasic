package 문제풀이;

import javax.swing.JOptionPane;

public class 성적확인 {

	public static void main(String[] args) {
		String jumsu = JOptionPane.showInputDialog("점수입력");
		int jumsu2 = Integer.parseInt(jumsu);
		if (jumsu2 >= 90) {
			System.out.println("A");
		}else if (jumsu2 >= 80) {
			System.out.println("B");
		}else if (jumsu2 >= 70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		

	}

}
