package 제어문.조건문;

import java.util.Date;

public class 여러조건 {

	public static void main(String[] args) {
		//시간, 날짜를 알려주는 부품
		//컨트롤+쉬프트+o(영문) : 자동import
		//마우스를 위에 올려서 선택, f2
		Date date = new Date();
		int hour = date.getHours();//6
		int min = date.getMinutes(); //41
		int sec= date.getSeconds();//22
		System.out.println("현재시각은 " + hour + "시 " + min + "분 " + sec + "초");
		
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int today = date.getDate();
		System.out.println("오늘은 " + year + "년 " + month + "월 " + today + "일");
		
	}

}
