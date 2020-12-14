package 클래스사용하기;

import 클래스만들기.붕어빵틀;

public class 붕어빵을먹자 {

	public static void main(String[] args) {
		붕어빵틀 빵1 = new 붕어빵틀();
		빵1.source = "팥";
		빵1.size = 5;
		빵1.만들다();
		빵1.팔다();
		System.out.println(빵1);
		//빵1라는 변수는 main()메서드 안에서 만들어지는 변수
		//빵1라는 변수에는 주소가 들어가 있다.
		
		붕어빵틀 빵2 = new 붕어빵틀();
		빵2.source = "크림";
		빵2.size = 11;
		빵2.만들다();
		빵2.팔다();
		System.out.println(빵2);
		
	}

}
