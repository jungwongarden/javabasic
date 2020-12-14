package 연산자;

public class 연산자정리문제 {

	public static void main(String[] args) {
		char pw1 = 'p';
		char pw2 = 'q';
		double change = 2.2;
		
		//3
		if (pw1 == pw2 && change > 2) {
			System.out.println("오늘은 성공!!");
		} else {
			System.out.println("내일은 다시 도전!!");
		}
		
		//2
		if (change > 2) {
			System.out.println("다이어트 성공!");
		}
		//1
		if (pw1 == pw2) {
			System.out.println("PASS!");
		} else {
			System.out.println("재입력!");
		}
		
		
	}

}
