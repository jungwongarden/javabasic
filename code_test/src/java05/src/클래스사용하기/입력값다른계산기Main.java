package 클래스사용하기;

import 클래스만들기.입력값이다른계산기;

public class 입력값다른계산기Main {

	public static void main(String[] args) {
		입력값이다른계산기 cal = new 입력값이다른계산기();
		cal.add(200, 100);
		cal.add(100, 22.2);
		cal.add("훌륭한", "자바"); //훌륭한자바
		cal.add("오늘은", 10); //오늘은10일
		cal.add(33.3, 22.2); //두 수의 합은 55.5
	}

}
