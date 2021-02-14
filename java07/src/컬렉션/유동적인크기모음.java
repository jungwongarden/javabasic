package 컬렉션;

import java.util.ArrayList;

public class 유동적인크기모음 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//아무타입이 다 목록으로 넣을 수 있다.
		list.add("홍길동"); //목록을 넣을 때
		list.add(100);
		list.add(11.22);
		list.add(true);
		list.add('남');
		System.out.println("전체 목록 확인 " + list);
		System.out.println("목록의 개수 " + list.size() + "개");
		System.out.println(list.get(0));
		System.out.println(list.get(1)); //목록에서 꺼낼 때
		list.remove(0);
		System.out.println("전체 목록 확인 " + list);
		System.out.println("목록의 개수 " + list.size() + "개");
		

	}

}
