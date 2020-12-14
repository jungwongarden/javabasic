package 생성자;

public class ComputerUser {

	public static void main(String[] args) {
		//기본 생성자를 이용해서 객체만들고, 
		//멤버변수값 넣어 프린트
		Computer com1 = new Computer();
		com1.color = "검정";
		com1.price = 100000;
		System.out.println(com1);
		
		//파라메터 생성자를 이용해서 객체생성하고, 프린트
		Computer com2 = new Computer(50000, "파랑");
		System.out.println(com2);
	}

}
