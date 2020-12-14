package 많은양의데이터;

import java.util.ArrayList;

public class 순서있는목록 {

	public static void main(String[] args) {
		//배열과 다른점: 아무거나 들어감, 사이즈가 내맘대로
		//배열 크기 고정(100개--->....)
		ArrayList list = new ArrayList();
		list.add("김연아");
		list.add("아사다 마오");
		list.add("잘탄다오");
		list.add(100);
		list.add("내가 1등");
		list.remove(3);
		list.set(3, "꼴찌다오");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("1등>> " + list.get(0));
	}

}
