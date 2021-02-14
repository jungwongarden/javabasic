package 생성자;

public class 자동차틀 {
	String color;
	String company;
	
	//파라메터 있는 생성자
	public 자동차틀(String color, String company) {
		this.color = color;
		this.company = company;
	}
	
	public void speedUp() {
		System.out.println("자동차 속도를 Up시키다.!!");
	}

	@Override
	public String toString() {
		return "자동차틀 [color=" + color + ", company=" + company + "]";
	}
	
	
}
