package 생성자;

public class 컴퓨터 {
	int price;
	String color;
	
	//멤버변수에 값을 넣는 역할
	public 컴퓨터(int price, String color) {
		this.price = price;
		this.color = color;
	}

	//멤버변수에 값을 출력하는 역할
	@Override
	public String toString() {
		return "컴퓨터 [price=" + price + ", color=" + color + "]";
	}
	
	
	
	
}
