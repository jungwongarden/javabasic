package 제너릭프로그램;

import java.util.ArrayList;

public class MyDesk {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("마우스");
		list.add("컵");
		list.add("노트북");
		list.add("마우스");
		System.out.println(list);
		String s1 = list.get(0);
		String s2 = list.get(3);
		
		if (s1.equals(s2)) {
			System.out.println("두 물건이 같아요.");
		} else {
			System.out.println("두 물건이 달라요.");
		}
		
	}

}
