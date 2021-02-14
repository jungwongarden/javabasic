package 배열복습;

import javax.swing.JOptionPane;

public class 배열만들기 {

	public static void main(String[] args) {
		// 배열을 만들 때 집어넣을 데이터를 이미 알고 있는 경우
		String[] name = {"김길동","홍길동","김길준","김길은"};
		
		// 배열을 만들 때 집어넣을 데이터를 아직 모르고 있다가 나중에 넣는 경우
		// 배열은 자동초기화를 시켜준다.
		String[] job = new String[4]; //{null, null, null, null}
		for (int i = 0; i < job.length; i++) { //0~3
			job[i] = JOptionPane.showInputDialog("희망 직업 입력");
		}
		for (int i = 0; i < job.length; i++) {
			System.out.println(job[i]);
		}
		
		//우리가족의 시력(double)을 넣어서, 프린트
		double[] eyes = {2.0, 1.5, 1.2, 0.8};
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i]);
		}
		
		//우리가족의 성별(char)을 넣어서, 프린트
		char[] gender = {'남','여','남','여'};
		String[] gender2 = {"남", "여", "남", "여"};

		for (char c : gender) {
			System.out.println(c);
		}
		
	}//main
}//class





