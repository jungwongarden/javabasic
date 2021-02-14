package 생성자;

public class 자동차공장 {

	public static void main(String[] args) {
		자동차틀 car1 = new 자동차틀("빨강색", "테슬라");
		System.out.println(car1);
		
		자동차틀 car2 = new 자동차틀("파랑색", "벤츠");
		System.out.println(car2);
		
	}

}
