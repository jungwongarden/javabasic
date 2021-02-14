package Á¦¾î¹®.Á¶°Ç¹®;

import java.util.Date;

public class ¿µ¾îÀÎ»ç {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		if (hour < 11) {
			System.out.println("±Â¸ğ´×");
		}else if (hour < 15) {
			System.out.println("±Â¾ÖÇÁÅÍ´«");
		}else if (hour < 19) {
			System.out.println("±ÂÀÌºê´×");
		}else {
			System.out.println("±Â³ªÀÕ");
		}
	}

}
