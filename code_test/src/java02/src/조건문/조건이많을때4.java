package 조건문;

import java.util.Date;

public class 조건이많을때4 {

	public static void main(String[] args) {
		// 자동import: 컨트롤+쉬프트+o(영문)
		Date date = new Date(); 
		int month = date.getMonth() + 1;
		int day = date.getDay(); //요일
		System.out.println(day);
		switch (day) {
		case 0: case 6://일요일, 토요일
			System.out.println("학원에 가자");
			break;

		default:
			break;
		}
		
		
		
		
		
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default: //나머지
			System.out.println("겨을");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
