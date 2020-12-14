package 클래스사용하기;

import 클래스만들기.계산기;

public class 카페만들기 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		int 커피값 = 3000;
		int 주스값 = 2000;
		int 커피주문수 = 5;
		int 주스주문수 = 9;
		
		int coffeeResult = cal.mul(커피값, 커피주문수);
		int juiceResult = cal.mul(주스값, 주스주문수);
		
		//전체 금액이 3만원 이상인지 확인해야함.
		int total = cal.add(coffeeResult, juiceResult);
		//3만원이상이면 3천원 할인해주세요.
		if (total >= 3000) {
			total = total - 3000;
		} 
		System.out.println("당신의 결제금액은 " +  total + "원");
		//void형 메서드는 반환되는결과가 없기 때문에, 
		//변수에 결과값을 넣을 수도 없고,
		//프린트할 수도 없다.
		
//		String result = cal.minus(200, 100);
//		System.out.println(cal.minus(200, 100));
		
	}

}
