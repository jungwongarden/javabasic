package 상속;

public class 매니저사용 {

	public static void main(String[] args) {
		매니저 m = new 매니저();
		m.name = "홍길동";
		m.address  = "강남구";
		m.rrn  = 900102;
		m.salary = 100;
		m.bonus = 200;
		
		System.out.println(m);
	}

}
