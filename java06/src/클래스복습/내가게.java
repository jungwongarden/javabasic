package 클래스복습;

public class 내가게 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();	
		cal.더하기(5000, 3000);
		//반환값이 없는 메서드는 결과값을 변수에 넣을 수 없다.
		//반환값이 없는 메서드는 결과값을 받아서 프린트할 수 없다.
		cal.곱하기(30, 20, 10);
		//뺀금액의 결과값이 필요
		int result = cal.빼기(100000, 20000);
		System.out.println("반환된 뺀 금액 결과값은 " + result);
		
		if (result < 30000) {
			System.out.println("자동 충전 해야함.");
		} else {
			System.out.println("아직 포인로 사용 가능함.");
		}
		
		int result2 = cal.나누기(500, 20); 
		//500나누기 20의 결과가 5이상이면=> 많이 사용할 수 있음. 
		//					       아니면=> 얼마안남았음.
		if (result2 >= 5) {
			System.out.println("많이 사용할 수 있음.");
		} else {
			System.out.println("얼마 안남았음.");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
