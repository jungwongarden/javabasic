package 조건문;

import java.util.Date;

public class 조건이많을때3 {

	public static void main(String[] args) {
		// 자동import: 컨트롤+쉬프트+o(영문)
		Date date = new Date(); // f2
		int hour = date.getHours();
		
		//11시 전이면 굿모닝
		//17시 전이면 굿애프터눈
		//20시 전이면 굿이브닝
		//굿나잇
		String result = "";
		if (hour < 11) {
			result = "굿모닝";
		}else if (hour < 17) {
			result = "굿애프터눈";
		}else if (hour < 20) {
			result = "굿이브닝";
		}else {
			result = "굿나잇";
		}
		
		System.out.println(result);
		
		System.out.println("=================");
		switch (hour) { //int, char, String
		case 9:
			System.out.println("시작 시간");
			break;
		case 19:
			System.out.println("끝날 시간");
			break;
		default:
			System.out.println("수업중이거나 집이거나");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
