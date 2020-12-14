package 조건문;

import java.util.Date;

public class 조건이많을때2 {

	public static void main(String[] args) {
		// 자동import: 컨트롤+쉬프트+o(영문)
		Date date = new Date(); // f2
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour + "시 " + min + "분 "  + sec + "초");
		
		int year = date.getYear();
		int month = date.getMonth() + 1;
		int today = date.getDate();
		System.out.println(year + 1900 + "년 " + month + "월 " + today + "일");
		
		
		
		
		
		
		
		
		
	}

}
