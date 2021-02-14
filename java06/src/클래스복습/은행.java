package 클래스복습;

public class 은행 {

	public static void main(String[] args) {
		계좌 a1 = new 계좌(); //내가 프로그램할때 사용할 대상을 틀을 가지고 찍어내는 것.
		//new는 대상을 만들어내는 키워드, 객체생성하는 키워드
		a1.name = "홍길동";
		a1.field = "튼튼적금";
		a1.money = 1000;
		a1.입금하다();
		System.out.println(a1);
		
		계좌 a2 = new 계좌();
		a2.name = "박길동";
		a2.field = "튼튼예금";
		a2.money = 2000;
		a2.입금하다();
		System.out.println(a2);
		
		계좌 a3 = new 계좌();
		a3.name = "홍기사";
		a3.field = "다음적금";
		a3.money = 3000;
		a3.입금하다();
		System.out.println(a3);
		

	}

}
