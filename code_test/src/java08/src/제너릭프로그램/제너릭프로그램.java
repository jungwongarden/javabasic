package 제너릭프로그램;

import java.util.ArrayList;

public class 제너릭프로그램 {
//new로 객체생성할 때 구체적으로 타입을 결정할 수 있는 프로그램 기법
//형변환이 필요없다.
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김길동");
		list.add("송길동");
		System.out.println(list);
		

	}

}
