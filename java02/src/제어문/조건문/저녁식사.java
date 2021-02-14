package 제어문.조건문;

import javax.swing.JOptionPane;

public class 저녁식사 {

	public static void main(String[] args) {
		String food 
			= JOptionPane.showInputDialog("저녁에 먹을 음식 종류는 1)짜장면, 2)우동, 3)라면");
		switch (food) {
		case "짜장면": 
			System.out.println("중국집으로 가요!");
			break;
		case "우동": 
			System.out.println("일식집으로 가요!");
			break;
		case "라면": 
			System.out.println("분식집으로 가요!");
			break;
		default: //if문의 else기능
			System.out.println("집에서 먹어요!");
			break;
		}
		
		
	}

}
