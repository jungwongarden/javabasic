package 배열기본;

import javax.swing.JOptionPane;

public class 입력해서배열에한꺼번에넣기 {

	public static void main(String[] args) {
		String[] data = new String[4];
		                //{"컴퓨터","국어","수학","영어"}
		//참조형은 무조건 null로 초기화
		//null(널): 주소가 없어!
		for (int i = 0; i < data.length; i++) {
			data[i] = JOptionPane.showInputDialog("좋아하는 과목은");
			System.out.println("당신이 좋아하는 과목은 " + data[i]);
		}
		
		for (int i = 0; i < data.length; i++) {
			if(data[i].equals("컴퓨터")){
				System.out.println("컴퓨터가 있어요");
			}
					
		}
	}

}





