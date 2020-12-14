package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터(1000, "삼성", 30);
		컴퓨터 com2 = new 컴퓨터(2000, "우성", 50);
		System.out.println(com1);
		System.out.println(com2);
	}

}
