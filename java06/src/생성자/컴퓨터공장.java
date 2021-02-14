package 생성자;

public class 컴퓨터공장 {

	public static void main(String[] args) {
		컴퓨터 c1 = new 컴퓨터(1000, "검정");
		System.out.println(c1);
		컴퓨터 c2 = new 컴퓨터(2000, "하얀색");
		System.out.println(c2);
	}

}
