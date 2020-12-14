package 많은양의데이터;

import java.util.HashSet;

public class 중복허용하지않은목록 {

	public static void main(String[] args) {
		HashSet bag  = new HashSet();
		bag.add("휴대폰");
		bag.add("볼펜");
		bag.add("휴지");
		bag.add("휴대폰");
		System.out.println(bag.size());
		System.out.println(bag);
		
		int[] list = {11,22, 33, 11, 22};
		HashSet set = new HashSet();
		for (int i = 0; i < list.length; i++) {
			set.add(list[i]);
		}
		System.out.println(set);
		
		
		
		
		
		
		
	}

}
