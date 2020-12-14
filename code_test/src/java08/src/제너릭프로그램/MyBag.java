package 제너릭프로그램;

import java.util.ArrayList;

public class MyBag {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("시계"); //0
		list.add("휴지"); //1
		list.add("휴대폰"); //2
		list.add(1000); //3
		
		System.out.println(list);
		int num = (Integer)list.get(3);
		System.out.println(num + 1000);
	}

}
