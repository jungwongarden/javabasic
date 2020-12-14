package 형변환;

import java.util.ArrayList;
import java.util.Random;

public class 참조형형변환3 {

	public static void main(String[] args) {
		//배열은 고정된 크기, 하나의 타입으로만 묶을 수 있다.
		//ArrayList는 가변된 크기, 여러 타입을 묶을 수 있다.
		ArrayList list = new ArrayList();
		list.add("홍길동"); //Object(큰)<---String(작)
		Random r = new Random();
		list.add(r); //Object(큰)<----Random(작)
		list.add(100); //Object(큰)<--자동형변환,업캐스팅--Integer(작)<--오토박싱--int
		list.add(11.22);
		System.out.println(list);
		
		//String(작)<----Object(큰)
		String name = (String)list.get(0); //강제형변환
		//Object name2 = list.get(0);
		char data = name.charAt(0);
		System.out.println(data);
		
		int data2 = (Integer)list.get(2); //100
		//기본형<---언박싱---포장클래스<---강제형변환,다운캐스팅<---Object
		
		
		
		
	}

}
